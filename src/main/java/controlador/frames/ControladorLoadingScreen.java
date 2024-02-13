package controlador.frames;

import controlador.ConexionBDD;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.JOptionPane;
import vista.frames.FrameLoadingScreen;
import vista.frames.FrameLogin;

/**
 * Controlador para la pantalla de carga de la aplicación.
 * Esta clase maneja el inicio de la aplicación, mostrando una barra de progreso y realizando las operaciones necesarias
 * antes de mostrar la ventana de inicio de sesión.
 * @author Tomás González Martín
 */
public class ControladorLoadingScreen {
    private final FrameLoadingScreen F_LOADING_SCREEN;
    
    /**
     * Constructor del controlador de la pantalla de carga.
     * @param fLoadingScreen La instancia de FrameLoadingScreen asociada a este controlador.
     */
    public ControladorLoadingScreen(FrameLoadingScreen fLoadingScreen){
        this.F_LOADING_SCREEN = fLoadingScreen;
    }

    /**
     * Método para iniciar la aplicación.
     * Este método controla la barra de progreso y realiza las operaciones necesarias antes de mostrar la ventana de inicio de sesión.
     */
    public void iniciarAplicacion() {
        int i = 0;
        try{
            while (i <= 100) {
                F_LOADING_SCREEN.getProgresBar().setValue(i);
                i++;
                // Cuando llegue al 95% realiza la conexión de la base de datos, en el resto se duerme durante 10 milisegundos para avanzar la carga
                switch (i) {
                    case 95 -> {
                        // Realiza la conexión a la base de datos y prepara la ventana de inicio de sesión
                        F_LOADING_SCREEN.setConexion(new ConexionBDD());
                        F_LOADING_SCREEN.setVentanaLogin(new FrameLogin(F_LOADING_SCREEN.getConexion(), new Locale("es","Es")));
                    }
                    default -> Thread.sleep(10);
                }
            }
        } catch (InterruptedException | SQLException | ClassNotFoundException ex) {
            // Si se produce una excepción, muestra un mensaje de error al usuario
            JOptionPane.showMessageDialog(F_LOADING_SCREEN.getRootPane(), "Error al iniciar la aplicación", "Error", HEIGHT);
        }
        // Cierra el frame de carga y muestra la ventana de inicio de sesión
        F_LOADING_SCREEN.dispose();
        F_LOADING_SCREEN.getVentanaLogin().setVisible(true);
    }
}
