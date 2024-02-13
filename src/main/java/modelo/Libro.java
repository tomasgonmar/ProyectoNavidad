package modelo;

import controlador.UtilDiseño;
import javax.swing.ImageIcon;

/**
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

    public Libro(String nombreImagen, String titulo, int paginas, String descripcion, double puntuacion, String genero) {
        this.imagen = UtilDiseño.createImageIcon("src/main/resources/img/libros/"+nombreImagen+".png", "img");
        this.titulo = titulo;
        this.paginas = paginas;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.genero = genero;
    }

    public Libro() {
        
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int duracion) {
        this.paginas = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
