package sk.stopangin.integration.service;

import org.springframework.messaging.Message;

public interface InputProcessor {
    void process(Message<Byte[]> message);
}
