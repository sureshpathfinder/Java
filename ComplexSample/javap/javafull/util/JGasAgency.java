import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class JGasAgency extends Frame implements ActionListener,WindowListener
{
Label l1,l2;
Button b1,b2,b3,b4,b5,b6,b7;

JCustomerEntry ce;
JReport jr;
JBooking jb;

JPrice jp;
JStockEntry se;
TransactionEntry te;

public JGasAgency(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Welcome to Gas Agency");
l2=new Label("");

b1=new Button("Customer Entry");
b2=new Button("Stock Entry");
b3=new Button("Transaction");
b4=new Button("Report");
b5=new Button("Booking");
b6=new Button("Price");
b7=new Button("Exit");

b1.setBackground(Color.darkGray);
b2.setBackground(Color.darkGray);
b3.setBackground(Color.darkGray);
b4.setBackground(Color.darkGray);
b5.setBackground(Color.darkGray);
b6.setBackground(Color.darkGray);
b7.setBackground(Color.darkGray);

b1.setForeground(Color.white);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b5.setForeground(Color.white);
b6.setForeground(Color.white);
b7.setForeground(Color.white);

l1.setForeground(Color.blue);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,22));

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

l1.setBounds(240,50,300,50);
l2.setBounds(100,80,150,20);

b1.setBounds(250,150,200,30);
b2.setBounds(250,200,200,30);
b3.setBounds(250,250,200,30);
b4.setBounds(250,300,200,30);
b5.setBounds(250,350,200,30);
b6.setBounds(250,400,200,30);
b7.setBounds(250,450,200,30);

add(l1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(l2);
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
ce=new JCustomerEntry("Welcome to CustomerEntry");
ce.setSize(700,520);
ce.setVisible(true);
}
if(ae.getSource()==b3)
{
te=new TransactionEntry("Welcome to CustomerEntry");
te.setSize(700,520);
te.setVisible(true);
}
else if(ae.getSource()==b2)
{
se=new JStockEntry("Welcome to StockEntry");
se.setSize(700,520);
se.setVisible(true);
}
else if(ae.getSource()==b4)
{
jr=new JReport("Welcome to Report");
jr.setSize(700,520);
jr.setVisible(true);
}
else if(ae.getSource()==b6)
{
jp=new JPrice("Welcome to Price");
jp.setSize(700,520);
jp.setVisible(true);
}
else if(ae.getSource()==b5)
{
jb=new JBooking("Welcome to Booking");
jb.setSize(700,520);
jb.setVisible(true);
}
else if(ae.getSource()==b7)
{
System.exit(0);
}
}

public static void main(String args[])
{
JGasAgency g=new JGasAgency("Welcome to GasAgency");
g.setVisible(true);
g.setSize(700,520);
}
}

class JCustomerEntry extends Frame implements ActionListener,WindowListener
{
Label l1,l2;
Button b1,b2,b3,b4,b5;

JAddition JA;
JModification JM;
JDeletion JD;
JView JV;
JGasAgency JG;

public JCustomerEntry(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Welcome to CustomerEntry");
l2=new Label("");

b1=new Button("ADDTION");
b2=new Button("MODIFICATION");
b3=new Button("DELETION");
b4=new Button("VIEW");
b5=new Button("PREVIOUS MENU");

b1.setBackground(Color.darkGray);
b2.setBackground(Color.darkGray);
b3.setBackground(Color.darkGray);
b4.setBackground(Color.darkGray);
b5.setBackground(Color.darkGray);

b1.setForeground(Color.white);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b5.setForeground(Color.white);

l1.setForeground(Color.blue);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,22));

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

l1.setBounds(240,100,300,50);
l2.setBounds(100,80,150,20);

b1.setBounds(250,200,200,30);
b2.setBounds(250,250,200,30);
b3.setBounds(250,300,200,30);
b4.setBounds(250,350,200,30);
b5.setBounds(250,400,200,30);

add(l1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(l2);
}

public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
JA=new JAddition("Welcome To Addition Menu");
JA.setVisible(true);
JA.setSize(700,540);
}
else if(ae.getSource()==b2)
{
JM=new JModification("Welcome To Modification");
JM.setVisible(true);
JM.setSize(700,540);
}
else if(ae.getSource()==b3)
{
JD=new JDeletion("Welcome To Deletion");
JD.setVisible(true);
JD.setSize(700,540);
}
else if(ae.getSource()==b4)
{
JV=new JView("Welcome To View");
JV.setVisible(true);
JV.setSize(700,540);
}
else if(ae.getSource()==b5)
{
JG=new JGasAgency("Welcome To View");
JG.setVisible(true);
JG.setSize(700,540);
}
}
}

class JAddition extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1;

Connection con;
Statement st;
ResultSet rs;

public JAddition(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Customer Entry Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));

l2=new Label("Customer Number");
l3=new Label("Customer Name");
l4=new Label("Cyln_Type");
l5=new Label("NO_of_Cyln");
l6=new Label("Customer Address");
l7=new Label("PinCode");
l8=new Label("Phone");
l9=new Label("Date_of_Connection");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);

b1=new Button("ADDITION");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);

b1.addActionListener(this);

l1.setBounds(100,100,250,25);

l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);
t2.setBounds(390,170,100,20);

l4.setBounds(50,210,100,20);
t3.setBounds(170,210,100,20);
l5.setBounds(280,210,100,20);
t4.setBounds(390,210,100,20);

l6.setBounds(50,250,110,20);
t5.setBounds(170,250,100,20);
l7.setBounds(280,250,100,20);
t6.setBounds(390,250,100,20);

