package com.aws.AWS.controller;

import com.aws.AWS.models.Event;
import com.aws.AWS.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping
    public List<Event> getEvents(){
        return eventService.getAllEvents();
    }
}
