package com.example.splitix.dcitizen.Events;

/**
 * Container for individual event data.
 *
 * Created by jdgranberry on 11/14/15.
 */
public class EventContainer {


    private String id;
    private String title;
    private String description;
    private String linkURL;
    private String imageURL; // TODO Make into array for multiple images
    private String eventType;
    private String GPSlocation; // TODO find a better data type

    public EventContainer(String id, String title, String description, String linkURL,
                          String imageURL, String eventType, String GPSlocation) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.linkURL = linkURL;
        this.imageURL = imageURL;
        this.eventType = eventType;
        this.GPSlocation = GPSlocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
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

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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
