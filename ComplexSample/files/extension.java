import java.io.*;
public class extension implements FilenameFilter
{
        String ext;
        public extension(String ext)
        {
                this.ext="."+ext;
        }
        public boolean accept(File dir,String name)
        {
                return name.endsWith(ext);
        }
      public static void main(String ar[])throws Exception
      {
        String dir="d:/karthik/files";
        File f1=new File(dir);
        FilenameFilter only=new extension("java");
        String s[]=f1.list(only);
        for(int i=0;i<s.length;i++)
        {
                System.out.println(s[i]);
        }
     }
}

