package vista.paneles;

import controlador.ConBDD;
import controlador.paneles.CPServicios;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 * Esta clase representa un panel de servicios que muestra los servicios disponibles.
 * Se utiliza para interactuar con la información de los servicios.
 * 
 * @author Tomas Gonzalez Martin
 */
public class PServicios extends javax.swing.JPanel {

    private ConBDD con;
    private Usuario user;
    private final CPServicios C;
    /**
     * Crea un nuevo panel de servicios.
     * 
     * @param con La conexión a la base de datos.
     * @param user El usuario asociado al panel de servicios.
     */
    public PServicios(ConBDD con, Usuario user) {
        initComponents();
        
        this.user = user;
        
        this.con = con;
        
        C = new CPServicios(this);
        
        scroll.getVerticalScrollBar().setUnitIncrement(20);
        
        C.insertarServicios();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelCentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_servicios_titulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBorder(null);

        panelCentral.setBackground(new java.awt.Color(38, 38, 38));
        panelCentral.setLayout(new java.awt.GridLayout(1, 0));
        scroll.setViewportView(panelCentral);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 109, 1210, 560));

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        lbl_servicios_titulo.setBackground(new java.awt.Color(38, 38, 38));
        lbl_servicios_titulo.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lbl_servicios_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_servicios_titulo.setText("<html> <div style='text-align: center;'>Servicios</div> </html>");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoTitulos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_servicios_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_servicios_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 1210, 109));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("correos.recuperacion.miapp@gmail.com");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 696, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoEmailVerde.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 693, 24, 24));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoTelefonoVerde.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 693, 24, 24));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setText("+34 932 932 932");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 696, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoLocalizacionVerde.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 693, 24, 24));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Salamanca");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 696, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 152, 154));
        jLabel4.setText("© 2023 MyApp. All rights reserved.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1091, 696, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_servicios_titulo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
    /**
    * Actualiza el idioma de la interfaz del panel de servicios.
    * 
    * @param bundle El ResourceBundle que contiene las traducciones en el nuevo idioma.
    */
    public void actualizarIdioma(ResourceBundle bundle) {
        C.actualizarIdioma(bundle);
    }
    /**
     * Obtiene el JLabel que muestra el título de los servicios.
     * 
     * @return El JLabel que muestra el título de los servicios.
     */
    public JLabel getLbl_servicios_titulo() {
        return lbl_servicios_titulo;
    }
    /**
     * Establece el JLabel que muestra el título de los servicios.
     * 
     * @param lbl_servicios_titulo El JLabel que muestra el título de los servicios.
     */
    public void setLbl_servicios_titulo(JLabel lbl_servicios_titulo) {
        this.lbl_servicios_titulo = lbl_servicios_titulo;
    }
    /**
     * Obtiene el panel central del panel de servicios.
     * 
     * @return El panel central del panel de servicios.
     */
    public JPanel getPanelCentral() {
        return panelCentral;
    }
    /**
     * Establece el panel central del panel de servicios.
     * 
     * @param panelCentral El panel central del panel de servicios.
     */
    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }
    /**
     * Obtiene la conexión a la base de datos asociada al panel de servicios.
     * 
     * @return La conexión a la base de datos asociada al panel de servicios.
     */
    public ConBDD getCon() {
        return con;
    }
    /**
     * Establece la conexión a la base de datos asociada al panel de servicios.
     * 
     * @param con La conexión a la base de datos asociada al panel de servicios.
     */
    public void setCon(ConBDD con) {
        this.con = con;
    }
    /**
     * Obtiene el usuario asociado al panel de servicios.
     * 
     * @return El usuario asociado al panel de servicios.
     */
    public Usuario getUser() {
        return user;
    }
    /**
     * Establece el usuario asociado al panel de servicios.
     * 
     * @param user El usuario asociado al panel de servicios.
     */
    public void setUser(Usuario user) {
        this.user = user;
    }
    
}
