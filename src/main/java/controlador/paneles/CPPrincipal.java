package controlador.paneles;

import java.util.ResourceBundle;
import vista.paneles.PanelInicio;

/**
 * Controlador para el panel de inicio.
 * Administra las interacciones y la lógica de negocio relacionada con la visualización del panel de inicio.
 * @author Tomas Gonzalez Martin
 */
public class CPPrincipal {
    private final PanelInicio P;

    /**
     * Constructor del controlador del panel de inicio.
     * @param p El panel de inicio asociado a este controlador.
     */
    public CPPrincipal(PanelInicio p) {
        this.P = p;
    }

    /**
     * Actualiza el idioma del panel de inicio.
     * @param bundle El ResourceBundle que contiene los textos localizados.
     */
    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_inicio_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("lbl_inicio_titulo")+"</div></html>");
    }   
}