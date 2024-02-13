package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cancion;
import modelo.Libro;
import modelo.Pelicula;
import modelo.Servicio;

/**
 * Clase que proporciona métodos para transformar los resultados de un ResultSet en listas de objetos de modelo.
 * Se utiliza para convertir los resultados de consultas a la base de datos en objetos que pueden ser utilizados por la aplicación.
 * @author Tomas Gonzalez Martin
 */
public class UtilesResultSet {
    
    /**
     * Transforma un ResultSet que contiene resultados de libros en una lista de objetos Libro.
     * @param r El ResultSet que contiene los resultados de la consulta de libros.
     * @return Una lista de objetos Libro.
     * @throws SQLException Si ocurre un error al acceder a los datos en el ResultSet.
     */
    public static ArrayList<Libro> transformResSetLibros(ResultSet r) throws SQLException{
        ArrayList<Libro> listaLibros = new ArrayList<>();
        while(r.next()){
            Libro libro = new Libro();
            libro.setTitulo(r.getString(1));
            libro.setGenero(r.getString(2));
            libro.setPaginas(Integer.parseInt(r.getString(3)));
            libro.setDescripcion(r.getString(5));
            libro.setPuntuacion(Double.parseDouble(r.getString(6)));
            listaLibros.add(libro);
        }
        return listaLibros;
    }

    /**
     * Transforma un ResultSet que contiene resultados de canciones en una lista de objetos Cancion.
     * @param r El ResultSet que contiene los resultados de la consulta de canciones.
     * @return Una lista de objetos Cancion.
     * @throws SQLException Si ocurre un error al acceder a los datos en el ResultSet.
     */
    public static ArrayList<Cancion> transformResSetCanciones(ResultSet r) throws SQLException {
        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        while(r.next()){
            Cancion cancion = new Cancion();
            cancion.setTitulo(r.getString(1));
            cancion.setDuracion(Double.parseDouble(r.getString(2)));
            cancion.setAutor(r.getString(3));
            cancion.setPuntuacion(Double.parseDouble(r.getString(4)));
            listaCanciones.add(cancion);
        }
        return listaCanciones;
    }

    /**
     * Transforma un ResultSet que contiene resultados de servicios en una lista de objetos Servicio.
     * @param r El ResultSet que contiene los resultados de la consulta de servicios.
     * @return Una lista de objetos Servicio.
     * @throws SQLException Si ocurre un error al acceder a los datos en el ResultSet.
     */
    public static ArrayList<Servicio> transformResSetServicios(ResultSet r) throws SQLException {
        ArrayList<Servicio> listaServicios = new ArrayList<>();
        while(r.next()){
            Servicio servicio = new Servicio(r.getString(1),r.getString(2));
            listaServicios.add(servicio);
        }
        return listaServicios;
    }
    
    /**
     * Transforma un ResultSet que contiene resultados de películas en una lista de objetos Pelicula.
     * @param r El ResultSet que contiene los resultados de la consulta de películas.
     * @return Una lista de objetos Pelicula.
     * @throws SQLException Si ocurre un error al acceder a los datos en el ResultSet.
     */
    public static ArrayList<Pelicula> transformResSetPeliculas(ResultSet r) throws SQLException {
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        while(r.next()){
            Pelicula pelicula = new Pelicula(r.getString(1),Integer.parseInt(r.getString(2)),r.getString(3),Double.parseDouble(r.getString(4)),r.getString(5));
            listaPeliculas.add(pelicula);
        }
        return listaPeliculas;
    }
}
