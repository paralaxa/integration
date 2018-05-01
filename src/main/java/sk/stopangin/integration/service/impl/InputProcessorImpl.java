package sk.stopangin.integration.service.impl;

import sk.stopangin.integration.service.InputProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class InputProcessorImpl implements InputProcessor {
    private static final Logger log = LoggerFactory.getLogger(InputProcessorImpl.class);

    @Override
    @ServiceActivator(inputChannel = "httpChannel")
    public void process(Message<Byte[]> message) {
        log.info("processing bytes: {}", message.getHeaders().get("content-length"));
    }
}
