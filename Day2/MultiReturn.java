/*
When Both Catch and Finally Return then Finally Value is Returned and Catch Return is overlooked


*/


class MultiReturn
{
  static int getInt()
  {
    try{
      String n[]={"Harry","Potter","Test"};
      System.out.println(n[5]);
    }
    catch(Exception e)
    {
      return 10;
    }
    finally
    {
      return 20;
    }

  }
    public static void main(String args[])
    {

      System.out.println(getInt());
    }
}
