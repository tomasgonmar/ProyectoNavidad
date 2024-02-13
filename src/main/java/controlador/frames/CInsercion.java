package controlador.frames;

import controlador.UDiseño;
import controlador.UResultSet;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Libro;
import vista.frames.FInsert;

/**
 * Controlador para la inserción de libros asociados a usuarios.
 * Permite gestionar la inserción de libros asociados a un usuario en la base de datos.
 * Proporciona funcionalidades para cerrar la ventana, gestionar el movimiento por pantalla,
 * cambiar el estado del botón de salida, guardar la inserción y agregar libros al ComboBox.
 * 
 * @author Tomas Gonzalez Martin
 */
public class CInsercion {
    
    private final FInsert p; // Ventana de inserción
    private List<Libro> libros; // Lista de libros disponibles

    /**
     * Constructor de la clase CInsercion.
     * 
     * @param p Ventana de inserción de libros.
     */
    public CInsercion(FInsert p) {
        this.p = p;
        try {
            libros = UResultSet.transformResSetLibrosP(p.getCon().obtenerLibros());
            agregarLibrosCombo(libros);
        } catch (SQLException ex) {
            Logger.getLogger(CInsercion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cierra la ventana de inserción.
     */
    public void cerrar() {
        p.dispose();
    }

    /**
     * Gestiona el movimiento de la ventana por pantalla.
     * 
     * @param evt Evento del mouse.
     */
    public void movimientoPorPantalla(MouseEvent evt) {
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        p.setLocation(x-p.getxMouse(),y-p.getyMouse());
    }

    /**
     * Gestiona el desplazamiento de la ventana al presionar el mouse.
     * 
     * @param evt Evento del mouse.
     */
    public void desplazamientoPressed(MouseEvent evt) {
        p.setxMouse(evt.getX());
        p.setyMouse(evt.getY());
    }

    /**
     * Cambia el estado visual del botón de salida.
     * 
     * @param b Estado visual del botón de salida.
     */
    public void cambiarEstadoBtnSalida(boolean b) {
        UDiseño.cambiarColor(p.getBtnExit(), b);
    }

    /**
     * Guarda la inserción del libro asociado al usuario.
     * 
     * @return true si la inserción se realizó correctamente, false si no.
     */
    public boolean guardar() {
        int id = libros.get(p.getCb().getSelectedIndex()).getId();
        try{
            double puntuacion = Double.parseDouble(p.gettFPuntuacion().getText().toString());
            if(puntuacion > 5 || puntuacion < 0){
                JOptionPane.showMessageDialog(p, "La puntuacion no es valida");
                return false;
            }
            p.getCon().asociarLibro(p.getUser(),id,puntuacion);
            p.getFa().insertarLibros();
        } catch(SQLIntegrityConstraintViolationException eof) {
            JOptionPane.showMessageDialog(p, "Este libro ya lo tienes asociado a tu cuenta");
            return false;
        } catch(Exception eof) {
            JOptionPane.showMessageDialog(p, "Puntuacion no valida");
            return false;
        }
        JOptionPane.showMessageDialog(p, "Libro agregado correctamente.");
        p.dispose();
        return true;
    }

    /**
     * Agrega los libros disponibles al ComboBox de la ventana.
     * 
     * @param libros Lista de libros disponibles.
     */
    private void agregarLibrosCombo(List<Libro> libros) {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for(Libro l: libros){
            modelo.addElement(l.getTitulo());
        }
        p.getCb().setModel(modelo);
    }
}
