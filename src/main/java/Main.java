import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import vista.LoadingScreen;
import vista.VentanaLogin;

/**
 *
 * @author Tomás González Martín
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        
        LoadingScreen ls = new LoadingScreen();
        VentanaLogin v = new VentanaLogin();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ls.setVisible(true);
            }
        });
        //ls.inicioAplicacion();
        ls.dispose();
        v.setVisible(true);
        
        
    }
}
