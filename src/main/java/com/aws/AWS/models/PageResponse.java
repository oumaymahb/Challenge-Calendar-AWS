package com.aws.AWS.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageResponse {

    private String kind;

    private Object defaultReminders;

    private String updated;

    private String summary;

    private String etag;

    private String nextSyncToken;

    private String timeZone;

    private String accessRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Event> items;

}
