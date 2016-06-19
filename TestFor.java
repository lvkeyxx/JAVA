public class TestFor
{
  public static void main(String args[])
  {
    boolean flag=true;
    for(int i=1;i<=100;i+=2)
    {
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          flag=false;
          break;
        }
      }
      if(!flag)
      {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}
