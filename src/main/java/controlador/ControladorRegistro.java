package controlador;

import java.awt.event.MouseEvent;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRegistro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRegistro {

    private VentanaRegistro ventanaReg;
    private ConexionBDD conexion;
    
    public ControladorRegistro(VentanaRegistro ventanaReg) {
        this.ventanaReg = ventanaReg;
        try {
            this.conexion = new ConexionBDD();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salir() {
        System.exit(0);
    }

    public void abrirInicioSesion() {
        new VentanaLogin().setVisible(true);
        ventanaReg.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ventanaReg.setLocation(x-ventanaReg.getXMouse(),y-ventanaReg.getYyMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        ventanaReg.setXMouse(evt.getX());
        ventanaReg.setYMouse(evt.getY());
    }
    public Usuario obtenerUsuario(){
        return new Usuario(ventanaReg.getEmail(),ventanaReg.getUser(),Encriptado.encriptarPassword(ventanaReg.getPassword()));
    }

    public void registrarUsuario() {
        Usuario u  = obtenerUsuario();
        if(u.emailValido()){
            try {
                conexion.registrarUsuario(u);
                ventanaReg.limpiarCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(ventanaReg, "El nombre de usuario o el correo ya esta en uso, porfavor cambielo.");
            }
        }else{
            JOptionPane.showMessageDialog(ventanaReg, "El correo introducido no es valido");
        }
    }
    
}
