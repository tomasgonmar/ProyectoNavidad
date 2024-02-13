package vista.frames;

import controlador.ConexionBDD;
import controlador.ControladorCierreApp;
import controlador.ControladorLogin;
import controlador.UtilDiseño;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * Frame para introducir los datos de inicio de sesion del usuario
 * @author Tomas Gonzalez Martin
 */
public class FrameLogin extends javax.swing.JFrame {
    /**
     * xMouse almacena la posicion x del raton
     * yMouse almacena la posicion y del raton
     * C_LOG controlador de la ventana login
     * CON conexion con la base de datos
     */
    private int xMouse;
    private int yMouse;
    private final ControladorLogin C_LOG;
    private final ConexionBDD CON;
    /**
     * Creates new form VentanaLogin
     * @param con Conexion con la base de datos
     */
    public FrameLogin(ConexionBDD con, Locale locale) {
        initComponents();
        this.setLocale(locale);
        /**
         * Hace focus al textField del usuario y se guarda la conexion
         */
        tFUser.requestFocus();
        this.CON = con;
        /**
         * Inicializa el controlador 
         */
        C_LOG = new ControladorLogin(this);
        /**
         * Llama a la funcion para redondear la ventana
         */        
        UtilDiseño.redondearVentana(this);
        /**
         * Utiliza las funciones de diseño para estilizar los textField y el boton
         */
        UtilDiseño.estilizarTextFieldUser(tFUser);
        UtilDiseño.estilizarTextFieldPassword(tFPassword);
        UtilDiseño.estilizarBtn(btnIniciar);
        C_LOG.actualizarIdioma();
        /**
         * El boton de iniciar sesion se coloca como boton por defecto del frame
         */
        getRootPane().setDefaultButton(btnIniciar);
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
        lbl_login_bienvenida = new javax.swing.JLabel();
        lbl_login_user = new javax.swing.JLabel();
        lbl_login_password = new javax.swing.JLabel();
        lblRecuperacion = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        tFPassword = new javax.swing.JPasswordField();
        tFUser = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();
        lblIdioma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login_bienvenida.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_login_bienvenida.setForeground(new java.awt.Color(239, 239, 239));
        lbl_login_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login_bienvenida.setText("<html> <div style='text-align: center;'>¡Bienvenido de nuevo!</div> </html>");
        lbl_login_bienvenida.setToolTipText("");
        panelCentral.add(lbl_login_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 350, 120));

