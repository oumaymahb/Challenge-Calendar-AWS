package com.aws.AWS.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Map;

@Getter
@Setter
@Entity
public class Event {
     @Id
     private String id;

     private String start;

     private String end ;

    @JsonProperty("end")
    private void unpackEndDateTimeFromNestedObject(Map<String, String> endTime) {
        end = endTime.get("dateTime");
    }
    @JsonProperty("start")
    private void unpackStartDateTimeFromNestedObject(Map<String, String> startTime) {
        start = startTime.get("dateTime");
    }
}
