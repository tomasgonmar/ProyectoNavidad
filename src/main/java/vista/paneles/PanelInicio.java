package vista.paneles;

/**
 *
 * @author Tomás González Martín
 */
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelInicio
     */
    public PanelInicio() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(1536, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCentral.setBackground(new java.awt.Color(38, 38, 38));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Abstract Design.png"))); // NOI18N
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 284, 1210, 446));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 68)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style='text-align: center;'> Organiza tus servicios, peliculas, libros y musicas en unico lugar </div></html> ");
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 28, 929, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/InicioFondo.png"))); // NOI18N
        panelCentral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 730));

        add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 1210, 730));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}