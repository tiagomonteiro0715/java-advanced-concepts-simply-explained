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
 * A Rectangle object has a length and a width, and can calculate its area.
 */
class Rectangle {
  int length;
  int width;
  void insert(int l, int w) {
    length = l;
    width = w;
  }
  void calculateArea() {
    System.out.println(length * width);
  }
}

/**
 * The class TestRectangle1 creates two objects of the class Rectangle, r1 and r2, and calls the
 * methods insert and calculateArea on them
 */
public class class_snippet {

  class TestRectangle1 {
    /**
     * The main function creates two Rectangle objects, r1 and r2, and then calls the insert and
     * calculateArea functions on each of them.
     * 
     * @param args This is the array of strings that are passed to the main method.
     */
    public void main(String args[]) {

      // Creating two objects of the class Rectangle.
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();

      // The above code is creating two objects of the Rectangle class.
      r1.insert(11, 5);
      r2.insert(3, 15);
      r1.calculateArea();
      r2.calculateArea();
    }

  }
}