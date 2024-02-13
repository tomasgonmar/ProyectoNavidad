package controlador.frames;

import controlador.ContraseñaAleatoria;
import controlador.EmailUtil;
import controlador.UtilDiseño;
import controlador.UtilEncriptado;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.frames.FrameLogin;
import vista.frames.FrameRecuperacion;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRecuperacion {
    
    private final FrameRecuperacion VENTANA_REC;

    public ControladorRecuperacion(FrameRecuperacion ventanaRec) {
        this.VENTANA_REC = ventanaRec;
        actualizarIdioma();
    }

    public void salir() {
        new FrameLogin(VENTANA_REC.getConexion(),VENTANA_REC.getLocale()).setVisible(true);
        VENTANA_REC.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_REC.setLocation(x-VENTANA_REC.getXMouse(),y-VENTANA_REC.getYMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        VENTANA_REC.setXMouse(evt.getX());
        VENTANA_REC.setYMouse(evt.getY());
    }

    public void enviarNuevaContraseña() {
        try {
            Usuario user = new Usuario(VENTANA_REC.getEmail());
            if(VENTANA_REC.getConexion().emailExiste(user)){
                String contraseñaEnviar = new ContraseñaAleatoria(15).obtenerContraseña();
                user.setContraseña(UtilEncriptado.encriptarPassword(contraseñaEnviar));
                
                VENTANA_REC.getConexion().modificarContraseña(user);
                
                new EmailUtil(user.getEmail(), contraseñaEnviar).start();
                
                //EmailUtil.sendEmail(user.getEmail(), contraseñaEnviar);
                JOptionPane.showMessageDialog(VENTANA_REC, "Nueva contraseña ha sido enviada al correo, si no lo recibe en unos minutos intentelo de nuevo.");
                salir();
                    
            }else{
                JOptionPane.showMessageDialog(VENTANA_REC,"Este correo no esta asociado a ningun usuario.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(VENTANA_REC, "Error al modificar la contraseña. Intentelo mas tarde.");
        }
        
        
    }

    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(VENTANA_REC.btnExit, entrar);
    }    

    private void actualizarIdioma() { 
        ResourceBundle bundle = ResourceBundle.getBundle("idioma", VENTANA_REC.getLocale());
        VENTANA_REC.getLbl_recuperacion_titulo().setText("<html> <div style='text-align: center;'>"+bundle.getString("lbl_recuperacion_titulo")+"</div> </html>");
        VENTANA_REC.getLbl_recuperacion_email().setText(bundle.getString("lbl_recuperacion_email"));
        VENTANA_REC.getBtnRecuperar().setText(bundle.getString("btn_recuperacion"));
        UtilDiseño.colocarPlaceHolderText(VENTANA_REC.gettFEmail(), bundle.getString("email_ejemplo"));
    }
}
