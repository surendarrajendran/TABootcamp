package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.List;

// this class shows how to use ArrayList and print values
public class ListActivity {

    public static void main(String[] args) {

        // create a list of names
        List<String> namesList = new ArrayList<>();

        // add some names into the list
        namesList.add("Surendar");
        namesList.add("Ilmars");
        namesList.add("Jana");
        namesList.add("Yusuf");

        // call print method to display the list
        print(namesList);
    }

    // method to print all elements in the list
    static void print(List<String> list) {

        // loop through list and print each name
        for (String name : list) {
            System.out.println(name);
        }
    }
}

/**
 * Output (printed in same order as input):

 Surendar
 Ilmars
 Jana
 Yusuf

 */