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
 *
 * @author Tomas Gonzalez Martin
 */
public class CPLibros {
    private final PanelLibros P;
    
    public CPLibros(PanelLibros p){
        this.P = p;
    }
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_libros_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_libros")+"</div></html>");
    }
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
