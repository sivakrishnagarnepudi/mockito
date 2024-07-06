//package com.neotric.demo.service;
//
//import com.sendgrid.Method;
//import com.sendgrid.Request;
//import com.sendgrid.SendGrid;
//import com.sendgrid.helpers.mail.Mail;
//import com.sendgrid.helpers.mail.objects.Content;
//import com.sendgrid.helpers.mail.objects.Email;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//@Service
//public class EmailService {
//
//    @Value("${sendgrid.api.key}")
//    private String sendGridApiKey;
//
//    public void sendEmail(String to, String subject, String body) throws IOException {
//        Email from = new Email("noreply@recruitmentmodule.com");
//        Email toEmail = new Email(to);
//        Content content = new Content("text/plain", body);
//        Mail mail = new Mail(from, subject, toEmail, content);
//
//        SendGrid sg = new SendGrid(sendGridApiKey);
//        Request request = new Request();
//        try {
//            request.setMethod(Method.POST);
//            request.setEndpoint("mail/send");
//            request.setBody(mail.build());
//            sg.api(request);
//        } catch (IOException ex) {
//            throw ex;
//        }
//    }
//}
