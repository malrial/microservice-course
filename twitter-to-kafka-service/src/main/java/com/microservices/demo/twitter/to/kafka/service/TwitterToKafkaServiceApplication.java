package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private final static Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    private TwitterToKafkaServiceConfigData config;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData config) {
        this.config = config;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("hola");
        LOG.info(Arrays.toString(config.getTwitterKeywords().toArray(new String []{})));
    }
}
