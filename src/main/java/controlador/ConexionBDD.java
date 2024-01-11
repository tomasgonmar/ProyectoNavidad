package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;

/**
 *
 * @author Tomás González Martín
 */
public class ConexionBDD {
    private Connection conn;
	
	public ConexionBDD() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/miapp","root","");
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
}
