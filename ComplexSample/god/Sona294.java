import java.io.*; 
public class Sona294 
{ 
        public static void main(String argv[])
       {
         Sona294 m=new Sona294(); 
         System.out.println(m.amethod()); 
      }
      public int amethod() 
      { 
         try 
        {          // Hello.txt file doesn't exist.
                   FileInputStream dis=new FileInputStream("Hello.txt"); 
        }
        catch (FileNotFoundException fne) 
        { 
                        System.out.println("No such file found"); 
                        return -1; 
        }
       catch(IOException ioe) 
       { 
         } 
        finally
       { 
           System.out.println("Doing finally"); 
       } 
       return 0; 
    } 
}
