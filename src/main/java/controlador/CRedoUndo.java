package controlador;

import javax.swing.*;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * La clase CRedoUndo proporciona métodos estáticos para agregar funcionalidad de deshacer y rehacer a un JTextField.
 * @author Tomás González Martín
 */
public class CRedoUndo {

    /**
     * Agrega la funcionalidad de deshacer y rehacer a un JTextField.
     *
     * @param textField El JTextField al que se le agregará la funcionalidad de deshacer y rehacer.
     */
    public static void addUndoRedoFunctionality(JTextField textField) {
        // Creamos un UndoManager
        UndoManager undoManager = new UndoManager();

        // Asociamos el UndoManager al Document del JTextField
        textField.getDocument().addUndoableEditListener(undoManager);

        // Acción de deshacer
        Action undoAction = new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
            }
        };

        // Acción de rehacer
        Action redoAction = new AbstractAction("Redo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoManager.canRedo()) {
                    undoManager.redo();
                }
            }
        };

        // Mapeamos las combinaciones de teclas a las acciones
        textField.getActionMap().put("Undo", undoAction);
        textField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK), "Undo");

        textField.getActionMap().put("Redo", redoAction);
        textField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK), "Redo");
    }
}
