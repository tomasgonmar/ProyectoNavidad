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

    private final VentanaLogin VENTANA_LOG;
    
    public ControladorLogin(VentanaLogin ventanaLog) {
        this.VENTANA_LOG = ventanaLog;
    }

    public void salir() {
        System.exit(0);
    }

    public void desplazamientoPressed(MouseEvent evt) {
        VENTANA_LOG.setXMouse(evt.getX());
        VENTANA_LOG.setYMouse(evt.getY());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_LOG.setLocation(x-VENTANA_LOG.getXMouse(),y-VENTANA_LOG.getYMouse());
    }

    public void abrirVentanaRecuperacion() {
        new VentanaRecuperacion(VENTANA_LOG.getConexion()).setVisible(true);
        VENTANA_LOG.dispose();
    }

    public void abrirVentanaRegistro() {
        new VentanaRegistro(VENTANA_LOG.getConexion()).setVisible(true);
        VENTANA_LOG.dispose();
    }
    
    public Usuario obtenerUser(){
        return new Usuario(VENTANA_LOG.getUsuario(),VENTANA_LOG.getContraseña());
    }

    public void iniciarSesion() {
        Usuario user = obtenerUser();
        try {
            if(VENTANA_LOG.getConexion().existsUser(user)){
                new VentanaPrincipal(user).setVisible(true);
                VENTANA_LOG.dispose();
            }else{
                JOptionPane.showMessageDialog(VENTANA_LOG, "Usuario o contraseña incorrecto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cambiarEstadoLblRecuperacion(boolean entrar) {
        UtilDiseño.cambiarColorYBorde(VENTANA_LOG.lblRecuperacion, entrar);
    }
    
    public void cambiarEstadoLblRegistro(boolean entrar) {
        UtilDiseño.cambiarColorYBorde(VENTANA_LOG.lblRegistro, entrar);
    }

    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(VENTANA_LOG.btnExit, entrar);
    }

    
}
