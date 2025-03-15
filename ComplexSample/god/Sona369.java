public class Sona369
   {
     public static void main(String[] args) {

        String ori = "india";
        String rev = "";
        int l = ori.length()-1;
        for(int i=l;i>=0;i--)
          rev+=(ori.charAt(i));
        System.out.print("Original : "+ori);
        System.out.print("\nReverese : "+rev);
    }
}
