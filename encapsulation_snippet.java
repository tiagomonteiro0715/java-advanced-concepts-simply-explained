/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */

/**
 * "A Person has an age, which can be read and written."
 * 
 * The private age field is the property's storage. The getAge() and setAge() methods are the
 * property's accessors
 */
class Person {
  // Private is a modifier that restricts access to the class.
  private int age;

  // getter method
  public int getAge() {
    return age;
  }

  // setter method
  public void setAge(int age) {
    this.age = age;
  }
}

/**
 * We create an object of Person, change its age using setter, and access its age using getter.
 */
class Main {
  public static void main(String[] args) {

    // create an object of Person
    Person p1 = new Person();

    // change age using setter
    p1.setAge(24);

    // access age using getter
    System.out.println("My age is " + p1.getAge());
  }
}





public class encapsulation_snippet {
    
}
