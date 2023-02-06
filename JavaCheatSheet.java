/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.cheatsheet;

/**
 *
 * @author drifter
 */
public class JavaCheatSheet {

  // The main method of the class.
  public static void main(String[] args) {

// A multi-line comment
    /*
    This is a commnent
    */





    /*https://www.geeksforgeeks.org/java-basic-syntax/
  
Access Modifier  |Within Class|  |Within Package|  |Outside Package by subclass only|  |Outside Package|
        
Private                 Y               N                           N                           N
Default                 Y               Y                           N                           N
Protected               Y               Y                           Y                           N
Public                  Y               Y                           Y                           Y
        */






// Declaring variables
    /*
int a=2,b=4,c=6;

float pi=3.14f;

double do=20.22d;

char a=’v’;
        */






// Checking the weather and giving a decision based on the weather.
    /*
        public void Weather(string myDay)
  {
    // 1st condition
    if (myDay == " Sunny")
    {
      // Decision
      Console.WriteLine("Read in the Library");
    }
    // 2nd condition
    else if (myday == "Raining")
    {
      //decision
      Console.WriteLine("Read at Home")
    }
    // 3rd condition
    else if (MyDay == "Cloudy")
    {
      // Decision
      Console.WriteLine("Read in the Garden")
    }
    else
    {
      // Default Decision
      Console.WriteLine("Get some Sleep")
    }
        */





    /*switch conditionals
        int myDay = 4; // setting the value to test
switch (myDay) 
{
  case 1:
    Console.WriteLine("Read in the Library");
    break;
  case 2:
    Console.WriteLine("Read at Home");
    break;
  case 3:
    Console.WriteLine("Read in the Garden");
    break;
  default:
    Console.WriteLine("Get some Sleep");
    break;
}
        
        */





    /* Function
        <access_modifier> <return_type> <method_name>( list_of_parameters)
{
    //body
}
        */




    /* Loops
            for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun");
    }
        
   // create an array
    int[] numbers = {3, 7, 5, -5};
    
    // iterating through the array in a very simple way -  for-each loop
    for (int number: numbers) {
       System.out.println(number);
    }
            int i=1;  
    while(i<=10){  
        System.out.println(i);  
    i++;  
    }  
        
        */

    System.out.println("\n\nHello World!\n\n");
  }
}