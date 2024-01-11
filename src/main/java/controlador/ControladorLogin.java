package controlador;

import java.awt.event.MouseEvent;
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
    
    public ControladorLogin(VentanaLogin ventanaLog) {
        this.ventanaLog = ventanaLog;
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

    public void iniciarSesion() {
        Usuario u = new Usuario(ventanaLog.getUsuario(),ventanaLog.getContraseña());
        if(u.valido()){
            new VentanaPrincipal().setVisible(true);
            ventanaLog.dispose();
        }else{
            JOptionPane.showMessageDialog(ventanaLog, "Usuario o contraseña incorrecto");
        }
    }

    
}
