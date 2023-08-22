
package lab_17_august;    //  creating package

public class fiboNacci_Q2 extends Thread {     // creating class and inherit thread class 
       int num=0,num1=1,num3;    // declaration of variables
       
       @Override
       public void run() {       // overriding run method from thread class 
    	   System.out.println(num+" \n"+ num1);   // printing 0 and 1 
       for(int i=2;i<=20;i++) {      // using for loop to print fibonacci series 
    	   num3=num+num1;
    	   num=num1;
    	   num1=num3;
    	   System.out.println(num3);  // here's printing output 
       }
       }
}
