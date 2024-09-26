package com.ammous.wikimedia.producer.rest;

import com.ammous.wikimedia.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rami Ammous
 */
@RestController
@RequestMapping("/api/v1/wiimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing(){
        streamConsumer.consumerStreamAndPublish();
    }
}
