import java.util.*;
class cumulativePrime
{
  int result=0,count=0;
  public boolean isPrime(int n)
  {
    for(int i=2;i<=(n/2);i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public boolean binsearch(int list[],int key)
  {
    int low=0;
    int flag=-1;
    int high=(list.length)-1;
    int mid=(low+high)/2;
    //System.out.println(mid);
    while(low<=high)
    {
      if(key>list[mid])
      low=mid+1;
      else if(key<list[mid])
      high=mid-1;
      else
      {
    return true;
      }
      mid=(low+high)/2;
    }
  return false;
  }
  public  void  getCompunitivePrime(int  n)
  {
    //Need To code

    int primeList[] =new int [n];
    int primeSum[]=new int [n+1];
    int val=2,i=0;
    while(i<n)
    {
      if(isPrime(val)==true)
      {
        primeList[i++]=val;
      }

    val++;
    }
for(i=0;i<n;i++)
primeSum[i+1]=primeSum[i]+primeList[i];

//Need to Find the Maximum Sum which is a Prime
//BruteForce Need to USE better Algorithm
final int limit=n;
for(i=0;i<limit;i++)
{
  for(int j=0;j<i;j++)
  {
    int cs=primeSum[i]-primeSum[j];
    if(binsearch(primeList,cs) && (i-j)>count && cs<limit)
    {
      result=cs;
      count=i-j;
    }
  }
}


}
  public static void main(String args[])
  {
    cumulativePrime p=new cumulativePrime();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Upper Bound n:");
    int n=s.nextInt();
    final long startTime=System.currentTimeMillis();
    p.getCompunitivePrime(n);
    final long duration=System.currentTimeMillis()-startTime;
    System.out.println("Highest Prime is "+p.result+" and is made up of "+p.count+" prime numbers\nIt took "+duration+" ms to Compute it");
  }
}
