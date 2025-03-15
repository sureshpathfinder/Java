import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FR_jdbc1
{
   Label l1,l2;
    TextField t1,t2;
    Button b1;
  public static void main(String[] args)
  { 
       FR_jdbc1 f=new  FR_jdbc1();
       f.setVisible(true);
       f.size(30,40);
   }
   FR_jdbc1()
   {
    Frame frm = new Frame("Java AWT Frame");
    frm.add(l1);
    frm.add(t2);
    frm.add(l2);
    frm.add(t2);
    frm.add(b1);
    b1.addActionListener(new hai());
    frm.setSize(100,100);
    frm.setVisible(true);
    }
}
 class hai  implements ActionListener
 {
   Label l1,l2;
    TextField t1,t2;
    Button b1;
    public void actionPerformed(ActionEvent ae)
    {
      try
      {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c = DriverManager.getConnection("jdbc:odbc:NEWDBS","sa","");
        PreparedStatement ps = c.prepareStatement("insert into tab values(?,?)");
        int rno = Integer.parseInt(t1.getText()); 
        String name=t2.getText();
        ps.setInt(1,rno);
        ps.setString(2,name);
       }
  
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
   }

