import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import vista.LoadingScreen;

/**
 *
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        
        LoadingScreen ls = new LoadingScreen();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ls.setVisible(true);
        });
        
        ls.inicioAplicacion();
    }
}
