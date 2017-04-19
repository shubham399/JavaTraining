import java.util.Scanner;
class Assignment1
{
  long fact(int n, int r)
  {
    if(n==r)
    return 1;
    else
    return n*fact(n-1,r);
  }
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    Assignment1 a=new Assignment1();
    do {
      n=s.nextInt();
    } while (n<0 && n>8);
    long x;
    x=a.fact(3*n,n);
    long y=a.fact(n,0)*a.fact(n,0);
    long ans=x/y;
    System.out.println(ans);
  }
}
