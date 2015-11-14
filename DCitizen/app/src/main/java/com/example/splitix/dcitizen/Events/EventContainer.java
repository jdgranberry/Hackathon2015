package com.example.splitix.dcitizen;

/**
 * Created by jdgranberry on 11/14/15.
 */
public class EventContainer extends Object {
    private String title;
    private String description;
    private String url;
    private String imageUrl; // TODO Make into array for multiple images
    private String eventType;
    private String GPSlocation; // TODO find a better data type
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getGPSlocation() {
        return GPSlocation;
    }

    public void setGPSlocation(String GPSlocation) {
        this.GPSlocation = GPSlocation;
    }



}
