package com.mycompany.java.cheatsheet.sockets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author drifter
 */
import java.net.*;
import java.io.*;

/**
 * It connects to a server, sends a message, and then waits for a response
 */
public class GreetingClient {

  /**
   * "The client connects to the server, sends a message, and then waits for a reply."
   * 
   * The first thing we do is create a socket and connect it to the server on the given port. Then we get
   * the input and output streams and send a message to the server. Then we wait for a reply
   */
  public static void main(String[] args) {

    // Getting the first argument from the command line.
    String serverName = args[0];

    // Getting the second argument from the command line.
    /*
    >int: This is the data type of the variable port. It is an int value, which represents a 32-bit signed integer in Java.

    >port: This is the variable that will hold the parsed integer value.

    >Integer.parseInt(args[1]): This is the method call that parses a string representation of a number into an int value. 
    The method Integer.parseInt() is a static method of the Integer class. 
    The argument passed to the method, args[1], is an element of the args array. 
    The args array is usually passed to the main() method as command-line arguments. 
    The [1] index accesses the second element of the array, as arrays in Java are zero-indexed.
     * 
     */
    int port = Integer.parseInt(args[1]);

    // Creating a socket connection to the server and sending a message to the server.
    try {
      // Creating a socket connection to the server and sending a message to the server.
      System.out.println("Connecting to " + serverName + " on port " + port);
      Socket client = new Socket(serverName, port);

      System.out.println("Just connected to " + client.getRemoteSocketAddress());
      // Getting the output stream from the client socket.
      OutputStream outToServer = client.getOutputStream();
      // Creating a new DataOutputStream object and passing the OutputStream object to the constructor.
      DataOutputStream out = new DataOutputStream(outToServer);

      // Writing a string to the output stream.
      out.writeUTF("Hello from " + client.getLocalSocketAddress());
      // Getting the input stream from the client socket.
      InputStream inFromServer = client.getInputStream();
      // Creating a new DataInputStream object and passing the InputStream object to the constructor.
      DataInputStream in = new DataInputStream(inFromServer);

      // Reading the message from the server.
      System.out.println("Server says " + in.readUTF());
      // It closes the socket connection.
      client.close();
    } // Catching an exception and printing the stack trace.
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}