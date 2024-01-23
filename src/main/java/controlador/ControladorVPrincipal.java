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

    private FrameApp vPrincipal;
    private CardLayout CARD_LAYOUT;
    
    public ControladorVPrincipal(FrameApp vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    public void inicializarCardLayout() {
        CARD_LAYOUT = new CardLayout();
        vPrincipal.panelCentral.setLayout(CARD_LAYOUT);
        
        vPrincipal.setpInicio(new PanelInicio());
        vPrincipal.setpServicios(new PanelServicios());
        vPrincipal.setpPeliculas(new PanelPeliculas());
        vPrincipal.setpLibros(new PanelLibros());
        vPrincipal.setpMusica(new PanelMusica());
        vPrincipal.setpPerfil(new PanelPerfil());
        
        vPrincipal.panelCentral.add(vPrincipal.getpInicio(),"pInicio");
        vPrincipal.panelCentral.add(vPrincipal.getpServicios(),"pServicios");
        vPrincipal.panelCentral.add(vPrincipal.getpPeliculas(),"pPeliculas");
        vPrincipal.panelCentral.add(vPrincipal.getpLibros(),"pLibros");
        vPrincipal.panelCentral.add(vPrincipal.getpMusica(),"pMusica");
        vPrincipal.panelCentral.add(vPrincipal.getpPerfil(),"pPerfil");
        
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pInicio");
        vPrincipal.setPanelActual("pInicio");
    }
    
    public void desplazamientoPressed(MouseEvent evt) {
        vPrincipal.setXMouse(evt.getX());
        vPrincipal.setYMouse(evt.getY());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        vPrincipal.setLocation(x-vPrincipal.getXMouse(),y-vPrincipal.getYMouse());
    }

    public void eventosBtnServicios() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pServicios");
        vPrincipal.setPanelActual("pServicios");
        UtilDiseño.eliminarFondoBtnsPaneInicio(vPrincipal);
        UtilDiseño.btnPaneInicioActivo(vPrincipal.getBtnServicios());
    }

    public void eventosBtnInicio() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pInicio");
        vPrincipal.setPanelActual("pInicio");
        UtilDiseño.eliminarFondoBtnsPaneInicio(vPrincipal);
        UtilDiseño.btnPaneInicioActivo(vPrincipal.getBtnInicio());
    }

    public void eventosBtnPeliculas() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pPeliculas");
        vPrincipal.setPanelActual("pPeliculas");
        UtilDiseño.eliminarFondoBtnsPaneInicio(vPrincipal);
        UtilDiseño.btnPaneInicioActivo(vPrincipal.getBtnPeliculas());
    }

    public void eventosBtnLibros() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pLibros");
        vPrincipal.setPanelActual("pLibros");
        UtilDiseño.eliminarFondoBtnsPaneInicio(vPrincipal);
        UtilDiseño.btnPaneInicioActivo(vPrincipal.getBtnLibros());
    }

    public void eventosBtnMusica() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pMusica");
        vPrincipal.setPanelActual("pMusica");
        UtilDiseño.eliminarFondoBtnsPaneInicio(vPrincipal);
        UtilDiseño.btnPaneInicioActivo(vPrincipal.getBtnMusica());
    }

    public void eventoBtnPerfil() {
        CARD_LAYOUT.show(vPrincipal.panelCentral, "pPerfil");
    }

    public void entrarBtn(JButton btn) {
        UtilDiseño.btnPaneInicioActivo(btn);
    }

    public void salirBtn(String panelActual, JButton btn) {
        if(!vPrincipal.getPanelActual().equals(panelActual))
            UtilDiseño.eliminarFondoBtnPaneInicio(btn);
    }

    public void cambiarEstadoBtnSalida(boolean entrar) {
        UtilDiseño.cambiarColor(vPrincipal.btnExit, entrar);
    }
}
