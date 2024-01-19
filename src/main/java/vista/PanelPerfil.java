package vista;

import controlador.UtilDiseño;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class PanelPerfil extends javax.swing.JPanel {

    /**
     * Creates new form PanelPerfil
     */
    public PanelPerfil() {
        initComponents();
        UtilDiseño.redondearElemento(pNombre);
        UtilDiseño.redondearElemento(pApllidos);
        UtilDiseño.redondearElemento(pTelefono);
        UtilDiseño.redondearElemento(pDireccion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pTelefono = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        pNombre = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pApllidos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        pDireccion = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pTelefono.setBackground(new java.awt.Color(51, 51, 51));
        pTelefono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefono");
        pTelefono.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));
        pTelefono.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, 35));

        jPanel3.add(pTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 350, 98));

        pNombre.setBackground(new java.awt.Color(51, 51, 51));
        pNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre");
        pNombre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));
        pNombre.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, 35));

        jPanel3.add(pNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 65, 350, 98));

        pApllidos.setBackground(new java.awt.Color(51, 51, 51));
        pApllidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellidos");
        pApllidos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));
        pApllidos.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, 35));

        jPanel3.add(pApllidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 65, 350, 98));

        pDireccion.setBackground(new java.awt.Color(51, 51, 51));
        pDireccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Direccion");
        pDireccion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));
        pDireccion.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, 35));

        jPanel3.add(pDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 350, 98));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Direccion");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));
        jPanel9.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 630, 35));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 295, 710, 98));

        jButton1.setBackground(new java.awt.Color(158, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Modificar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 420, 196, 63));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 109, 1210, 560));

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        jLabel5.setBackground(new java.awt.Color(38, 38, 38));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html> <div style='text-align: center;'>Perfil</div> </html>");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoTitulos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 1210, 109));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("correos.recuperacion.miapp@gmail.com");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 688, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setText("+34 932 932 932");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 688, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Salamanca");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 688, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 152, 154));
        jLabel4.setText("© 2023 MyApp. All rights reserved.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1091, 690, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoEmailVerde.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 690, 24, 24));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoTelefonoVerde.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 690, 24, 24));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoLocalizacionVerde.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 690, 24, 24));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel pApllidos;
    private javax.swing.JPanel pDireccion;
    private javax.swing.JPanel pNombre;
    private javax.swing.JPanel pTelefono;
    // End of variables declaration//GEN-END:variables
}
