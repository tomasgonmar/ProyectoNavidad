package modelo;

import controlador.UtilDiseño;
import javax.swing.ImageIcon;

/**
 *
 * @author Tomás González Martín
 */
public class Servicio {
    private ImageIcon imagen;
    private String nombre;
    private String descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = obtenerImagen();
    }

    
    public final ImageIcon obtenerImagen(){
        String archivo="LogoServicios";
        switch(nombre){
            case "Amazon Prime" -> archivo += "Amazon";
            case "Apple TV" -> archivo += "AppleTV";
            case "Disney Plus" -> archivo += "Disney";
            case "HBO" -> archivo += nombre;
            case "Netflix" -> archivo += nombre;
            case "Spotify" -> archivo += nombre;
            case "Youtube" -> archivo += nombre;
        }
        return UtilDiseño.createImageIcon("src/main/resources/img/logos_servicios/"+archivo+".png", "img");
    }
    public Servicio() {
        
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
