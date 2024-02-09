package controlador;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Tomas Gonzalez Martin
 */
public class EmailUtil extends Thread {
    private final String FROM = "correos.recuperacion.miapp@gmail.com";
    private final String PASSWORD = "kaszbixklbblbxvo";
    private final String TO_EMAIL;
    private final String NEW_PASSWORD;
    
    public EmailUtil(String toEmail, String newPassword){
        this.TO_EMAIL = toEmail;
        this.NEW_PASSWORD = newPassword;
    }

    @Override
    public synchronized void run() {
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.user", FROM);
        props.put("mail.smtp.ssl.enable", "TLSv1.2");
        
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PASSWORD);
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset-UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(FROM, "NoReply-JD"));
            msg.setSubject("MiAplicacion", "UTF-8");
            msg.setSentDate(new Date());
            String htmlContent = "<html>" +
                "<head>" +
                "<style>" +
                "body {font-family: 'Arial', sans-serif; background-color: #f4f4f4;}" +
                ".container {background-color: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); width: 300px;}" +
                "h2 {color: #007bff;}" +
                "strong {color: #28a745;}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<h2>Recuperación de Contraseña</h2>" +
                "<p>Se ha generado una nueva contraseña para tu cuenta:</p>" +
                "<p>Nueva Contraseña: <strong>"+this.NEW_PASSWORD+"</strong></p>" +
                "<p>Por favor, cambia tu contraseña después de iniciar sesión.</p>" +
                "</div>" +
                "</body>" +
                "</html>";
            msg.setContent(htmlContent, "text/html");  // Corrige esta línea
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.TO_EMAIL, false));
            
            Transport.send(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Forma sin hilo
    /*
    public static void sendEmail(String toEmail, String newPassword) {
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.user", FROM);
        props.put("mail.smtp.ssl.enable", "TLSv1.2");
        
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PASSWORD);
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset-UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(FROM, "NoReply-JD"));
            msg.setSubject("MiAplicacion", "UTF-8");
            msg.setSentDate(new Date());
            String htmlContent = "<html>" +
                "<head>" +
                "<style>" +
                "body {font-family: 'Arial', sans-serif; background-color: #f4f4f4;}" +
                ".container {background-color: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); width: 300px;}" +
                "h2 {color: #007bff;}" +
                "strong {color: #28a745;}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<h2>Recuperación de Contraseña</h2>" +
                "<p>Se ha generado una nueva contraseña para tu cuenta:</p>" +
                "<p>Nueva Contraseña: <strong>"+newPassword+"</strong></p>" +
                "<p>Por favor, cambia tu contraseña después de iniciar sesión.</p>" +
                "</div>" +
                "</body>" +
                "</html>";
            msg.setContent(htmlContent, "text/html");  // Corrige esta línea
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            
            Transport.send(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
*/
}
