package com.ammous.wikimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

/**
 * @author Rami Ammous
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String msg){
//        log.info(format("Sending message to ammous Topic:: %s" , msg));
        kafkaTemplate.send("wikimedia-stream",msg);
    }

}
