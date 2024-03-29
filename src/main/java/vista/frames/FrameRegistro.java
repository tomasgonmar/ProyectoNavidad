package vista.frames;

import controlador.ConBDD;
import controlador.CCierreApp;

import controlador.frames.CRegistro;
import controlador.UDiseño;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Ventana de registro de usuarios.
 * Permite que los usuarios se registren en la aplicación.
 * Esta ventana contiene campos para el correo electrónico, usuario y contraseña.
 * Los usuarios pueden acceder a la ventana de inicio de sesión desde aquí.
 * Los datos ingresados por los usuarios se registran en la base de datos.
 * La ventana se cierra al hacer clic en el botón "X" en la esquina superior derecha.
 * 
 * @author Tomas Gonzalez Martin
 */
public class FrameRegistro extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private final CRegistro C_REG;
    private final ConBDD CON;
    /**
     * Constructor de la clase FrameRegistro.
     * Inicializa la ventana de registro y sus componentes.
     * 
     * @param con La conexión a la base de datos.
     * @param idioma El idioma que se utilizará en la interfaz.
     */
    public FrameRegistro(ConBDD con, Locale idioma) {
        initComponents();
        
        this.CON = con;
        
        this.setLocale(idioma);
        
        setIconImage(UDiseño.createImageIcon("/img/logo_myapp/Logo_Nav.png", "Logo").getImage());
        
        C_REG = new CRegistro(this);
        
        UDiseño.redondearVentana(this);
        
        UDiseño.estilizarTextFieldEmail(tFEmail);
        UDiseño.estilizarTextFieldUser(tFUser);
        UDiseño.estilizarTextFieldPassword(tFPassword);
        UDiseño.estilizarTextFieldPassword(tFPasswordValidacion);
        UDiseño.estilizarBtn(btnRegistro); 
                
        getRootPane().setDefaultButton(btnRegistro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        lbl_registro_titulo = new javax.swing.JLabel();
        lbl_registro_email = new javax.swing.JLabel();
        lbl_registro_password_r = new javax.swing.JLabel();
        lbl_registro_usuario = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        tFPasswordValidacion = new javax.swing.JPasswordField();
        tFUser = new javax.swing.JTextField();
        lblInicioSes = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();
        tFEmail = new javax.swing.JTextField();
        tFPassword = new javax.swing.JPasswordField();
        lbl_registro_password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setMinimumSize(new java.awt.Dimension(390, 637));
        panelCentral.setPreferredSize(new java.awt.Dimension(390, 637));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_registro_titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_registro_titulo.setForeground(new java.awt.Color(239, 239, 239));
        lbl_registro_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registro_titulo.setText("Registrate gratis");
        panelCentral.add(lbl_registro_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, 341, 60));

        lbl_registro_email.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_registro_email.setForeground(new java.awt.Color(164, 164, 164));
        lbl_registro_email.setText("Email");
        panelCentral.add(lbl_registro_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 150, -1, -1));

        lbl_registro_password_r.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_registro_password_r.setForeground(new java.awt.Color(164, 164, 164));
        lbl_registro_password_r.setText("Repetir contraseña");
        panelCentral.add(lbl_registro_password_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 438, -1, -1));

        lbl_registro_usuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_registro_usuario.setForeground(new java.awt.Color(164, 164, 164));
        lbl_registro_usuario.setText("Usuario");
        panelCentral.add(lbl_registro_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 250, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(158, 255, 0));
        btnRegistro.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Registrame");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelCentral.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 547, 314, 50));

        tFPasswordValidacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelCentral.add(tFPasswordValidacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 466, 314, 55));

        tFUser.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tFUser.setToolTipText("");
        panelCentral.add(tFUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 277, 314, 55));

        lblInicioSes.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblInicioSes.setForeground(new java.awt.Color(164, 164, 164));
        lblInicioSes.setText("Inicia sesion");
        lblInicioSes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicioSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioSesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioSesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioSesMouseExited(evt);
            }
        });
        panelCentral.add(lblInicioSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 608, -1, -1));

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

        tFEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tFEmail.setToolTipText("");
        panelCentral.add(tFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 183, 314, 55));

        tFPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelCentral.add(tFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 371, 314, 55));

        lbl_registro_password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_registro_password.setForeground(new java.awt.Color(164, 164, 164));
        lbl_registro_password.setText("Contraseña");
        panelCentral.add(lbl_registro_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 344, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que se activa cuando se hace clic en el botón "Exit" (Salir). Cierra la aplicación.
     * @param evt Evento de acción que desencadena esta operación.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        CCierreApp.cerrarApp();
    }//GEN-LAST:event_btnExitActionPerformed
    /**
     * Método que maneja el evento cuando el mouse se arrastra sobre el panel de desplazamiento.
     * Llama al método 'desplazamientoPressed' en el controlador de registro.
     * @param evt Evento de mouse que indica que el mouse se está moviendo mientras se mantiene presionado sobre el panel de desplazamiento.
     */
    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_REG.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged
    /**
     * Método que maneja el evento cuando el mouse se presiona sobre el panel de desplazamiento.
     * Llama al método 'movimientoPorPantalla' en el controlador de registro.
     * @param evt Evento de mouse que indica que el mouse se ha presionado sobre el panel de desplazamiento.
     */
    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_REG.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed
    /**
     * Método que maneja el evento cuando se hace clic en el texto "Inicia sesion".
     * Abre la ventana de inicio de sesión.
     * @param evt Evento de mouse que indica que se hizo clic en el texto "Inicia sesion".
     */
    private void lblInicioSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseClicked
        C_REG.abrirInicioSesion();
    }//GEN-LAST:event_lblInicioSesMouseClicked
    /**
     * Método que se activa cuando se hace clic en el botón "Registrame".
     * Registra al usuario en la aplicación.
     * @param evt Evento de acción que desencadena esta operación.
     */
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        C_REG.registrarUsuario();
    }//GEN-LAST:event_btnRegistroActionPerformed
    /**
     * Método que maneja el evento cuando el mouse entra al área del texto "Inicia sesion".
     * Cambia el estado del texto "Inicia sesion" a resaltado.
     * @param evt Evento de mouse que indica que el mouse ha entrado al área del texto "Inicia sesion".
     */
    private void lblInicioSesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseEntered
        C_REG.cambiarEstadoLblInicio(true);
    }//GEN-LAST:event_lblInicioSesMouseEntered
    /**
     * Método que maneja el evento cuando el mouse sale del área del texto "Inicia sesion".
     * Cambia el estado del texto "Inicia sesion" a normal.
     * @param evt Evento de mouse que indica que el mouse ha salido del área del texto "Inicia sesion".
     */
    private void lblInicioSesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseExited
        C_REG.cambiarEstadoLblInicio(false);
    }//GEN-LAST:event_lblInicioSesMouseExited
    /**
     * Método que maneja el evento cuando el mouse entra al área del botón "Exit" (Salir).
     * Cambia el estado del botón "Exit" a resaltado.
     * @param evt Evento de mouse que indica que el mouse ha entrado al área del botón "Exit" (Salir).
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_REG.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * Método que maneja el evento cuando el mouse sale del área del botón "Exit" (Salir).
     * Cambia el estado del botón "Exit" a normal.
     * @param evt Evento de mouse que indica que el mouse ha salido del área del botón "Exit" (Salir).
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_REG.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblInicioSes;
    private javax.swing.JLabel lbl_registro_email;
    private javax.swing.JLabel lbl_registro_password;
    private javax.swing.JLabel lbl_registro_password_r;
    private javax.swing.JLabel lbl_registro_titulo;
    private javax.swing.JLabel lbl_registro_usuario;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JTextField tFEmail;
    private javax.swing.JPasswordField tFPassword;
    private javax.swing.JPasswordField tFPasswordValidacion;
    private javax.swing.JTextField tFUser;
    // End of variables declaration//GEN-END:variables

    /**
     * Obtiene la coordenada X del mouse.
     * @return La coordenada X del mouse.
     */
    public int getXMouse() {
        return xMouse;
    }

    /**
     * Obtiene la coordenada Y del mouse.
     * @return La coordenada Y del mouse.
     */
    public int getYMouse() {
        return yMouse;
    }

    /**
     * Establece la coordenada X del mouse.
     * @param x La coordenada X del mouse.
     */
    public void setXMouse(int x) {
        xMouse = x;
    }

    /**
     * Establece la coordenada Y del mouse.
     * @param y La coordenada Y del mouse.
     */
    public void setYMouse(int y) {
        yMouse = y;
    }
    
    /**
     * Obtiene el correo electrónico ingresado por el usuario.
     * @return El correo electrónico ingresado.
     */
    public String getEmail(){
        return tFEmail.getText();
    }
    
    /**
     * Obtiene el nombre de usuario ingresado por el usuario.
     * @return El nombre de usuario ingresado.
     */
    public String getUser(){
        return tFUser.getText();
    }
    
    /**
     * Obtiene la contraseña de validación ingresada por el usuario.
     * @return La contraseña de validación ingresada.
     */
    public String getPasswordValidation(){
        return String.valueOf(tFPasswordValidacion.getPassword());
    }
    
    /**
     * Obtiene la contraseña ingresada por el usuario.
     * @return La contraseña ingresada.
     */
    public String getPassword(){
        return String.valueOf(tFPassword.getPassword());
    }

    /**
     * Obtiene el botón de salida.
     * @return El botón de salida.
     */
    public JButton getBtnExit() {
        return btnExit;
    }

    /**
     * Establece el botón de salida.
     * @param btnExit El botón de salida.
     */
    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    /**
     * Obtiene el botón de registro.
     * @return El botón de registro.
     */
    public JButton getBtnRegistro() {
        return btnRegistro;
    }

    /**
     * Establece el botón de registro.
     * @param btnRegistro El botón de registro.
     */
    public void setBtnRegistro(JButton btnRegistro) {
        this.btnRegistro = btnRegistro;
    }

    /**
     * Obtiene el panel principal.
     * @return El panel principal.
     */
    public JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * Establece el panel principal.
     * @param jPanel1 El panel principal.
     */
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * Obtiene la etiqueta de inicio de sesión.
     * @return La etiqueta de inicio de sesión.
     */
    public JLabel getLblInicioSes() {
        return lblInicioSes;
    }

    /**
     * Establece la etiqueta de inicio de sesión.
     * @param lblInicioSes La etiqueta de inicio de sesión.
     */
    public void setLblInicioSes(JLabel lblInicioSes) {
        this.lblInicioSes = lblInicioSes;
    }

    /**
     * Obtiene la etiqueta de registro de correo electrónico.
     * @return La etiqueta de registro de correo electrónico.
     */
    public JLabel getLbl_registro_email() {
        return lbl_registro_email;
    }

    /**
     * Establece la etiqueta de registro de correo electrónico.
     * @param lbl_registro_email La etiqueta de registro de correo electrónico.
     */
    public void setLbl_registro_email(JLabel lbl_registro_email) {
        this.lbl_registro_email = lbl_registro_email;
    }

    /**
     * Obtiene la etiqueta de registro de contraseña.
     * @return La etiqueta de registro de contraseña.
     */
    public JLabel getLbl_registro_password() {
        return lbl_registro_password;
    }

    /**
     * Establece la etiqueta de registro de contraseña.
     * @param lbl_registro_password La etiqueta de registro de contraseña.
     */
    public void setLbl_registro_password(JLabel lbl_registro_password) {
        this.lbl_registro_password = lbl_registro_password;
    }

    /**
     * Obtiene la etiqueta de registro de repetir contraseña.
     * @return La etiqueta de registro de repetir contraseña.
     */
    public JLabel getLbl_registro_password_r() {
        return lbl_registro_password_r;
    }

    /**
     * Establece la etiqueta de registro de repetir contraseña.
     * @param lbl_registro_password_r La etiqueta de registro de repetir contraseña.
     */
    public void setLbl_registro_password_r(JLabel lbl_registro_password_r) {
        this.lbl_registro_password_r = lbl_registro_password_r;
    }

    /**
     * Obtiene la etiqueta de registro de título.
     * @return La etiqueta de registro de título.
     */
    public JLabel getLbl_registro_titulo() {
        return lbl_registro_titulo;
    }

    /**
     * Establece la etiqueta de registro de título.
     * @param lbl_registro_titulo La etiqueta de registro de título.
     */
    public void setLbl_registro_titulo(JLabel lbl_registro_titulo) {
        this.lbl_registro_titulo = lbl_registro_titulo;
    }

    /**
     * Obtiene la etiqueta de registro de usuario.
     * @return La etiqueta de registro de usuario.
     */
    public JLabel getLbl_registro_usuario() {
        return lbl_registro_usuario;
    }

    /**
     * Establece la etiqueta de registro de usuario.
     * @param lbl_registro_usuario La etiqueta de registro de usuario.
     */
    public void setLbl_registro_usuario(JLabel lbl_registro_usuario) {
        this.lbl_registro_usuario = lbl_registro_usuario;
    }

    /**
     * Obtiene el panel central.
     * @return El panel central.
     */
    public JPanel getPanelCentral() {
        return panelCentral;
    }

    /**
     * Establece el panel central.
     * @param panelCentral El panel central.
     */
    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    /**
     * Obtiene el panel de desplazamiento.
     * @return El panel de desplazamiento.
     */
    public JPanel getPanelDesplazamiento() {
        return panelDesplazamiento;
    }

    /**
     * Establece el panel de desplazamiento.
     * @param panelDesplazamiento El panel de desplazamiento.
     */
    public void setPanelDesplazamiento(JPanel panelDesplazamiento) {
        this.panelDesplazamiento = panelDesplazamiento;
    }

    /**
     * Obtiene el campo de texto del correo electrónico.
     * @return El campo de texto del correo electrónico.
     */
    public JTextField gettFEmail() {
        return tFEmail;
    }

    /**
     * Establece el campo de texto del correo electrónico.
     * @param tFEmail El campo de texto del correo electrónico.
     */
    public void settFEmail(JTextField tFEmail) {
        this.tFEmail = tFEmail;
    }

    /**
     * Obtiene el campo de texto de la contraseña.
     * @return El campo de texto de la contraseña.
     */
    public JPasswordField gettFPassword() {
        return tFPassword;
    }

    /**
     * Establece el campo de texto de la contraseña.
     * @param tFPassword El campo de texto de la contraseña.
     */
    public void settFPassword(JPasswordField tFPassword) {
        this.tFPassword = tFPassword;
    }

    /**
     * Obtiene el campo de texto de validación de contraseña.
     * @return El campo de texto de validación de contraseña.
     */
    public JPasswordField gettFPasswordValidacion() {
        return tFPasswordValidacion;
    }

    /**
     * Establece el campo de texto de validación de contraseña.
     * @param tFPasswordValidacion El campo de texto de validación de contraseña.
     */
    public void settFPasswordValidacion(JPasswordField tFPasswordValidacion) {
        this.tFPasswordValidacion = tFPasswordValidacion;
    }

    /**
     * Obtiene el campo de texto del nombre de usuario.
     * @return El campo de texto del nombre de usuario.
     */
    public JTextField gettFUser() {
        return tFUser;
    }

    /**
     * Establece el campo de texto del nombre de usuario.
     * @param tFUser El campo de texto del nombre de usuario.
     */
    public void settFUser(JTextField tFUser) {
        this.tFUser = tFUser;
    }

    /**
     * Limpia los campos de entrada de texto.
     */
    public void limpiarCampos() {
        tFEmail.setText("");
        tFUser.setText("");
        tFPassword.setText("");
        tFPasswordValidacion.setText("");
    }

    /**
     * Obtiene la conexión a la base de datos.
     * @return La conexión a la base de datos.
     */
    public ConBDD getConexion() {
        return CON;
    }
}
