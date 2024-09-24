package com.ammous.kafka.rest;

import com.ammous.kafka.payload.Student;
import com.ammous.kafka.producer.KafkaJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ammous.kafka.producer.kafkaProducer;
/**
 * @author Rami Ammous
 */

@RestController
@RequestMapping("/api/v1/messsages")
@RequiredArgsConstructor
public class MessageController {

    private final kafkaProducer kafkaProducer;
    private final KafkaJsonProducer jsonKafkaProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }


    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student student){
        jsonKafkaProducer.sendMessage(student);
        return ResponseEntity.ok("Message queued successfully as Json");
    }
}
