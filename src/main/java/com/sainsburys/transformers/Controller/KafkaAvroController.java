package com.sainsburys.transformers.Controller;

import com.sainsburys.transformers.model.Person;
import com.sainsburys.transformers.sender.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//@RestController
@RequestMapping("/api")
@RestController

//@RequestMapping("/demo")

public class KafkaAvroController {

    @Autowired
    ProducerService producerService;

    //@PostMapping(value = "/publish")
    //public String kafkaMessage(@RequestBody Person message) {
    //   producerService.sendMessage(message);
    //   return "Success";

    //@GetMapping("/")
    //       public String index() {
    //     return "Greetings from Spring Boot!";}

    @GetMapping(value = "getMapping")
    public String getMapping(ModelMap model) {
        model.addAttribute("message", "This is Get Method using @GetMapping annotation..!");
        return "hello";
    }

    //@PostMapping(value = "postMapping")
    //public String postMapping(ModelMap model) {
       // model.addAttribute("message", "This is Post Method using @PostMapping annotation..!");
    //    return "hello";
    //}


    //@PostMapping("/")
    //@ResponseBody
    @PostMapping(value = "postMapping")
    public String kafkaMessage(@RequestBody Person message) {
        producerService.sendMessage(message);
        return "Success";
    }
}
  //  @RestController
  //  public class KafkaAvroController {

  //       @GetMapping("/")
  //      public String index() {
  //          return "Greetings from Spring Boot!";



 //   }