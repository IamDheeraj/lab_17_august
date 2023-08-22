package lab_17_august;

public class Test   // creating class  
{
     static int cnt=0;  // variables 
     Test() throws NotMoreException    // throws exception 
     {
          if (cnt == 0)
          {
               cnt++;
          }
          else
               throw new NotMoreException();  // throwing exception 
     }
}