package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 * Conector con la base de datos y funciones para el DDL de la base de datos
 * @author Tomás González Martín
 */
public class ConexionBDD {
    /**
     * Conexión a la base de datos.
     */
    private final Connection CONN;
	
    /**
     * Constructor de la clase que establece la conexión con la base de datos.
     * @throws SQLException si ocurre un error al conectar a la base de datos.
     * @throws ClassNotFoundException si no se encuentra el controlador de la base de datos.
     */
    public ConexionBDD() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establecer la conexión a la base de datos local
        CONN = DriverManager.getConnection("jdbc:mysql://localhost/miapp","root","");
        // Establecer la conexión a la base de datos en la nube
        // CONN = DriverManager.getConnection("jdbc:mysql://bsrlj7amexjfe77v7s4c-mysql.services.clever-cloud.com:3306/bsrlj7amexjfe77v7s4c","uxvwv7dsq8ge8idp","hqY6qvBKQt7GGP53JMfc");
    }
	
    /**
     * Cierra la conexión a la base de datos.
     * @throws SQLException si ocurre un error al cerrar la conexión.
     */
    public void cerrarConexion() throws SQLException {
        CONN.close();
    }
        
    /**
     * Obtiene el hash de la contraseña almacenada en la base de datos para el usuario dado.
     * @param user El usuario del cual se desea obtener el hash de la contraseña.
     * @return El hash de la contraseña del usuario, o null si el usuario no existe.
     * @throws SQLException si ocurre un error al ejecutar la consulta.
     */
    public String obternerHashContraseñaBDD(Usuario user) throws SQLException{
        // Consulta SQL para obtener el hash de la contraseña del usuario
        String sql = "SELECT contraseña FROM usuarios WHERE email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        ResultSet r = s.executeQuery();
        while(r.next()){
            return r.getString("contraseña");
        }
        return null;
    }
    
    /**
     * Registra un nuevo usuario en la base de datos.
     * @param user El usuario que se desea registrar.
     * @throws SQLException si ocurre un error al ejecutar la consulta.
     */
    public void registrarUsuario(Usuario user) throws SQLException{
        // Consulta SQL para registrar un nuevo usuario
        String sql = "INSERT INTO usuarios(email, usuario, contraseña) VALUES (?, ?, ?)";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getEmail());
        s.setString(2, user.getUsuario());
        s.setString(3, user.getContraseña());
        s.executeUpdate();
    }
    /**
    * Verifica si un usuario existe en la base de datos.
    * @param user El usuario que se desea verificar.
    * @return true si el usuario existe en la base de datos y la contraseña coincide, false de lo contrario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public boolean existsUser(Usuario user) throws SQLException {
        String sql = "select * from usuarios where usuario=?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getUsuario());
        ResultSet r = s.executeQuery();
        while(r.next()){
            user.setEmail(r.getString("email"));
            user.setNombre(r.getString("nombre"));
            user.setApellidos(r.getString("apellidos"));
            user.setTelefono(r.getString("telefono"));
            user.setDireccion(r.getString("direccion"));
            return UtilEncriptado.comprobarContraseña(user.getContraseña(),r.getString("contraseña")); 
        }
        return false;
    }
    /**
    * Modifica la contraseña de un usuario en la base de datos.
    * @param user El usuario cuya contraseña se desea modificar.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public void modificarContraseña(Usuario user) throws SQLException {
        String sql = "UPDATE usuarios SET contraseña = ? WHERE email = ? ";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getContraseña());
        s.setString(2, user.getEmail());
        s.executeUpdate();
    }
    /**
    * Verifica si un correo electrónico existe en la base de datos.
    * @param user El usuario cuyo correo electrónico se desea verificar.
    * @return true si el correo electrónico existe en la base de datos, false de lo contrario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public boolean emailExiste(Usuario user) throws SQLException {
        String sql = "select email from usuarios where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        ResultSet r = s.executeQuery();
        return r.next();
    }
    /**
    * Obtiene los servicios asociados a un usuario desde la base de datos.
    * @param user El usuario del cual se desean obtener los servicios asociados.
    * @return un objeto ResultSet que contiene los servicios asociados al usuario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public ResultSet obtenerServiciosAsociados(Usuario user) throws SQLException{
        String sql = "select distinct s.nombre,s.descripcion from servicios s join servicio_multimedia sm on id = sm.id_servicio join multimedia m on sm.id_multimedia = m.id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getEmail());
        return s.executeQuery();
    }
    /**
    * Obtiene las películas asociadas a un usuario desde la base de datos.
    * @param user El usuario del cual se desean obtener las películas asociadas.
    * @return un objeto ResultSet que contiene las películas asociadas al usuario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public ResultSet obtenerPeliculasAsociados(Usuario user) throws SQLException{
        String sql = "select titulo,duracion_min,m.descripcion,puntuacion,s.nombre from peliculas join multimedia m on id_multimedia = id join servicio_multimedia sm on id = sm.id_multimedia join servicios s on s.id=sm.id_servicio join user_multimedia um on sm.id_multimedia = um.id_multimedia join usuarios u on id_user = u.id where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }
    /**
    * Obtiene los libros asociados a un usuario desde la base de datos.
    * @param user El usuario del cual se desean obtener los libros asociados.
    * @return un objeto ResultSet que contiene los libros asociados al usuario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public ResultSet obtenerLibrosAsociados(Usuario user) throws SQLException{
        String sql = "select titulo,genero,paginas,id_multimedia,descripcion,puntuacion from libros join multimedia on id_multimedia = id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }
    /**
    * Obtiene las canciones asociadas a un usuario desde la base de datos.
    * @param user El usuario del cual se desean obtener las canciones asociadas.
    * @return un objeto ResultSet que contiene las canciones asociadas al usuario.
    * @throws SQLException si ocurre un error al ejecutar la consulta.
    */
    public ResultSet obtenerCancionesAsociadas(Usuario user) throws SQLException {
        String sql = "select titulo,duracion_min,autor,puntuacion,id_multimedia from canciones join multimedia on id_multimedia = id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }

    /**
     * Actualiza la información de un usuario en la base de datos.
     * @param user El usuario cuya información se desea actualizar.
     * @return true si la actualización se realizó con éxito, false de lo contrario.
     * @throws SQLException si ocurre un error al ejecutar la consulta.
     */
    public boolean actualizarUsuario(Usuario user) throws SQLException {
        String sql = "UPDATE usuarios SET contraseña=?, email=?, nombre=?, apellidos=?, telefono=?, direccion=? WHERE email=?";
        PreparedStatement s = CONN.prepareCall(sql);
        s.setString(1, user.getContraseña());
        s.setString(2, user.getEmail());
        s.setString(3, user.getNombre());
        s.setString(4, user.getApellidos());
        s.setString(5, user.getTelefono());
        s.setString(6, user.getDireccion());
        s.setString(7, user.getEmail());
        if(s.executeUpdate()>0){
            return true;
        }else return false;
    }
}
