package com.bootcampexercise.module8;

import java.util.HashMap;
import java.util.Map;

// this class shows how to use HashMap and print key-value pairs
public class MapActivity {

    public static void main(String[] args) {

        // create map using method
        Map<String, String> userMap = createMap();

        // call print method
        print(userMap);
    }

    // method to create and return map
    static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();

        // adding key-value pairs (id, name)
        map.put("1", "Surendar");
        map.put("2", "Ilmars");
        map.put("3", "Jana");
        map.put("4", "Wajid");

        return map;
    }

    // method to print map
    static void print(Map<String, String> map) {

        // loop through map and print key and value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Id: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}