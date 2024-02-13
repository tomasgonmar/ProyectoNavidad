package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * La clase Usuario representa un usuario con su email, nombre de usuario, contraseña, 
 * validación de contraseña, nombre, apellidos, dirección y teléfono.
 * Proporciona métodos para validar el email del usuario.
 * 
 * El email se utiliza como identificador único del usuario en el sistema.
 * 
 * @author Tomás González Martín
 */
public class Usuario {
    private String email;
    private String usuario;
    private String contraseña;
    private String validacionContraseña;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private int id;

    /**
     * Constructor de la clase Usuario con email, usuario, contraseña y validación de contraseña.
     * 
     * @param email Email del usuario.
     * @param usuario Nombre de usuario del usuario.
     * @param contraseña Contraseña del usuario.
     * @param validacionContraseña Validación de la contraseña del usuario.
     */
    public Usuario(String email, String usuario, String contraseña, String validacionContraseña) {
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.validacionContraseña = validacionContraseña;
    }

    /**
     * Constructor de la clase Usuario con usuario y contraseña.
     * 
     * @param usuario Nombre de usuario del usuario.
     * @param contraseña Contraseña del usuario.
     */
    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Constructor de la clase Usuario con email.
     * 
     * @param email Email del usuario.
     */
    public Usuario(String email) {
        this.email = email;
        this.usuario = null;
        this.contraseña = null;
    }

    /**
     * Obtiene la validación de la contraseña del usuario.
     * 
     * @return La validación de la contraseña del usuario.
     */
    public String getValidacionContraseña() {
        return validacionContraseña;
    }

    /**
     * Establece la validación de la contraseña del usuario.
     * 
     * @param validacionContraseña La nueva validación de la contraseña del usuario.
     */
    public void setValidacionContraseña(String validacionContraseña) {
        this.validacionContraseña = validacionContraseña;
    }

    /**
     * Obtiene el email del usuario.
     * 
     * @return El email del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del usuario.
     * 
     * @param email El nuevo email del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el nombre de usuario del usuario.
     * 
     * @return El nombre de usuario del usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario del usuario.
     * 
     * @param usuario El nuevo nombre de usuario del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param contraseña La nueva contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del usuario.
     * 
     * @return Los apellidos del usuario.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del usuario.
     * 
     * @param apellidos Los nuevos apellidos del usuario.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la dirección del usuario.
     * 
     * @return La dirección del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     * 
     * @param direccion La nueva dirección del usuario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono del usuario.
     * 
     * @return El teléfono del usuario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del usuario.
     * 
     * @param telefono El nuevo teléfono del usuario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para validar el email del usuario.
     * 
     * @return true si el email es válido, false en caso contrario.
     */
    public boolean emailValido() {
        String patronCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(patronCorreo);

        Matcher matcher = pattern.matcher(this.email);

        return matcher.matches();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
