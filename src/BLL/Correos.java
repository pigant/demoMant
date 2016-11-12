/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;



import static com.oracle.jrockit.jfr.Transition.To;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.security.auth.Subject;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Correos {
    
public void envioCorreos(String equipo, String solicitante, String causa, String ot){    
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("ff.carreno@gmail.com", "2721216s6RubicK");
                    }
                });
        
        try {
            InternetAddress[] misDs = InternetAddress.parse("ff.carreno@gmail.com,"
                + "fernando.carreno@alumnos.usm.cl");
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ff.carreno@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    misDs);
            message.setSubject("Ingreso de mantención a "+equipo);
            message.setText("Se ingreso mantención a equipo "+equipo+" "
                    + "por solicitante "+solicitante+" por la causa: "+causa+
                    " de nº OT: "+ot);
             Transport.send(message);
            
             
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
public void envioCorreosAviso(String equipo){    
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("ff.carreno@gmail.com", "2721216s6RubicK");
                    }
                });
        
        try {
            InternetAddress[] misDs = InternetAddress.parse("ff.carreno@gmail.com,"
                + "fernando.carreno@alumnos.usm.cl");
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ff.carreno@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    misDs);
            message.setSubject("Correo mantencios preventivo");
            message.setText("Se ingreso mantención preventiva por mucho "
                    + "tiempo sin revision a "+equipo);
             Transport.send(message);
            
             
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
public void envioCorreosModif(String equipo, String solicitante, String causa, String ot){    
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("ff.carreno@gmail.com", "2721216s6RubicK");
                    }
                });
        
        try {
            InternetAddress[] misDs = InternetAddress.parse("ff.carreno@gmail.com,"
                + "fernando.carreno@alumnos.usm.cl");
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ff.carreno@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    misDs);
            message.setSubject("Comentarios a mantecion de "+equipo);
            message.setText("Se comento la mantención a equipo "+equipo+" "
                    + "por responsable "+solicitante+" comentario: "+causa+
                    " de nº OT: "+ot);
             Transport.send(message);
            
             
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
public void envioCorreosCerrado(String equipo, String responsable, String accion
        , String ot){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("ff.carreno@gmail.com", "2721216s6RubicK");
                    }
                });
        try {
                    InternetAddress[] misDs = InternetAddress.parse("ff.carreno@gmail.com,"
                + "fernando.carreno@alumnos.usm.cl,jkdelarge@gmail.com");

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ff.carreno@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    misDs);
            message.setSubject("Mantención cerrada de"
                    + " "+equipo);
            message.setText("Mantención a equipo "+equipo+" cerrada "
                    + "por responsable "+responsable+" "
                            + "se realizaron las siguientes labores: "+accion+
                    " de nº OT: "+ot);
             Transport.send(message);
            
           
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
  
}