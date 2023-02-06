/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */

/*
In this example, an Employee object is created and its state is written to a file called "employee.ser" using an ObjectOutputStream. 

Then the same object is read from the file using an ObjectInputStream and deserialized into a new Employee object. 

The Employee class must implement the Serializable interface for this to work. 

The deserialized object is then used to print its name, address, and age.
*/

import java.io.*;

class Employee implements Serializable {
  private String name;
  private String address;
  private int age;

  // A constructor.
  public Employee(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }
}

/**
 * The Employee class implements the Serializable interface, which means that it can be serialized
 */
public class SerializeDeserializeExample {

  /**
   * Serialize an object to a file, then deserialize it back into a new object.
   */
  public static void main(String[] args) {
    Employee employee = new Employee("John Doe", "123 Main St", 25);

    // The above code is serializing the object employee.
    try {
      // Creating a file named employee.ser in the current directory.
      FileOutputStream fileOut = new FileOutputStream("employee.ser");
      // Creating a new ObjectOutputStream object and passing it the fileOut object.
      ObjectOutputStream out = new ObjectOutputStream(fileOut);


      // Serializing the object employee.
      out.writeObject(employee);


      // The above code is serializing the object.
      out.close();
      fileOut.close();
      System.out.println("Serialized data is saved in employee.ser");

    } // The above code is catching an IOException.
    catch (IOException i) {
      i.printStackTrace();
    }

    // Deserialize the object
    Employee deserializedEmployee = null;
    try {

      // Reading the serialized object from the file.
      FileInputStream fileIn = new FileInputStream("employee.ser");

      // Creating an ObjectInputStream object that reads from a file.
      ObjectInputStream in = new ObjectInputStream(fileIn);

      // Casting the object read from the file to an Employee object.
      deserializedEmployee = (Employee) in.readObject();

      // Reading the file and deserializing it.
      in.close();
      fileIn.close();
    }
    // Catching an IOException.
    catch (IOException i) {
      i.printStackTrace();
      return;
    } catch (ClassNotFoundException c) {
      System.out.println("Employee class not found");
      c.printStackTrace();
      return;
    }

    // The above code is serializing and deserializing an object.
    System.out.println("Deserialized Employee...");
    System.out.println("Name: " + deserializedEmployee.name);
    System.out.println("Address: " + deserializedEmployee.address);
    System.out.println("Age: " + deserializedEmployee.age);
  }

}

public class serialization_snippet {

}