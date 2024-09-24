package com.ammous.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Rami Ammous
 */
@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic ammousTopic() {
        return TopicBuilder
                .name("ammous")
                .build();
    }

    @Bean
    public NewTopic ammousJsonTopic() {
        return TopicBuilder
                .name("ammousJson")
                .build();
    }
}
