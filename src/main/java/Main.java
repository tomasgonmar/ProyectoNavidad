import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import vista.frames.FrameLoadingScreen;

/**
 *
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        
        FrameLoadingScreen ls = new FrameLoadingScreen();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ls.setVisible(true);
        });
        
        ls.inicioAplicacion();
    }
}
