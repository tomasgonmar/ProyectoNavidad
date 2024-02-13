package controlador.frames;

import controlador.CRedoUndo;
import controlador.ContraseñaAleatoria;
import controlador.UEmail;
import controlador.UDiseño;
import controlador.UEncriptado;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.frames.FrameLogin;
import vista.frames.FrameRecuperacion;

/**
 * Controlador para la ventana de recuperación de contraseña.
 * Gestiona las interacciones y eventos relacionados con la recuperación de contraseñas.
 * @author Tomas Gonzalez Martin
 */
public class CRecuperacion {
    
    private final FrameRecuperacion VENTANA_REC;

    /**
     * Constructor del controlador de recuperación de contraseña.
     * @param ventanaRec La instancia de FrameRecuperacion asociada a este controlador.
     */
    public CRecuperacion(FrameRecuperacion ventanaRec) {
        this.VENTANA_REC = ventanaRec;
        actualizarIdioma();
        CRedoUndo.addUndoRedoFunctionality(VENTANA_REC.gettFEmail());
    }

    /**
     * Método para salir de la ventana de recuperación.
     */
    public void salir() {
        new FrameLogin(VENTANA_REC.getConexion(),VENTANA_REC.getLocale()).setVisible(true);
        VENTANA_REC.dispose();
    }

    /**
     * Método para manejar el evento del mouse cuando se presiona en la ventana.
     * @param evt El evento del mouse.
     */
    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_REC.setLocation(x-VENTANA_REC.getXMouse(),y-VENTANA_REC.getYMouse());
    }

    /**
     * Método para mover la ventana por la pantalla.
     * @param evt El evento del mouse.
     */
    public void movimientoPorPantalla(MouseEvent evt) {
        VENTANA_REC.setXMouse(evt.getX());
        VENTANA_REC.setYMouse(evt.getY());
    }

    /**
     * Método para enviar una nueva contraseña al correo electrónico del usuario.
     */
    public void enviarNuevaContraseña() {
        try {
            Usuario user = new Usuario(VENTANA_REC.getEmail());
            if(VENTANA_REC.getConexion().emailExiste(user)){
                String contraseñaEnviar = new ContraseñaAleatoria(15).obtenerContraseña();
                user.setContraseña(UEncriptado.encriptarPassword(contraseñaEnviar));
                
                VENTANA_REC.getConexion().modificarContraseña(user);
                
                new UEmail(user.getEmail(), contraseñaEnviar).start();
                
                JOptionPane.showMessageDialog(VENTANA_REC, "Nueva contraseña ha sido enviada al correo, si no lo recibe en unos minutos intentelo de nuevo.");
                salir();
                    
            }else{
                JOptionPane.showMessageDialog(VENTANA_REC,"Este correo no está asociado a ningún usuario.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(VENTANA_REC, "Error al modificar la contraseña. Intentelo más tarde.");
        }
    }

    /**
     * Método para cambiar el estado del botón de salida.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoBtnSalida(boolean entrar) {
        UDiseño.cambiarColor(VENTANA_REC.btnExit, entrar);
    }    

    /**
     * Método privado para actualizar el idioma de la ventana.
     */
    private void actualizarIdioma() { 
        ResourceBundle bundle = ResourceBundle.getBundle("idioma", VENTANA_REC.getLocale());
        VENTANA_REC.getLbl_recuperacion_titulo().setText("<html> <div style='text-align: center;'>"+bundle.getString("lbl_recuperacion_titulo")+"</div> </html>");
        VENTANA_REC.getLbl_recuperacion_email().setText(bundle.getString("lbl_recuperacion_email"));
        VENTANA_REC.getBtnRecuperar().setText(bundle.getString("btn_recuperacion"));
        UDiseño.colocarPlaceHolderText(VENTANA_REC.gettFEmail(), bundle.getString("email_ejemplo"));
    }
}