l8.setBounds(280,290,100,20);
t7.setBounds(170,290,100,20);
l9.setBounds(50,290,100,20);
t8.setBounds(390,290,100,20);
b1.setBounds(200,350,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b1);
add(l10);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}
}

public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(ae.getSource()==b1)
{
String s1,s2,s3,s4;
int a1,a2,a3,a4,a5;

s1=t2.getText();
s2=t3.getText();
s3=t5.getText();
s4=t7.getText();

a1=Integer.parseInt(t1.getText());
a2=Integer.parseInt(t4.getText());
a3=Integer.parseInt(t6.getText());
a4=Integer.parseInt(t8.getText());

String query="insert into custmast(consno,consname,cylntype,noofcyln,consadd,pincode,dateofconn,telephone)values("+a1+",'"+s1+"','"+s2+"',"+a2+",'"+s3+"',"+a3+",'"+s4+"',"+a4+")";

try
{
st.executeUpdate(query);
System.out.println("Record Is Successfully Added to custmast");
}
catch(Exception e1)
{
System.out.println("Record Is Not Successfully Added"+e1.getMessage());
}
}
}
}

class JReport extends Frame implements ActionListener,WindowListener
{
Label l1,l2;
Button b1,b2,b3,b4;

JCustomerReport cr;
JDailyTransactionReport dt;
JWeeklyReport wr;
JGasAgency JG;

public JReport(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Welcome to Report");
l2=new Label("");

b1=new Button("CUSTOMER REPORT");
b2=new Button("DAILY TRANSACTION REPORT");
b3=new Button("WEEKLY REPORT");
b4=new Button("PREVIOUS WINDOW");

b1.setBackground(Color.darkGray);
b2.setBackground(Color.darkGray);
b3.setBackground(Color.darkGray);
b4.setBackground(Color.darkGray);

b1.setForeground(Color.white);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);

l1.setForeground(Color.blue);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,22));

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

l1.setBounds(240,100,300,50);
l2.setBounds(100,80,150,20);

b1.setBounds(250,200,200,30);
b2.setBounds(250,250,200,30);
b3.setBounds(250,300,200,30);
b4.setBounds(250,350,200,30);

add(l1);
add(b1);
add(b2);
add(b3);
add(b4);
add(l2);
}

public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
cr=new JCustomerReport("Welcome to CustomerReport");
cr.setSize(700,520);
cr.setVisible(true);
}
else if(ae.getSource()==b2)
{
dt=new JDailyTransactionReport("Welcome to Transaction Report");
dt.setSize(700,520);
dt.setVisible(true);
}
else if(ae.getSource()==b3)
{
wr=new JWeeklyReport("Welcome to Weekly Report");
wr.setSize(700,520);
wr.setVisible(true);
}
else if(ae.getSource()==b4)
{
JG=new JGasAgency("Welcome to Weekly Report");
JG.setSize(700,520);
JG.setVisible(true);
}
}
}

class JModification extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1,b2;

Connection con;
Statement st;
ResultSet rt;

public JModification(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Customer Entry Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Customer Number");
l3=new Label("Customer Name");
l4=new Label("Cyln_Type");
l5=new Label("NO_of_Cyln");
l6=new Label("Customer Address");
l7=new Label("PinCode");
l8=new Label("Phone");
l9=new Label("Date_of_Connection");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);

b1=new Button("MODIFICATION");
b1.addActionListener(this);
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);

b2=new Button("SAVE");
b2.addActionListener(this);
b2.setBackground(Color.darkGray);
b2.setForeground(Color.white);

l1.setBounds(100,100,250,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20); 
l3.setBounds(280,170,100,20);

t2.setBounds(390,170,100,20);
l4.setBounds(50,210,100,20);
t3.setBounds(170,210,100,20);
l5.setBounds(280,210,100,20);

t4.setBounds(390,210,100,20);
l6.setBounds(50,250,110,20);
t5.setBounds(170,250,100,20);
l7.setBounds(280,250,100,20);
t6.setBounds(390,250,100,20);

l8.setBounds(280,290,100,20);
t7.setBounds(170,290,100,20);
l9.setBounds(50,290,100,20);
t8.setBounds(390,290,100,20);

b1.setBounds(200,350,100,20);
b2.setBounds(350,350,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b1);
add(b2);
add(l10);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();

if(ae.getSource()==b1)
{
int n=Integer.parseInt(t1.getText());
String query="select * from custmast where consno="+n+"";

try
{
rt=st.executeQuery(query);
rt.next();
t1.setText(String.valueOf(rt.getInt("consno")));
t2.setText(rt.getString("consname"));
t3.setText(rt.getString("cylntype"));
t4.setText(String.valueOf(rt.getInt("noofcyln")));
t5.setText(rt.getString("consadd"));
t6.setText(String.valueOf(rt.getInt("pincode")));
t7.setText(rt.getString("dateofconn"));
t8.setText(String.valueOf(rt.getInt("telephone")));

System.out.println("Record are currently displays");
}
catch(Exception e)
{
System.out.println("Record are error currently displas"+e.getMessage());
}
}
else if(ae.getSource()==b2)
{
String s1,s2,s3,s4;
int a1,a2,a3,a4;

s1=t2.getText();
s2=t3.getText();
s3=t5.getText();
s4=t7.getText();

a1=Integer.parseInt(t1.getText());
a2=Integer.parseInt(t4.getText());
a3=Integer.parseInt(t6.getText());
a4=Integer.parseInt(t8.getText());

String query="Update custmast set consno="+a1+",consname='"+s1+"',cylntype='"+s2+"',noofcyln="+a2+",consadd='"+s3+"',pincode="+a3+",dateofconn='"+s4+"',telephone="+a4+" where consno="+a1+" ";

try
{
st.executeUpdate(query);
System.out.println("Record Is Successfully Updated to custmast");
}
catch(Exception e1)
{
System.out.println("Record Is Not Successfully Updated"+e1.getMessage());
}
}
}
}

