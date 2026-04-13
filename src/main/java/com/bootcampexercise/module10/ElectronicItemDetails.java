package com.bootcampexercise.module10;

import java.util.HashMap;

// class to store electronic item details
public class ElectronicItemDetails {

    // method to return price of item
    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // create hashmap
        HashMap<String, Double> itemHashMap = new HashMap<>();

        // add items
        itemHashMap.put("TV", 500.0);
        itemHashMap.put("Refrigerator", 800.0);
        itemHashMap.put("Washing Machine", 600.0);
        itemHashMap.put("Laptop", 1000.0);

        // print price of TV
        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }
}

/*

Output:

Price of TV is 500.0

*/