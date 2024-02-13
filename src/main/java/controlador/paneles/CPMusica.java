package controlador.paneles;

import controlador.UtilesResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cancion;
import vista.modulos.ModuloCancion;
import vista.paneles.PanelLibros;
import vista.paneles.PanelMusica;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class CPMusica {
    private final PanelMusica P;
    
    public CPMusica(PanelMusica p){
        this.P = p;
    }
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_musica_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("lbl_musica_titulo")+"</div></html>");
    }

    public void insertarCanciones() {
        P.getPanelCentral().setLayout(new GridLayout(0,1));
        
        ArrayList<Cancion> a;
        try {
            a = UtilesResultSet.transformResSetCanciones(P.getCon().obtenerCancionesAsociadas(P.getUser()));
                for(Cancion c : a){
                    P.getPanelCentral().add(new ModuloCancion(c));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PanelLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
