package controlador.paneles;

import controlador.UtilDiseño;
import java.util.ResourceBundle;
import vista.paneles.PanelPerfil;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class CPPerfil {

    private final PanelPerfil P;
    
    public CPPerfil(PanelPerfil p) {
        this.P = p;
    }

    public void actualizarIdioma(ResourceBundle bundle) {
        P.getLbl_perfil_titulo().setText("<html><div style='text-align: center;'>"+bundle.getString("btn_app_perfil")+"</div></html>");
        P.getLbl_perfil_nombre().setText(bundle.getString("lbl_perfil_nombre"));
        P.getLbl_perfil_email().setText(bundle.getString("lbl_recuperacion_email"));
        P.getLbl_perfil_password().setText(bundle.getString("lbl_login_password"));
        P.getLbl_perfil_telefono().setText(bundle.getString("lbl_perfil_telefono"));
        P.getLbl_perfil_direccion().setText(bundle.getString("lbl_perfil_direccion"));
        P.getBtnModificar().setText(bundle.getString("btn_perfil_modificar"));
        
        UtilDiseño.colocarPlaceHolderText(P.gettFNombre(), bundle.getString("tF_perfil_nombre"));
        UtilDiseño.colocarPlaceHolderText(P.gettFEmail(), bundle.getString("email_ejemplo"));
        UtilDiseño.colocarPlaceHolderText(P.gettFTelefono(), bundle.getString("tF_perfil_telefono"));
        UtilDiseño.colocarPlaceHolderText(P.gettFDireccion(), bundle.getString("tF_perfil_direccion"));
    }
    
}
