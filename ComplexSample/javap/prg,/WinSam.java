import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class WinSam extends Frame implements ActionListener
{
TextField t1,t2,t3;
TextArea ta;
Label l1,l2,l3;
Button b1,b2,b3,b4,b5;

ResultSet rs;
Connection con;
Statement ss;

WinSam()
{
dbc();
l1=new Label("Roll No    :");
l2=new Label("Name       :");
l3=new Label("Age          :");
t1=new TextField();
t2=new TextField();
t3=new TextField();
ta=new TextArea();
ta.setEditable(false);

b1=new Button("Insert");
b2=new Button("Close");
b3=new Button("Update");
b4=new Button("Delete");
b5=new Button("Result");

setLayout(new FlowLayout());

add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);add(b3);add(b4);add(b5);

add(ta);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}

public void dbc()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("Jdbc:Odbc:jay");
ss=con.createStatement();
}catch(Exception e){System.out.println(e);}

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
try
{
//dbc();
String s1="insert into stud values("+t1.getText()+",'"+t2.getText()+"',"+t3.getText()+")";
System.out.println(s1);
ss.executeUpdate("insert into stud values("+t1.getText()+",'"+t2.getText()+"',"+t3.getText()+")");
t1.setText("");
t2.setText("");
t3.setText("");
}catch(Exception e){System.out.println(e);}
}

if(ae.getSource()==b2)
{
System.exit(0);
}

if(ae.getSource()==b3)
{
try
{
//dbc();
ss.executeUpdate("Update stud set name='"+t2.getText()+"', age="+t3.getText()+" where rollno="+t1.getText()+"");
t1.setText("");
t2.setText("");
t3.setText("");
}catch(Exception e){System.out.println(e);}
}

if(ae.getSource()==b4)
{
try
{
//dbc();
System.out.println("delete stud where rollno="+t1.getText()+"");
ss.executeUpdate("delete stud where rollno="+t1.getText()+"");
t1.setText("");
t2.setText("");
t3.setText("");
}catch(Exception e){System.out.println(e);}
}

if(ae.getSource()==b5)
{
try{
ta.setText("");
rs=ss.executeQuery("select * from stud");
while(rs.next())
{
ta.append(rs.getString("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("age")+"\n");
}
}catch(Exception e){System.out.println(e);}
}
}

public static void  main(String arg[])
{
WinSam ws=new WinSam();
ws.show();
ws.setSize(600,600);
}

}




