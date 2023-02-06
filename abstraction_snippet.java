/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */



/***************************************************
What is an abstract class in java, simply explained?
****************************************************
An abstract class in Java is a class that cannot be instantiated on its own, but is meant to be a base or blueprint for other classes to extend and build upon. 

Abstract classes can contain abstract methods, which are methods without a body or implementation, that must be defined by any class that extends the abstract class. 

An abstract class can also contain concrete (implemented) methods, which can be reused by classes that extend it. 

The purpose of an abstract class is to provide a common interface and shared functionality for related classes, while allowing each class to have its own unique implementation.
*/


/**
 * Sunstar is an abstract class that has one abstract method called printInfo.
 */
abstract class sunstar {
	abstract void printInfo();
}

/**
 * The employee class is a subclass of the sunstar class.
 */
class employee extends sunstar {
/**
 * It prints the values of the variables name, age and salary.
 */
	void printInfo() {
// Declaring and initializing variables.
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

// Printing the values of the variables name, age and salary.
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}

}

/**
 * The base class is a class that contains a main method that creates an object of the employee class
 * and calls the printInfo method on it.
 */
class base {
	public static void main(String args[]) {
		sunstar s = new employee();
		s.printInfo();
	}
}


public class abstraction_snippet {

}
