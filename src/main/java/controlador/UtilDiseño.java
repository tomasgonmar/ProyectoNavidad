package controlador;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Tomás González Martín
 */
public class UtilDiseño {
    public static void cambiarColorYBorde(JLabel label,boolean entrar) {
        Color colorTexto = entrar ? Color.WHITE : new Color(164, 164, 164);
        Border borde = entrar ? BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE) : null;

        label.setForeground(colorTexto);
        label.setBorder(borde);
    }
    
    public static void cambiarColor(JButton label,boolean entrar) {
        Color colorTexto = entrar ? Color.red : new Color(164, 164, 164);

        label.setForeground(colorTexto);
    }
}
