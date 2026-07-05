package org.example.sxmain.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {
    @MessageMapping("/test-message")
    public void messager(String text) {
        System.out.println("Text: " + text);
    }
}
