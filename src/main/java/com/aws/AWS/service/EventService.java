package com.aws.AWS.service;

import com.aws.AWS.models.Event;
import com.aws.AWS.models.PageResponse;
import com.aws.AWS.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    RestTemplate restTemplate;

    private String endPoint="https://dodat-programming-test.s3-ap-southeast-2.amazonaws.com/dodatrhys_events.json";

    public void storeEvent(){
        PageResponse result = restTemplate.getForObject(endPoint, PageResponse.class);
        result.getItems().stream().forEach(e->{
            eventRepository.save(e);
            System.out.println(e.getId()+" "+e.getEnd()+" "+e.getStart());
        });
    }
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
}
