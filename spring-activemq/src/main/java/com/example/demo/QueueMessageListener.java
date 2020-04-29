package com.example.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueMessageListener {
	
	@JmsListener(destination = MessageSender.ALERT_MONITOR_QUEUE_NAME)
	public void receiveMessage(final Message message) throws JMSException {
		System.out.println("Received message " + message);
		if(message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage)message;
			System.out.println("Received message " + textMessage.getText());
		}
	}
}
