package vista;

import controlador.ConexionBDD;

import controlador.ControladorRegistro;
import controlador.UtilDiseño;

/**
 *
 * @author Tomas Gonzalez Martin
 */

public class VentanaRegistro extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private final ControladorRegistro C_REG;
    private final ConexionBDD CON;
    /**
     * Creates new form VentanaRegistro
     * @param con
     */
    public VentanaRegistro(ConexionBDD con) {
        initComponents();
        
        this.CON = con;
        
        C_REG = new ControladorRegistro(this);
                
        UtilDiseño.redondearVentana(this);
        
        UtilDiseño.estilizarTextFieldEmail(tFEmail);
        UtilDiseño.estilizarTextFieldUser(tFUser);
        UtilDiseño.estilizarTextFieldPassword(tFPassword);
        UtilDiseño.estilizarBtn(btnRegistro); 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        tFPassword = new javax.swing.JPasswordField();
        tFUser = new javax.swing.JTextField();
        lblInicioSes = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();
        tFEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrate gratis");
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, 341, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(164, 164, 164));
        jLabel4.setText("Email");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(164, 164, 164));
        jLabel3.setText("Contraseña");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 344, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(164, 164, 164));
        jLabel2.setText("Usuario");
        panelCentral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 250, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(158, 255, 0));
        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Registrame");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelCentral.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 449, 314, 50));
        panelCentral.add(tFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 371, 314, 55));

        tFUser.setToolTipText("");
        panelCentral.add(tFUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 277, 314, 55));

        lblInicioSes.setForeground(new java.awt.Color(164, 164, 164));
        lblInicioSes.setText("Inicia sesion");
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
        panelCentral.add(lblInicioSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 510, -1, -1));

        btnExit.setBackground(new java.awt.Color(26, 26, 26));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(164, 164, 164));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
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

        tFEmail.setToolTipText("");
        panelCentral.add(tFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 183, 314, 55));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        C_REG.salir();
    }//GEN-LAST:event_btnExitActionPerformed

    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_REG.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged

    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_REG.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed

    private void lblInicioSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseClicked
        C_REG.abrirInicioSesion();
    }//GEN-LAST:event_lblInicioSesMouseClicked

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        C_REG.registrarUsuario();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void lblInicioSesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseEntered
        C_REG.cambiarEstadoLblInicio(true);
    }//GEN-LAST:event_lblInicioSesMouseEntered

    private void lblInicioSesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesMouseExited
        C_REG.cambiarEstadoLblInicio(false);
    }//GEN-LAST:event_lblInicioSesMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_REG.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_REG.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblInicioSes;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JTextField tFEmail;
    private javax.swing.JPasswordField tFPassword;
    private javax.swing.JTextField tFUser;
    // End of variables declaration//GEN-END:variables

    public int getXMouse() {
        return xMouse;
    }

    public int getYyMouse() {
        return yMouse;
    }

    public void setXMouse(int x) {
        xMouse = x;
    }

    public void setYMouse(int y) {
        yMouse = y;
    }
    
    public String getEmail(){
        return tFEmail.getText();
    }
    public String getUser(){
        return tFUser.getText();
    }
    public String getPassword(){
        return String.valueOf(tFPassword.getPassword());
    }

    public void limpiarCampos() {
        tFEmail.setText("");
        tFUser.setText("");
        tFPassword.setText("");
    }

    public ConexionBDD getConexion() {
        return CON;
    }
    
}
