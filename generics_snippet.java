/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter 
 */

// Java program to show multiple
// type parameters in Java Generics

/*chatGPT response - Why are generics used in java simply explained?

Generics in Java allow you to create reusable classes, interfaces, and methods that work with different types of data. 
This makes your code more flexible and scalable, because you can write a generic algorithm once and use it with multiple types of objects, 
without having to write separate implementations for each type.

Generics also help you write safer and more readable code, because they enable you to catch errors at compile time rather than at runtime. 
This can help you avoid bugs and reduce the need for debugging.

For example, consider a generic class List that can be used to store a list of objects of any type. 
You can create a List of integers, a List of strings, and so on, all with the same implementation. 
This makes your code more concise and less error-prone, because you don't have to write separate implementations for each type of list.
*/

/**
 * Test is a generic class that has two type parameters, T and U, and has T obj1 and U obj2 as its data
 * members.
 */
class Test < T, U > {
  // Creating two objects of different types.
  T obj1; // An object of type T
  U obj2; // An object of type U

  // A constructor that takes two arguments of type T and U and assigns them to the data members obj1 and
  // obj2.
  Test(T obj1, U obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
  }

  /**
   * `print()` prints the values of `obj1` and `obj2` to the console
   */
  public void print() {
    System.out.println(obj1);
    System.out.println(obj2);
  }
}

/**
 * The class Test is a generic class that has two type parameters, T and V. The class declares two
 * private fields of type T and V respectively, and a constructor that initializes these fields. The
 * class also declares a method print() that prints the two fields
 */
class Main {
  /**
   * The function takes two arguments, one of type T and the other of type V, and prints them using
   * System.out.println()
   */
  public static void main(String[] args) {
    // The above code is creating an object of Test class with String and Integer as type arguments.
    Test < String, Integer > obj = new Test < String, Integer > ("GfG", 15);
    obj.print();
  }
}

public class generics_snippet {

}