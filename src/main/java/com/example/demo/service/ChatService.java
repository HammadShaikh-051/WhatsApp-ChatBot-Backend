package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null) {
            return "Invalid message";
        }

        message = message.trim().toLowerCase();

        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            case "how are you":
                return "I'm fine!";
            default:
                return "I don't understand";
        }
    }
}