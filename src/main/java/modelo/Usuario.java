package modelo;

/**
 *
 * @author Tomás González Martín
 */
public class Usuario {
    private String email;
    private String usuario;
    private String contraseña;

    public Usuario(String email, String usuario, String contraseña) {
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public boolean valido() {
        return false;
    }

    
}
