package com.example.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender { 
 @Autowired
 private JmsTemplate jmsTemplate;
 
 public static final String ALERT_MONITOR_QUEUE_NAME="ATP.OPC.MONITOR.QUEUE";


  public void sendMessage(String message) {
      System.out.println("sending: " + message);
      jmsTemplate.send(ALERT_MONITOR_QUEUE_NAME, new MessageCreator() {
          @Override
          public Message createMessage(Session session) throws JMSException {
              return session.createTextMessage(message);
          }
      });
  }
}