class JDeletion extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1,b2;

Connection con;
Statement st;
ResultSet rt;

public JDeletion(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Customer Entry Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Customer Number");
l3=new Label("Customer Name");
l4=new Label("Cyln_Type");
l5=new Label("NO_of_Cyln");
l6=new Label("Customer Address");
l7=new Label("PinCode");
l8=new Label("Phone");
l9=new Label("Date_of_Connection");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);

b1=new Button("DELETION");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);

b2=new Button("DISPLAY");
b2.setBackground(Color.darkGray);
b2.setForeground(Color.white);
b2.addActionListener(this);

l1.setBounds(100,100,250,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);
t2.setBounds(390,170,100,20);

l4.setBounds(50,210,100,20);
t3.setBounds(170,210,100,20);
l5.setBounds(280,210,100,20);
t4.setBounds(390,210,100,20);
l6.setBounds(50,250,110,20);

t5.setBounds(170,250,100,20);
l7.setBounds(280,250,100,20);
t6.setBounds(390,250,100,20);
l8.setBounds(280,290,100,20);
t7.setBounds(170,290,100,20);

l9.setBounds(50,290,100,20);
t8.setBounds(390,290,100,20);

b1.setBounds(200,350,100,20);
b2.setBounds(300,350,100,20);

add(b2);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b1);
add(l10);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int n=Integer.parseInt(t1.getText());
String query="delete from custmast where consno="+n+"";
try
{
st.executeUpdate(query);
System.out.println("Record are suceessfully onerow deleted");
}
catch(Exception e)
{
System.out.println(" Deleted ERROR :"+e.getMessage());
}
}
else if(ae.getSource()==b2)
{
int n=Integer.parseInt(t1.getText());
String query="select * from custmast where consno="+n+"";

try
{
rt=st.executeQuery(query);
rt.next();
t1.setText(String.valueOf(rt.getInt("consno")));
t2.setText(rt.getString("consname"));
t3.setText(rt.getString("cylntype"));
t4.setText(String.valueOf(rt.getInt("noofcyln")));
t5.setText(rt.getString("consadd"));
t6.setText(String.valueOf(rt.getInt("pincode")));
t7.setText(rt.getString("dateofconn"));
t8.setText(String.valueOf(rt.getInt("telephone")));

System.out.println("Record are currently displays");
}
catch(Exception e)
{
System.out.println("Record are error currently displas"+e.getMessage());
}
}
}
}

class JView extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1;

Connection con;
Statement st;
ResultSet rt;

public JView(String s)
{
super(s);
addWindowListener(this);
b1=new Button("Click");
b1.addActionListener(this);

l1=new Label("Customer Entry Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Customer Number");
l3=new Label("Customer Name");
l4=new Label("Cyln_Type");
l5=new Label("NO_of_Cyln");
l6=new Label("Customer Address");
l7=new Label("PinCode");
l8=new Label("Phone");
l9=new Label("Date_of_Connection");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);

b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);

l1.setBounds(100,100,250,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);
t2.setBounds(390,170,100,20);

l4.setBounds(50,210,100,20);
t3.setBounds(170,210,100,20);
l5.setBounds(280,210,100,20);
t4.setBounds(390,210,100,20);
l6.setBounds(50,250,110,20);

t5.setBounds(170,250,100,20);
l7.setBounds(280,250,100,20);
t6.setBounds(390,250,100,20);
l8.setBounds(280,290,100,20);
t7.setBounds(170,290,100,20);

l9.setBounds(50,290,100,20);
t8.setBounds(390,290,100,20);
b1.setBounds(200,350,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b1);
add(l10);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
rt=st.executeQuery("select * from custmast");
rt.next();
t1.setText(String.valueOf(rt.getInt("consno")));
t2.setText(rt.getString("consname"));
t3.setText(rt.getString("cylntype"));
t4.setText(String.valueOf(rt.getInt("noofcyln")));
t5.setText(rt.getString("consadd"));
t6.setText(String.valueOf(rt.getInt("pincode")));
t7.setText(rt.getString("dateofconn"));
t8.setText(String.valueOf(rt.getInt("telephone")));
System.out.println("Record are currently displays");
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
try
{
if(rt.next())
{
t1.setText(String.valueOf(rt.getInt("consno")));
t2.setText(rt.getString("consname"));
t3.setText(rt.getString("cylntype"));
t4.setText(String.valueOf(rt.getInt("noofcyln")));
t5.setText(rt.getString("consadd"));
t6.setText(String.valueOf(rt.getInt("pincode")));
t7.setText(rt.getString("dateofconn"));
t8.setText(String.valueOf(rt.getInt("telephone")));
System.out.println("Record are currently displays");
}
}
catch(Exception e)
{
System.out.println("Record are not currently displays");
}

}
}

class JPrice extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l10;
TextField t1,t2;
Button b1;
int i=0;

Connection con;
Statement st;
ResultSet rt;

public JPrice(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Customer Entry Price screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Cylinder Type");
l3=new Label("Price");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 

b1=new Button("UPDATE");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);

l1.setBounds(100,100,350,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);
t2.setBounds(390,170,100,20);

