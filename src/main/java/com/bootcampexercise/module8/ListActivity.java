package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// this class shows List and HashSet operations
public class ListActivity {

    public static void main(String[] args) {

        // List part
        List<String> namesList = createList();
        printList(namesList);

        System.out.println("----- HashSet Operations -----");

        // HashSet part
        Set<String> namesSet = createSet();
        printSet(namesSet);

        addDuplicates(namesSet);
        printSet(namesSet);

        removeValues(namesSet);
        printSet(namesSet);

        findIndex(namesSet, "Disha");
    }

    // method to create list
    static List<String> createList() {

        List<String> namesList = new ArrayList<>();

        namesList.add("Surendar");
        namesList.add("Ilmars");
        namesList.add("Jana");
        namesList.add("Yusuf");

        return namesList;
    }

    // method to print list
    static void printList(List<String> list) {

        for (String name : list) {
            System.out.println(name);
        }
    }

    // method to create HashSet with 10 names
    static Set<String> createSet() {

        Set<String> namesSet = new HashSet<>();

        namesSet.add("Surendar");
        namesSet.add("Disha");
        namesSet.add("Rajendran");
        namesSet.add("Ilamrs");
        namesSet.add("Edvards");
        namesSet.add("Priyanka");
        namesSet.add("Nikita");
        namesSet.add("Disha");
        namesSet.add("Wajid");
        namesSet.add("Povilas");

        return namesSet;
    }

    // method to print set
    static void printSet(Set<String> set) {

        for (String name : set) {
            System.out.println(name);
        }

        System.out.println("-------------------");
    }

    // method to add duplicate values
    static void addDuplicates(Set<String> set) {

        // adding duplicates (will not be added again)
        set.add("Ilmars");
        set.add("Disha");
    }

    // method to remove values
    static void removeValues(Set<String> set) {

        set.remove("Surendar");
        set.remove("Rajendran");
    }

    // method to find index of a name (by converting to list)
    static void findIndex(Set<String> set, String target) {

        List<String> tempList = new ArrayList<>(set);

        int index = tempList.indexOf(target);

        if (index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found in set");
        }
    }
}

/*
Overall output (including Module8 Activity1 & Activity2):

Surendar
Ilmars
Jana
Yusuf
----- HashSet Operations -----
Povilas
Ilamrs
Nikita
Rajendran
Disha
Edvards
Surendar
Wajid
Priyanka
-------------------
Povilas
Ilamrs
Nikita
Rajendran
Disha
Edvards
Surendar
Wajid
Priyanka
Ilmars
-------------------
Povilas
Ilamrs
Nikita
Disha
Edvards
Wajid
Priyanka
Ilmars
-------------------
Disha found at index: 3

 */