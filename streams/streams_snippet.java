/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.cheatsheet.streams;

/**
 *
 * @author drifter
 */

/*chatCPT
Why are streams used in java?

Streams in Java are used to perform functional-style operations on data collections and other sources of data, such as arrays, I/O channels, and generator functions. 

They provide a concise, expressive, and efficient way to process data, often reducing the amount of code that needs to be written. 

Streams are a powerful tool to manipulate large amounts of data, and they support parallel processing, which can make your code faster by allowing multiple operations to be executed simultaneously.

Streams are also used to filter, map, and reduce data, which makes it easy to perform complex data manipulation tasks with fewer lines of code. 

They also support operations like sorting, and grouping, and it's easy to use them in combination with other functional constructs like lambda expressions and method references, which makes the code more readable and expressive.

In summary, Streams in Java provide an expressive, functional programming model for manipulating collections of data, which makes it easy to write concise, efficient, and expressive code for working with large data sets and other sources of data.
*/

//a simple program to demonstrate the use of stream in java
import java.util.*;
import java.util.stream.*;

class Demo
{
public static void main(String args[])
{

	// create a list of integers
	List<Integer> number = Arrays.asList(2,3,4,5);

	// demonstration of map method
	List<Integer> square = number.stream().map(x -> x*x).
						collect(Collectors.toList());
	System.out.println(square);

	// create a list of String
	List<String> names =
				Arrays.asList("Reflection","Collection","Stream");

	// demonstration of filter method
	List<String> result = names.stream().filter(s->s.startsWith("S")).
						collect(Collectors.toList());
	System.out.println(result);

	// demonstration of sorted method
	List<String> show =
			names.stream().sorted().collect(Collectors.toList());
	System.out.println(show);

	// create a list of integers
	List<Integer> numbers = Arrays.asList(2,3,4,5,2);

	// collect method returns a set
	Set<Integer> squareSet =
		numbers.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println(squareSet);

	// demonstration of forEach method
	number.stream().map(x->x*x).forEach(y->System.out.println(y));

	// demonstration of reduce method
	int even =
	number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

	System.out.println(even);
}
}


public class streams_snippet {
    
}