b1.setBounds(200,350,100,20);
add(l1);
add(l2);
add(b1);
add(l3);

add(t1);
add(t2);
add(l10);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
String query="select * from price";
rt=st.executeQuery(query);
while(rt.next())
{
i++;
}
if(i==0)
{
t1.setText("D");
t1.setEnabled(false);
}
else if(i==1)
{
t1.setText("C");
t1.setEnabled(false);
}
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}

}

public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
if(i==0||i==1)
{
String s1;
s1=t1.getText();
Float F=Float.valueOf(t2.getText());
float f=F.floatValue();
String query="insert into price(cylntype,price1)values('"+s1+"',"+f+")";
try
{
st.executeUpdate(query);
System.out.println("Insert Price");
}
catch(Exception e)
{
System.out.println("Error in Insert Price "+e.getMessage());
}
}
else
{
String s1;
s1=t1.getText();
Float F=Float.valueOf(t2.getText());
float f=F.floatValue();
String query="update price set price1="+f+" where cylntype='"+s1+"'";
try
{
st.executeUpdate(query);
System.out.println("Insert Price");
}
catch(Exception e)
{
System.out.println("Error in Insert Price "+e.getMessage());
}
}
}
}
}

class JBooking extends Frame implements ActionListener,WindowListener,ItemListener
{
Label l1,l2,l3,l4,l5,l6,l10;
TextField t1,t2,t3,t4,t5;
Button b1;

Connection con;
Statement st;
ResultSet rs;

public JBooking(String s)
{
super(s);
addWindowListener(this);

l1=new Label(" Booking Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Customer Number");
l3=new Label("Cyln_Type");
l4=new Label("NO_of_Cyln");
l5=new Label("Customer Name");
l6=new Label("Booking Date");
l10=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);

b1=new Button("CLICK");
b1.addActionListener(this);
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);

l1.setBounds(100,100,250,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);

t2.setBounds(390,170,100,20);
l4.setBounds(50,210,100,20);
t3.setBounds(170,210,100,20);
l5.setBounds(280,210,100,20);

t4.setBounds(390,210,100,20);
l6.setBounds(50,250,110,20);
t5.setBounds(170,250,100,20);
b1.setBounds(200,350,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(b1);
add(l10);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
}
catch(Exception e)
{
System.out.println("When getting connection error is Occurred"+e.getMessage());
}

}
public void itemStateChanged(ItemEvent ie)
{
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
	{
	String str=ae.getActionCommand();
	if(ae.getSource()==b1)
	{
	String s1,s2,s3;
	int a1,a2;

	System.out.println("t1   ="+t1.getText());
	System.out.println("t2   ="+t2.getText());
	System.out.println("t3   ="+t3.getText());
	System.out.println("t4   ="+t4.getText());
	System.out.println("t5   ="+t5.getText());

	s1=t2.getText();	
	s2=t4.getText();
	s3=t5.getText();

	a1=Integer.parseInt(t1.getText());
	a2=Integer.parseInt(t3.getText());


	String query="insert into booking(consno,consname,cylntype,noofcyln,bookingdate)values("+a1+",'"+s2+"','"+s1+"',"+a2+",'"+s3+"')";

	try
	{
	st.executeUpdate(query);
	System.out.println("Record Is Successfully Added to booking");
	}
	catch(Exception e1)
	{	
	System.out.println("Record Is Not Successfully Added"+e1.getMessage());
	}
	}
}
}

class JStockEntry extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13 ;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1;

Connection con;
Statement st;
ResultSet rt;

int i=0;

public JStockEntry(String s)
{
super(s);
addWindowListener(this);
l1=new Label("Stock Entry Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
l2=new Label("Arrival Date");
l3=new Label("Customer Name");
l4=new Label("Stock Received");
l5=new Label("Current Stock");
l6=new Label("Commercial");
l7=new Label("Commercial");
l8=new Label("Domestic");
l9=new Label("Domestic");
l10=new Label("NO Of Defective");
l11=new Label("Commercial");
l12=new Label("Domestic");
l13=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);

b1=new Button("ADDITION");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);


l1.setBounds(100,100,250,25);
l2.setBounds(50,170,110,20);
t1.setBounds(170,170,100,20);
l3.setBounds(280,170,100,20);
t2.setBounds(390,170,100,20);

l4.setBounds(50,210,100,20);
t3.setBounds(170,250,100,20);
l5.setBounds(280,210,100,20);
t4.setBounds(390,250,100,20);
l6.setBounds(50,250,110,20);

t5.setBounds(170,290,100,20);
l7.setBounds(280,250,100,20);
t6.setBounds(390,290,100,20);
l8.setBounds(280,290,100,20);
t7.setBounds(170,370,100,20);

l9.setBounds(50,290,100,20);
t8.setBounds(170,410,100,20);
l10.setBounds(50,330,100,20);
l11.setBounds(50,370,100,20);
l12.setBounds(50,410,100,20);

b1.setBounds(200,450,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);

add(b1);
add(l13);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is Sucessfully Created");
rt=st.executeQuery("Select * from stock");

if(rt.next())
{
i++;
}

