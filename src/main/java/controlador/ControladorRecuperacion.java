package controlador;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRecuperacion;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRecuperacion {
    
    private VentanaRecuperacion ventanaRec;
    private ConexionBDD con;

    public ControladorRecuperacion(VentanaRecuperacion ventanaRec) {
        this.ventanaRec = ventanaRec;
        try {
            this.con = new ConexionBDD();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRecuperacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorRecuperacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salir() {
        new VentanaLogin().setVisible(true);
        ventanaRec.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ventanaRec.setLocation(x-ventanaRec.getXMouse(),y-ventanaRec.getYMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        ventanaRec.setXMouse(evt.getX());
        ventanaRec.setYMouse(evt.getY());
    }

    public void enviarNuevaContraseña() {
        try {
            Usuario user = new Usuario(ventanaRec.getEmail());
            if(con.emailExiste(user)){
                String contraseñaEnviar = new ContraseñaAleatoria(15).obtenerContraseña();
                user.setContraseña(Encriptado.encriptarPassword(contraseñaEnviar));
                
                con.modificarContraseña(user);
                
                //EmailUtil.sendEmail(user.getEmail(), contraseñaEnviar);
                JOptionPane.showMessageDialog(ventanaRec, "Nueva contraseña ha sido enviada al correo");
                salir();
                    
            }else{
                JOptionPane.showMessageDialog(ventanaRec,"Este correo no esta asociado a ningun usuario.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(ventanaRec, "Error al modificar la contraseña. Intentelo mas tarde.");
        }
        
        
    }
    
}
