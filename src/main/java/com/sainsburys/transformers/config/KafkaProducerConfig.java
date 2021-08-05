package com.sainsburys.transformers.config;

import com.sainsburys.transformers.model.Person;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.internals.Sender;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public ProducerFactory<String, Person> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "localhost:9092");
        configProps.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        configProps.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG
                , "io.confluent.kafka.serializers.KafkaAvroSerializer");

        //configProps.put("schema.registry.url", "http://localhost:8081/subjects/persons-avro-value/versions");
        configProps.put("schema.registry.url", "http://localhost:8081");
        System.out.println( "prop configs :" +configProps);
        return new DefaultKafkaProducerFactory<>(configProps);

    }

    @Bean
    public KafkaTemplate<String, Person> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

  //  @Bean
   // public ProducerFactory<String, User> producerFactory() {
   //     return new DefaultKafkaProducerFactory<>(producerConfigs());


}
