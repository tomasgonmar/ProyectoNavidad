package controlador;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRecuperacion;
import vista.VentanaRegistro;

/**
 *
 * @author Tomás González Martín
 */
public class ControladorLogin {

    private VentanaLogin ventanaLog;
    private ConexionBDD con;
    
    public ControladorLogin(VentanaLogin ventanaLog) {
        this.ventanaLog = ventanaLog;
        try {
             this.con = new ConexionBDD();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salir() {
        System.exit(0);
    }

    public void desplazamientoPressed(MouseEvent evt) {
        ventanaLog.setXMouse(evt.getX());
        ventanaLog.setYMouse(evt.getY());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ventanaLog.setLocation(x-ventanaLog.getXMouse(),y-ventanaLog.getYMouse());
    }

    public void abrirVentanaRecuperacion() {
        new VentanaRecuperacion().setVisible(true);
        ventanaLog.dispose();
    }

    public void abrirVentanaRegistro() {
        new VentanaRegistro().setVisible(true);
        ventanaLog.dispose();
    }
    
    public Usuario obtenerUser(){
        return new Usuario(ventanaLog.getUsuario(),ventanaLog.getContraseña());
    }

    public void iniciarSesion() {
        Usuario u = obtenerUser();
        try {
            if(con.existsUser(u)){
                new VentanaPrincipal().setVisible(true);
                ventanaLog.dispose();
            }else{
                JOptionPane.showMessageDialog(ventanaLog, "Usuario o contraseña incorrecto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
