package com.solebac.application.services;

import org.springframework.mail.SimpleMailMessage;

import com.solebac.application.domain.Cliente;
import com.solebac.application.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
