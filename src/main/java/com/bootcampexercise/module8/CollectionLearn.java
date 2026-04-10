package com.bootcampexercise.module8;

import java.util.*;

// this class shows list, set and map operations
public class CollectionLearn {

    public static void main(String[] args) {

        // create collections
        List<String> list = createList();
        Set<String> set = createSet();
        Map<Integer, String> map = createMap();

        System.out.println("----- Initial Values -----");
        printAll(list, set, map);

        // add values (no duplicates)
        System.out.println("\n----- Add Operation -----");
        addToList(list, "Ahmed");
        addToSet(set, "Ahmed");
        addToMap(map, 11, "Ahmed");
        printAll(list, set, map);

        // add values (validate non addition of duplicates)
        System.out.println("\n----- Add Operation -----");
        addToList(list, "Surendar");
        addToSet(set, "Surendar");
        addToMap(map, 11, "Surendar");
        printAll(list, set, map);

        // remove values
        System.out.println("\n----- Remove Operation -----");
        removeFromList(list, "Jana");
        removeFromSet(set, "Jana");
        removeFromMap(map, 5);
        printAll(list, set, map);

        // replace values (no duplicates)
        System.out.println("\n----- Replace Operation -----");
        replaceInList(list, "Surendar", "Surea");
        replaceInSet(set, "Surendar", "Surea");
        replaceInMap(map, 1, "Surea");
        printAll(list, set, map);
    }

    // create list with 10 values
    static List<String> createList() {
        List<String> list = new ArrayList<>();

        list.add("Surendar");
        list.add("Rajendran");
        list.add("Disha");
        list.add("Ilmars");
        list.add("Jana");
        list.add("Yusuf");
        list.add("Sonakshi");
        list.add("Nikita");
        list.add("Wajid");
        list.add("Priya");

        return list;
    }

    // create set with same values
    static Set<String> createSet() {
        return new HashSet<>(createList());
    }

    // create map with 10 values
    static Map<Integer, String> createMap() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Surendar");
        map.put(2, "Rajendran");
        map.put(3, "Disha");
        map.put(4, "Ilmars");
        map.put(5, "Jana");
        map.put(6, "Yusuf");
        map.put(7, "Sonakshi");
        map.put(8, "Nikita");
        map.put(9, "Wajid");
        map.put(10, "Priya");

        return map;
    }

    // print all collections with numbering
    static void printAll(List<String> list, Set<String> set, Map<Integer, String> map) {

        System.out.println("List:");
        int count = 1;
        for (String s : list) {
            System.out.println(count + ". " + s);
            count++;
        }

        System.out.println("\nSet:");
        count = 1;
        for (String s : set) {
            System.out.println(count + ". " + s);
            count++;
        }

        System.out.println("\nMap:");
        count = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + " - " + entry.getValue());
            count++;
        }
    }

    // add methods (no duplicates)
    static void addToList(List<String> list, String value) {
        if (!list.contains(value)) {
            list.add(value);
        }
    }

    static void addToSet(Set<String> set, String value) {
        set.add(value);
    }

    static void addToMap(Map<Integer, String> map, int key, String value) {
        if (!map.containsValue(value)) {
            map.put(key, value);
        }
    }

    // remove methods
    static void removeFromList(List<String> list, String value) {
        list.remove(value);
    }

    static void removeFromSet(Set<String> set, String value) {
        set.remove(value);
    }

    static void removeFromMap(Map<Integer, String> map, int key) {
        map.remove(key);
    }

    // replace methods (no duplicates)
    static void replaceInList(List<String> list, String oldValue, String newValue) {
        if (!list.contains(newValue)) {
            int index = list.indexOf(oldValue);
            if (index != -1) {
                list.set(index, newValue);
            }
        }
    }

    static void replaceInSet(Set<String> set, String oldValue, String newValue) {
        if (set.contains(oldValue) && !set.contains(newValue)) {
            set.remove(oldValue);
            set.add(newValue);
        }
    }

    static void replaceInMap(Map<Integer, String> map, int key, String newValue) {
        if (!map.containsValue(newValue) && map.containsKey(key)) {
            map.put(key, newValue);
        }
    }
}

