import java.util.Scanner;
class Assignment2
{
  boolean iseven(int n)
  {
    int count=0;
    while(n!=0)
    {
      count++;
      n &= (n-1);
    }
    if(count==2)
    return true;
    else
    return false;
  }
    public static void main(String args[])
  {
    int n,sum=0;
    Scanner s=new Scanner(System.in);
    Assignment2 a=new Assignment2();
    do {
      n=s.nextInt();
    } while (n<0 && n>1000);
    for(int i=1;i<=n;i++)
    if(a.iseven(i))
    sum+=i;
    System.out.println(sum);
  }
}
