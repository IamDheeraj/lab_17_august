/*
 * Q. Write a Java program which creates only one object. 
 * If user attempts to create second object, he should not be able to create it.
 *  (Using user defined Exception).
 */

package lab_17_august;  // creating package 

public class One_object_Q4 {  //  creating class 
  
	public static void main(String[] args)  // main method of the class 
    {
         try                            // try block for the exception 
         {
              Test t1 = new Test();     // creating first object of test class 
              Test t2 = new Test();     // creating second object of test class 
              Test t3 = new Test();     // creating third object of test class 
         }
         catch (NotMoreException ex)
         {
              System.out.println(ex);    // it shows which exception occurs
         }
    }

}
