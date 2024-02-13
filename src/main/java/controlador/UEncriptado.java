package controlador;

import com.password4j.Hash;
import com.password4j.Password;
import modelo.Usuario;

/**
 * Clase que proporciona métodos para el encriptado y la verificación de contraseñas.
 * Utiliza la biblioteca password4j para realizar el encriptado y la verificación de contraseñas.
 * @author Tomás González Martín
 */
public class UEncriptado {
    
    /**
     * Encripta una contraseña utilizando el algoritmo Argon2 con una sal aleatoria.
     * @param contraseña La contraseña a encriptar.
     * @return La contraseña encriptada.
     */
    public static String encriptarPassword(String contraseña){
        Hash hash = Password.hash(contraseña)
            .addRandomSalt(32) 
            .withArgon2();
        return hash.getResult();
    }
    
    /**
     * Comprueba si una contraseña coincide con su hash encriptado utilizando el algoritmo Argon2.
     * @param contraseña La contraseña a comprobar.
     * @param hash El hash de la contraseña encriptada.
     * @return true si la contraseña coincide con el hash, false en caso contrario.
     */
    public static boolean comprobarContraseña(String contraseña,String hash){
        return Password.check(contraseña, hash).withArgon2();
    }

    /**
     * Encripta la contraseña y la validación de la contraseña de un objeto Usuario.
     * @param u El objeto Usuario cuya contraseña y validación de contraseña se encriptarán.
     */
    public static void encriptarUsuario(Usuario u) {
        u.setContraseña(encriptarPassword(u.getContraseña()));
        u.setValidacionContraseña(encriptarPassword(u.getValidacionContraseña()));
    }
}
