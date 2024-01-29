package modelo;

import controlador.UtilDiseño;
import javax.swing.ImageIcon;

/**
 *
 * @author Tomás González Martín
 */
public class Cancion {
    private ImageIcon imagen;
    private String titulo;
    private String autor;
    private double duracion;
    private double puntuacion;

    public Cancion(String nombreImagen, String titulo, String autor, double duracion, double puntuacion) {
        this.imagen = UtilDiseño.createImageIcon("src/main/resources/img/canciones/"+nombreImagen+".png", "img");
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.puntuacion = puntuacion;
    }

    public Cancion() {
        
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
