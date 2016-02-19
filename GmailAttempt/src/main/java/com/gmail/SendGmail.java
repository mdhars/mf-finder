package com.gmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendGmail {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props);/*,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("muralisuk@gmail.com","chaseg0als");
				}
			});*/

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("muralisuk@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("mdhars@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," +
					"\n\n No spam to my email, please!");

			Transport.send(message,"muralisuk@gmail.com","chaseg0als");

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void send(){
		 {
				
				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.setProperty("mail.smtp.ssl.enable", "true");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.port", "465");

				Session session = Session.getInstance(props);/*,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication("muralisuk@gmail.com","chaseg0als");
						}
					});*/

				try {

					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress("muralisuk@gmail.com"));
					message.setRecipients(Message.RecipientType.TO,
							InternetAddress.parse("mdhars@gmail.com"));
					message.setSubject("Testing Subject");
					message.setText("Dear Mail Crawler," +
							"\n\n No spam to my email, please!");

					Transport.send(message,"muralisuk@gmail.com","chaseg0als");

					System.out.println("Done");

				} catch (MessagingException e) {
					throw new RuntimeException(e);
				}
			}
	}
}
