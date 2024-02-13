package modelo;

import controlador.UDiseño;
import javax.swing.ImageIcon;

/**
 * La clase Libro representa un libro con su imagen, título, número de páginas, descripción,
 * puntuación y género.
 * La imagen se carga utilizando el método createImageIcon de la clase UtilDiseño.
 * 
 * @author Tomás González Martín
 */
public class Libro {
    private ImageIcon imagen;
    private String titulo;
    private int paginas;
    private String descripcion;
    private double puntuacion;
    private String genero; 
    private int id;

    /**
     * Constructor de la clase Libro.
     * 
     * @param nombreImagen Nombre de la imagen del libro.
     * @param titulo Título del libro.
     * @param paginas Número de páginas del libro.
     * @param descripcion Descripción del libro.
     * @param puntuacion Puntuación del libro.
     * @param genero Género del libro.
     */
    public Libro(String nombreImagen, String titulo, int paginas, String descripcion, double puntuacion, String genero) {
        this.imagen = UDiseño.createImageIcon("src/main/resources/img/libros/" + nombreImagen + ".png", "img");
        this.titulo = titulo;
        this.paginas = paginas;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.genero = genero;
    }

    /**
     * Constructor vacío de la clase Libro.
     */
    public Libro() {
        
    }

    /**
     * Obtiene la imagen del libro.
     * 
     * @return La imagen del libro.
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del libro.
     * 
     * @param imagen La nueva imagen del libro.
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el número de páginas del libro.
     * 
     * @return El número de páginas del libro.
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Establece el número de páginas del libro.
     * 
     * @param paginas El nuevo número de páginas del libro.
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Obtiene la descripción del libro.
     * 
     * @return La descripción del libro.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del libro.
     * 
     * @param descripcion La nueva descripción del libro.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la puntuación del libro.
     * 
     * @return La puntuación del libro.
     */
    public double getPuntuacion() {
        return puntuacion;
    }

    /**
     * Establece la puntuación del libro.
     * 
     * @param puntuacion La nueva puntuación del libro.
     */
    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Obtiene el género del libro.
     * 
     * @return El género del libro.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del libro.
     * 
     * @param genero El nuevo género del libro.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