if(i==0)
{
t4.setText("0");
t6.setText("0");
}
else
{
try
{
rt=st.executeQuery("Select cc from stock");
rt.next();
t4.setText(String.valueOf(rt.getInt("cc")));
}
catch(Exception o)
{
System.out.println("Error On Selecting CC  "+o.getMessage());
}
try
{
rt=st.executeQuery("Select cd from stock");
rt.next();
t6.setText(String.valueOf(rt.getInt("cd")));
}
catch(Exception p)
{
System.out.println("Error On Selecting CD  "+p.getMessage());
}
}
}
catch(Exception e8)
{
System.out.println("When getting Connection error is Occurred"+e8.getMessage());
}
}
public void actionPerformed(ActionEvent ae)
{
String s1="",s2="";int f=0,f1=0,f2=0,f3=0,f4=0,f5=0;

if(ae.getSource()==b1)
{
s1=t1.getText();
s2=t2.getText();

f=Integer.parseInt(t3.getText());
f1=Integer.parseInt(t5.getText());
f2=Integer.parseInt(t4.getText());
f3=Integer.parseInt(t6.getText());
f4=Integer.parseInt(t7.getText());
f5=Integer.parseInt(t8.getText());
try
{
System.out.println(f2);
System.out.println(f3);
}
catch(Exception week)
{
System.out.println("Error  "+week.getMessage());
}

f2=f-f4+f2;
f3=f1-f5+f3;
try
{
System.out.println(f2);
System.out.println(f);
System.out.println(f4);
System.out.println(f3);
System.out.println(f1);
System.out.println(f5);
}
catch(Exception week)
{
System.out.println("Error  "+week.getMessage());
}
String query1="update stock set AD='"+s1+"',CN='"+s2+"',SC="+ f+",SD="+f1+",DC="+f4+",DD="+f5+",CC="+f2+",CD="+f3+"";
String query="Insert into stock(AD,CN,SC,SD,DC,DD,CC,CD)Values('"+s1+"','"+s2+"',"+f+","+f1+","+f4+","+f5+","+f2+","+f3+")";

if(i==0)
{
try
{
st.executeUpdate(query);
System.out.println("Record Is SuccessFully Inserted");
}
catch(Exception q)
{
System.out.println("Stock Inserting    "+q.getMessage());
}
}
else
{
try
{
st.executeUpdate(query1);
System.out.println("Record Is SuccessFully Updated");
}
catch(Exception q)
{
System.out.println("Stock Update    "+q.getMessage());
}
}
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

}

class JDailyTransactionReport extends Frame implements ActionListener,WindowListener,ItemListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
Button b1;
Choice c;

Connection con;
Statement st;
ResultSet rt;

public JDailyTransactionReport(String s)
{
super(s);
addWindowListener(this);

l1=new Label("DailyTransactionReport Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));
c=new Choice();
c.addItemListener(this);

l2=new Label("Date");
l3=new Label("Time");
l4=new Label("Sl.No");
l5=new Label("CustomerNumber");
l6=new Label("Cyln_Type");
l7=new Label("BookingDate");
l8=new Label("DateOfRelease");
l9=new Label("Remarks");
l10=new Label("NoOfGasCylindersBooked");
l11=new Label("Domestic");
l12=new Label("Commercial");
l13=new Label("Total");
l14=new Label("NOOfGasCylindersReleased");
l15=new Label("Domestic");
l16=new Label("Commercial");
l17=new Label("Total");
l18=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);
t9=new TextField(8);
t10=new TextField(8);
t11=new TextField(8);
t12=new TextField(8);
t13=new TextField(8);
t14=new TextField(8);

b1=new Button("CLICK");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);

l1.setBounds(100,50,350,20);

l2.setBounds(10,90,100,20);
t1.setBounds(140,90,100,20);
l3.setBounds(250,90,100,20);
t2.setBounds(360,90,100,20);

l4.setBounds(10,120,100,20);
l5.setBounds(10,140,100,20);
l6.setBounds(10,170,100,20);
l7.setBounds(10,200,100,20);

l8.setBounds(10,230,100,20);
l9.setBounds(10,260,100,20);
l10.setBounds(10,290,150,20);
l11.setBounds(10,320,100,20);

l12.setBounds(10,350,100,20);
l13.setBounds(10,380,100,20);
l14.setBounds(360,290,170,20);
l15.setBounds(250,320,100,20);

l16.setBounds(250,350,100,20);
l17.setBounds(250,380,100,20);
t3.setBounds(140,110,100,20);
t4.setBounds(140,140,100,20);

t5.setBounds(140,170,100,20);
t6.setBounds(140,200,100,20);
t7.setBounds(140,230,100,20);
t8.setBounds(140,260,100,20);

t9.setBounds(140,320,100,20);
t10.setBounds(140,350,100,20);
t11.setBounds(140,380,100,20);
t12.setBounds(360,320,100,20);

t13.setBounds(360,350,100,20);
t14.setBounds(360,380,100,20);

b1.setBounds(300,420,100,20);
c.setBounds(10,420,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(l15);
add(l16);
add(l17);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);
add(t14);

add(b1);
add(c);
add(l18);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is successfully created");
}
catch(Exception u9)
{
System.out.println("When Creating Dirver Error Is Occurred"+u9.getMessage());
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a1=t1.getText();
a1=a1.trim();

String query="select consno from transaction where releasedate = '"+a1+"' ";

try
{
rt=st.executeQuery(query);
while(rt.next())
c.addItem(String.valueOf(rt.getInt("consno")));
}
catch(Exception e)
{
System.out.println("\n Error   "+e.getMessage());
}

}
}
public void itemStateChanged(ItemEvent ae)
{
int di=0,ci=0;
String bdate=t1.getText();
bdate=bdate.trim();

if(ae.getSource()==c)
{
String s;
s=c.getSelectedItem();
int n=Integer.parseInt(s.trim());
try
{
rt=st.executeQuery("select cylntype From Transaction where bookdate='"+bdate+"'");
while(rt.next())
{
String ss=rt.getString("cylntype");
ss=ss.trim();
ss=ss.toUpperCase();
if(ss.equals("D"))
di++;
else
ci++;
}
t13.setText(String.valueOf(ci));
t12.setText(String.valueOf(di));
t14.setText(String.valueOf(ci+di));
System.out.println("Records are Currently displayed");
ci=0;
di=0;
}
catch(Exception e16)
{
System.out.println("When Transaction Error  "+e16.getMessage());
}

try
{
rt=st.executeQuery("Select cylntype from booking where bookingdate='"+bdate+"'");
while(rt.next())
{
String ss=rt.getString("cylntype");
ss=ss.trim();
ss=ss.toUpperCase();
if(ss.equals("D"))
di++;
else
ci++;
}
t9.setText(String.valueOf(di));
t10.setText(String.valueOf(ci));
t11.setText(String.valueOf(ci+di));
}
catch(Exception week)
{
System.out.println("Error    :"+week.getMessage());
}


try
{
rt=st.executeQuery("select * From Transaction  where consno="+n);
rt.next();
t4.setText(String.valueOf(rt.getInt("Consno")));
String q=rt.getString("Consadd");
String q1=String.valueOf(rt.getInt("Pincode"));
String q2=rt.getString("Consname");
String q3=String.valueOf(rt.getInt("Phone"));
t3.setText(String.valueOf(rt.getInt("Sino")));
String q4=String.valueOf(rt.getInt("Consuno"));
t5.setText(rt.getString("Cylntype"));
t6.setText(rt.getString("bookdate"));
t7.setText(rt.getString("Releasedate"));
t8.setText(rt.getString("Remarks"));
System.out.println("Records are Currently displayed From Transaction");
}
catch(Exception e16)
{
System.out.println("When accessing result set Error is occurred from custmast "+e16.getMessage());
}
}
}
}

