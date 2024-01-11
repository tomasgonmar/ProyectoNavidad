package controlador;

import java.awt.event.MouseEvent;
import vista.VentanaLogin;
import vista.VentanaRegistro;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRegistro {

    private VentanaRegistro ventanaReg;
    
    public ControladorRegistro(VentanaRegistro ventanaReg) {
        this.ventanaReg = ventanaReg;
    }

    public void salir() {
        System.exit(0);
    }

    public void abrirInicioSesion() {
        new VentanaLogin().setVisible(true);
        ventanaReg.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ventanaReg.setLocation(x-ventanaReg.getXMouse(),y-ventanaReg.getYyMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        ventanaReg.setXMouse(evt.getX());
        ventanaReg.setYMouse(evt.getY());
    }
    
}
