package com.sainsburys.transformers.sender;

import com.sainsburys.transformers.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class ProducerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;
    private String topicName = "personavro";



   public void sendMessage(Person message) {
       System.out.println("here sender");

       ListenableFuture<SendResult<String, Person>> future =
               kafkaTemplate.send(topicName, message);

       future.addCallback(new ListenableFutureCallback<SendResult<String, Person>>() {

           @Override
           public void onSuccess(SendResult<String, Person> result) {
               System.out.println("Sent message=[" + message +
                       "] with offset=[" + result.getRecordMetadata().offset() + "]");
           }
           @Override
           public void onFailure(Throwable ex) {
               System.out.println("Unable to send message=["
                       + message + "] due to : " + ex.getMessage());
           }
       });
   }
}


