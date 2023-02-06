/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet.sockets;

/**
 *
 * @author drifter
 */

/*
Here is an example of a simple socket in Java that creates a client that 
connects to a server at a specific IP address and port number, sends a message, 
and receives a response:
*/

import java.io.*;
import java.net.*;


/**
 * It creates a socket that connects to the server at the IP address 127.0.0.1 (localhost) and port
 * number 1234. It then sends a message to the server and prints the server's response to the console
 */
public class chatGPT_socket_snippet {

/*
  throws IOException >> A way to tell the compiler that the method might throw an IOException.
*/
  public static void main(String[] args) throws IOException { 

    // It creates a socket that connects to the server at the IP address 127.0.0.1 (localhost) and port
    // number 1234.
    Socket socket = new Socket("127.0.0.1", 1234);



    /***** 
    Send a message to the server 
    *****/

    // Getting the output stream from the socket.
    OutputStream out = socket.getOutputStream();

    // The second parameter of the PrintWriter constructor is a boolean that specifies whether the
    // PrintWriter should automatically flush the output buffer.
    PrintWriter writer = new PrintWriter(out, true);

    // Sending a message to the server.
    writer.println("Hello server!");




    /***** 
    Receive a response from the server 
    *****/

    // Getting the input stream from the socket.
    InputStream in = socket.getInputStream();

    // Wrapping the InputStream in a BufferedReader so that we can use the readLine() method.
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    // Reading the response from the server and printing it to the console.
    String response = reader.readLine();
    System.out.println("Server says: " + response);

    // Close the socket
    socket.close();

  }

}