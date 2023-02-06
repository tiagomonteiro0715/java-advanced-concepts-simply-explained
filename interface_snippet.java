/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */

import java.io.*;

/**
 * Bicycle and Bike are two classes that implement the Vehicle interface.
 */
public class interface_snippet {

  // Defining an interface.
  interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
  }

  /**
   * The class Bicycle implements the interface Vehicle
   */
  class Bicycle implements Vehicle {

    // Defining the variables that are used in the class.
    int speed;
    int gear;

    /**
     * The `@Override` annotation is a compiler check to make sure that the method is actually overriding a
     * method in the superclass
     * 
     * @param newGear The new gear to change to.
     */
    @Override // A compiler check to make sure that the method is actually overriding a method in the superclass.
    public void changeGear(int newGear) {
      gear = newGear;
    }

    /**
     * The speedUp function takes an integer as an argument and adds it to the speed variable.
     * 
     * @param increment the amount by which to increase the speed of the vehicle
     */
    @Override
    public void speedUp(int increment) {
      speed = speed + increment;
    }

    /**
     * The applyBrakes() function in the Bicycle class is overridden in the MountainBike class.
     * 
     * @param decrement The amount by which the speed of the vehicle is decreased
     */
    @Override
    public void applyBrakes(int decrement) {
      speed = speed - decrement;
    }

    /**
     * PrintStates prints the speed and gear of the bike.
     */
    public void printStates() {
      System.out.println("speed: " + speed + " gear: " + gear);
    }
  }

  /**
   * The class Bike implements the interface Vehicle
   */
  class Bike implements Vehicle {

    // Defining the variables that are used in the class.
    int speed;
    int gear;

    /**
     * The changeGear() function is a member of the Bicycle class, and it takes an integer as an argument.
     * 
     * @param newGear The new gear to change to.
     */
    @Override
    public void changeGear(int newGear) {
      gear = newGear;
    }

    /**
     * The speedUp function takes an integer as an argument and adds it to the speed variable.
     * 
     * @param increment the amount by which to increase the speed of the vehicle.
     */
    @Override
    public void speedUp(int increment) {
      speed = speed + increment;
    }

    /**
     * The applyBrakes() function in the Bicycle class is overridden in the MountainBike class.
     * 
     * @param decrement The amount by which the speed of the vehicle is decremented.
     */
    @Override
    public void applyBrakes(int decrement) {
      speed = speed - decrement;
    }

    /**
     * PrintStates() prints the current speed and gear of the bicycle.
     */
    public void printStates() {
      System.out.println("speed: " + speed + " gear: " + gear);
    }

  }

  /**
   * The class `Bicycle` has three fields `cadence`, `speed`, and `gear`. The class also has one
   * constructor and four methods. When we create a new `Bicycle` object using the constructor, we are
   * initializing that object's `cadence`, `speed`, and `gear` fields to the values `0`, `0`, and `1`,
   * respectively
   */
  class GFG {
    public void main(String[] args) {

      // Creating a new instance of the class `Bicycle` and assigning it to the variable `bicycle`.
      Bicycle bicycle = new Bicycle();

      // Calling the methods `changeGear`, `speedUp`, and `applyBrakes` on the object `bicycle`.
      bicycle.changeGear(2);
      bicycle.speedUp(3);
      bicycle.applyBrakes(1);

      // Calling the `printStates` method on the `bicycle` object.
      System.out.println("Bicycle present state :");
      bicycle.printStates();
      //----------------------------------------------------------------------------------------------------------
      // Creating a new instance of the class `Bike` and assigning it to the variable `bike`.
      Bike bike = new Bike();

      // Calling the methods `changeGear`, `speedUp`, and `applyBrakes` on the object `bike`.
      bike.changeGear(1);
      bike.speedUp(4);
      bike.applyBrakes(3);

      // Calling the `printStates` method on the `bike` object.
      System.out.println("Bike present state :");
      bike.printStates();
    }
  }

}