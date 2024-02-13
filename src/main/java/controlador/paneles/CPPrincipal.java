package controlador.paneles;

import java.util.ResourceBundle;
import vista.paneles.PanelInicio;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class CPPrincipal {
    private final PanelInicio P;

    public CPPrincipal(PanelInicio p) {
        this.P = p;
    }

    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_inicio_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("lbl_inicio_titulo")+"</div></html>");
    }
    
}
