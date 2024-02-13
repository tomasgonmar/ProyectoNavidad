package controlador.frames;

import controlador.UDiseño;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import vista.paneles.PInicio;
import vista.paneles.PLibros;
import vista.paneles.PMusica;
import vista.paneles.PPeliculas;
import vista.paneles.PPerfil;
import vista.paneles.PServicios;
import vista.frames.FrameApp;

/**
 * Controlador para la ventana principal de la aplicación.
 * Gestiona las interacciones y eventos relacionados con la interfaz de usuario de la aplicación.
 * @author Tomas Gonzalez Martin
 */
public class ControladorVPrincipal {

    private final FrameApp V_PRINCIPAL;
    private CardLayout CARD_LAYOUT;
    /**
     * Constructor del controlador de la ventana principal.
     * @param vPrincipal La instancia de FrameApp asociada a este controlador.
     */
    public ControladorVPrincipal(FrameApp vPrincipal) {
        this.V_PRINCIPAL = vPrincipal;
        inicializarCardLayout();
        actualizarIdioma();
        actualizarImagen();
    }
    /**
     * Inicializa el CardLayout y los paneles de la ventana principal.
     */
    public void inicializarCardLayout() {
        CARD_LAYOUT = new CardLayout();
        V_PRINCIPAL.panelCentral.setLayout(CARD_LAYOUT);
        
        Locale l = V_PRINCIPAL.getLocale();
        
        V_PRINCIPAL.setpInicio(new PInicio(l));
        V_PRINCIPAL.setpServicios(new PServicios(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpPeliculas(new PPeliculas(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpLibros(new PLibros(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpMusica(new PMusica(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        V_PRINCIPAL.setpPerfil(new PPerfil(V_PRINCIPAL.getCon(),V_PRINCIPAL.getUser()));
        
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpInicio(),"pInicio");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpServicios(),"pServicios");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpPeliculas(),"pPeliculas");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpLibros(),"pLibros");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpMusica(),"pMusica");
        V_PRINCIPAL.panelCentral.add(V_PRINCIPAL.getpPerfil(),"pPerfil");
        
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pInicio");
        V_PRINCIPAL.setPanelActual("pInicio");
    }
    /**
     * Maneja el evento del mouse cuando se presiona en la ventana.
     * @param evt El evento del mouse.
     */
    public void desplazamientoPressed(MouseEvent evt) {
        V_PRINCIPAL.setXMouse(evt.getX());
        V_PRINCIPAL.setYMouse(evt.getY());
    }
    /**
     * Mueve la ventana por la pantalla.
     * @param evt El evento del mouse.
     */
    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        V_PRINCIPAL.setLocation(x-V_PRINCIPAL.getXMouse(),y-V_PRINCIPAL.getYMouse());
    }
    /**
     * Cambia al panel de servicios.
     */
    public void eventosBtnServicios() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pServicios");
        V_PRINCIPAL.setPanelActual("pServicios");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnServicios());
    }
    /**
     * Cambia al panel de inicio.
     */
    public void eventosBtnInicio() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pInicio");
        V_PRINCIPAL.setPanelActual("pInicio");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnInicio());
    }
    /**
     * Cambia al panel de peliculas.
     */
    public void eventosBtnPeliculas() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pPeliculas");
        V_PRINCIPAL.setPanelActual("pPeliculas");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnPeliculas());
    }
    /**
     * Cambia al panel de libros.
     */
    public void eventosBtnLibros() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pLibros");
        V_PRINCIPAL.setPanelActual("pLibros");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnLibros());
    }
    /**
     * Cambia al panel de musica.
     */
    public void eventosBtnMusica() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pMusica");
        V_PRINCIPAL.setPanelActual("pMusica");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnMusica());
    }
    /**
     * Cambia al panel de perfil.
     */
    public void eventoBtnPerfil() {
        CARD_LAYOUT.show(V_PRINCIPAL.panelCentral, "pPerfil");
        V_PRINCIPAL.setPanelActual("pPerfil");
        UDiseño.eliminarFondoBtnsPaneInicio(V_PRINCIPAL);
        UDiseño.btnPaneInicioActivo(V_PRINCIPAL.getBtnPerfil());
    }
    /**
    * Activa el estado visual del botón pasado como argumento.
    * @param btn El botón al que se le aplicará el estado visual activo.
    */
    public void entrarBtn(JButton btn) {
        UDiseño.btnPaneInicioActivo(btn);
    }
    /**
    * Cambia el estado visual del botón pasado como argumento al salir de un panel específico.
    * Si el panel actual no es igual al panel pasado como argumento, se elimina el fondo del botón.
    * @param panelActual El panel actual de la aplicación.
    * @param btn El botón al que se le cambiará el estado visual.
    */
    public void salirBtn(String panelActual, JButton btn) {
        if(!V_PRINCIPAL.getPanelActual().equals(panelActual))
            UDiseño.eliminarFondoBtnPaneInicio(btn);
    }
    /**
    * Cambia el estado visual del botón de salida.
    * @param entrar true si se activa, false si se desactiva.
    */
    public void cambiarEstadoBtnSalida(boolean entrar) {
        UDiseño.cambiarColor(V_PRINCIPAL.btnExit, entrar);
    }
    /**
     * Actualiza el idioma de la interfaz de usuario.
     */
    private void actualizarIdioma() {
        ResourceBundle bundle = ResourceBundle.getBundle("idioma",V_PRINCIPAL.getLocale());
        V_PRINCIPAL.getpInicio().actualizarIdioma(bundle); //
        V_PRINCIPAL.getpLibros().actualizarIdioma(bundle); //
        V_PRINCIPAL.getpMusica().actualizarIdioma(bundle); //
        V_PRINCIPAL.getpPeliculas().actualizarIdioma(bundle); //
        V_PRINCIPAL.getpPerfil().actualizarIdioma(bundle); //
        V_PRINCIPAL.getpServicios().actualizarIdioma(bundle); //
        V_PRINCIPAL.getBtnInicio().setText(bundle.getString("btn_app_inicio"));
        V_PRINCIPAL.getBtnServicios().setText(bundle.getString("btn_app_servicios"));
        V_PRINCIPAL.getBtnPeliculas().setText(bundle.getString("btn_app_peliculas"));
        V_PRINCIPAL.getBtnMusica().setText(bundle.getString("btn_app_musica"));
        V_PRINCIPAL.getBtnLibros().setText(bundle.getString("btn_app_libros"));
        V_PRINCIPAL.getBtnPerfil().setText(bundle.getString("btn_app_perfil"));
        
    }
    /**
     * Maneja el evento del clic en la bandera del idioma.
     * @param evt El evento del mouse.
     */
    public void btnIdioma(MouseEvent evt) {
        String idioma = V_PRINCIPAL.getLocale().toString();
        switch(idioma){
            case("es_ES"):
                V_PRINCIPAL.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_en.png", "idioma"));
                V_PRINCIPAL.setLocale(new Locale("en","US"));
                actualizarIdioma();
                break;
            case("en_US"):
                V_PRINCIPAL.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_es.png", "idioma"));
                V_PRINCIPAL.setLocale(new Locale("es","ES"));
                actualizarIdioma();
                break;
        }
    }
    /**
     * Actualiza la imagen del idioma en la ventana.
     */
    public void actualizarImagen(){
        String idioma = V_PRINCIPAL.getLocale().toString();
        switch(idioma){
            case("es_ES"):
                V_PRINCIPAL.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_es.png", "idioma"));
                break;
            case("en_US"):
                V_PRINCIPAL.getLblIdioma().setIcon(UDiseño.createImageIcon("/img/iconos/bandera_en.png", "idioma"));
                break;
        }
    }
}
