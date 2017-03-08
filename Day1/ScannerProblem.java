import java.util.Scanner;
class ScannerProblem
{
  public static void main(String args[])
  {
    int x;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Integer");
    x=s.nextInt();
    System.out.println("Enter a String");
    String ss=s.nextLine();
    System.out.println(x+ss);
  }
}
