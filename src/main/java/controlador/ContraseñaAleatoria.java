package controlador;

/**
 *
 * @author Tomás González Martín
 */
import org.apache.commons.lang3.RandomStringUtils;

public class ContraseñaAleatoria {
    private final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+={}[]|\\:;<>,.?/";

    private final String CONTRASEÑA_GENERADA;

    public ContraseñaAleatoria(int tam) {
        this.CONTRASEÑA_GENERADA = RandomStringUtils.random(tam, CARACTERES);
    }

    public String obtenerContraseña() {
        return this.CONTRASEÑA_GENERADA;
    }
}