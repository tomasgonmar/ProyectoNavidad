package controlador;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import vista.frames.FrameApp;

/**
 * Clase para utilidades de diseño de interfaz de usuario.
 * Proporciona métodos estáticos para cambiar colores, bordes, formas y estilos de componentes de la interfaz de usuario.
 * También proporciona métodos para cargar imágenes, redondear elementos y colocar iconos en campos de texto.
 * Además, tiene métodos específicos para estilizar diferentes componentes de la interfaz de usuario.
 * Basado en el diseño de la aplicación.
 * Utiliza FlatLaf para el estilo de componentes de interfaz de usuario.
 * @author Tomás González Martín
 */
public class UtilDiseño {
    /**
    * Cambia el color del texto y el borde de un JLabel según la condición especificada.
    * @param label El JLabel al que se le cambiará el color y el borde.
    * @param entrar Indica si se está entrando en alguna área.
    */
   public static void cambiarColorYBorde(JLabel label, boolean entrar) {
       Color colorTexto = entrar ? Color.WHITE : new Color(164, 164, 164);
       Border borde = entrar ? BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE) : null;

       label.setForeground(colorTexto);
       label.setBorder(borde);
   }

   /**
    * Cambia el color del texto de un JButton según la condición especificada.
    * @param label El JButton al que se le cambiará el color del texto.
    * @param entrar Indica si se está entrando en alguna área.
    */
   public static void cambiarColor(JButton label, boolean entrar) {
       Color colorTexto = entrar ? Color.red : new Color(164, 164, 164);

       label.setForeground(colorTexto);
   }

   /**
    * Redondea los bordes de un JFrame.
    * @param frame El JFrame al que se le redondearán los bordes.
    */
   public static void redondearVentana(JFrame frame) {
       Shape s = new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 20, 20);
       frame.setShape(s);
   }

   /**
    * Crea un ImageIcon a partir de la ruta y la descripción especificadas.
    * @param path La ruta del archivo de imagen.
    * @param description La descripción del ImageIcon.
    * @return ImageIcon creado a partir de la ruta y la descripción.
    */
   public static ImageIcon createImageIcon(String path, String description) {
       try {
           URL imageURL = UtilDiseño.class.getResource(path);
           if (imageURL != null) {
               BufferedImage image = ImageIO.read(imageURL);
               return new ImageIcon(image, description);
           } else {
               System.err.println("Resource not found: " + path);
               return null;
           }
       } catch (IOException e) {
           e.printStackTrace();
           return null;
       }
   }

   /**
    * Establece el estilo de redondeado para un componente.
    * @param elemento El componente al que se le establecerá el estilo de redondeado.
    */
   public static void redondearElemento(JComponent elemento) {
       elemento.putClientProperty("FlatLaf.style", "arc:30");
   }

   /**
    * Coloca un texto de marcador de posición en un JTextField.
    * @param elemento El JTextField al que se le colocará el texto de marcador de posición.
    * @param texto El texto de marcador de posición a colocar.
    */
   public static void colocarPlaceHolderText(JTextField elemento, String texto) {
       elemento.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, texto);
   }

   /**
    * Cambia el relleno de un JTextField.
    * @param elemento El JTextField al que se le cambiará el relleno.
    */
   public static void cambiarPadding(JTextField elemento) {
       elemento.putClientProperty("JTextField.padding", new Insets(0, 20, 0, 0));
   }

   /**
    * Coloca un icono principal en un JTextField.
    * @param elemento El JTextField al que se le colocará el icono principal.
    * @param path La ruta del archivo de imagen del icono.
    */
   public static void colocarTextFieldLeadingIcon(JTextField elemento, String path) {
       elemento.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON,
               UtilDiseño.createImageIcon(path, "Icono"));
   }

   /**
    * Estiliza un JTextField para representar un campo de correo electrónico.
    * @param tFEmail El JTextField que representa el campo de correo electrónico.
    */
   public static void estilizarTextFieldEmail(JTextField tFEmail) {
       redondearElemento(tFEmail);
       colocarPlaceHolderText(tFEmail, "tucorreo@gmail.com");
       cambiarPadding(tFEmail);
       colocarTextFieldLeadingIcon(tFEmail, "/img/iconos/IconoEmail.png");
       cambiarColorOutline(tFEmail);
   }

   /**
    * Estiliza un JTextField para representar un campo de usuario.
    * @param tFUser El JTextField que representa el campo de usuario.
    */
   public static void estilizarTextFieldUser(JTextField tFUser) {
       redondearElemento(tFUser);
       colocarPlaceHolderText(tFUser, "Usuario");
       cambiarPadding(tFUser);
       colocarTextFieldLeadingIcon(tFUser, "/img/iconos/IconoUsuario.png");
       cambiarColorOutline(tFUser);
   }

   /**
    * Estiliza un JPasswordField para representar un campo de contraseña.
    * @param tFPassword El JPasswordField que representa el campo de contraseña.
    */
   public static void estilizarTextFieldPassword(JPasswordField tFPassword) {
       redondearElemento(tFPassword);
       colocarPlaceHolderText(tFPassword, "******************");
       cambiarPadding(tFPassword);
       colocarTextFieldLeadingIcon(tFPassword, "/img/iconos/IconoContraseña.png");
       cambiarColorOutline(tFPassword);
   }

   /**
    * Estiliza un JButton aplicando redondeado y contorno.
    * @param btnIniciar El JButton a estilizar.
    */
   public static void estilizarBtn(JButton btnIniciar) {
       redondearElemento(btnIniciar);
       cambiarColorOutline(btnIniciar);
   }

    /**
    * Estiliza el JButton especificado con un color personalizado y aplica redondeado y contorno.
    * @param btnIniciar El JButton a estilizar.
    * @param color El color personalizado para el contorno.
    */
   public static void estilizarBtn(JButton btnIniciar, String color) {
       redondearElemento(btnIniciar);
       cambiarColorOutline(btnIniciar, color);
   }

   /**
    * Cambia el color del contorno del componente especificado con un color predeterminado.
    * @param elemento El componente al que se cambiará el contorno.
    */
   private static void cambiarColorOutline(JComponent elemento) {
       elemento.putClientProperty("JComponent.outline", new Color[]{Color.white, Color.decode("#1a1a1a")});
   }

   /**
    * Cambia el color del contorno del componente especificado con un color personalizado.
    * @param elemento El componente al que se cambiará el contorno.
    * @param color El color personalizado para el contorno.
    */
   private static void cambiarColorOutline(JComponent elemento, String color) {
       elemento.putClientProperty("JComponent.outline", new Color[]{Color.white, Color.decode(color)});
   }

   /**
    * Activa el área de contenido de un JButton.
    * @param btn El JButton al que se activará el área de contenido.
    */
   public static void btnPaneInicioActivo(JButton btn) {
       btn.setContentAreaFilled(true);
   }

   /**
    * Elimina el fondo del área de contenido de un JButton.
    * @param btn El JButton al que se eliminará el fondo del área de contenido.
    */
   public static void eliminarFondoBtnPaneInicio(JButton btn) {
       btn.setContentAreaFilled(false);
   }

   /**
    * Estiliza el botón del panel de inicio de la aplicación con redondeado y contorno.
    * @param btn El JButton del panel de inicio a estilizar.
    */
   public static void estilizarBotonPanelInicio(JButton btn) {
       redondearElemento(btn);
       cambiarColorOutline(btn);
   }

    /**
    * Estiliza el botón del perfil con características específicas, como redondear el elemento y cambiar el color del contorno.
    * @param btn El JButton del perfil al que se aplicarán los estilos.
    */
    public static void estilizarBotonPerfil(JButton btn) {
        redondearElemento(btn);
        cambiarColorOutline(btn);
    }
    /**
     * Elimina el fondo del área de contenido de los botones del panel de inicio de la aplicación.
     * @param aThis La instancia del FrameApp que contiene los botones del panel de inicio.
     */
    public static void eliminarFondoBtnsPaneInicio(FrameApp aThis) {
        eliminarFondoBtnPaneInicio(aThis.getBtnInicio());
        eliminarFondoBtnPaneInicio(aThis.getBtnServicios());
        eliminarFondoBtnPaneInicio(aThis.getBtnPeliculas());
        eliminarFondoBtnPaneInicio(aThis.getBtnLibros());
        eliminarFondoBtnPaneInicio(aThis.getBtnMusica());
    }
}
