package controlador;

import com.password4j.Hash;
import com.password4j.Password;
import modelo.Usuario;

/**
 *
 * @author Tomás González Martín
 */
public class Encriptado {
    public static String encriptarPassword(String contraseña){
        Hash hash = Password.hash(contraseña)
            .addRandomSalt(32) 
            .withArgon2();
        return hash.getResult();
    }
    public static boolean comprobarContraseña(String contraseña,String hash){
        return Password.check(contraseña,hash).withArgon2();
    }

    static void encriptarUsuario(Usuario u) {
        u.setContraseña(encriptarPassword(u.getContraseña()));
        u.setValidacionContraseña(encriptarPassword(u.getValidacionContraseña()));
    }
}
