/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet.sockets;

/**
 *
 * @author drifter
 */
// File Name GreetingServer.java
import java.net.*;
import java.io.*;

/**
 * It creates a ServerSocket, waits for a client to connect, and then sends a message to the client
 */
public class GreetingServer extends Thread {
  private ServerSocket serverSocket;


  public GreetingServer(int port) throws IOException {
    serverSocket = new ServerSocket(port);
    serverSocket.setSoTimeout(10000);
  }

  public void run() {
    while (true) {
      try {
        System.out.println("Waiting for client on port " +
          serverSocket.getLocalPort() + "...");
        Socket server = serverSocket.accept();

        System.out.println("Just connected to " + server.getRemoteSocketAddress());
        DataInputStream in = new DataInputStream(server.getInputStream());

        System.out.println(in.readUTF());
        DataOutputStream out = new DataOutputStream(server.getOutputStream());
        out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() +
          "\nGoodbye!");
        server.close();

      } catch (SocketTimeoutException s) {
        System.out.println("Socket timed out!");
        break;
      } catch (IOException e) {
        e.printStackTrace();
        break;
      }
    }
  }

  public static void main(String[] args) {

    // Getting the port number from the command line.
    int port = Integer.parseInt(args[0]);

/*
    Thread t: This declares a variable t of type Thread. A Thread is a unit of execution in a Java program.
    new GreetingServer(port): This is an object instantiation expression that creates a new instance of the GreetingServer class, 
    passing the value of the port variable as an argument. The GreetingServer class must have a constructor that accepts an int argument.
*/   
 try {
      Thread t = new GreetingServer(port);
      t.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}