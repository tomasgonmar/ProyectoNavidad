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

    public Servicio(String nombreImagen, String nombre, String descripcion) {
        this.imagen = UtilDiseño.createImageIcon("src/main/resources/img/logos_servicios/"+nombreImagen+".png", "img");
        this.nombre = nombre;
        this.descripcion = descripcion;
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
