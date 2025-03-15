import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/*<applet code=SW_jdbc width=750 height=750>
</applet>*/
public class SW_jdbc extends JApplet implements ActionListener
{
        JLabel l1,l2;
        JButton b1;
        JTextField t1,t2;
  public void init()
  {
   Container cp=getContentPane();
   cp.setLayout(new FlowLayout());
   t1=new JTextField(10);
   t2=new JTextField(10);
   b1=new JButton("Insert");
   l1=new JLabel("Empno");
   l2=new JLabel("EmpName");
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(b1);
  b1.addActionListener(this);
   }
 
 public void actionPerformed(ActionEvent a1)
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
  ps.execute();
 }
    catch(Exception e)
    {}
   
  
 }
}