class JWeeklyReport extends Frame implements ActionListener,WindowListener,ItemListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
Button b1;
Choice c;

Connection con;
Statement st;
ResultSet rt;

public JWeeklyReport(String s)
{
super(s);
addWindowListener(this);
c=new Choice();
c.addItemListener(this);

l1=new Label("WeeklyReport Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));

l2=new Label("Date");
l3=new Label("Time");
l4=new Label("StartingDate");
l5=new Label("Endingdate");
l6=new Label("CustomerNumber");
l7=new Label("CustomerName");
l8=new Label("CustomerAddress");
l9=new Label("Pincode");
l10=new Label("Telephone");
l11=new Label("sl.No");
l12=new Label("CustomerNumber");
l13=new Label("CylnType");
l14=new Label("BookingDate");
l15=new Label("DateOfRelease");
l16=new Label("Remarks");
l17=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);
t9=new TextField(8);
t10=new TextField(8);
t11=new TextField(8);
t12=new TextField(8);
t13=new TextField(8);
t14=new TextField(8);
t15=new TextField(8);

b1=new Button("CLICK");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);

l1.setBounds(100,50,350,20);

l2.setBounds(10,90,100,20);
t1.setBounds(140,90,100,20);
l3.setBounds(250,90,100,20);
t2.setBounds(360,90,100,20);

l4.setBounds(10,140,100,20);
l5.setBounds(250,140,100,20);
l6.setBounds(10,170,100,20);
l7.setBounds(10,200,100,20);

l8.setBounds(10,230,100,20);
l9.setBounds(10,260,100,20);
l10.setBounds(10,290,100,20);
l11.setBounds(10,320,100,20);

l12.setBounds(10,350,100,20);
l13.setBounds(10,380,100,20);
l14.setBounds(250,320,100,20);
l15.setBounds(250,350,100,20);
l16.setBounds(250,380,100,20);

t3.setBounds(140,140,100,20);
t4.setBounds(360,140,100,20);
t5.setBounds(140,170,100,20);
t6.setBounds(140,200,100,20);

t7.setBounds(140,230,100,20);
t8.setBounds(140,260,100,20);
t9.setBounds(140,290,100,20);
t10.setBounds(140,320,100,20);

t11.setBounds(140,350,100,20);
t12.setBounds(140,380,100,20);
t13.setBounds(360,320,100,20);
t14.setBounds(360,350,100,20);
t15.setBounds(360,380,100,20);

b1.setBounds(300,420,100,20);
c.setBounds(10,420,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(l15);
add(l16);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);
add(t14);
add(t15);

add(b1);
add(c);
add(l17);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is successfully created");
}
catch(Exception u9)
{
System.out.println("When Creating Dirver Error Is Occurred"+u9.getMessage());
}
}

public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a1=t3.getText();
a1=a1.trim();
String a2=t4.getText();
a2=a2.trim();
String query="select consno from transaction where releasedate between '"+a1+"' and '"+a2+"' ";
try
{
rt=st.executeQuery(query);
while(rt.next())
c.addItem(String.valueOf(rt.getInt("consno")));
}
catch(Exception e)
{
System.out.println("\n Error   "+e.getMessage());
}
}
}

public void itemStateChanged(ItemEvent ae)
{
if(ae.getSource()==c)
{
String s;
s=c.getSelectedItem();
int n=Integer.parseInt(s.trim());
try
{
rt=st.executeQuery("select * From Transaction  where consno="+n);
rt.next();
t5.setText(String.valueOf(rt.getInt("Consno")));
t7.setText(rt.getString("Consadd"));
t8.setText(String.valueOf(rt.getInt("Pincode")));
t6.setText(rt.getString("Consname"));
t9.setText(String.valueOf(rt.getInt("Phone")));
t10.setText(String.valueOf(rt.getInt("Sino")));
t11.setText(String.valueOf(rt.getInt("Consuno")));
t12.setText(rt.getString("Cylntype"));
t13.setText(rt.getString("bookdate"));
t14.setText(rt.getString("Releasedate"));
t15.setText(rt.getString("Remarks"));
System.out.println("Records are Currently displayed");
}
catch(Exception e16)
{
System.out.println("When accessing result set Error is occurred from custmast "+e16.getMessage());
}
}
}
}
class JCustomerReport extends Frame implements ActionListener,WindowListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
Button b1;

