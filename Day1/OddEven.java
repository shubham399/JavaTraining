import java.util.Scanner;
class OddEven
{
  public static void main(String args[])
  {
    int x;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter an integer value: \t");
    x=s.nextInt();
    if(x%2==0)
    {
      System.out.println("Is Even!!");
    }
    else
    System.out.println("Is Odd!!");
  }
}
