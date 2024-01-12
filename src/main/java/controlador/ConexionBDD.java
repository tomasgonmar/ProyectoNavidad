package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

import controlador.Encriptado;

/**
 *
 * @author Tomás González Martín
 */
public class ConexionBDD {

    private Connection conn;
	
	public ConexionBDD() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/miapp","root","");
            
            //Base de datos en la nube
            conn = DriverManager.getConnection("jdbc:mysql://bsrlj7amexjfe77v7s4c-mysql.services.clever-cloud.com:3306/bsrlj7amexjfe77v7s4c","uxvwv7dsq8ge8idp","hqY6qvBKQt7GGP53JMfc");
	}
	public void cerrarConexion() throws SQLException {
            conn.close();
	}
        
        public String obternerHashContraseñaBDD(Usuario user) throws SQLException{
            String sql = "select contraseña from usuarios where email = ?";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1,user.getEmail());
            ResultSet r = s.executeQuery();
            while(r.next()){
                return r.getString("contraseña");
            }
            
            return null;
        }
        
        public void registrarUsuario(Usuario user) throws SQLException{
            String sql = "insert into usuarios(email,usuario,contraseña) values(?,?,?)";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, user.getEmail());
            s.setString(2, user.getUsuario());
            s.setString(3, user.getContraseña());
            s.executeUpdate();
        }

    boolean existsUser(Usuario user) throws SQLException {
        System.out.println(user.getContraseña());
        String sql = "select contraseña from usuarios where usuario=?";
        PreparedStatement s = conn.prepareStatement(sql);
        s.setString(1, user.getUsuario());
        ResultSet r = s.executeQuery();
        while(r.next()){
            System.out.println(r.getString("contraseña"));
            if(Encriptado.comprobarContraseña(user.getContraseña(),r.getString("contraseña"))){
                return true;
            } else return false;            
        }
        return false;
    }
        
}
