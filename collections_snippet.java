/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */

// Importing all the classes in the java.util package.
import java.util.*;

public class collections_snippet {
  /**
   * The above function creates a List, a Set, and a Map, adds elements to each, and displays each
   */
  public static void main(String[] args) {
    /* 
    List: An interface in Java that defines a set of methods for working with a list data structure.

    <String>: A generic type that specifies the type of elements that the list will store. In this case, the list will store strings.

    list: A variable name that refers to an instance of the list data structure.

    new ArrayList<>(): A constructor of the ArrayList class, which creates a new instance of the list. 

    The empty angle brackets <> indicate that the type of elements that the list will store will be inferred 
    from the type of the variable (list) that the instance is being assigned to, which is List<String>.    
    */

    // Creating a List
    List < String > list = new ArrayList < > ();

    // Adding elements to the List
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");

    // Displaying the List
    System.out.println("List: " + list);

    /* 
    Set: An interface in Java that defines a set of methods for working with a set data structure, which is a collection of unique elements.

    <String>: A generic type that specifies the type of elements that the set will store. In this case, the set will store strings.

    set: A variable name that refers to an instance of the set data structure.

    new HashSet<>(): A constructor of the HashSet class, which creates a new instance of the set. 
    The empty angle brackets <> indicate that the type of elements that the set will store will be inferred 
    from the type of the variable (set) that the instance is being assigned to, which is Set<String>.
     */

    // Creating a Set
    Set < String > set = new HashSet < > ();

    // Adding elements to the Set
    set.add("Apple");
    set.add("Banana");
    set.add("Cherry");
    set.add("Date");

    // Displaying the Set
    System.out.println("Set: " + set);

    /* 
    Map: An interface in Java that defines a set of methods for working with a map data structure, which is a collection of key-value pairs.

    <String, Integer>: A generic type that specifies the types of the keys and values that the map will store. 
    In this case, the keys will be strings and the values will be integers.

    map: A variable name that refers to an instance of the map data structure.

    new HashMap<>(): A constructor of the HashMap class, which creates a new instance of the map. 
    The empty angle brackets <> indicate that the types of the keys and values that the map will store will be inferred 
    from the type of the variable (map) that the instance is being assigned to, which is Map<String, Integer>.


     */

    // Creating a Map
    Map < String, Integer > map = new HashMap < > ();

    // Adding elements to the Map
    map.put("Apple", 1);
    map.put("Banana", 2);
    map.put("Cherry", 3);
    map.put("Date", 4);

    // Displaying the Map
    System.out.println("Map: " + map);
  }
}