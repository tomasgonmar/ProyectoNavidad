package controlador;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
    
    public static void redondearVentana(JFrame frame){
        Shape s = new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 20, 20);
        frame.setShape(s);
    }

    public static ImageIcon createImageIcon(String path, String description) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image, description);
        } catch (IOException e) {
            return null;
        }
    }

    public static void redondearElemento(JTextField elemento) {
        elemento.putClientProperty( "FlatLaf.style", "arc:30" );
    }

    public static void redondearElemento(JButton elemento) {
        elemento.putClientProperty( "FlatLaf.style", "arc:30" );
    }

    public static void colocarPlaceHolderText(JTextField elemento, String texto) {
        elemento.putClientProperty( FlatClientProperties.PLACEHOLDER_TEXT, texto );
    }

    public static void cambiarPadding(JTextField elemento) {
        elemento.putClientProperty("JTextField.padding", new Insets(0,20,0,0));
    }

    public static void colocarTextFieldLeadingIcon(JTextField elemento, String path) {
        elemento.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, 
                UtilDiseño.createImageIcon(path, "Icono"));
    }
    
    public static void estilizarTextFieldEmail(JTextField tFEmail) {
        redondearElemento(tFEmail);
        colocarPlaceHolderText(tFEmail,"tucorreo@gmail.com");
        cambiarPadding(tFEmail);
        colocarTextFieldLeadingIcon(tFEmail,"src/main/resources/img/IconoEmail.png");
    }

    public static void estilizarTextFieldUser(JTextField tFUser) {
        redondearElemento(tFUser);
        colocarPlaceHolderText(tFUser,"Usuario");
        cambiarPadding(tFUser);
        colocarTextFieldLeadingIcon(tFUser,"src/main/resources/img/IconoUsuario.png");
    }

    public static void estilizarTextFieldPassword(JPasswordField tFPassword) {
        redondearElemento(tFPassword);
        colocarPlaceHolderText(tFPassword,"******************");
        cambiarPadding(tFPassword); 
        colocarTextFieldLeadingIcon(tFPassword,"src/main/resources/img/IconoContraseña.png");
    }

    public static void estilizarBtn(JButton btnIniciar) {
        redondearElemento(btnIniciar);
    }
}
