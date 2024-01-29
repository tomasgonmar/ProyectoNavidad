package modelo;

import controlador.UtilDiseño;
import javax.swing.ImageIcon;

/**
 *
 * @author Tomás González Martín
 */
public class Pelicula {
    private ImageIcon imagen;
    private String nombre;
    private double duracion;
    private String descripcion;
    private double puntuacion;
    private ImageIcon imagenServicio;

    public Pelicula(String nombreImagen, String nombre, double duracion, String descripcion, double puntuacion, String servicio) {
        this.imagen = UtilDiseño.createImageIcon("src/main/resources/img/peliculas/"+nombreImagen+".png", "img");
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.imagenServicio = UtilDiseño.createImageIcon("src/main/resources/img/logos_servicios_mini/"+servicio+".png", "img");
    }

    public Pelicula() {
        
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
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

    public ImageIcon getImagenServicio() {
        return imagenServicio;
    }

    public void setImagenServicio(ImageIcon imagenServicio) {
        this.imagenServicio = imagenServicio;
    }
    
}
