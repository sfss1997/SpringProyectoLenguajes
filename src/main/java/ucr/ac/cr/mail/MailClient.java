package ucr.ac.cr.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import ucr.ac.cr.project.Email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@Service
public class MailClient {

    @Autowired
    private JavaMailSender javaMailSender;

    public void SendEmail(Email mail){

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom("infoempresarialucr@gmail.com");
        mailMessage.setTo(mail.getTo());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mail.getBody());

        javaMailSender.send(mailMessage);
    }
}
