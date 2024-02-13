package controlador.frames;

import controlador.CRedoUndo;
import controlador.UDiseño;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.frames.FrameLogin;
import vista.frames.FrameApp;
import vista.frames.FrameRecuperacion;
import vista.frames.FrameRegistro;

/**
 * Controlador para la ventana de inicio de sesión.
 * Maneja las interacciones y eventos relacionados con el inicio de sesión del usuario.
 * @author Tomás González Martín
 */
public class CLogin {

    private final FrameLogin VENTANA_LOG;
    
    /**
     * Constructor del controlador de inicio de sesión.
     * @param ventanaLog La instancia de FrameLogin asociada a este controlador.
     */
    public CLogin(FrameLogin ventanaLog) {
        this.VENTANA_LOG = ventanaLog;
        actualizarImagen();
        CRedoUndo.addUndoRedoFunctionality(VENTANA_LOG.gettFPassword());
        CRedoUndo.addUndoRedoFunctionality(VENTANA_LOG.gettFUser());
    }
    
    /**
     * Método para manejar el evento del mouse cuando se presiona en la ventana.
     * @param evt El evento del mouse.
     */
    public void desplazamientoPressed(MouseEvent evt) {
        VENTANA_LOG.setXMouse(evt.getX());
        VENTANA_LOG.setYMouse(evt.getY());
    }

    /**
     * Método para mover la ventana por la pantalla.
     * @param evt El evento del mouse.
     */
    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        VENTANA_LOG.setLocation(x-VENTANA_LOG.getXMouse(),y-VENTANA_LOG.getYMouse());
    }
    
    /**
     * Método para abrir una nueva ventana.
     * @param ventana La ventana que se va a abrir.
     */
    private void abrirVentana(JFrame ventana) {
        ventana.setVisible(true);
        VENTANA_LOG.dispose();
    }

    /**
     * Método para abrir la ventana de recuperación de contraseña.
     */
    public void abrirVentanaRecuperacion() {
        abrirVentana(new FrameRecuperacion(VENTANA_LOG.getConexion(),VENTANA_LOG.getLocale()));
    }

    /**
     * Método para abrir la ventana de registro de usuario.
     */
    public void abrirVentanaRegistro() {
        abrirVentana(new FrameRegistro(VENTANA_LOG.getConexion(),VENTANA_LOG.getLocale()));
    }
    
    /**
     * Método para obtener los datos del usuario de la ventana de inicio de sesión.
     * @return Los datos del usuario.
     */
    public Usuario obtenerUser(){
        return new Usuario(VENTANA_LOG.getUsuario(),VENTANA_LOG.getContraseña());
    }

    /**
     * Método para iniciar sesión.
     */
    public void iniciarSesion() {
        Usuario user = obtenerUser();
        try {
            if(VENTANA_LOG.getConexion().existsUser(user)){
                new FrameApp(user,this.VENTANA_LOG.getConexion(),VENTANA_LOG.getLocale()).setVisible(true);
                VENTANA_LOG.dispose();
            }else{
                JOptionPane.showMessageDialog(VENTANA_LOG, "Usuario o contraseña incorrecto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para cambiar el estado del texto de recuperación de contraseña.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoLblRecuperacion(boolean entrar) {
        UDiseño.cambiarColorYBorde(VENTANA_LOG.lblRecuperacion, entrar);
    }
    
    /**
     * Método para cambiar el estado del texto de registro de usuario.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoLblRegistro(boolean entrar) {
        UDiseño.cambiarColorYBorde(VENTANA_LOG.lblRegistro, entrar);
    }

    /**
     * Método para cambiar el estado del botón de salida.
     * @param entrar true si se activa, false si se desactiva.
     */
    public void cambiarEstadoBtnSalida(boolean entrar) {
        UDiseño.cambiarColor(VENTANA_LOG.btnExit, entrar);
    }

    /**
     * Método para manejar el evento de presionar la tecla Enter en el botón predeterminado.
     * @param evt El evento de teclado.
     */
    public void btnDefaultKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }

    /**
     * Método para actualizar el idioma de la ventana.
     */
    public void actualizarIdioma() {
        Locale idioma = VENTANA_LOG.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("idioma", idioma);
        VENTANA_LOG.getLbl_login_bienvenida().setText("<html> <div style='text-align: center;'>"+bundle.getString("lbl_login_bienvenida")+"</div> </html>");
        VENTANA_LOG.getLbl_login_user().setText(bundle.getString("lbl_login_user"));
        VENTANA_LOG.getLbl_login_password().setText(bundle.getString("lbl_login_password"));
        VENTANA_LOG.getLblRecuperacion().setText(bundle.getString("lbl_login_recuperacion"));
        VENTANA_LOG.getLblRegistro().setText(bundle.getString("lbl_login_registro"));
        VENTANA_LOG.getBtnIniciar().setText(bundle.getString("btn_login_iniciar"));
        UDiseño.colocarPlaceHolderText(VENTANA_LOG.gettFUser(), bundle.getString("tF_login_usuario"));
    }

    /**
     * Método para cambiar el idioma al hacer clic en la bandera del idioma.
     * @param evt El evento del mouse.
     */
    public void btnIdioma(MouseEvent evt) {
        String idioma = VENTANA_LOG.getLocale().toString();
        switch(idioma){
            case("es_ES"):
                VENTANA_LOG.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_en.png", "idioma"));
                VENTANA_LOG.setLocale(new Locale("en","US"));
                actualizarIdioma();
                break;
            case("en_US"):
                VENTANA_LOG.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_es.png", "idioma"));
                VENTANA_LOG.setLocale(new Locale("es","ES"));
                actualizarIdioma();
                break;
        }
    }
    
    /**
     * Método para actualizar la imagen del idioma en la ventana.
     */
    public void actualizarImagen(){
        String idioma = VENTANA_LOG.getLocale().toString();
        switch(idioma){
            case("es_ES"):
                VENTANA_LOG.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_es.png", "idioma"));
                break;
            case("en_US"):
                VENTANA_LOG.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_en.png", "idioma"));
                break;
        }
    }

}
