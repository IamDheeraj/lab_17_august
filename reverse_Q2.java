/*Q.Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.
*/

package lab_17_august;  // creating package

public class reverse_Q2 extends Thread{     // creating class and inherit thread class  
	public static void main(String[] args) {  // main method of the class 
		reverse_Q2 obj=new reverse_Q2();     // creating object of reverse_Q2 class 
		fiboNacci_Q2 obj1=new fiboNacci_Q2();  // creating object of fiboNacci_Q2 class 
		
		//  calling start function of thread class 
		obj.start();         
		obj1.start();
	}
	@Override
	public void run() {       // overriding run method from thread class 
		for(int i=9999;i>=1;i--) {
			System.out.println(i);
		}
	}

}
