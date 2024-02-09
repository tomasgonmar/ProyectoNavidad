package controlador;

import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import vista.paneles.PanelInicio;
import vista.paneles.PanelLibros;
import vista.paneles.PanelMusica;
import vista.paneles.PanelPeliculas;
import vista.paneles.PanelPerfil;
import vista.paneles.PanelServicios;
import vista.frames.FrameApp;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorVPrincipal {

    private final FrameApp V_PRINCIPAL;
    private CardLayout CARD_LAYOUT;
    
    public ControladorVPrincipal(FrameApp vPrincipal) {
        this.V_PRINCIPAL = vPrincipal;
    }

    public void inicializarCardLayout() {
        CARD_LAYOUT = new CardLayout();
        V_PRINCIPAL.panelCentral.setLayout(CARD_LAYOUT);
        
        V_PRINCIPAL.setpInicio(new PanelInicio());
        V_PRINCIPAL.setpServicios(new PanelServicios(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpPeliculas(new PanelPeliculas(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpLibros(new PanelLibros(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpMusica(new PanelMusica(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpPerfil(new PanelPerfil(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpInicio(),"pInicio");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpServicios(),"pServicios");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpPeliculas(),"pPeliculas");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpLibros(),"pLibros");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpMusica(),"pMusica");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpPerfil(),"pPerfil");
        
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pInicio");
        V_PRINCIPAL.setPanelActual("pInicio");
    }
    
    public void desplazamientoPressed(MouseEvent evt) {
        V_PRINCIPAL.setXMouse(evt.getX());
        V_PRINCIPAL.setYMouse(evt.getY());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        V_PRINCIPAL.setLocation(x-V_PRINCIPAL.getXMouse(),y-V_PRINCIPAL.getYMouse());
    }

    public void eventosBtnServicios() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pServicios");
        V_PRINCIPAL.setPanelActual("pServicios");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnServicios());
    }

    public void eventosBtnInicio() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pInicio");
        V_PRINCIPAL.setPanelActual("pInicio");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnInicio());
    }

    public void eventosBtnPeliculas() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pPeliculas");
        V_PRINCIPAL.setPanelActual("pPeliculas");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnPeliculas());
    }

    public void eventosBtnLibros() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pLibros");
        V_PRINCIPAL.setPanelActual("pLibros");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnLibros());
    }

    public void eventosBtnMusica() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pMusica");
        V_PRINCIPAL.setPanelActual("pMusica");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnMusica());
    }

    public void eventoBtnPerfil() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pPerfil");
        V_PRINCIPAL.setPanelActual("pPerfil");
        UtilDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UtilDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnPerfil());
    }

    public void entrarBtn(JButton btn) {
        UtilDiseño.btnPaneInicioActivo(btn);
    }

    public void salirBtn(String panelActual, JButton btn) {
        if(!V_PRINCIPAL.getPanelActual().equals(panelActual))
            UtilDiseño.eliminarFondoBtnPaneInicio(btn);
    }

    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(V_PRINCIPAL.btnExit, entrar);
    }
}
