import java.sql.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code=jd_applet width=1000 height=1000></applet>*/

class jd_applet extends Applet implements ActionListener 
{
 Label l1,l2;
 TextField t1,t2;
 Button b1;
   
    public void init()
  {
   t1=new TextField(10);
   t2=new TextField(10);
   b1=new Button("Insert");
   l1=new Label("Empno");
   l2=new Label("EmpName");
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
  Connection c1 = DriverManager.getConnection("jdbc:odbc:NEWDBS","sa","");
  PreparedStatement ps1 = c1.prepareStatement("insert into tab values(?,?)");
  int rno = Integer.parseInt(t1.getText()); 
  String name=t2.getText();
  ps1.setInt(1,rno);
  ps1.setString(2,name);
  ps1.execute();
  }
  
  catch(Exception e){}
  }
}

