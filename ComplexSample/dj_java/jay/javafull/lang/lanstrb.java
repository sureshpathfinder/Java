class lanstrb
{
        public static void main(String ar[])
        {
                StringBuffer s=new StringBuffer("Karthikeyan");
                System.out.println("The given Sting:"+s);
                System.out.println("Deleting 3rd to 6th character:"+s.delete(3,6));
                System.out.println("Appending Karthik:"+s.append("Keyan"));
                System.out.println("Capacity number of spaces allocatedto string:"+ s.capacity());
                System.out.println("Character at 5th Position:"+s.charAt(5));

                StringBuffer s1=new StringBuffer("MCA");
                System.out.println("The new String:"+s1);
                System.out.println("Inserting MCA at 2 position:"+s1.insert(2,"MCA"));
                System.out.println("The Reversed String:"+s1.reverse());
                
         }
}
                
