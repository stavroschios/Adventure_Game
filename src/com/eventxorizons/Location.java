package com.eventxorizons;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits){
        this.description = description;
        this.locationID = locationID;
       if(exits != null) {
           this.exits = new HashMap<>(exits);
       } else {
               this.exits = new HashMap<>();
           }
        this.exits.put("Q",0);
    }

//    public void addExit(String location, int direction){
//        exits.put(location,direction);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
