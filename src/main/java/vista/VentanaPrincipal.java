/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.CardLayout;

/**
 *
 * @author Tomás González Martín
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private PanelInicio pInicio;
    private CardLayout cardLayout;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cardLayout = new CardLayout();
        panelCentral.setLayout(cardLayout);
        
        pInicio = new PanelInicio();
        
        panelCentral.add(pInicio,"pInicio");
        
        cardLayout.show(panelCentral, "pInicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegador = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panelBotonesNav = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 38, 38));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNavegador.setBackground(new java.awt.Color(26, 26, 26));
        panelNavegador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(158, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Perfil");
        jButton1.setFocusPainted(false);
        panelNavegador.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1348, 20, 102, 59));

        panelBotonesNav.setBackground(new java.awt.Color(26, 26, 26));

        jButton3.setBackground(new java.awt.Color(38, 38, 38));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Inicio");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setMargin(new java.awt.Insets(11, 20, 12, 20));
        panelBotonesNav.add(jButton3);

        jButton7.setBackground(new java.awt.Color(38, 38, 38));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Servicios");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setMargin(new java.awt.Insets(11, 20, 12, 20));
        panelBotonesNav.add(jButton7);

        jButton4.setBackground(new java.awt.Color(38, 38, 38));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Peliculas");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setMargin(new java.awt.Insets(11, 20, 12, 20));
        panelBotonesNav.add(jButton4);

        jButton5.setBackground(new java.awt.Color(38, 38, 38));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Libros");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setMargin(new java.awt.Insets(11, 20, 12, 20));
        panelBotonesNav.add(jButton5);

        jButton6.setBackground(new java.awt.Color(38, 38, 38));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Canciones");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setMargin(new java.awt.Insets(11, 20, 12, 20));
        panelBotonesNav.add(jButton6);

        panelNavegador.add(panelBotonesNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 21, 468, 53));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_Nav.png"))); // NOI18N
        panelNavegador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 20, 60, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi Aplicacion");
        panelNavegador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 37, -1, -1));

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
        panelNavegador.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1495, 0, 40, 40));

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
        panelNavegador.add(panelDesplazamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 20));

        getContentPane().add(panelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1536, 100));

        panelCentral.setBackground(new java.awt.Color(38, 38, 38));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1536, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged

    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelDesplazamientoMousePressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBotonesNav;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JPanel panelNavegador;
    // End of variables declaration//GEN-END:variables
}
