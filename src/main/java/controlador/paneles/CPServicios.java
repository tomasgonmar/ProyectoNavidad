package controlador.paneles;

import controlador.UtilesResultSet;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Servicio;
import vista.modulos.ModuloServicio;
import vista.paneles.PanelLibros;
import vista.paneles.PanelServicios;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class CPServicios {
    private final PanelServicios P;

    public CPServicios(PanelServicios p) {
        this.P = p;
    }

    public void actualizarIdioma(ResourceBundle bundle) {
        
        P.getLbl_servicios_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_servicios")+"</div></html>");
    }

    public void insertarServicios() {
        P.getPanelCentral().setLayout(new GridLayout(0,3));
        
        ArrayList<Servicio> a;
        try {
            a = UtilesResultSet.transformResSetServicios(P.getCon().obtenerServiciosAsociados(P.getUser()));
                for(Servicio s : a){
                    P.getPanelCentral().add(new ModuloServicio(s));
                }
        } catch (SQLException ex) {
            Logger.getLogger(PanelLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
