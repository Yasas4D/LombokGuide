package com.example.lombok.guide.services;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private static final Logger log = LoggerFactory.getLogger(MailService.class);

    @EventListener(ApplicationReadyEvent.class)
    public void Setup() {
        log.info("An INFO Message in default SL4J Logger");
        log.warn("A WARN Message in default SL4J Logger");
    }

}
