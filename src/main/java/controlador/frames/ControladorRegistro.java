package controlador.frames;

import controlador.CRedoUndo;
import controlador.UtilDiseño;
import controlador.UtilEncriptado;
import java.awt.event.MouseEvent;
import modelo.Usuario;
import vista.frames.FrameLogin;
import vista.frames.FrameRegistro;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 * Controlador para la ventana de registro de usuarios.
 * Gestiona las interacciones y eventos relacionados con el registro de nuevos usuarios.
 * @author Tomas Gonzalez Martin
 */
public class ControladorRegistro {

    private final FrameRegistro VENTANA_REG;
    
    /**
     * Constructor del controlador de registro de usuarios.
     * @param ventanaReg La instancia de FrameRegistro asociada a este controlador.
     */
    public ControladorRegistro(FrameRegistro ventanaReg) {
        this.VENTANA_REG = ventanaReg;
        actualizarIdioma();
        CRedoUndo.addUndoRedoFunctionality(VENTANA_REG.gettFEmail());
        CRedoUndo.addUndoRedoFunctionality(VENTANA_REG.gettFPassword());
        CRedoUndo.addUndoRedoFunctionality(VENTANA_REG.gettFPasswordValidacion());
        CRedoUndo.addUndoRedoFunctionality(VENTANA_REG.gettFUser());
    }

    /**
     * Método para abrir la ventana de inicio de sesión.
     */
    public void abrirInicioSesion() {
        new FrameLogin(VENTANA_REG.getConexion(), VENTANA_REG.getLocale()).setVisible(true);
        VENTANA_REG.dispose();
    }

    /**
     * Método para manejar el evento del mouse cuando se presiona en la ventana.
     * @param evt El evento del mouse.
     */
    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_REG.setLocation(x-VENTANA_REG.getXMouse(),y-VENTANA_REG.getYMouse());
    }

    /**
     * Método para mover la ventana por la pantalla.
     * @param evt El evento del mouse.
     */
    public void movimientoPorPantalla(MouseEvent evt) {
        VENTANA_REG.setXMouse(evt.getX());
        VENTANA_REG.setYMouse(evt.getY());
    }
    
    /**
     * Método para obtener los datos del usuario desde la ventana de registro.
     * @return Los datos del usuario.
     */
    public Usuario obtenerUsuario(){
        return new Usuario(VENTANA_REG.getEmail(),VENTANA_REG.getUser()
                ,VENTANA_REG.getPassword(),VENTANA_REG.getPasswordValidation());
    }

    /**
     * Método para registrar un nuevo usuario.
     */
    public void registrarUsuario() {
        Usuario u  = obtenerUsuario();
        if(u.emailValido()){
            if(u.getContraseña().equals(u.getValidacionContraseña())){
                try {
                    UtilEncriptado.encriptarUsuario(u);
                    VENTANA_REG.getConexion().registrarUsuario(u);
                    VENTANA_REG.limpiarCampos();
                    JOptionPane.showMessageDialog(VENTANA_REG, "Usuario registrado correctamente.");
                    new FrameLogin(VENTANA_REG.getConexion(), VENTANA_REG.getLocale()).setVisible(true);
                    VENTANA_REG.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(VENTANA_REG, "El nombre de usuario o el correo ya está en uso, por favor cámbielo.");
                }
            }else{
                JOptionPane.showMessageDialog(VENTANA_REG, "Las contraseñas no coinciden.");
            }
            
        }else{
            JOptionPane.showMessageDialog(VENTANA_REG, "El correo introducido no es válido");
        }
    }

    /**
     * Método para cambiar el estado del texto de inicio de sesión.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoLblInicio(boolean entrar) {
        UtilDiseño.cambiarColorYBorde(VENTANA_REG.lblInicioSes, entrar);
    }

    /**
     * Método para cambiar el estado del botón de salida.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(VENTANA_REG.btnExit, entrar);
    }

    /**
     * Método para actualizar el idioma de la ventana.
     */
    public void actualizarIdioma() {
        ResourceBundle bundle = ResourceBundle.getBundle("idioma",VENTANA_REG.getLocale());
        VENTANA_REG.getLbl_registro_titulo().setText("<html> <div style='text-align: center;'>"+bundle.getString("lbl_registro_titulo")+"</div> </html>");
        VENTANA_REG.getLbl_registro_email().setText(bundle.getString("lbl_recuperacion_email"));
        VENTANA_REG.getLbl_registro_usuario().setText(bundle.getString("tF_login_usuario"));
        VENTANA_REG.getLbl_registro_password().setText(bundle.getString("lbl_login_password"));
        VENTANA_REG.getLbl_registro_password_r().setText(bundle.getString("lbl_recuperacion_password_r"));
        VENTANA_REG.getBtnRegistro().setText(bundle.getString("btn_registro"));
        VENTANA_REG.getLblInicioSes().setText(bundle.getString("lbl_registro_inicio_sesion"));
        UtilDiseño.colocarPlaceHolderText(VENTANA_REG.gettFUser(), bundle.getString("tF_login_usuario"));
        UtilDiseño.colocarPlaceHolderText(VENTANA_REG.gettFEmail(), bundle.getString("email_ejemplo"));
    }
    
}