import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class JF_jdbc
{
   public static void main(String arg[])
  {
    but1 cl = new but1();
   }
}
 

class but1
{
  JButton b;
  JLabel l1,l2;
  JTextField t1,t2;
  but1()
  {
    
    JFrame frame = new JFrame("JDBC CONNECTIVITY");
    b = new JButton("INSERT");
    b.addActionListener(new MyAction1());
    frame.add(l1);
    frame.add(t1);
    frame.add(l2);
    frame.add(t2);
    frame.add(b);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

  

  public class MyAction1 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      try
      {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       Connection c = DriverManager.getConnection("jdbc:odbc:NEWDBS","sa","");
       PreparedStatement ps = c.prepareStatement("insert into tab values(?,?)");
       String text = (String)e.getActionCommand();
       if (text.equals("INSERT"))
       {
        int rno = Integer.parseInt(t1.getText()); 
        String name=t2.getText();
        ps.setInt(1,rno);
        ps.setString(2,name);
        ps.execute();
        }
      }
      catch(Exception e1){}
      
    }
  }
}

