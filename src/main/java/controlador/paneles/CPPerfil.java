package controlador.paneles;

import controlador.CRedoUndo;
import controlador.UtilDiseño;
import controlador.UtilEncriptado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.paneles.PanelPerfil;

/**
 * Controlador para el panel de perfil de usuario.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización y modificación del perfil de usuario.
 * @author Tomas Gonzalez Martin
 */
public class CPPerfil {

    private final PanelPerfil P;
    private Usuario user;
    
    /**
     * Constructor del controlador del panel de perfil.
     * @param p El panel de perfil asociado a este controlador.
     */
    public CPPerfil(PanelPerfil p) {
        this.P = p;
        
        activarEdicion(false);
        
        this.user = P.getUser();
                
        P.gettFNombre().setText(user.getNombre()+", "+user.getApellidos());
        P.gettFEmail().setText(user.getEmail());
        P.gettFTelefono().setText(user.getTelefono());
        P.gettFDireccion().setText(user.getDireccion());
        
        CRedoUndo.addUndoRedoFunctionality(P.gettFEmail());
        CRedoUndo.addUndoRedoFunctionality(P.gettFDireccion());
        CRedoUndo.addUndoRedoFunctionality(P.gettFNombre());
        CRedoUndo.addUndoRedoFunctionality(P.gettFPassword());
        CRedoUndo.addUndoRedoFunctionality(P.gettFTelefono());
    }

    /**
     * Actualiza el idioma del panel de perfil.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.setLocale(bundle.getLocale());
        P.getLbl_perfil_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_perfil")+"</div></html>");
        P.getLbl_perfil_nombre().setText(bundle.getString("lbl_perfil_nombre"));
        P.getLbl_perfil_email().setText(bundle.getString("lbl_recuperacion_email"));
        P.getLbl_perfil_password().setText(bundle.getString("lbl_login_password"));
        P.getLbl_perfil_telefono().setText(bundle.getString("lbl_perfil_telefono"));
        P.getLbl_perfil_direccion().setText(bundle.getString("lbl_perfil_direccion"));
        P.getBtnModificar().setText(bundle.getString("btn_perfil_modificar"));
        
        UtilDiseño.colocarPlaceHolderText(P.gettFNombre(), bundle.getString("tF_perfil_nombre"));
        UtilDiseño.colocarPlaceHolderText(P.gettFEmail(), bundle.getString("email_ejemplo"));
        UtilDiseño.colocarPlaceHolderText(P.gettFTelefono(), bundle.getString("tF_perfil_telefono"));
        UtilDiseño.colocarPlaceHolderText(P.gettFDireccion(), bundle.getString("tF_perfil_direccion"));
    }
    
    /**
     * Activa o desactiva la edición de los campos del perfil.
     * @param activo true para activar la edición, false para desactivarla.
     */
    public void activarEdicion(boolean activo){
        P.gettFNombre().setEditable(activo);
        P.gettFEmail().setEditable(activo);
        P.gettFTelefono().setEditable(activo);
        P.gettFPassword().setEditable(activo);
        P.gettFDireccion().setEditable(activo);
        if (activo) {
            P.gettFNombre().setBackground(Color.decode("#282828"));
            P.gettFEmail().setBackground(Color.decode("#282828"));
            P.gettFTelefono().setBackground(Color.decode("#282828"));
            P.gettFPassword().setBackground(Color.decode("#282828"));
            P.gettFDireccion().setBackground(Color.decode("#282828"));
        } else {
            P.gettFNombre().setBackground(null);
            P.gettFEmail().setBackground(null);
            P.gettFTelefono().setBackground(null);
            P.gettFPassword().setBackground(null);
            P.gettFDireccion().setBackground(null);
        }
    }

    /**
     * Maneja el evento del botón Modificar del perfil.
     * @param evt El evento de acción del botón.
     */
    public void btnModificar(ActionEvent evt) {
        ResourceBundle bundle = ResourceBundle.getBundle("idioma", P.getLocale());
        if(P.isModificacionActiva()){
            guardarCambios();
            activarEdicion(false);
            P.setModificacionActiva(false);
            P.getBtnModificar().setText(bundle.getString("btn_perfil_modificar"));
        }else{
            activarEdicion(true);
            P.setModificacionActiva(true);
            P.getBtnModificar().setText(bundle.getString("btn_perfil_guardar"));
        }
    }

    /**
     * Guarda los cambios realizados en el perfil.
     * @return true si los cambios se guardaron correctamente, false si hubo algún error.
     */
    private boolean guardarCambios() {
        Usuario user = P.getUser();
        
        ResourceBundle bundle = ResourceBundle.getBundle("idioma", P.getLocale());
                
        String nombre_apellidos = P.gettFNombre().getText().toString();
        if(!comprobarNombreApellido(nombre_apellidos)){
            JOptionPane.showMessageDialog(P, bundle.getString("msg_perfil_err_nombre"));
            return false;
        }
        String nombre = nombre_apellidos.split(",")[0].trim();
        String apellidos = nombre_apellidos.split(",")[1].trim();
        String email = P.gettFEmail().getText().toString();
        if(!comprobarEmail(email)){
            JOptionPane.showMessageDialog(P, bundle.getString("msg_perfil_err_email"));
            return false;
        }
        String telefono = P.gettFTelefono().getText().toString();
        if (!comprobarTelefono(telefono)) {
            JOptionPane.showMessageDialog(P, bundle.getString("msg_perfil_err_telefono"));
            return false;
        }
        String direccion = P.gettFDireccion().getText().toString();
        
        String password = String.valueOf(P.gettFPassword().getPassword());
        
        if(password.isBlank()){
            password = user.getContraseña();
        }
        password = UtilEncriptado.encriptarPassword(password);
        user.setNombre(nombre);
        user.setApellidos(apellidos);
        user.setDireccion(direccion);
        user.setEmail(email);
        user.setTelefono(telefono);
        user.setContraseña(password);
        
        try {
            P.getCON().actualizarUsuario(user);
            JOptionPane.showMessageDialog(P, bundle.getString("msg_perfil_usuario_agregado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(P, bundle.getString("msg_perfil_usuario_error"));
        }
        return true;
    }

    /**
     * Comprueba el formato del nombre y apellidos.
     * @param nombre_apellidos El nombre y apellidos a comprobar.
     * @return true si el formato es correcto, false si no lo es.
     */
    private boolean comprobarNombreApellido(String nombre_apellidos) {
        String regex = "^[^,]+,[^,]+$";
        return nombre_apellidos.matches(regex);
    }

    /**
     * Comprueba el formato del email.
     * @param email El email a comprobar.
     * @return true si el formato es correcto, false si no lo es.
     */
    private boolean comprobarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    /**
     * Comprueba el formato del número de teléfono.
     * @param telefono El número de teléfono a comprobar.
     * @return true si el formato es correcto, false si no lo es.
     */
    private boolean comprobarTelefono(String telefono) {
        String regex = "^[1-9][0-9]{8}$";
        return telefono.matches(regex);
    }
}