/*
Output:

----- Initial Values -----
List:
1. Surendar
2. Rajendran
3. Disha
4. Ilmars
5. Jana
6. Yusuf
7. Sonakshi
8. Nikita
9. Wajid
10. Priya

Set:
1. Priya
2. Yusuf
3. Nikita
4. Rajendran
5. Disha
6. Surendar
7. Jana
8. Sonakshi
9. Wajid
10. Ilmars

Map:
1. 1 - Surendar
2. 2 - Rajendran
3. 3 - Disha
4. 4 - Ilmars
5. 5 - Jana
6. 6 - Yusuf
7. 7 - Sonakshi
8. 8 - Nikita
9. 9 - Wajid
10. 10 - Priya

----- Add Operation -----
List:
1. Surendar
2. Rajendran
3. Disha
4. Ilmars
5. Jana
6. Yusuf
7. Sonakshi
8. Nikita
9. Wajid
10. Priya
11. Ahmed

Set:
1. Ahmed
2. Priya
3. Yusuf
4. Nikita
5. Rajendran
6. Disha
7. Surendar
8. Jana
9. Sonakshi
10. Wajid
11. Ilmars

Map:
1. 1 - Surendar
2. 2 - Rajendran
3. 3 - Disha
4. 4 - Ilmars
5. 5 - Jana
6. 6 - Yusuf
7. 7 - Sonakshi
8. 8 - Nikita
9. 9 - Wajid
10. 10 - Priya
11. 11 - Ahmed

----- Add Operation -----
List:
1. Surendar
2. Rajendran
3. Disha
4. Ilmars
5. Jana
6. Yusuf
7. Sonakshi
8. Nikita
9. Wajid
10. Priya
11. Ahmed

Set:
1. Ahmed
2. Priya
3. Yusuf
4. Nikita
5. Rajendran
6. Disha
7. Surendar
8. Jana
9. Sonakshi
10. Wajid
11. Ilmars

Map:
1. 1 - Surendar
2. 2 - Rajendran
3. 3 - Disha
4. 4 - Ilmars
5. 5 - Jana
6. 6 - Yusuf
7. 7 - Sonakshi
8. 8 - Nikita
9. 9 - Wajid
10. 10 - Priya
11. 11 - Ahmed

----- Remove Operation -----
List:
1. Surendar
2. Rajendran
3. Disha
4. Ilmars
5. Yusuf
6. Sonakshi
7. Nikita
8. Wajid
9. Priya
10. Ahmed

Set:
1. Ahmed
2. Priya
3. Yusuf
4. Nikita
5. Rajendran
6. Disha
7. Surendar
8. Sonakshi
9. Wajid
10. Ilmars

Map:
1. 1 - Surendar
2. 2 - Rajendran
3. 3 - Disha
4. 4 - Ilmars
5. 6 - Yusuf
6. 7 - Sonakshi
7. 8 - Nikita
8. 9 - Wajid
9. 10 - Priya
10. 11 - Ahmed

----- Replace Operation -----
List:
1. Surea
2. Rajendran
3. Disha
4. Ilmars
5. Yusuf
6. Sonakshi
7. Nikita
8. Wajid
9. Priya
10. Ahmed

Set:
1. Ahmed
2. Priya
3. Surea
4. Yusuf
5. Nikita
6. Rajendran
7. Disha
8. Sonakshi
9. Wajid
10. Ilmars

Map:
1. 1 - Surea
2. 2 - Rajendran
3. 3 - Disha
4. 4 - Ilmars
5. 6 - Yusuf
6. 7 - Sonakshi
7. 8 - Nikita
8. 9 - Wajid
9. 10 - Priya
10. 11 - Ahmed

 */