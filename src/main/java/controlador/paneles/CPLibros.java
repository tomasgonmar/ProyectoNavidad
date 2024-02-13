package controlador.paneles;

import controlador.UtilesResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Libro;
import vista.modulos.ModuloLibro;
import vista.paneles.PanelLibros;

/**
 * Controlador para el panel de libros.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización y gestión de libros.
 * @author Tomas Gonzalez Martin
 */
public class CPLibros {
    private final PanelLibros P;
    
    /**
     * Constructor del controlador de libros.
     * @param p El panel de libros asociado a este controlador.
     */
    public CPLibros(PanelLibros p){
        this.P = p;
    }
    
    /**
     * Actualiza el idioma del panel de libros.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_libros_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_libros")+"</div></html>");
    }
    
    /**
     * Inserta los libros en el panel central.
     * Obtiene los libros asociados al usuario y los muestra en el panel central.
     */
    public void insertarLibros(){
        
        P.getPanelCentral().setLayout(new GridLayout(0,1));
        ArrayList<Libro> a;
        try {
            a = UtilesResultSet.transformResSetLibros(P.getCon().obtenerLibrosAsociados(P.getUser()));
                for(Libro l : a){
                    P.getPanelCentral().add(new ModuloLibro(l));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PanelLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
