package com.kafkaspringboot.spring.boot.kafka.project.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


    private  static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    //inject kafka template
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //method that will use kafka template to send the messsage
    public void sendMessage(String message){
        //log statement to print the statement
        LOGGER.info(String.format("Message sent %s", message));
        kafkaTemplate.send("javaguides", message);
    }

}
