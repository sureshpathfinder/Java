import java.util.Random;  //Pseudorandom Numbers

class Random_class
{
  public static void main(String s[])
  {
    Random r=new Random();
    int i,j;
    int[] a=new int[5];
    for(i=0;i<5;i++)
    {
      a[i]=r.nextInt(100);
    }
    System.out.println("Random Numbers");
    for(i=0;i<5;i++)
    {
      System.out.println(a[i]);
    }
    
    for(i=0;i<5;i++)
    {
      for( j=i+1;j<5;j++)
      {
        if(a[i]>a[j])
        {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    
    System.out.println("Arranged Order");
       for(i=0;i<5;i++)
       {
      System.out.println(a[i]);
       }
    }
  }

    
      