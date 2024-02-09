package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
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

    public Usuario(String email, String usuario, String contraseña, String validacionContraseña) {
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.validacionContraseña = validacionContraseña;
    }

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(String email) {
        this.email = email;
        this.usuario = null;
        this.contraseña = null;
    }

    public String getValidacionContraseña() {
        return validacionContraseña;
    }

    public void setValidacionContraseña(String validacionContraseña) {
        this.validacionContraseña = validacionContraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean emailValido() {
        String patronCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(patronCorreo);

        Matcher matcher = pattern.matcher(this.email);

        return matcher.matches();
    }
        
}
