class product
{
  public static void main(String agrs[])
  {
    int n=1234;
    int p=1;
    while(n>0)
    {
      int d=n%10;
         p=p*d;
         n=n/10;
    }
    System.out.println(""+p);
  }
}