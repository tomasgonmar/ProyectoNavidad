package vista.frames;

import controlador.ConexionBDD;
import controlador.ControladorCierreApp;
import controlador.ControladorLogin;
import controlador.UtilDiseño;
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
    public FrameLogin(ConexionBDD con) {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRecuperacion = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        tFPassword = new javax.swing.JPasswordField();
        tFUser = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<div style='text-align: center;'>¡Bienvenido de nuevo!</div>\n</html>");
        jLabel1.setToolTipText("");
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 350, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(164, 164, 164));
        jLabel4.setText("Usuario");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 177, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(164, 164, 164));
        jLabel3.setText("Contraseña");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 277, -1, -1));

        lblRecuperacion.setForeground(new java.awt.Color(164, 164, 164));
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
        panelCentral.add(lblRecuperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 371, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(158, 255, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
        panelCentral.add(tFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 306, 314, 55));
        panelCentral.add(tFUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 210, 314, 55));

        lblRegistro.setForeground(new java.awt.Color(164, 164, 164));
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
        panelCentral.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 475, -1, -1));

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
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel lblRecuperacion;
    public javax.swing.JLabel lblRegistro;
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
}
