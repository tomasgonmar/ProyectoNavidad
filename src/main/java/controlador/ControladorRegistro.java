package controlador;

import java.awt.event.MouseEvent;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRegistro;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRegistro {

    private final VentanaRegistro VENTANA_REG;
    
    public ControladorRegistro(VentanaRegistro ventanaReg) {
        this.VENTANA_REG = ventanaReg;
    }

    public void salir() {
        System.exit(0);
    }

    public void abrirInicioSesion() {
        new VentanaLogin(VENTANA_REG.getConexion()).setVisible(true);
        VENTANA_REG.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_REG.setLocation(x-VENTANA_REG.getXMouse(),y-VENTANA_REG.getYyMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        VENTANA_REG.setXMouse(evt.getX());
        VENTANA_REG.setYMouse(evt.getY());
    }
    public Usuario obtenerUsuario(){
        return new Usuario(VENTANA_REG.getEmail(),VENTANA_REG.getUser(),Encriptado.encriptarPassword(VENTANA_REG.getPassword()));
    }

    public void registrarUsuario() {
        Usuario u  = obtenerUsuario();
        if(u.emailValido()){
            try {
                VENTANA_REG.getConexion().registrarUsuario(u);
                VENTANA_REG.limpiarCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(VENTANA_REG, "El nombre de usuario o el correo ya esta en uso, porfavor cambielo.");
            }
        }else{
            JOptionPane.showMessageDialog(VENTANA_REG, "El correo introducido no es valido");
        }
    }

    public void cambiarEstadoLblInicio(boolean entrar) {
        UtilDiseño.cambiarColorYBorde(VENTANA_REG.lblInicioSes, entrar);
    }

    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(VENTANA_REG.btnExit, entrar);
    }
    
}
