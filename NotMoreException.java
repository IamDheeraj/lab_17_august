package lab_17_august;

public class NotMoreException extends Exception {   // inheriting Exception class 
		NotMoreException()
	     {
	          super("No more than 1 object");
	     }
}
