package controlador;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.JOptionPane;
import vista.frames.FrameLoadingScreen;
import vista.frames.FrameLogin;

/**
 *
 * @author Tomás González Martín
 */
public class ControladorLoadingScreen {
    private final FrameLoadingScreen F_LOADING_SCREEN;
    public ControladorLoadingScreen(FrameLoadingScreen fLoadingScreen){
        this.F_LOADING_SCREEN = fLoadingScreen;
    }

    public void iniciarAplicacion() {
        int i = 0;
        try{
            while (i <= 100) {
                F_LOADING_SCREEN.getProgresBar().setValue(i);
                i++;
                /**
                 * Cuando llegue al 95% realiza la conexion de la base de datos,
                 * en el resto se duerme durante 10 milisegundos para avanzar la
                 * carga
                 */
                switch (i) {
                    case 95 -> {
                        F_LOADING_SCREEN.setConexion(new ConexionBDD());
                        F_LOADING_SCREEN.setVentanaLogin(new FrameLogin(F_LOADING_SCREEN.getConexion(), new Locale("es","Es")));
                    }
                    default -> Thread.sleep(10);
                }
            }
        /**
         * Cuando se produce una excepcion muestra un mensaje de error al usuario
         */    
        } catch (InterruptedException | SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(F_LOADING_SCREEN.getRootPane(), "Error al iniciar la aplicacion", "Error", HEIGHT);
        }
        /**
         * Cerramos el frame y se muestra la ventana del login
         */
        F_LOADING_SCREEN.dispose();
        F_LOADING_SCREEN.getVentanaLogin().setVisible(true);
    }
    
}
