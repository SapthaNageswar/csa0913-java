public class duplicate
{
  public static void main(String args[])
  {
    int[] a={10,20,20,30,40,40,50};
    System.out.print(a[0]+" , ");
    for(int i=1;i<a.length;i++)
    {
      if(a[i]!=a[i-1])
      {
        System.out.print(a[i]+" , ");
      }
    }
  }
}
