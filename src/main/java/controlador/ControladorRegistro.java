package controlador;

import java.awt.event.MouseEvent;
import modelo.Usuario;
import vista.frames.FrameLogin;
import vista.frames.FrameRegistro;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRegistro {

    private final FrameRegistro VENTANA_REG;
    
    public ControladorRegistro(FrameRegistro ventanaReg) {
        this.VENTANA_REG = ventanaReg;
    }

    public void abrirInicioSesion() {
        new FrameLogin(VENTANA_REG.getConexion()).setVisible(true);
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
        return new Usuario(VENTANA_REG.getEmail(),VENTANA_REG.getUser()
                ,VENTANA_REG.getPassword(),VENTANA_REG.getPasswordValidation());
    }

    public void registrarUsuario() {
        Usuario u  = obtenerUsuario();
        if(u.emailValido()){
            System.out.println(u.getContraseña());
            System.out.println(u.getValidacionContraseña());
            if(u.getContraseña().equals(u.getValidacionContraseña())){
                try {
                    UtilEncriptado.encriptarUsuario(u);
                    VENTANA_REG.getConexion().registrarUsuario(u);
                    VENTANA_REG.limpiarCampos();
                    JOptionPane.showMessageDialog(VENTANA_REG, "Usuario registrado correctamente.");
                    new FrameLogin(VENTANA_REG.getConexion()).setVisible(true);
                    VENTANA_REG.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(VENTANA_REG, "El nombre de usuario o el correo ya esta en uso, porfavor cambielo.");
                }
            }else{
                JOptionPane.showMessageDialog(VENTANA_REG, "Las contraseñas no coinciden.");
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
