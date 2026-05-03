package dev.marketing.listener.listener;

import dev.marketing.listener.event.PropertyRegisteredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka Consumer — Marketing & Lead Management Bounded Context.
 *
 * Listens for PropertyRegistered events from the Inventory context.
 * When a new property is registered, this listener simulates the
 * beginning of the "advertisement announcement" workflow.
 *
 * This demonstrates:
 * - Asynchronous Nonblocking communication via Kafka
 * - Eventual Consistency between Inventory and Marketing contexts
 * - Information Hiding: Marketing only sees the event payload,
 *   not the internal aggregate structure of Inventory
 */
@Component
public class PropertyEventListener {

    private static final Logger log = LoggerFactory.getLogger(PropertyEventListener.class);

    @KafkaListener(
        topics = "${app.kafka.topic}",
        groupId = "marketing-listener-group"
    )
    public void onPropertyRegistered(PropertyRegisteredEvent event) {
        log.info("========================================================");
        log.info("[MARKETING] Received PropertyRegistered event!");
        log.info("[MARKETING] Property ID   : {}", event.getPropertyId());
        log.info("[MARKETING] Project       : {}", event.getProjectName());
        log.info("[MARKETING] Unit          : {}", event.getUnitNumber());
        log.info("[MARKETING] Type          : {}", event.getPropertyType());
        log.info("[MARKETING] Address       : {}", event.getAddress());
        log.info("[MARKETING] Price         : {}", event.getSettledPrice());
        log.info("[MARKETING] Area (sqm)    : {}", event.getAreaSqm());
        log.info("[MARKETING] Registered At : {}", event.getRegisteredAt());
        log.info("--------------------------------------------------------");
        log.info("[MARKETING] >> Initiating advertisement announcement...");
        log.info("[MARKETING] >> Creating property listing for portal...");
        log.info("[MARKETING] >> Workflow triggered successfully.");
        log.info("========================================================");
    }
}
