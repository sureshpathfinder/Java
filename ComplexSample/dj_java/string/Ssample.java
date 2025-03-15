class Ssample
{
  public static void main(String ar[])
  {
    /*String str ="JAVA ";
    System.out.println(str.length());
    str += "BEAN";
    System.out.println(str.length());*/
   StringBuffer str = new StringBuffer ("JAVA ");
   System.out.println(str);
   str.append("BEAN");
   System.out.println(str);
   }
}