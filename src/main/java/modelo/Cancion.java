package modelo;

import controlador.UDiseño;
import javax.swing.ImageIcon;

/**
 * La clase Cancion representa una canción con su imagen, título, autor, duración y puntuación.
 * La imagen se carga utilizando el método createImageIcon de la clase UtilDiseño.
 * @author Tomás González Martín
 */
public class Cancion {
    private ImageIcon imagen;
    private String titulo;
    private String autor;
    private double duracion;
    private double puntuacion;

    /**
     * Constructor de la clase Cancion.
     * 
     * @param nombreImagen Nombre de la imagen de la canción.
     * @param titulo Título de la canción.
     * @param autor Autor de la canción.
     * @param duracion Duración de la canción en minutos.
     * @param puntuacion Puntuación de la canción.
     */
    public Cancion(String nombreImagen, String titulo, String autor, double duracion, double puntuacion) {
        this.imagen = UDiseño.createImageIcon("img/canciones/" + nombreImagen + ".png", "img");
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.puntuacion = puntuacion;
    }

    /**
     * Constructor vacío de la clase Cancion.
     */
    public Cancion() {
        
    }

    /**
     * Obtiene la imagen de la canción.
     * 
     * @return La imagen de la canción.
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen de la canción.
     * 
     * @param imagen La nueva imagen de la canción.
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el título de la canción.
     * 
     * @return El título de la canción.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la canción.
     * 
     * @param titulo El nuevo título de la canción.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la duración de la canción.
     * 
     * @return La duración de la canción en minutos.
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     * 
     * @param duracion La nueva duración de la canción en minutos.
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene la puntuación de la canción.
     * 
     * @return La puntuación de la canción.
     */
    public double getPuntuacion() {
        return puntuacion;
    }

    /**
     * Establece la puntuación de la canción.
     * 
     * @param puntuacion La nueva puntuación de la canción.
     */
    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Obtiene el autor de la canción.
     * 
     * @return El autor de la canción.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor de la canción.
     * 
     * @param autor El nuevo autor de la canción.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
