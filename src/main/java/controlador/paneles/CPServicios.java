package controlador.paneles;

import controlador.UResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Servicio;
import vista.modulos.ModuloServicio;
import vista.paneles.PServicios;

/**
 * Controlador para el panel de servicios.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización del panel de servicios.
 * @author Tomas Gonzalez Martin
 */
public class CPServicios {
    private final PServicios P;

    /**
     * Constructor del controlador del panel de servicios.
     * @param p El panel de servicios asociado a este controlador.
     */
    public CPServicios(PServicios p) {
        this.P = p;
    }

    /**
     * Actualiza el idioma del panel de servicios.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_servicios_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_servicios")+"</div></html>");
    }

    /**
     * Inserta los servicios en el panel de servicios.
     * Obtiene los servicios asociados al usuario y los muestra en el panel.
     */
    public void insertarServicios() {
        P.getPanelCentral().setLayout(new GridLayout(0,3));
        
        ArrayList<Servicio> a;
        try {
            a = UResultSet.transformResSetServicios(P.getCon().obtenerServiciosAsociados(P.getUser()));
                for(Servicio s : a){
                    P.getPanelCentral().add(new ModuloServicio(s));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
