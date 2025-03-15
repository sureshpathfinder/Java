class Sona215{
 public static void main(String args[]){
     String s1,s2;
    s1 = new String("HI");
    s2  = new String("Hello");
    s1 = null;
    s1 = s2;
    s1+s2;
   System.out.println(s1);
   s1 = s1+s2;
   System.out.println(s1);
    }
}