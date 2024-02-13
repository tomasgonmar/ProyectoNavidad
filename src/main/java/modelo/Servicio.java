package modelo;

import controlador.UDiseño;
import javax.swing.ImageIcon;

/**
 * La clase Servicio representa un servicio con su imagen, nombre y descripción.
 * La imagen se obtiene a partir del nombre del servicio utilizando un método interno.
 * La imagen se carga utilizando el método createImageIcon de la clase UtilDiseño.
 * 
 * @author Tomás González Martín
 */
public class Servicio {
    private ImageIcon imagen;
    private String nombre;
    private String descripcion;

    /**
     * Constructor de la clase Servicio.
     * 
     * @param nombre Nombre del servicio.
     * @param descripcion Descripción del servicio.
     */
    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = obtenerImagen();
    }

    /**
     * Método privado que obtiene la imagen del servicio.
     * 
     * @return La imagen del servicio.
     */
    public final ImageIcon obtenerImagen() {
        String archivo = "LogoServicios";
        switch(nombre) {
            case "Amazon Prime" -> archivo += "Amazon";
            case "Apple TV" -> archivo += "AppleTV";
            case "Disney Plus" -> archivo += "Disney";
            case "HBO" -> archivo += nombre;
            case "Netflix" -> archivo += nombre;
            case "Spotify" -> archivo += nombre;
            case "Youtube" -> archivo += nombre;
        }
        return UDiseño.createImageIcon("/img/logos_servicios/" + archivo + ".png", "img");
    }

    /**
     * Constructor vacío de la clase Servicio.
     */
    public Servicio() {
        
    }

    /**
     * Obtiene la imagen del servicio.
     * 
     * @return La imagen del servicio.
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del servicio.
     * 
     * @param imagen La nueva imagen del servicio.
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el nombre del servicio.
     * 
     * @return El nombre del servicio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del servicio.
     * 
     * @param nombre El nuevo nombre del servicio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del servicio.
     * 
     * @return La descripción del servicio.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del servicio.
     * 
     * @param descripcion La nueva descripción del servicio.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
