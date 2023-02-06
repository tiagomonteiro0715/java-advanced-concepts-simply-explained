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
 * The MountainBike class extends the Bicycle class, and therefore inherits all its fields and methods
 */
public class inheritance_snippet {

  /**
   * The Bicycle class has three methods, one constructor, and two fields
   */
  class Bicycle {

    // Declaring two variables, gear and speed, and assigning them default values.
    public int gear;
    public int speed;

    // A constructor.
    public Bicycle(int gear, int speed) {
      this.gear = gear;
      this.speed = speed;
    }

    /**
     * ApplyBrake() is a public function that takes an integer as an argument and decrements the speed of
     * the vehicle by that amount.
     * 
     * @param decrement The amount by which the speed of the vehicle is decreased
     */
    public void applyBrake(int decrement) {
      speed -= decrement;
    }

    /**
     * This function takes an integer as an argument and adds it to the speed variable.
     * 
     * @param increment the amount to increase the speed by
     */
    public void speedUp(int increment) {
      speed += increment;
    }

    /**
     * The toString() method returns the string representation of the object
     * 
     * @return The toString() method is being returned.
     */
    public String toString() {
      return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
  }

  /**
   * MountainBike is a subclass of Bicycle.
   */
  class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
      // Calling the constructor of the parent class.
      super(gear, speed);
      seatHeight = startHeight;
    }

    /**
     * > The setHeight function takes an integer as an argument and sets the seatHeight variable to that
     * value
     * 
     * @param newValue The new value for the seatHeight variable.
     */
    public void setHeight(int newValue) {
      seatHeight = newValue;
    }

    /** What @Override does in java?
    The @Override annotation in Java is used to indicate that a method is intended to override a method declared in a superclass(Bicycle). 
    When a method is annotated with @Override, the compiler checks that the method actually does override a superclass method. 
    If it does not, the compiler generates an error.
     */

    /**
     * The `toString()` method is a special method that returns a string representation of the object
     * 
     * @return The superclass toString() method is being called, and then the seatHeight is being added to
     * the end of the string.
     */
    @Override 
	public String toString() {
      return (super.toString() + "\nseat height is " + seatHeight);
    }
  }

  /**
   * The MountainBike class extends the Bike class and adds one more field
   */
  public class Test {
    /**
     * The `main()` function is the entry point of the program
     * 
     * @param args The arguments passed to the main method.
     */
    public void main(String args[]) {
      // Creating a new MountainBike object, and then printing out the string representation of that object.
      MountainBike mb = new MountainBike(3, 100, 25);
      System.out.println(mb.toString());
    }
  }

}