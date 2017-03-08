/*Exception Example*/
import java.util.*;
import java.lang.Exception;
class trycatchExample
{
  public static void main(String args[])
  {
      Scanner s=new Scanner(System.in);
      int a=0,b=1,c;
      try
      {
        System.out.print("Enter a Number: ");
        b=s.nextInt();
        System.out.print("Enter another Number: ");
        a=s.nextInt();
        c=b/a;
        System.out.println(b+"/"+a+" = "+c);
      }
      catch(InputMismatchException e)
      {
        System.out.println("Input Mismatch");
      }
      catch(ArithmeticException e)//Arithmetic Exaemption
      {
        System.out.println("Divide by Zero Not Allowed");
      }
  }
}
