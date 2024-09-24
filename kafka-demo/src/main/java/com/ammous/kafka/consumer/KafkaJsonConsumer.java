package com.ammous.kafka.consumer;


import com.ammous.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

/**
 * @author Rami Ammous
 */
@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "ammousJson" ,  groupId = "myGroup")
    public void consumerJsonMsg(Student student){
        log.info(format("Consuming the message from ammousJson Topic: %s" , student ));
    }
}
