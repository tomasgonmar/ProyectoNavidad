package controlador;

import java.util.Random;

/**
 *
 * @author Tomás González Martín
 */
public class ContraseñaAleatoria {
    private final char[] CARACTERES = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                                    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                    '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '<', '>', ',', '.', '?', '/'};

    private String contraseñaGenerada;
    
    public ContraseñaAleatoria(int tam){
        this.contraseñaGenerada = "";
        Random r = new Random();
        for(int i = 0; i< tam; i++){
            this.contraseñaGenerada += CARACTERES[r.nextInt(CARACTERES.length)];
        }
    }
    
    public String obtenerContraseña(){
        return this.contraseñaGenerada;
    }
}
