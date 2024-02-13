package controlador.paneles;

import controlador.UResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cancion;
import vista.modulos.ModuloCancion;
import vista.paneles.PMusica;

/**
 * Controlador para el panel de música.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización y gestión de canciones.
 * @author Tomas Gonzalez Martin
 */
public class CPMusica {
    private final PMusica P;
    
    /**
     * Constructor del controlador de música.
     * @param p El panel de música asociado a este controlador.
     */
    public CPMusica(PMusica p){
        this.P = p;
    }
    
    /**
     * Actualiza el idioma del panel de música.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_musica_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("lbl_musica_titulo")+"</div></html>");
    }

    /**
     * Inserta las canciones en el panel central.
     * Obtiene las canciones asociadas al usuario y las muestra en el panel central.
     */
    public void insertarCanciones() {
        P.getPanelCentral().setLayout(new GridLayout(0,1));
        
        ArrayList<Cancion> a;
        try {
            a = UResultSet.transformResSetCanciones(P.getCon().obtenerCancionesAsociadas(P.getUser()));
                for(Cancion c : a){
                    P.getPanelCentral().add(new ModuloCancion(c));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PMusica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
