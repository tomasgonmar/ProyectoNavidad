
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.LoadingScreen;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRecuperacion;
import vista.VentanaRegistro;

/**
 *
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        
        LoadingScreen ls = new LoadingScreen();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ls.setVisible(true);
            }
        });
        ls.inicioAplicacion();
        ls.dispose();
        new VentanaLogin().setVisible(true);
        
        
    }
}
