package controlador;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Clase para generar contraseñas aleatorias.
 * Esta clase genera contraseñas aleatorias de la longitud especificada.
 * Las contraseñas pueden contener letras mayúsculas, minúsculas, números y caracteres especiales.
 * @author Tomás González Martín
 */
public class ContraseñaAleatoria {
    
    /**
     * Conjunto de caracteres para generar la contraseña aleatoria.
     */
    private final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+={}[]|\\:;<>,.?/";

    /**
     * Contraseña generada aleatoriamente.
     */
    private final String CONTRASEÑA_GENERADA;

    /**
     * Constructor de la clase que genera una contraseña aleatoria.
     * @param tam La longitud de la contraseña a generar.
     */
    public ContraseñaAleatoria(int tam) {
        this.CONTRASEÑA_GENERADA = RandomStringUtils.random(tam, CARACTERES);
    }

    /**
     * Obtiene la contraseña aleatoria generada.
     * @return La contraseña aleatoria generada.
     */
    public String obtenerContraseña() {
        return this.CONTRASEÑA_GENERADA;
    }
}
