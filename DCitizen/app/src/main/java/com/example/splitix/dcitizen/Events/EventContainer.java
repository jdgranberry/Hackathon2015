package com.example.splitix.dcitizen.Events;

import java.util.Iterator;
import java.util.List;

/**
 * Container for individual event data.
 * eventType can be used to determine which icon to display.
 *
 * Created by jdgranberry on 11/14/15.
 */
public class EventContainer {


    private String id;
    private String title;
    private String blurb;       // Short blurb for listView description
    private String description; // Full description
    private String linkURL;
    private String imageURL; // TODO Make into array for multiple images
    private String eventType;
    private String GPSlocation; // TODO find a better data type
    private List<String> tags;  // List of tags associated with event

    public EventContainer(String id, String title, String blurb, String linkURL,
                          String imageURL, String eventType, String GPSlocation) {
        this.id = id;
        this.title = title;
        this.blurb = blurb;
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

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addToTags(String newTag) {tags.add(newTag);}

    public boolean removeFromTags(String removeTag) {
        Iterator itr = this.tags.iterator();
        boolean found = false;
        String strElement;
        while (itr.hasNext()) {

            strElement = (String) itr.next();
            if (strElement.equals(removeTag)) {
                itr.remove();
                found = true;
            }
        }
        return found;
    }


}