        lbl_login_user.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_login_user.setForeground(new java.awt.Color(164, 164, 164));
        lbl_login_user.setText("Usuario");
        panelCentral.add(lbl_login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 177, -1, -1));

        lbl_login_password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_login_password.setForeground(new java.awt.Color(164, 164, 164));
        lbl_login_password.setText("Contraseña");
        panelCentral.add(lbl_login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 277, -1, -1));

        lblRecuperacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblRecuperacion.setForeground(new java.awt.Color(164, 164, 164));
        lblRecuperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecuperacion.setText("Recuperar contraseña");
        lblRecuperacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRecuperacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRecuperacionMouseExited(evt);
            }
        });
        panelCentral.add(lblRecuperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 370, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(158, 255, 0));
        btnIniciar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setText("Iniciar");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        btnIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarKeyPressed(evt);
            }
        });
        panelCentral.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 410, 314, 50));

        tFPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelCentral.add(tFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 306, 314, 55));

        tFUser.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelCentral.add(tFUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 210, 314, 55));

        lblRegistro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(164, 164, 164));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registrate");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistroMouseExited(evt);
            }
        });
        panelCentral.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 473, -1, -1));

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

        lblIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/bandera_esp.png"))); // NOI18N
        lblIdioma.setToolTipText("");
        lblIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIdiomaMouseClicked(evt);
            }
        });
        panelCentral.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 495, 45, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Finaliza la aplicacion
     * @param evt 
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ControladorCierreApp.cerrarApp();
    }//GEN-LAST:event_btnExitActionPerformed
    /**
     * Desplazamiento de la ventana
     * @param evt 
     */
    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_LOG.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed
    /**
     * Desplazamiento de la ventana
     * @param evt 
     */
    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_LOG.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged
    /**
     * Llama al frame de recuperacion de la contraseña
     * @param evt 
     */
    private void lblRecuperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperacionMouseClicked
        C_LOG.abrirVentanaRecuperacion();
    }//GEN-LAST:event_lblRecuperacionMouseClicked
    /**
     * Llama al frame de recuperacion de la contraseña
     * @param evt 
     */
    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        C_LOG.abrirVentanaRegistro();
    }//GEN-LAST:event_lblRegistroMouseClicked
    /**
     * Inicia la sesion
     * @param evt 
     */
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        C_LOG.iniciarSesion();
    }//GEN-LAST:event_btnIniciarActionPerformed
    /**
     * Modifica el estilo del label de recuperacion
     * @param evt 
     */
    private void lblRecuperacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperacionMouseEntered
        C_LOG.cambiarEstadoLblRecuperacion(true);
    }//GEN-LAST:event_lblRecuperacionMouseEntered
    /**
     * Modifica el estilo del label de recuperacion
     * @param evt 
     */
    private void lblRecuperacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperacionMouseExited
        C_LOG.cambiarEstadoLblRecuperacion(false);
    }//GEN-LAST:event_lblRecuperacionMouseExited
    /**
     * Modifica el estilo del label de registro
     * @param evt 
     */
    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        C_LOG.cambiarEstadoLblRegistro(true);
    }//GEN-LAST:event_lblRegistroMouseEntered
    /**
     * Modifica el estilo del label de registro
     * @param evt 
     */
    private void lblRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseExited
        C_LOG.cambiarEstadoLblRegistro(false);
    }//GEN-LAST:event_lblRegistroMouseExited
    /**
     * Modifica el estilo del boton de salir
     * @param evt 
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_LOG.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * Modifica el estilo del boton de salir
     * @param evt 
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_LOG.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited
    /**
     * Inicia sersion en la aplicacion
     * @param evt 
     */
    private void btnIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarKeyPressed
        C_LOG.btnDefaultKeyPressed(evt);
    }//GEN-LAST:event_btnIniciarKeyPressed

    private void lblIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIdiomaMouseClicked
        C_LOG.btnIdioma(evt);
    }//GEN-LAST:event_lblIdiomaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblIdioma;
    public javax.swing.JLabel lblRecuperacion;
    public javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lbl_login_bienvenida;
    private javax.swing.JLabel lbl_login_password;
    private javax.swing.JLabel lbl_login_user;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JPasswordField tFPassword;
    private javax.swing.JTextField tFUser;
    // End of variables declaration//GEN-END:variables
    /**
     * Guarda el valor x del frame
     * @param x Posicion x del frame 
     */
    public void setXMouse(int x) {
        xMouse = x;
    }
    /**
     * Guarda el valor y del frame
     * @param y Posicion y del frame
     */
    public void setYMouse(int y) {
        yMouse = y;
    }
    /**
     * Devuelve el valor x del frame
     * @return 
     */
    public int getXMouse() {
       return xMouse;
    }
    /**
     * Devuelve el valor y del frame
     * @return 
     */
    public int getYMouse() {
       return yMouse;
    }
    /**
     * Devuelve el texto del textField de usuario como string
     * @return 
     */
    public String getUsuario(){
        return tFUser.getText();
    }
    /**
     * Devuelve el texto del textField de contraseña como string
     * @return 
     */
    public String getContraseña(){
        return String.valueOf(tFPassword.getPassword());
    }
    /**
     * Devuelve la conexion con la base de datos
     * @return 
     */
    public ConexionBDD getConexion() {
        return CON;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public void setBtnIniciar(JButton btnIniciar) {
        this.btnIniciar = btnIniciar;
    }

    public JLabel getLblIdioma() {
        return lblIdioma;
    }

    public void setLblIdioma(JLabel lblIdioma) {
        this.lblIdioma = lblIdioma;
    }

    public JLabel getLblRecuperacion() {
        return lblRecuperacion;
    }

    public void setLblRecuperacion(JLabel lblRecuperacion) {
        this.lblRecuperacion = lblRecuperacion;
    }

    public JLabel getLblRegistro() {
        return lblRegistro;
    }

    public void setLblRegistro(JLabel lblRegistro) {
        this.lblRegistro = lblRegistro;
    }

    public JLabel getLbl_login_bienvenida() {
        return lbl_login_bienvenida;
    }

    public void setLbl_login_bienvenida(JLabel lbl_login_bienvenida) {
        this.lbl_login_bienvenida = lbl_login_bienvenida;
    }

    public JLabel getLbl_login_password() {
        return lbl_login_password;
    }

    public void setLbl_login_password(JLabel lbl_login_password) {
        this.lbl_login_password = lbl_login_password;
    }

    public JLabel getLbl_login_user() {
        return lbl_login_user;
    }

    public void setLbl_login_user(JLabel lbl_login_user) {
        this.lbl_login_user = lbl_login_user;
    }

    public JPanel getPanelCentral() {
        return panelCentral;
    }

    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    public JPanel getPanelDesplazamiento() {
        return panelDesplazamiento;
    }

    public void setPanelDesplazamiento(JPanel panelDesplazamiento) {
        this.panelDesplazamiento = panelDesplazamiento;
    }

    public JPasswordField gettFPassword() {
        return tFPassword;
    }

    public void settFPassword(JPasswordField tFPassword) {
        this.tFPassword = tFPassword;
    }

    public JTextField gettFUser() {
        return tFUser;
    }

    public void settFUser(JTextField tFUser) {
        this.tFUser = tFUser;
    }
    
}
