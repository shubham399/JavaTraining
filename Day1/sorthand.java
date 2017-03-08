class sorthand
{
  public static void main(String args[])
  {
    int t=999,count=0;
    while(t!=0)
    {
      count++;
      t &= (t-1);
    }
    System.out.println(count);
}
}
