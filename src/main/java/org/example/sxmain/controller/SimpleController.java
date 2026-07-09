package org.example.sxmain.controller;

import org.example.sxmain.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {
    @MessageMapping("/test-message")
    @SendTo("/topic/test")
    public Message messager(Message m) {
        return m;
    }
}
