
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import vista.VentanaPrincipal;

/**
 *
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
        
    }
}
