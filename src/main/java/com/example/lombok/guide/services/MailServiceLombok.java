package com.example.lombok.guide.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailServiceLombok {

    @EventListener(ApplicationReadyEvent.class)
    public void Setup() {
        log.info("An INFO Message in Lombok SL4J Logger");
        log.warn("A WARN Message in Lombok SL4J Logger");
    }
}
