package controlador;

import java.awt.event.MouseEvent;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRecuperacion;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class ControladorRecuperacion {
    
    private VentanaRecuperacion ventanaRec;

    public ControladorRecuperacion(VentanaRecuperacion ventanaRec) {
        this.ventanaRec = ventanaRec;
    }

    public void salir() {
        new VentanaLogin().setVisible(true);
        ventanaRec.dispose();
    }

    public void desplazamientoPressed(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ventanaRec.setLocation(x-ventanaRec.getXMouse(),y-ventanaRec.getYMouse());
    }

    public void movimientoPorPantalla(MouseEvent evt) {
        ventanaRec.setXMouse(evt.getX());
        ventanaRec.setYMouse(evt.getY());
    }

    public void enviarNuevaContraseña() {
        Usuario user = new Usuario(ventanaRec.getEmail());
        if(user.emailValido()){
            EmailUtil.sendEmail(user.getEmail(), "nuevaContraseña");
        }
        
        
    }
    
}
