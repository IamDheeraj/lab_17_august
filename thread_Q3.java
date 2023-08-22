/*
 * Write a program to demonstrate the chained exception in Java.
 */

package lab_17_august;  // package of the program 
public class thread_Q3{  // creating class thread_Q3 
	    public static void main(String[] args) {  // main method of the class 
	        try {                                   // try block for the handling exception 
	            // code that might throw an exception
	            int[] numbers = new int[5];    // creating array 
	            int divisor = 0;                  // declaration and initialization of variables 
	            for (int i = 0; i < numbers.length; i++) {   // using for loop 
	                int result = numbers[i] / divisor;
	                System.out.println(result);     // it will show the exception 
	            }
	        } catch (ArithmeticException e) {    
	            // create a new exception with the original exception as the cause
	            throw new RuntimeException("Error: division by zero", e);   // catch block also the exception 
	        }
	    }
	}

