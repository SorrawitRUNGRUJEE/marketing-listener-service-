package dev.marketing.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Marketing Listener Service — Marketing & Lead Management Bounded Context.
 *
 * Consumes PropertyRegistered events from Kafka and triggers
 * the advertisement announcement workflow.
 */
@SpringBootApplication
public class MarketingListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketingListenerApplication.class, args);
    }
}