Connection con;
Statement st;
ResultSet rt;

public JCustomerReport(String s)
{
super(s);
addWindowListener(this);

l1=new Label("CustomerReport Screen");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,24));

l2=new Label("Date");
l3=new Label("Time");
l4=new Label("CustomerNumber");
l5=new Label("CustomerName");
l6=new Label("CustomerAddress");
l7=new Label("NoofCyln");
l8=new Label("Pincode");
l9=new Label("Telephone");
l10=new Label("BookingDate");
l11=new Label("DateofConnection");
l12=new Label("CustomersSignture");
l13=new Label("Price");
l14=new Label("cylntype");
l15=new Label("");

t1=new TextField(8);
t2=new TextField(8); 
t3=new TextField(8);
t4=new TextField(8);
t5=new TextField(8);
t6=new TextField(8);
t7=new TextField(8);
t8=new TextField(8);
t9=new TextField(8);
t10=new TextField(8);
t11=new TextField(8);
t12=new TextField(8);
t13=new TextField(8);
  

b1=new Button("CLICK");
b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);
b1.addActionListener(this);

l1.setBounds(100,50,350,20);

l2.setBounds(10,90,100,20);
t1.setBounds(140,90,100,20);
l3.setBounds(250,90,100,20);
t2.setBounds(360,90,100,20);

l4.setBounds(10,140,100,20);
l5.setBounds(250,140,100,20);
l6.setBounds(10,170,100,20);
l7.setBounds(10,200,100,20);

l8.setBounds(10,230,100,20);
l9.setBounds(10,260,100,20);
l10.setBounds(10,290,100,20);
l11.setBounds(10,320,100,20);
l12.setBounds(10,350,100,20);

l13.setBounds(10,380,100,20);
l14.setBounds(10,410,100,20);

t3.setBounds(140,140,100,20);
t4.setBounds(360,140,100,20);
t5.setBounds(140,170,100,20);
t6.setBounds(140,200,100,20);

t7.setBounds(140,230,100,20);
t8.setBounds(140,260,100,20);
t9.setBounds(140,290,100,20);
t10.setBounds(140,320,100,20);

t11.setBounds(140,350,100,20);
t12.setBounds(140,380,100,20);
t13.setBounds(140,410,100,20);

b1.setBounds(140,440,100,20);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);

add(b1);
add(l15);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is successfully created");
}
catch(Exception u9)
{
System.out.println("When Creating Dirver Error Is Occurred"+u9.getMessage());
}

}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}

public void actionPerformed(ActionEvent ae)
{
String ss="";
if(ae.getSource()==b1)
{
String s;
s=t3.getText();
int n=Integer.parseInt(s.trim());
try
{
rt=st.executeQuery("select consno,consname,cylntype,bookdate,consadd,pincode,phone from Transaction where consno="+n);
rt.next();
t3.setText(String.valueOf(rt.getInt("Consno")));
t4.setText(rt.getString("Consname"));
t13.setText(rt.getString("Cylntype"));
ss=t13.getText();
t9.setText(rt.getString("bookdate"));
t5.setText(rt.getString("Consadd"));
t7.setText(String.valueOf(rt.getInt("Pincode")));
t8.setText(String.valueOf(rt.getInt("Phone")));
System.out.println("Records are Currently displayed");
}
catch(Exception e12)
{
System.out.println("When Accessing Transaction Error is Ocured   "+e12.getMessage());
}
try
{
rt=st.executeQuery("select noofcyln,dateofconn from custmast where consno="+n);
rt.next();
t6.setText(String.valueOf(rt.getInt("noofcyln")));
t10.setText(rt.getString("dateofconn"));
System.out.println("Records are Currently displayedFrom Custmast");
}
catch(Exception e13)
{
System.out.println("When accessing(Custmast) result set Error is occurred from custmast "+e13.getMessage());
}
try
{
ss=t13.getText();
ss=ss.trim();
ss=ss.toUpperCase();
rt=st.executeQuery("select PRICE1 from price WHERE cylntype='"+ss+"'");
rt.next();
t12.setText(String.valueOf(rt.getFloat("price1")));
System.out.println("Records are Currently displayed From price");
}
catch(Exception e14)
{
System.out.println("When accessing(price) result set Error is occurred  "+e14.getMessage());
}
}
}
}
class TransactionEntry extends Frame implements ActionListener,WindowListener
{
Button b1,b2;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;

Connection con;
Statement st;
ResultSet rt;

DateFormat d3;
String d4;

public TransactionEntry(String s)
{
super(s);
addWindowListener(this);

l1=new Label("TRANSACTION ENTRY");
l2=new Label("Customer No");
l3=new Label("Customer Address");
l4=new Label("Pincode");
l5=new Label("Customer Name");
l6=new Label("Telephone");
l7=new Label("Sl.No");
l8=new Label("Consumer.No");
l9=new Label("Cyln Type");
l10=new Label("Booking Date");
l11=new Label("Date Of Release");
l12=new Label("Remarks");

l13=new Label(" ");

b1=new Button("Click");
b2=new Button("View");

t1=new TextField(" ");
t2=new TextField(" ");
t3=new TextField(" ");
t4=new TextField(" ");
t5=new TextField(" ");
t6=new TextField(" ");
t7=new TextField(" ");
t8=new TextField(" ");
t9=new TextField(" ");
t10=new TextField(" ");
t11=new TextField(" ");

b1.setBackground(Color.darkGray);
b2.setBackground(Color.darkGray);

b1.setForeground(Color.white);
b2.setForeground(Color.white);

b1.addActionListener(this);
b2.addActionListener(this);

add(b1);
add(b2);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);


add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);

