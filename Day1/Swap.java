class Swap
{
  public static void main(String args[])
  {
    int a=2;
    int b=1;
    System.out.println("Before Swap");
    System.out.println(a+" "+b);
    System.out.println("Swapping....");
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swap");
    System.out.println(a+" "+b);
  }
}
