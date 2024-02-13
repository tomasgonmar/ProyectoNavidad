package controlador.paneles;

import controlador.UtilesResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pelicula;
import vista.modulos.ModuloPeliculas;
import vista.paneles.PanelPeliculas;

/**
 * Controlador para el panel de películas.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización y gestión de películas.
 * @author Tomas Gonzalez Martin
 */
public class CPPeliculas {
    private final PanelPeliculas P;
    
    /**
     * Constructor del controlador de películas.
     * @param p El panel de películas asociado a este controlador.
     */
    public CPPeliculas(PanelPeliculas p){
        this.P = p;
    }
    
    /**
     * Actualiza el idioma del panel de películas.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_peliculas_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_peliculas")+"</div></html>");
    }

    /**
     * Inserta las películas en el panel central.
     * Obtiene las películas asociadas al usuario y las muestra en el panel central.
     */
    public void insertarPeliculas() {
        P.getPanelCentral().setLayout(new GridLayout(0,1));
        
        ArrayList<Pelicula> a;
        try {
            a = UtilesResultSet.transformResSetPeliculas(P.getCon().obtenerPeliculasAsociados(P.getUser()));
                for(Pelicula p : a){
                    P.getPanelCentral().add(new ModuloPeliculas(p));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
