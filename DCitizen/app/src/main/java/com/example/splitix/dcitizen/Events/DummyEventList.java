package com.example.splitix.dcitizen.Events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This creates a list of dummy Event items.
 * TODO make this a singleton that event submission adds items to
 *
 * Created by jdgranberry on 11/14/15.
 */
public class DummyEventList {

    /**
     * An array of sample (dummy) items.
     */
    public static List<EventContainer> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, EventContainer> ITEM_MAP = new HashMap<>();

    static {
        // Add sample items.
        addItem(new EventContainer("1", // ID
                "Austin Pets Alive!",   // Title
                "We are looking for volunteers to help out with monthly adoption events.", // Desc
                "http://www.austinpetsalive.org",                                          //LinkURL
                "http://www.petango.com/sms/photos/1112/6550712e-6819-4fdb-85ec-4bb8ed94587d.jpg", //ImageURL
                "Animals",  // EventType
                "00000"     // GPSlocation
                ));
        addItem(new EventContainer("2", "Flood Relief", "Help the vicitims of the recent flooding" +
                "in San Marcos and surrounding areas.", "http://www.txstate.edu/floodrelief/",
                "http://www.txstate.edu/floodrelief/help.jpg", "Disaster", "00000"
                ));
        addItem(new EventContainer("3", "Food Bank Donations", "The holidays are almost here," +
                "donate food and toys to help families in need.", "http://haysfoodbank.org/",
                "http://http://haysfoodbank.org/wp-content/uploads/hsf_logo.png",
                "People In Need", "00000"));
        addItem(new EventContainer("4", "River Cleanup", "We are looking for volunteers to help" +
                " clean up the San Marcos River!", "http://sanmarcosriver.org/",
                "http://sanmarcosriver.org/wp-content/uploads/2015/10/Water-quality.jpg",
                "Local", "00000"));
        addItem(new EventContainer("5", "Blood Drive", "Save a life, donate blood today! " +
                "Sponsored by The American Red Cross.", "http://www.redcross.org/tx/austin",
                "https://american.redcross.org/images/content/pagebuilder/2015_Catalog_Comfort_Kits_290x290.jpg",
                "Blood Drive", "00000"));
    }

    private static void addItem(EventContainer item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }
}