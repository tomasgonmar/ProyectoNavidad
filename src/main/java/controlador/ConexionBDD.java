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

    private final Connection CONN;
	
	public ConexionBDD() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            CONN = DriverManager.getConnection("jdbc:mysql://localhost/miapp","root","");
            
            //Base de datos en la nube
            //CONN = DriverManager.getConnection("jdbc:mysql://bsrlj7amexjfe77v7s4c-mysql.services.clever-cloud.com:3306/bsrlj7amexjfe77v7s4c","uxvwv7dsq8ge8idp","hqY6qvBKQt7GGP53JMfc");
	}
	public void cerrarConexion() throws SQLException {
            CONN.close();
	}
        
        public String obternerHashContraseñaBDD(Usuario user) throws SQLException{
            String sql = "select contraseña from usuarios where email = ?";
            PreparedStatement s = CONN.prepareStatement(sql);
            s.setString(1,user.getEmail());
            ResultSet r = s.executeQuery();
            while(r.next()){
                return r.getString("contraseña");
            }
            
            return null;
        }
        
        public void registrarUsuario(Usuario user) throws SQLException{
            String sql = "insert into usuarios(email,usuario,contraseña) values(?,?,?)";
            PreparedStatement s = CONN.prepareStatement(sql);
            s.setString(1, user.getEmail());
            s.setString(2, user.getUsuario());
            s.setString(3, user.getContraseña());
            s.executeUpdate();
        }

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

    public void modificarContraseña(Usuario user) throws SQLException {
        String sql = "UPDATE usuarios SET contraseña = ? WHERE email = ? ";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getContraseña());
        s.setString(2, user.getEmail());
        s.executeUpdate();
    }

    public boolean emailExiste(Usuario user) throws SQLException {
        String sql = "select email from usuarios where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        ResultSet r = s.executeQuery();
        return r.next();
    }
    
    public ResultSet obtenerServiciosAsociados(Usuario user) throws SQLException{
        String sql = "select distinct s.nombre,s.descripcion from servicios s join servicio_multimedia sm on id = sm.id_servicio join multimedia m on sm.id_multimedia = m.id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1, user.getEmail());
        return s.executeQuery();
    }
    
    public ResultSet obtenerPeliculasAsociados(Usuario user) throws SQLException{
        String sql = "select titulo,duracion_min,m.descripcion,puntuacion,s.nombre from peliculas join multimedia m on id_multimedia = id join servicio_multimedia sm on id = sm.id_multimedia join servicios s on s.id=sm.id_servicio join user_multimedia um on sm.id_multimedia = um.id_multimedia join usuarios u on id_user = u.id where email = ?";
        PreparedStatement s = CONN.prepareStatement(sql);
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }
    
    public ResultSet obtenerLibrosAsociados(Usuario user) throws SQLException{
        String sql = "select titulo,genero,paginas,id_multimedia,descripcion,puntuacion from libros join multimedia on id_multimedia = id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        
        PreparedStatement s = CONN.prepareStatement(sql);
        System.out.println(user.getEmail());
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }

    public ResultSet obtenerCancionesAsociadas(Usuario user) throws SQLException {
        String sql = "select titulo,duracion_min,autor,puntuacion,id_multimedia from canciones join multimedia on id_multimedia = id join user_multimedia um using (id_multimedia) join usuarios u on id_user = u.id where email = ?";
        
        PreparedStatement s = CONN.prepareStatement(sql);
        System.out.println(user.getEmail());
        s.setString(1,user.getEmail());
        return s.executeQuery();
    }
}
