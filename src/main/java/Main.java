import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import vista.frames.FrameLoadingScreen;

/**
 * Clase principal de la aplicacion que inicia el programa
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Se inicia el tema de FlatLaf ArcDark
         */
        FlatArcDarkIJTheme.setup();
        /**
         * Inicializa el frame de la pantalla de carga de la aplicacion
         */
        FrameLoadingScreen ls = new FrameLoadingScreen();
        /**
         * Se hace visible el frame de la pantalla de carga
         */
        java.awt.EventQueue.invokeLater(() -> {
            ls.setVisible(true);
        });
        /**
         * Se llama la funcion del frame de la pantalla de carga para que comience
         * la aplicacion
         */
        ls.inicioAplicacion();
    }
}
