package com.chat.app.tusharchatbot.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.chat.app.tusharchatbot.models.Message;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try{
            Thread.sleep(2000);

        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        return message;
    }
}
