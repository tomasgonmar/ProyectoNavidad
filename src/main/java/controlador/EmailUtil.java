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
public class EmailUtil {
    private static final String FROM = "correos.recuperacion.miapp@gmail.com";
    private static final String PASSWORD = "kaszbixklbblbxvo";
    
    public static void sendEmail(String toEmail, String newPassword) {
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.user", FROM);
        props.put("mail.smtp.ssl.enable", "TLSv1.2");
        
        Session session = Session.getInstance(props, new Authenticator() {
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
            String body = "<html><h1>Nueva contraseña</h1><p>"+newPassword+"</p></html>";
            msg.setContent(body, "text/html");  // Corrige esta línea
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            
            Transport.send(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}
