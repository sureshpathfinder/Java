import java.sql.*;  
   
 public class excel_Insert
 {  
     public static void main(String[] args){  
         Connection connection = null;  
         String sql=null;  
         try{  
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
             Connection con = DriverManager.getConnection( "jdbc:odbc:sure" );  
             Statement st = con.createStatement();            
              sql="insert into [emp$]([sno],[name],[salary]) Values ('fdf')";  
              st.executeUpdate(sql);  
              //System.out.print(columnValue);  
             
                     
                                 
             st.close();  
             con.close();  
         } catch(Exception ex)
         {  
             ex.printStackTrace();  
         }  
     }  
 }  