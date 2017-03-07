/*
n t
2 3
arr
4 5
start dest
5 7   //YES
*/
import java.util.Scanner;
class Assigment3
{
  public static void main(String args[])
  {
    int p,n,d,t;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    t=s.nextInt();
    int z[] = new int[n];
    for(int i=0;i<n;i++)
    z[i]=s.nextInt();
    p=s.nextInt();
    d=s.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<(n-i);j++)
      {
        if(z[j-1]>z[j])
        {
          int temp=z[j];
          z[j]=z[j-1];
          z[j-1]=temp;
        }
      }
    }
    int i=0;
    while(d>p||i<n)
    {
      int diff=p-z[i];
      if(diff<0)
      break;
      else
      p=p+diff;
      i++;
    }
    if(d<=p)
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}
