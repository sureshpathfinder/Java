public class Sona366
   {
    public static void main(String[] args) {
        String ori = "malayalam";
        String rev = "";
        int l = ori.length()-1;
        for(int i=l;i>=0;i--)
          rev+=(ori.charAt(i));
        System.out.print("Original : "+ori);
        System.out.println("\nReverese : "+rev);
        if(ori.equals(rev))
          System.out.println("Polindrome");
        else
          System.out.println("Not a Polindrome");
    }
}
