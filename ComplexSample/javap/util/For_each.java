class For_each
{
  public static void main(String s[])
  {
    double[] ar = {1.2, 3.0, 0.8};
    double sum = 0;
    for (double d : ar)
    {  // d gets successively each value in ar.
    sum += d;
    }
    System.out.println(sum);
  }
}