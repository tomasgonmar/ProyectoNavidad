package vista.modulos;

import modelo.Pelicula;

/**
 * Este módulo representa una película en la interfaz de usuario.
 * Proporciona información sobre la película, como su título, descripción, duración, servicio de streaming, puntuación, etc.
 * Este módulo se puede utilizar para mostrar información detallada sobre una película en la interfaz de usuario.
 * @author Tomás González Martín
 */
public class ModuloPeliculas extends javax.swing.JPanel {

    /**
     * Crea un nuevo módulo de película con la información proporcionada por el objeto Pelicula.
     * @param pelicula El objeto Pelicula que contiene la información de la película.
     */
    public ModuloPeliculas(Pelicula pelicula) {
        initComponents();
        //lblImagen.setIcon(pelicula.getImagen());
        lblTitulo.setText(pelicula.getNombre());
        lblDescripcion.setText("<html><div style='text-align: justify;'>"+pelicula.getDescripcion()+"</div></html>");
        lblDuracion.setText(String.valueOf(pelicula.getDuracion())+"'");
        lblServicio.setIcon(pelicula.getImagenServicio());
        lblPuntuacion.setText(String.valueOf(pelicula.getPuntuacion())+"/5");
    }
    /**
     * Crea un nuevo módulo de película sin información inicial.
     */
    public ModuloPeliculas(){
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

        lblImagen = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblPuntuacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/peliculas/logo_pelicula_default.png"))); // NOI18N
        add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 132, 180));

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Titulo");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 65, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(230, 230, 230));
        lblDescripcion.setText("<html> <div style=\"text-align: justify;\"> At Squareup, our design team is passionate about creating stunning, user-centric designs that captivate your audience and elevate your brand. We believe that great design is not just about aesthetics; it's about creating seamless and intuitive user experiences. </div> </html>");
        lblDescripcion.setToolTipText("");
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 113, 565, 126));

        lblDuracion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDuracion.setText("Duracion");
        add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 139, 110, -1));

        lblPuntuacion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPuntuacion.setText("Score");
        add(lblPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 139, 70, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Star.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 41, 41));

        lblServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logos_servicios_mini/LogoServiciosAmazonMini.png"))); // NOI18N
        add(lblServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 82, 68, 25));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
