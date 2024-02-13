package modelo;

import controlador.UtilDiseño;
import javax.swing.ImageIcon;

/**
 * La clase Pelicula representa una película con su imagen, nombre, duración, descripción,
 * puntuación, imagen del servicio de streaming y nombre del servicio.
 * La imagen del servicio se obtiene a partir del nombre del servicio utilizando un método interno.
 * La imagen se carga utilizando el método createImageIcon de la clase UtilDiseño.
 * 
 * @author Tomás González Martín
 */
public class Pelicula {
    private ImageIcon imagen;
    private String nombre;
    private int duracion;
    private String descripcion;
    private double puntuacion;
    private ImageIcon imagenServicio;
    private String servicio;

    /**
     * Constructor de la clase Pelicula.
     * 
     * @param nombre Nombre de la película.
     * @param duracion Duración de la película en minutos.
     * @param descripcion Descripción de la película.
     * @param puntuacion Puntuación de la película.
     * @param servicio Nombre del servicio de streaming donde está disponible la película.
     */
    public Pelicula(String nombre, int duracion, String descripcion, double puntuacion, String servicio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.servicio = servicio;
        this.imagenServicio = obtenerImagen();
    }

    /**
     * Método privado que obtiene la imagen del servicio de streaming.
     * 
     * @return La imagen del servicio de streaming.
     */
    private ImageIcon obtenerImagen() {
        String archivo = "LogoServicios";
        switch(servicio) {
            case "Amazon Prime" -> archivo += "Amazon";
            case "Apple TV" -> archivo += "AppleTV";
            case "Disney Plus" -> archivo += "Disney";
            case "HBO" -> archivo += servicio;
            case "Netflix" -> archivo += servicio;
            case "Youtube" -> archivo += servicio;
        }
        return UtilDiseño.createImageIcon("/img/logos_servicios_mini/" + archivo + "Mini.png", "img");
    }

    /**
     * Constructor vacío de la clase Pelicula.
     */
    public Pelicula() {
        
    }

    /**
     * Obtiene la imagen de la película.
     * 
     * @return La imagen de la película.
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen de la película.
     * 
     * @param imagen La nueva imagen de la película.
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el nombre de la película.
     * 
     * @return El nombre de la película.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la película.
     * 
     * @param nombre El nuevo nombre de la película.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la duración de la película.
     * 
     * @return La duración de la película en minutos.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la película.
     * 
     * @param duracion La nueva duración de la película en minutos.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene la descripción de la película.
     * 
     * @return La descripción de la película.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la película.
     * 
     * @param descripcion La nueva descripción de la película.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la puntuación de la película.
     * 
     * @return La puntuación de la película.
     */
    public double getPuntuacion() {
        return puntuacion;
    }

    /**
     * Establece la puntuación de la película.
     * 
     * @param puntuacion La nueva puntuación de la película.
     */
    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Obtiene la imagen del servicio de streaming.
     * 
     * @return La imagen del servicio de streaming.
     */
    public ImageIcon getImagenServicio() {
        return imagenServicio;
    }

    /**
     * Establece la imagen del servicio de streaming.
     * 
     * @param imagenServicio La nueva imagen del servicio de streaming.
     */
    public void setImagenServicio(ImageIcon imagenServicio) {
        this.imagenServicio = imagenServicio;
    }
    
    /**
     * Obtiene el nombre del servicio de streaming.
     * 
     * @return El nombre del servicio de streaming.
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Establece el nombre del servicio de streaming.
     * 
     * @param servicio El nuevo nombre del servicio de streaming.
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}