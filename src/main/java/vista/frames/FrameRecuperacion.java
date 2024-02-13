package vista.frames;

import controlador.ConBDD;
import controlador.frames.CRecuperacion;
import controlador.UDiseño;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Esta clase representa la ventana de recuperación de contraseña.
 * Permite a los usuarios solicitar la recuperación de sus contraseñas.
 * @author Tomas Gonzalez Martin
 */
public class FrameRecuperacion extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private final CRecuperacion C_REC;
    private final ConBDD CON;
    /**
     * Constructor de la clase FrameRecuperacion.
     * Crea una nueva instancia de la ventana de recuperación.
     *
     * @param con La conexión a la base de datos.
     * @param idioma El idioma en el que se muestra la interfaz de usuario.
     */
    public FrameRecuperacion(ConBDD con, Locale idioma) {
        initComponents();
        
        this.CON = con;
        
        this.setLocale(idioma);
        
        setIconImage(UDiseño.createImageIcon("/img/logo_myapp/Logo_Nav.png", "Logo").getImage());
        
        C_REC = new CRecuperacion(this);
        
        UDiseño.redondearVentana(this);
        
        UDiseño.estilizarTextFieldEmail(tFEmail);
        UDiseño.estilizarBtn(btnRecuperar); 
        
        getRootPane().setDefaultButton(btnRecuperar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        lbl_recuperacion_titulo = new javax.swing.JLabel();
        lbl_recuperacion_email = new javax.swing.JLabel();
        btnRecuperar = new javax.swing.JButton();
        tFEmail = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_recuperacion_titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_recuperacion_titulo.setForeground(new java.awt.Color(239, 239, 239));
        lbl_recuperacion_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_recuperacion_titulo.setText("<html><div style='text-align: center;'> Recuperar contraseña</div></html>");
        panelCentral.add(lbl_recuperacion_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 318, 120));

        lbl_recuperacion_email.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_recuperacion_email.setForeground(new java.awt.Color(164, 164, 164));
        lbl_recuperacion_email.setText("Email");
        lbl_recuperacion_email.setToolTipText("");
        panelCentral.add(lbl_recuperacion_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 150, -1, -1));

        btnRecuperar.setBackground(new java.awt.Color(158, 255, 0));
        btnRecuperar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setText("Recuperar");
        btnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        panelCentral.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 285, 314, 50));

        tFEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelCentral.add(tFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 183, 314, 55));

        btnExit.setBackground(new java.awt.Color(26, 26, 26));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(164, 164, 164));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelCentral.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, 40));

        panelDesplazamiento.setBackground(new java.awt.Color(26, 26, 26));
        panelDesplazamiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDesplazamientoMouseDragged(evt);
            }
        });
        panelDesplazamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDesplazamientoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelDesplazamientoLayout = new javax.swing.GroupLayout(panelDesplazamiento);
        panelDesplazamiento.setLayout(panelDesplazamientoLayout);
        panelDesplazamientoLayout.setHorizontalGroup(
            panelDesplazamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        panelDesplazamientoLayout.setVerticalGroup(
            panelDesplazamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelCentral.add(panelDesplazamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de clic en el botón de salida.
     * Este método llama al controlador para cerrar la ventana de recuperación.
     * 
     * @param evt El evento de acción del botón de salida.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        C_REC.salir();
    }//GEN-LAST:event_btnExitActionPerformed
    /**
     * Maneja el evento de arrastre del mouse sobre el panel de desplazamiento.
     * Este método llama al controlador para realizar acciones cuando se arrastra el mouse sobre el panel.
     * 
     * @param evt El evento del mouse al arrastrar sobre el panel de desplazamiento.
     */
    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_REC.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged
    /**
     * Maneja el evento de presión del mouse sobre el panel de desplazamiento.
     * Este método llama al controlador para realizar acciones cuando se presiona el mouse sobre el panel.
     * 
     * @param evt El evento del mouse al presionar sobre el panel de desplazamiento.
     */
    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_REC.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed
    /**
     * Maneja el evento de clic en el botón de recuperación.
     * Este método llama al controlador para enviar una nueva contraseña.
     * 
     * @param evt El evento de acción del botón de recuperación.
     */
    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        C_REC.enviarNuevaContraseña();
    }//GEN-LAST:event_btnRecuperarActionPerformed
    /**
     * Maneja el evento de entrada del mouse en el botón de salida.
     * Este método llama al controlador para cambiar el estado del botón de salida cuando el mouse entra en él.
     * 
     * @param evt El evento del mouse al entrar en el botón de salida.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_REC.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * Maneja el evento de salida del mouse del botón de salida.
     * Este método llama al controlador para cambiar el estado del botón de salida cuando el mouse sale de él.
     * 
     * @param evt El evento del mouse al salir del botón de salida.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_REC.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JLabel lbl_recuperacion_email;
    private javax.swing.JLabel lbl_recuperacion_titulo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JTextField tFEmail;
    // End of variables declaration//GEN-END:variables

    /**
     * Proporciona los valores actuales de la coordenada X del mouse.
     *
     * @return La coordenada X actual del mouse.
     */
    public int getXMouse() {
        return xMouse;
    }

    /**
     * Proporciona los valores actuales de la coordenada Y del mouse.
     *
     * @return La coordenada Y actual del mouse.
     */
    public int getYMouse() {
        return yMouse;
    }

    /**
     * Establece la coordenada X del mouse con el valor especificado.
     *
     * @param x El valor de la coordenada X del mouse.
     */
    public void setXMouse(int x) {
        xMouse = x;
    }

    /**
     * Establece la coordenada Y del mouse con el valor especificado.
     *
     * @param y El valor de la coordenada Y del mouse.
     */
    public void setYMouse(int y) {
        yMouse = y;
    }

    /**
     * Obtiene el correo electrónico ingresado por el usuario.
     *
     * @return El correo electrónico ingresado en el campo de texto.
     */
    public String getEmail() {
        return tFEmail.getText();
    }

    /**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public ConBDD getConexion() {
        return CON;
    }

    /**
     * Obtiene el botón de salida.
     *
     * @return El botón de salida.
     */
    public JButton getBtnExit() {
        return btnExit;
    }

    /**
     * Establece el botón de salida.
     *
     * @param btnExit El botón de salida a establecer.
     */
    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    /**
     * Obtiene el botón de recuperación.
     *
     * @return El botón de recuperación.
     */
    public JButton getBtnRecuperar() {
        return btnRecuperar;
    }

    /**
     * Establece el botón de recuperación.
     *
     * @param btnRecuperar El botón de recuperación a establecer.
     */
    public void setBtnRecuperar(JButton btnRecuperar) {
        this.btnRecuperar = btnRecuperar;
    }

    /**
     * Obtiene la etiqueta de correo electrónico de recuperación.
     *
     * @return La etiqueta de correo electrónico de recuperación.
     */
    public JLabel getLbl_recuperacion_email() {
        return lbl_recuperacion_email;
    }

    /**
     * Establece la etiqueta de correo electrónico de recuperación.
     *
     * @param lbl_recuperacion_email La etiqueta de correo electrónico de recuperación a establecer.
     */
    public void setLbl_recuperacion_email(JLabel lbl_recuperacion_email) {
        this.lbl_recuperacion_email = lbl_recuperacion_email;
    }

    /**
     * Obtiene la etiqueta de título de recuperación.
     *
     * @return La etiqueta de título de recuperación.
     */
    public JLabel getLbl_recuperacion_titulo() {
        return lbl_recuperacion_titulo;
    }

    /**
     * Establece la etiqueta de título de recuperación.
     *
     * @param lbl_recuperacion_titulo La etiqueta de título de recuperación a establecer.
     */
    public void setLbl_recuperacion_titulo(JLabel lbl_recuperacion_titulo) {
        this.lbl_recuperacion_titulo = lbl_recuperacion_titulo;
    }

    /**
     * Obtiene el panel central de la interfaz.
     *
     * @return El panel central de la interfaz.
     */
    public JPanel getPanelCentral() {
        return panelCentral;
    }

    /**
     * Establece el panel central de la interfaz.
     *
     * @param panelCentral El panel central de la interfaz a establecer.
     */
    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    /**
     * Obtiene el panel de desplazamiento de la interfaz.
     *
     * @return El panel de desplazamiento de la interfaz.
     */
    public JPanel getPanelDesplazamiento() {
        return panelDesplazamiento;
    }

    /**
     * Establece el panel de desplazamiento de la interfaz.
     *
     * @param panelDesplazamiento El panel de desplazamiento de la interfaz a establecer.
     */
    public void setPanelDesplazamiento(JPanel panelDesplazamiento) {
        this.panelDesplazamiento = panelDesplazamiento;
    }

    /**
     * Obtiene el campo de texto del correo electrónico.
     *
     * @return El campo de texto del correo electrónico.
     */
    public JTextField gettFEmail() {
        return tFEmail;
    }

    /**
     * Establece el campo de texto del correo electrónico.
     *
     * @param tFEmail El campo de texto del correo electrónico a establecer.
     */
    public void settFEmail(JTextField tFEmail) {
        this.tFEmail = tFEmail;
    }

    
}
