/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Tomás González Martín
 */
public class ImagenUtil {
    
    public static ImageIcon createImageIcon(String path, String description) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image, description);
        } catch (IOException e) {
            return null;
        }
    }
}
