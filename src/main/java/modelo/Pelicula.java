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
    private int duracion;
    private String descripcion;
    private double puntuacion;
    private ImageIcon imagenServicio;
    private String servicio;

    public Pelicula(String nombre, int duracion, String descripcion, double puntuacion, String servicio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.servicio = servicio;
        this.imagenServicio = obtenerImagen();
    }
public final ImageIcon obtenerImagen(){
        String archivo="LogoServicios";
        switch(servicio){
            case "Amazon Prime" -> archivo += "Amazon";
            case "Apple TV" -> archivo += "AppleTV";
            case "Disney Plus" -> archivo += "Disney";
            case "HBO" -> archivo += servicio;
            case "Netflix" -> archivo += servicio;
            case "Youtube" -> archivo += servicio;
        }
        return UtilDiseño.createImageIcon("src/main/resources/img/logos_servicios_mini/"+archivo+"Mini.png", "img");
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
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
