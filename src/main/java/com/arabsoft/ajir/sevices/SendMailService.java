package com.arabsoft.ajir.sevices;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class SendMailService {
	 @Autowired
		private JavaMailSender mailSender;
		private static final long EXPIRE_TOKEN_AFTER_MINUTES = 60;
		@Async
		public void sendEmail(SimpleMailMessage email) {
			mailSender.send(email);
		}
}


