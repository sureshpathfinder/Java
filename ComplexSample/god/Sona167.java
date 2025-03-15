public class Sona167
  {
      public static void main(String[] args)
        {
           StringBuffer sb=new StringBuffer("Java");
           String s=new String("Servlets");

           //  which line will generate error 

           sb.append("JSP");
           s.append("EJB");
           
           sb.insert(1,"XML");
           s.concat(sb);
           s.trim();
        }
  }
