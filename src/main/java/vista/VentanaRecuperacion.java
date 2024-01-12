package vista;

import com.formdev.flatlaf.FlatClientProperties;
import controlador.ConexionBDD;
import controlador.ControladorRecuperacion;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class VentanaRecuperacion extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private final ControladorRecuperacion C_REC;
    private final ConexionBDD CON;
    /**
     * Creates new form VentanaRecuperacion
     * @param con
     */
    public VentanaRecuperacion(ConexionBDD con) {
        initComponents();
        
        this.CON = con;
        
        C_REC = new ControladorRecuperacion(this);
        
        Shape s = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        setShape(s);
        
        tFEmail.putClientProperty( "FlatLaf.style", "arc:30" );
        btnRecuperar.putClientProperty( "FlatLaf.style", "arc:30" );
        
        tFEmail.putClientProperty( FlatClientProperties.PLACEHOLDER_TEXT, "tucorreo@gmail.com" );
        
        tFEmail.putClientProperty("JTextField.padding", new Insets(0,40,0,0));
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
        btnRecuperar = new javax.swing.JButton();
        tFEmail = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(26, 26, 26));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style='text-align: center;'> Recuperar contraseña</div></html>");
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 318, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(164, 164, 164));
        jLabel4.setText("Email");
        jLabel4.setToolTipText("");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 150, -1, -1));

        btnRecuperar.setBackground(new java.awt.Color(158, 255, 0));
        btnRecuperar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setText("Recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        panelCentral.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 285, 314, 50));
        panelCentral.add(tFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 183, 314, 55));

        btnExit.setBackground(new java.awt.Color(26, 26, 26));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        C_REC.salir();
    }//GEN-LAST:event_btnExitActionPerformed

    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_REC.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged

    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_REC.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        C_REC.enviarNuevaContraseña();
    }//GEN-LAST:event_btnRecuperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JTextField tFEmail;
    // End of variables declaration//GEN-END:variables

    public int getXMouse() {
        return xMouse;
    }

    public int getYMouse() {
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
    
    public ConexionBDD getConexion(){
        return CON;
    }
}
