package com.sanhotels.email.service;
import java.io.IOException;
import java.util.Map;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.sanhotels.email.entity.EmailTemplate;
import com.sanhotels.email.entity.EmailToPost;
import com.sanhotels.email.entity.MailResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
@Service
public class EmailServiceSender {
	@Autowired
private  JavaMailSender mailSender;
	@Autowired
	private Configuration config;
	@Value("classpath:/image-7.jpeg")
	private Resource image7;
	
	@Value("classpath:/image-1.png")
	private Resource image1;
	
	@Value("classpath:/image-2.png")
	private Resource image2;
	
	@Value("classpath:/image-3.png")
	private Resource image3;
	
	@Value("classpath:/image-4.png")
	private Resource image4;
	
	@Value("classpath:/image-5.png")
	private Resource image5;
	
	@Value("classpath:/image-6.png")
	private Resource image6;
	
	@Value("classpath:/image-8.jpeg")
	private Resource image8;
	
	@Value("classpath:/image-9.jpeg")
	private Resource image9;
	
	@Value("classpath:/image-10.png")
	private Resource image10;
	
	@Value("classpath:/image-11.webp")
	private Resource image11;
	public void sendSimpleEmail(String toEmail,String body,String subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("samy.outemzabet@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		mailSender.send(message);
		System.out.println("Mail Send...");
		
	}
	
	public MailResponse sendEmail(EmailTemplate  request, Map<String, Object> model) {
		MailResponse response = new MailResponse();
		MimeMessage message = mailSender.createMimeMessage();
		try {
			// set mediaType
			MimeMessageHelper helper = new MimeMessageHelper(message, true,
					"UTF-8");
			//MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
				//	StandardCharsets.UTF_8.name());
			// add attachment
			//helper.addAttachment("sanhotels.PNG", new ClassPathResource("sanhotels.PNG"));
			
			Template t = config.getTemplate("email-res-template.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);

			helper.setTo(request.getToEmailForTemplate());
			helper.setText(html, true);
			helper.addInline("image7", image7);
			helper.addInline("image1", image1);
			helper.addInline("image2", image2);
			helper.addInline("image3", image3);
			helper.addInline("image4", image4);
			helper.addInline("image5", image5);
			helper.addInline("image6", image6);
			helper.addInline("image8", image8);
			helper.addInline("image9", image9);
			
			helper.addInline("image10", image10);
			
			helper.addInline("image11", image11);
			helper.setSubject(request.getEmailInfo().getSubjectEmail());
			helper.setFrom("samy.outemzabet@gmail.com");
			mailSender.send(message);

			response.setMessage("mail send to : " + request.getToEmailForTemplate());
			response.setStatus(Boolean.TRUE);

		} catch (MessagingException | IOException | TemplateException e) {
			response.setMessage("Mail Sending failure : "+e.getMessage());
			response.setStatus(Boolean.FALSE);
		}

		return response;
	}
}
