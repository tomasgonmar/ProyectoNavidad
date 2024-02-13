package vista.frames;

import controlador.ConexionBDD;
import controlador.ControladorCierreApp;
import controlador.ControladorVPrincipal;
import controlador.UtilDiseño;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Usuario;
import vista.paneles.PanelInicio;
import vista.paneles.PanelLibros;
import vista.paneles.PanelMusica;
import vista.paneles.PanelPeliculas;
import vista.paneles.PanelPerfil;
import vista.paneles.PanelServicios;

/**
 *
 * @author Tomás González Martín
 */
public class FrameApp extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private PanelInicio pInicio;
    private PanelServicios pServicios;
    private PanelPeliculas pPeliculas;    
    private PanelLibros pLibros;
    private PanelMusica pMusica;
    private PanelPerfil pPerfil;
    private String panelActual;
    private final ControladorVPrincipal C_PRIN;
    private final ConexionBDD CON;
    private final Usuario USER;
    /**
     * Creates new form VentanaPrincipal
     * @param user
     * @param con
     */
    public FrameApp(Usuario user, ConexionBDD con, Locale locale) {
        initComponents();
        this.CON = con;
        this.USER = user;
        
        this.setLocale(locale);
        
        C_PRIN = new ControladorVPrincipal(this);
        
        C_PRIN.inicializarCardLayout();
        
        UtilDiseño.estilizarBotonPanelInicio(btnInicio);
        UtilDiseño.estilizarBotonPanelInicio(btnServicios);
        UtilDiseño.estilizarBotonPanelInicio(btnPeliculas);
        UtilDiseño.estilizarBotonPanelInicio(btnLibros);
        UtilDiseño.estilizarBotonPanelInicio(btnMusica);
        UtilDiseño.estilizarBotonPerfil(btnPerfil);
    }

    public void setpInicio(PanelInicio panel) {
        this.pInicio = panel;
    }

    public void setpServicios(PanelServicios panel) {
        this.pServicios = panel;
    }

    public void setpPeliculas(PanelPeliculas panel) {
        this.pPeliculas = panel;
    }

    public void setpLibros(PanelLibros panel) {
        this.pLibros = panel;
    }

    public void setpMusica(PanelMusica panel) {
        this.pMusica = panel;
    }

    public void setpPerfil(PanelPerfil panel) {
        this.pPerfil = panel;
    }

    public PanelInicio getpInicio() {
        return pInicio;
    }

    public PanelServicios getpServicios() {
        return pServicios;
    }

    public PanelPeliculas getpPeliculas() {
        return pPeliculas;
    }

    public PanelLibros getpLibros() {
        return pLibros;
    }

    public PanelMusica getpMusica() {
        return pMusica;
    }

    public PanelPerfil getpPerfil() {
        return pPerfil;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getLblIdioma() {
        return lblIdioma;
    }

    public void setLblIdioma(JLabel lblIdioma) {
        this.lblIdioma = lblIdioma;
    }

    public JPanel getPanelBotonesNav() {
        return panelBotonesNav;
    }

    public void setPanelBotonesNav(JPanel panelBotonesNav) {
        this.panelBotonesNav = panelBotonesNav;
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

    public JPanel getPanelNavegador() {
        return panelNavegador;
    }

    public void setPanelNavegador(JPanel panelNavegador) {
        this.panelNavegador = panelNavegador;
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
        btnPerfil = new javax.swing.JButton();
        panelBotonesNav = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        panelDesplazamiento = new javax.swing.JPanel();
        lblIdioma = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 38, 38));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNavegador.setBackground(new java.awt.Color(26, 26, 26));
        panelNavegador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPerfil.setBackground(new java.awt.Color(158, 255, 0));
        btnPerfil.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setText("Perfil");
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setFocusPainted(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        panelNavegador.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1348, 20, 102, 59));

        panelBotonesNav.setBackground(new java.awt.Color(26, 26, 26));

        btnInicio.setBackground(new java.awt.Color(38, 38, 38));
        btnInicio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setMargin(new java.awt.Insets(11, 20, 12, 20));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panelBotonesNav.add(btnInicio);

        btnServicios.setBackground(new java.awt.Color(38, 38, 38));
        btnServicios.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("Servicios");
        btnServicios.setContentAreaFilled(false);
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServicios.setFocusPainted(false);
        btnServicios.setMargin(new java.awt.Insets(11, 20, 12, 20));
        btnServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnServiciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServiciosMouseExited(evt);
            }
        });
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        panelBotonesNav.add(btnServicios);

        btnPeliculas.setBackground(new java.awt.Color(38, 38, 38));
        btnPeliculas.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        btnPeliculas.setText("Peliculas");
        btnPeliculas.setContentAreaFilled(false);
        btnPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeliculas.setFocusPainted(false);
        btnPeliculas.setMargin(new java.awt.Insets(11, 20, 12, 20));
        btnPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseExited(evt);
            }
        });
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });
        panelBotonesNav.add(btnPeliculas);

        btnLibros.setBackground(new java.awt.Color(38, 38, 38));
        btnLibros.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Libros");
        btnLibros.setContentAreaFilled(false);
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.setFocusPainted(false);
        btnLibros.setMargin(new java.awt.Insets(11, 20, 12, 20));
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrosMouseExited(evt);
            }
        });
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        panelBotonesNav.add(btnLibros);

        btnMusica.setBackground(new java.awt.Color(38, 38, 38));
        btnMusica.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMusica.setText("Musica");
        btnMusica.setContentAreaFilled(false);
        btnMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusica.setFocusPainted(false);
        btnMusica.setMargin(new java.awt.Insets(11, 20, 12, 20));
        btnMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMusicaMouseExited(evt);
            }
        });
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });
        panelBotonesNav.add(btnMusica);

        panelNavegador.add(panelBotonesNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 19, 620, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_Nav.png"))); // NOI18N
        panelNavegador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 20, 60, 60));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi Aplicacion");
        panelNavegador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 37, -1, -1));

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

        lblIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/bandera_esp.png"))); // NOI18N
        lblIdioma.setToolTipText("");
        panelNavegador.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 35, 45, 30));

        getContentPane().add(panelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1536, 100));

        panelCentral.setBackground(new java.awt.Color(38, 38, 38));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1536, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_PRIN.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged

    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_PRIN.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ControladorCierreApp.cerrarApp();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        C_PRIN.eventosBtnServicios();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        C_PRIN.eventosBtnInicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        C_PRIN.eventosBtnPeliculas();
    }//GEN-LAST:event_btnPeliculasActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        C_PRIN.eventosBtnLibros();
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        C_PRIN.eventosBtnMusica();
    }//GEN-LAST:event_btnMusicaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        C_PRIN.eventoBtnPerfil();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseEntered
        C_PRIN.entrarBtn(btnServicios);
    }//GEN-LAST:event_btnServiciosMouseEntered

    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        C_PRIN.salirBtn("pServicios",btnServicios);
    }//GEN-LAST:event_btnServiciosMouseExited

    private void btnPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseEntered
        C_PRIN.entrarBtn(btnPeliculas);
    }//GEN-LAST:event_btnPeliculasMouseEntered

    private void btnPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseExited
       C_PRIN.salirBtn("pPeliculas",btnPeliculas);
    }//GEN-LAST:event_btnPeliculasMouseExited

    private void btnMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicaMouseEntered
        C_PRIN.entrarBtn(btnMusica);
    }//GEN-LAST:event_btnMusicaMouseEntered

    private void btnMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicaMouseExited
        C_PRIN.salirBtn("pMusica",btnMusica);       
    }//GEN-LAST:event_btnMusicaMouseExited

    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
        C_PRIN.entrarBtn(btnLibros);
    }//GEN-LAST:event_btnLibrosMouseEntered

    private void btnLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseExited
        C_PRIN.salirBtn("pLibros",btnLibros); 
    }//GEN-LAST:event_btnLibrosMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        C_PRIN.entrarBtn(btnInicio);
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        C_PRIN.salirBtn("pInicio",btnInicio);
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_PRIN.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_PRIN.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JPanel panelBotonesNav;
    public javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDesplazamiento;
    private javax.swing.JPanel panelNavegador;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnInicio() {
        return btnInicio;
    }

    public JButton getBtnServicios() {
        return btnServicios;
    }

    public JButton getBtnPeliculas() {
        return btnPeliculas;
    }

    public JButton getBtnLibros() {
        return btnLibros;
    }

    public JButton getBtnMusica() {
        return btnMusica;
    }

    public void setPanelActual(String nombrePanel) {
        this.panelActual = nombrePanel;
    }

    public void setXMouse(int x) {
        this.xMouse = x;
    }

    public void setYMouse(int y) {
        this.yMouse = y;
    }

    public int getXMouse() {
       return xMouse;
    }

    public int getYMouse() {
        return yMouse;
    }

    public String getPanelActual() {
        return panelActual;
    }

    public JButton getBtnPerfil() {
        return btnPerfil;
    }
   
    public ConexionBDD getCon(){
        return this.CON;
    }

    public Usuario getUser() {
        return this.USER;
    }
    
}