add(l13);

l1.setFont(new Font("TimesNewRoman",Font.BOLD,14));

l1.setBounds(225,50,150,20);

l2.setBounds(150,75,100,20);
l3.setBounds(150,100,100,20);
l4.setBounds(150,125,100,20);
l5.setBounds(150,150,100,20);

l6.setBounds(150,175,100,20);
l7.setBounds(150,200,100,20);
l8.setBounds(150,225,100,20);
l9.setBounds(150,250,100,20);

l10.setBounds(150,275,100,20);
l11.setBounds(150,300,100,20);
l12.setBounds(150,325,100,20);

t1.setBounds(300,75,100,20);
t2.setBounds(300,100,100,20);
t3.setBounds(300,125,100,20);
t4.setBounds(300,150,100,20);

t5.setBounds(300,175,100,20);
t6.setBounds(300,200,100,20);
t7.setBounds(300,225,100,20);
t8.setBounds(300,250,100,20);

t9.setBounds(300,275,100,20);
t10.setBounds(300,300,100,20);
t11.setBounds(300,325,100,20);

b1.setBounds(280,350,100,30);
b2.setBounds(180,350,100,30);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:purush","","");
st=con.createStatement();
System.out.println("Driver is successfully created");
}
catch(Exception u9)
{
System.out.println("When Creating Dirver Error Is Occurred"+u9.getMessage());
}
try
{
d3=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
d4=d3.format(new java.util.Date());
t10.setText(d4.substring(0,8));
}
catch(Exception pp)
{
System.out.println("Date   :"+pp.getMessage());
}
}
public void actionPerformed(ActionEvent ae)
{
String ct="";

if(ae.getSource()==b2)
{
String s=t1.getText();
int n=Integer.parseInt(s.trim());

try
{
rt=st.executeQuery("select * from CustMast where consno="+n);
rt.next();
t1.setText(String.valueOf(rt.getInt("Consno")));
t4.setText(rt.getString("consname"));
t8.setText(rt.getString("Cylntype"));
String st=String.valueOf(rt.getInt("NoofCyln"));
t2.setText(rt.getString("Consadd"));
t3.setText(String.valueOf(rt.getInt("Pincode")));
String st1=rt.getString("DateofConn");
t5.setText(String.valueOf(rt.getInt("telePhone")));
t7.setText(t1.getText());
System.out.println("Records are Currently displayed");
}
catch(Exception e3)
{
System.out.println("When accessing result set Error is occurred from custmast "+e3.getMessage());
}

try
{
rt=st.executeQuery("select bookingdate from booking where consno="+n);
rt.next();
t9.setText(rt.getString("Bookingdate"));
}
catch(Exception ss1)
{
System.out.println("When Booking result set Error is occurred"+ss1.getMessage());
}
}
else if(ae.getSource()==b1)
{
String s1,s2,s3,s4,s5,s6,s7,s8;
int a1,a2,a3,a4,a5;

a1=Integer.parseInt(t1.getText());
s1=t2.getText();
a2=Integer.parseInt(t3.getText());
s2=t4.getText();
a3=Integer.parseInt(t5.getText());
s8=t6.getText();
a4=Integer.parseInt(s8.trim());
a5=Integer.parseInt(t7.getText());
s4=t8.getText();
s5=t9.getText();
s6=t10.getText();
s7=t11.getText();


String query="Insert  into Transaction (Consno,Consadd,Pincode,consname,Phone,sino,consuno,cylntype,BookDate,Releasedate,Remarks)Values("+a1+",'"+s1+"',"+a2+",'"+s2+"',"+a3+","+a4+","+a5+",'"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
try
{
st.executeUpdate(query);
System.out.println("Records is Successfully added To Transaction");
}
catch(Exception e10)
{
System.out.println("When adding a data to Transcation Error is occurred"+e10.getMessage());
}

ct=t8.getText();
ct=ct.trim();
ct=ct.toUpperCase();

int cc=0,cd=0;
try
{
rt=st.executeQuery("Select cc,cd from stock");
rt.next();
cc=rt.getInt("cc");
cd=rt.getInt("cd");
cc=cc-1;
cd=cd-1;
System.out.println("Ctype  ="+ct);
}
catch(Exception we)
{
System.out.println("Error   :"+we.getMessage());
}
if(ct.equals("D"))
{
try
{
st.executeUpdate("update stock set cd="+cd+"");
System.out.println("Record Is SuccessFully Updated On Stock");
}
catch(Exception iop)
{
System.out.println("Error Cd"+iop.getMessage());
}
}
else if(ct.equals("C"))
{
try
{
st.executeUpdate("update stock set cc="+cc+"");
System.out.println("Record Is SuccessFully Updated On Stock");
}
catch(Exception iop1)
{
System.out.println("Error Cc"+iop1.getMessage());
}
}
}
}
public void windowActivated(WindowEvent we){}
public void windowClosing(WindowEvent we)
{
this.setVisible(false);
}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}
}


