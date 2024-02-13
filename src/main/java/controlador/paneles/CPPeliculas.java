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
import vista.paneles.PanelLibros;
import vista.paneles.PanelPeliculas;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class CPPeliculas {
    private final PanelPeliculas P;
    
    public CPPeliculas(PanelPeliculas p){
        this.P = p;
    }
    public void actualizarIdioma(ResourceBundle bundle) {
        
        P.getLbl_peliculas_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_peliculas")+"</div></html>");
    }

    public void insertarPeliculas() {
        P.getPanelCentral().setLayout(new GridLayout(0,1));
        
        ArrayList<Pelicula> a;
        try {
            a = UtilesResultSet.transformResSetPeliculas(P.getCon().obtenerPeliculasAsociados(P.getUser()));
                for(Pelicula p : a){
                    P.getPanelCentral().add(new ModuloPeliculas(p));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PanelLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
