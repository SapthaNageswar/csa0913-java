public class minmax 
{
  public static void main(String args[])
  {
    int[] a={14,16,87,36,25,89,34};
    int M=1;
    int N=3;
    int temp;
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
      int Nthmin=a[N-1];
      int Mthmax=a[a.length-M];

    System.out.println(Mthmax);
    System.out.println(Nthmin);
    System.out.println(Mthmax+Nthmin);
    System.out.println(Mthmax-Nthmin);
  }
}