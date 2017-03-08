/*
If a function Contain a return outside finally and there is a exception if the catch has return that value will be returned

*/
class MultiReturn1
{
  int getInt()
  {
    int abouttoReturn=10;
    try{
      String n[]={"Harry","Potter","Test"};
      System.out.println(n[5]);
    }
    catch(Exception e)
    {
      System.out.println("In Catch: "+abouttoReturn);
      return abouttoReturn;
    }
    finally
    {
      abouttoReturn+=10;
      System.out.println("In Finally: "+abouttoReturn);
    }
    return abouttoReturn;
  }
    public static void main(String args[])
    {
      MultiReturn1 m=new MultiReturn1();
      System.out.println("In Main: "+m.getInt());
    }
}
