package controlador;

import com.password4j.Hash;
import com.password4j.Password;

/**
 *
 * @author Tomás González Martín
 */
public class Encriptado {
    public String obtenerHash(String contraseña){
        Hash hash = Password.hash(contraseña)
            .addRandomSalt(32) 
            .withArgon2();
        return hash.getResult();
    }
    public boolean comprobarContraseña(String contraseña,String hash){
        return Password.check(contraseña,hash).withArgon2();
    }
}
