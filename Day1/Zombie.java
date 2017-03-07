
/*
n t
2 3
arr
4 5
start dest
5 7   //YES
*/
class Zombie
{
  public static void main(String args[])
  {
    int p,n,d,t;
    Scanner s=Scanner(System.in);
    n=s.nextInt();
    t=s.nextInt();
    int z[] = new int[n];
    for(int i=0;i<n;i++)
    z[i]=s.nextInt();
    p=s.nextInt();
    d=s.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n-2;j++)
      {
        if(z[j]>z[j+1])
        {
          int t=z[j];
          z[j]=z[j+1];
          z[j+1]=t;
        }
      }
    }
    int i=0;
  //while()
  }
}
