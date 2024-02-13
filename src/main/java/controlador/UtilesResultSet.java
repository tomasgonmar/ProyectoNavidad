package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cancion;
import modelo.Libro;
import modelo.Pelicula;
import modelo.Servicio;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class UtilesResultSet {
    public static ArrayList<Libro> transformResSetLibros(ResultSet r) throws SQLException{
        ArrayList<Libro> a = new ArrayList<>();
        while(r.next()){
            Libro l = new Libro();
            l.setTitulo(r.getString(1));
            l.setGenero(r.getString(2));
            l.setPaginas(Integer.parseInt(r.getString(3)));
            l.setDescripcion(r.getString(5));
            l.setPuntuacion(Double.parseDouble(r.getString(6)));
            a.add(l);
        }
        return a;
    }

    public static ArrayList<Cancion> transformResSetCanciones(ResultSet r) throws SQLException {
        ArrayList<Cancion> a = new ArrayList<>();
        while(r.next()){
            Cancion cancion = new Cancion();
            cancion.setTitulo(r.getString(1));
            cancion.setDuracion(Double.parseDouble(r.getString(2)));
            cancion.setAutor(r.getString(3));
            cancion.setPuntuacion(Double.parseDouble(r.getString(4)));
            a.add(cancion);
        }
        return a;
    }

    public static ArrayList<Servicio> transformResSetServicios(ResultSet r) throws SQLException {
        ArrayList<Servicio> a = new ArrayList<>();
        while(r.next()){
            Servicio servicio = new Servicio(r.getString(1),r.getString(2));
            a.add(servicio);
        }
        return a;
    }
    public static ArrayList<Pelicula> transformResSetPeliculas(ResultSet r) throws SQLException {
        ArrayList<Pelicula> a = new ArrayList<>();
        while(r.next()){
            Pelicula pelicula = new Pelicula(r.getString(1),Integer.parseInt(r.getString(2)),r.getString(3),Double.parseDouble(r.getString(4)),r.getString(5));
            a.add(pelicula);
        }
        return a;
    }
}
