package vista.frames;

import controlador.ConexionBDD;
import controlador.ControladorCierreApp;
import controlador.frames.ControladorVPrincipal;
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
 * La clase FrameApp representa la ventana principal de la aplicación.
 * Contiene referencias a varios paneles y componentes que conforman la interfaz de usuario.
 * 
 * Permite la gestión de paneles y componentes dentro de la ventana.
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
     * Crea una nueva instancia de la ventana principal.
     * 
     * @param user El usuario que ha iniciado sesión en la aplicación.
     * @param con La conexión a la base de datos.
     * @param locale El locale que indica la configuración regional de la aplicación.
     */
    public FrameApp(Usuario user, ConexionBDD con, Locale locale) {
        initComponents();
        
        this.CON = con;
        this.USER = user;
        
        this.setLocale(locale);
        
        C_PRIN = new ControladorVPrincipal(this);
        
        UtilDiseño.estilizarBotonPanelInicio(btnInicio);
        UtilDiseño.estilizarBotonPanelInicio(btnServicios);
        UtilDiseño.estilizarBotonPanelInicio(btnPeliculas);
        UtilDiseño.estilizarBotonPanelInicio(btnLibros);
        UtilDiseño.estilizarBotonPanelInicio(btnMusica);
        UtilDiseño.estilizarBotonPerfil(btnPerfil);
        setIconImage(UtilDiseño.createImageIcon("/img/logo_myapp/Logo_Nav.png", "Logo").getImage());
    }
    /**
     * Establece el panel de inicio en la ventana principal.
     * 
     * @param panel El panel de inicio a establecer.
     */
    public void setpInicio(PanelInicio panel) {
        this.pInicio = panel;
    }
    /**
     * Establece el panel de servicios en la ventana principal.
     * 
     * @param panel El panel de servicios a establecer.
     */
    public void setpServicios(PanelServicios panel) {
        this.pServicios = panel;
    }
    /**
     * Establece el panel de películas en la ventana principal.
     * 
     * @param panel El panel de películas a establecer.
     */
    public void setpPeliculas(PanelPeliculas panel) {
        this.pPeliculas = panel;
    }
    /**
     * Establece el panel de libros en la ventana principal.
     * 
     * @param panel El panel de libros a establecer.
     */
    public void setpLibros(PanelLibros panel) {
        this.pLibros = panel;
    }
    /**
     * Establece el panel de música en la ventana principal.
     * 
     * @param panel El panel de música a establecer.
     */
    public void setpMusica(PanelMusica panel) {
        this.pMusica = panel;
    }
    /**
     * Establece el panel de perfil en la ventana principal.
     * 
     * @param panel El panel de perfil a establecer.
     */
    public void setpPerfil(PanelPerfil panel) {
        this.pPerfil = panel;
    }
    /**
     * Obtiene el panel de inicio.
     * 
     * @return El panel de inicio.
     */
    public PanelInicio getpInicio() {
        return pInicio;
    }
    /**
     * Obtiene el panel de servicios.
     * 
     * @return El panel de servicios.
     */
    public PanelServicios getpServicios() {
        return pServicios;
    }
    /**
     * Obtiene el panel de películas.
     * 
     * @return El panel de películas.
     */
    public PanelPeliculas getpPeliculas() {
        return pPeliculas;
    }
    /**
     * Obtiene el panel de libros.
     * 
     * @return El panel de libros.
     */
    public PanelLibros getpLibros() {
        return pLibros;
    }
    /**
     * Obtiene el panel de música.
     * 
     * @return El panel de música.
     */
    public PanelMusica getpMusica() {
        return pMusica;
    }
    /**
     * Obtiene el panel de perfil.
     * 
     * @return El panel de perfil.
     */
    public PanelPerfil getpPerfil() {
        return pPerfil;
    }

    /**
     * Obtiene el botón de salida de la ventana principal.
     * 
     * @return El botón de salida.
     */
    public JButton getBtnExit() {
        return btnExit;
    }

    /**
     * Establece el botón de salida de la ventana principal.
     * 
     * @param btnExit El botón de salida a establecer.
     */
    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    /**
     * Obtiene el JLabel 4 de la ventana principal.
     * 
     * @return El JLabel 4.
     */
    public JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * Establece el JLabel 4 de la ventana principal.
     * 
     * @param jLabel4 El JLabel 4 a establecer.
     */
    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * Obtiene el JLabel 5 de la ventana principal.
     * 
     * @return El JLabel 5.
     */
    public JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * Establece el JLabel 5 de la ventana principal.
     * 
     * @param jLabel5 El JLabel 5 a establecer.
     */
    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * Obtiene el JLabel de idioma de la ventana principal.
     * 
     * @return El JLabel de idioma.
     */
    public JLabel getLblIdioma() {
        return lblIdioma;
    }

    /**
     * Establece el JLabel de idioma de la ventana principal.
     * 
     * @param lblIdioma El JLabel de idioma a establecer.
     */
    public void setLblIdioma(JLabel lblIdioma) {
        this.lblIdioma = lblIdioma;
    }

    /**
     * Obtiene el panel de botones de navegación de la ventana principal.
     * 
     * @return El panel de botones de navegación.
     */
    public JPanel getPanelBotonesNav() {
        return panelBotonesNav;
    }

    /**
     * Establece el panel de botones de navegación de la ventana principal.
     * 
     * @param panelBotonesNav El panel de botones de navegación a establecer.
     */
    public void setPanelBotonesNav(JPanel panelBotonesNav) {
        this.panelBotonesNav = panelBotonesNav;
    }

    /**
     * Obtiene el panel central de la ventana principal.
     * 
     * @return El panel central.
     */
    public JPanel getPanelCentral() {
        return panelCentral;
    }

    /**
     * Establece el panel central de la ventana principal.
     * 
     * @param panelCentral El panel central a establecer.
     */
    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    /**
     * Obtiene el panel de desplazamiento de la ventana principal.
     * 
     * @return El panel de desplazamiento.
     */
    public JPanel getPanelDesplazamiento() {
        return panelDesplazamiento;
    }

    /**
     * Establece el panel de desplazamiento de la ventana principal.
     * 
     * @param panelDesplazamiento El panel de desplazamiento a establecer.
     */
    public void setPanelDesplazamiento(JPanel panelDesplazamiento) {
        this.panelDesplazamiento = panelDesplazamiento;
    }

    /**
     * Obtiene el panel de navegación de la ventana principal.
     * 
     * @return El panel de navegación.
     */
    public JPanel getPanelNavegador() {
        return panelNavegador;
    }

    /**
     * Establece el panel de navegación de la ventana principal.
     * 
     * @param panelNavegador El panel de navegación a establecer.
     */
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
        jLabel5.setText("MyApp");
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
        lblIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIdiomaMouseClicked(evt);
            }
        });
        panelNavegador.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 35, 45, 30));

        getContentPane().add(panelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1536, 100));

        panelCentral.setBackground(new java.awt.Color(38, 38, 38));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1536, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de arrastre del ratón en el panel de desplazamiento.
     * Llama al controlador para gestionar el movimiento por pantalla.
     * 
     * @param evt El evento del ratón.
     */
    private void panelDesplazamientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMouseDragged
        C_PRIN.movimientoPorPantalla(evt);
    }//GEN-LAST:event_panelDesplazamientoMouseDragged
    /**
     * Maneja el evento de presionar el ratón en el panel de desplazamiento.
     * Llama al controlador para gestionar el desplazamiento presionado.
     * 
     * @param evt El evento del ratón.
     */
    private void panelDesplazamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazamientoMousePressed
        C_PRIN.desplazamientoPressed(evt);
    }//GEN-LAST:event_panelDesplazamientoMousePressed
    /**
     * Maneja el evento de clic en el botón de salida.
     * Llama al controlador para cerrar la aplicación.
     * 
     * @param evt El evento de acción.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ControladorCierreApp.cerrarApp();
    }//GEN-LAST:event_btnExitActionPerformed
    /**
     * Maneja el evento de clic en el botón de servicios.
     * Llama al controlador para gestionar los eventos del botón de servicios.
     * 
     * @param evt El evento de acción.
     */
    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        C_PRIN.eventosBtnServicios();
    }//GEN-LAST:event_btnServiciosActionPerformed
    /**
     * Maneja el evento de clic en el botón de inicio.
     * Llama al controlador para gestionar los eventos del botón de inicio.
     * 
     * @param evt El evento de acción.
     */
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        C_PRIN.eventosBtnInicio();
    }//GEN-LAST:event_btnInicioActionPerformed
    /**
     * Maneja el evento de clic en el botón de películas.
     * Llama al controlador para gestionar los eventos del botón de películas.
     * 
     * @param evt El evento de acción.
     */
    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        C_PRIN.eventosBtnPeliculas();
    }//GEN-LAST:event_btnPeliculasActionPerformed
    /**
     * Maneja el evento de clic en el botón de libros.
     * Llama al controlador para gestionar los eventos del botón de libros.
     * 
     * @param evt El evento de acción.
     */
    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        C_PRIN.eventosBtnLibros();
    }//GEN-LAST:event_btnLibrosActionPerformed
    /**
     * Maneja el evento de clic en el botón de música.
     * Llama al controlador para gestionar los eventos del botón de música.
     * 
     * @param evt El evento de acción.
     */
    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        C_PRIN.eventosBtnMusica();
    }//GEN-LAST:event_btnMusicaActionPerformed
    /**
     * Maneja el evento de clic en el botón de perfil.
     * Llama al controlador para gestionar los eventos del botón de perfil.
     * 
     * @param evt El evento de acción.
     */
    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        C_PRIN.eventoBtnPerfil();
    }//GEN-LAST:event_btnPerfilActionPerformed
    /**
     * Maneja el evento de entrada del ratón al botón de servicios.
     * Llama al controlador para gestionar la entrada al botón de servicios.
     * 
     * @param evt El evento del ratón.
     */
    private void btnServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseEntered
        C_PRIN.entrarBtn(btnServicios);
    }//GEN-LAST:event_btnServiciosMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de servicios.
     * Llama al controlador para gestionar la salida del botón de servicios.
     * 
     * @param evt El evento del ratón.
     */
    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        C_PRIN.salirBtn("pServicios",btnServicios);
    }//GEN-LAST:event_btnServiciosMouseExited
    /**
     * Maneja el evento de entrada del ratón al botón de películas.
     * Llama al controlador para gestionar la entrada al botón de películas.
     * 
     * @param evt El evento del ratón.
     */
    private void btnPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseEntered
        C_PRIN.entrarBtn(btnPeliculas);
    }//GEN-LAST:event_btnPeliculasMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de películas.
     * Llama al controlador para gestionar la salida del botón de películas.
     * 
     * @param evt El evento del ratón.
     */
    private void btnPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseExited
       C_PRIN.salirBtn("pPeliculas",btnPeliculas);
    }//GEN-LAST:event_btnPeliculasMouseExited
    /**
     * Maneja el evento de entrada del ratón al botón de música.
     * Llama al controlador para gestionar la entrada al botón de música.
     * 
     * @param evt El evento del ratón.
     */
    private void btnMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicaMouseEntered
        C_PRIN.entrarBtn(btnMusica);
    }//GEN-LAST:event_btnMusicaMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de música.
     * Llama al controlador para gestionar la salida del botón de música.
     * 
     * @param evt El evento del ratón.
     */
    private void btnMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicaMouseExited
        C_PRIN.salirBtn("pMusica",btnMusica);       
    }//GEN-LAST:event_btnMusicaMouseExited
    /**
     * Maneja el evento de entrada del ratón al botón de libros.
     * Llama al controlador para gestionar la entrada al botón de libros.
     * 
     * @param evt El evento del ratón.
     */
    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
        C_PRIN.entrarBtn(btnLibros);
    }//GEN-LAST:event_btnLibrosMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de libros.
     * Llama al controlador para gestionar la salida del botón de libros.
     * 
     * @param evt El evento del ratón.
     */
    private void btnLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseExited
        C_PRIN.salirBtn("pLibros",btnLibros); 
    }//GEN-LAST:event_btnLibrosMouseExited
    /**
     * Maneja el evento de entrada del ratón al botón de inicio.
     * Llama al controlador para gestionar la entrada al botón de inicio.
     * 
     * @param evt El evento del ratón.
     */
    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        C_PRIN.entrarBtn(btnInicio);
    }//GEN-LAST:event_btnInicioMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de inicio.
     * Llama al controlador para gestionar la salida del botón de inicio.
     * 
     * @param evt El evento del ratón.
     */
    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        C_PRIN.salirBtn("pInicio",btnInicio);
    }//GEN-LAST:event_btnInicioMouseExited
    /**
     * Maneja el evento de entrada del ratón al botón de salida.
     * Llama al controlador para cambiar el estado del botón de salida.
     * 
     * @param evt El evento del ratón.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        C_PRIN.cambiarEstadoBtnSalida(true);
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * Maneja el evento de salida del ratón del botón de salida.
     * Llama al controlador para cambiar el estado del botón de salida.
     * 
     * @param evt El evento del ratón.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        C_PRIN.cambiarEstadoBtnSalida(false);
    }//GEN-LAST:event_btnExitMouseExited
    /**
     * Maneja el evento de clic en el JLabel de idioma.
     * Llama al controlador para gestionar los eventos del botón de idioma.
     * 
     * @param evt El evento del ratón.
     */
    private void lblIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIdiomaMouseClicked
        C_PRIN.btnIdioma(evt);
    }//GEN-LAST:event_lblIdiomaMouseClicked

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

    /**
     * Devuelve el botón de inicio.
     *
     * @return El botón de inicio.
     */
    public JButton getBtnInicio() {
        return btnInicio;
    }

    /**
     * Devuelve el botón de servicios.
     *
     * @return El botón de servicios.
     */
    public JButton getBtnServicios() {
        return btnServicios;
    }

    /**
     * Devuelve el botón de películas.
     *
     * @return El botón de películas.
     */
    public JButton getBtnPeliculas() {
        return btnPeliculas;
    }

    /**
     * Devuelve el botón de libros.
     *
     * @return El botón de libros.
     */
    public JButton getBtnLibros() {
        return btnLibros;
    }

    /**
     * Devuelve el botón de música.
     *
     * @return El botón de música.
     */
    public JButton getBtnMusica() {
        return btnMusica;
    }

    /**
     * Establece el panel actual.
     *
     * @param nombrePanel El nombre del panel actual.
     */
    public void setPanelActual(String nombrePanel) {
        this.panelActual = nombrePanel;
    }

    /**
     * Establece la coordenada x del ratón.
     *
     * @param x La coordenada x del ratón.
     */
    public void setXMouse(int x) {
        this.xMouse = x;
    }

    /**
     * Establece la coordenada y del ratón.
     *
     * @param y La coordenada y del ratón.
     */
    public void setYMouse(int y) {
        this.yMouse = y;
    }

    /**
     * Obtiene la coordenada x del ratón.
     *
     * @return La coordenada x del ratón.
     */
    public int getXMouse() {
        return xMouse;
    }

    /**
     * Obtiene la coordenada y del ratón.
     *
     * @return La coordenada y del ratón.
     */
    public int getYMouse() {
        return yMouse;
    }

    /**
     * Obtiene el nombre del panel actual.
     *
     * @return El nombre del panel actual.
     */
    public String getPanelActual() {
        return panelActual;
    }

    /**
     * Devuelve el botón de perfil.
     *
     * @return El botón de perfil.
     */
    public JButton getBtnPerfil() {
        return btnPerfil;
    }
   
    /**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public ConexionBDD getCon(){
        return this.CON;
    }

    /**
     * Obtiene el usuario actual.
     *
     * @return El usuario actual.
     */
    public Usuario getUser() {
        return this.USER;
    }

    
}
