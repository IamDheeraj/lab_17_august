/* 
 * Write a program that creates 2 threads
- each displaying a message (Pass the message as a parameter to the constructor).
The threads should display the messages continuously till the user presses ctrl+c.
*/

package lab_17_august;
class ContinuousMessageThreads_Q1{    
 
 public static void main(String args[]){  
	 
	 
	 Thread_massage1_Q1 t1=new Thread_massage1_Q1("Hii This Is Thread 1");    
	 Thread_massage2_Q1 t2=new Thread_massage2_Q1("Hello This Is Thread 2");    
     
    t1.start();    
    t2.start();    
 }       
}    