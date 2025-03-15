import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
import sun.jdbc.odbc.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;

/**
<applet code=havai.class width=650 height=550>
</applet>
*/



class cancellation extends JFrame implements ActionListener
{

Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl51,Rl52,Rl6,Rl7,Rl8,Rl9,Rl10,Rl11,Rl12,Rl13,Rl14,Rl15,Rl16,Rl17,Rl18,Rl19,Rl20,Rl21,Rl22,Rl23,Rl24;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt51,Rt6,Rt7,Rt8,Rt9,Rt10,Rt11,Rt12,Rt13,Rt14,Rt15,Rt16,Rt17,Rt18,Rt19,Rt20,Rt21,Rt22,Rt23;
JButton b1;

java.util.Date d1;
Font f,f1,f2;

Connection connection;
Statement statement,statement1;
ResultSet results;
int i=0,a=0;

dialog1 d5;
int pnr;
cancellation(String s,int a1)
{                                                   
super(s);
pnr=a1;
f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("CANCELLATION");

Rl2=new JLabel("PASSPORT NUMBER");
Rl3=new JLabel("PNR NUMBER");
Rl4=new JLabel("PASSENGER NAME");
Rl5=new JLabel("ADDRESS1");
Rl51=new JLabel("ADDRESS2");
Rl52=new JLabel("ADDRESS3");
Rl6=new JLabel("PHONE");
Rl7=new JLabel("OCCUPTION");
Rl8=new JLabel("NATIONALITY");
Rl9=new JLabel("ISSUE DATE");
Rl10=new JLabel("FLYING DATE");
Rl11=new JLabel("DAY");
Rl12=new JLabel("STATUS");
Rl13=new JLabel("FLIGHT NO");
Rl14=new JLabel("TICKET NO");
Rl15=new JLabel("SECTOR");
Rl16=new JLabel("CLASS");
Rl17=new JLabel("ZONE1");
Rl18=new JLabel("ZONE2");
Rl19=new JLabel("SEATS REQUIRED");
Rl20=new JLabel("BAGGAGE ALLOWED");
Rl21=new JLabel("AIRCRAFT TYPE");
Rl22=new JLabel("TIME");
Rl23=new JLabel("AMOUNT");
Rl24=new JLabel("CONFIRM");


Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);
Rt5=new TextField(4);
Rt51=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);
Rt8=new TextField(4);
Rt9=new TextField(4);
Rt10=new TextField(4);
Rt11=new TextField(4);
Rt12=new TextField(4);
Rt13=new TextField(4);
Rt14=new TextField(4);
Rt15=new TextField(4);                     
Rt16=new TextField(4);
Rt17=new TextField(4);
Rt18=new TextField(4);
Rt19=new TextField(4);
Rt20=new TextField(4);
Rt21=new TextField(4);
Rt22=new TextField(4);
Rt23=new TextField(4);

b1=new JButton("CONFIRM");
b1.setToolTipText("IF YOU REARY FOR RESERVATION THEN CLICK THIS CONFIRM BUTTON");

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);


l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(230,115,200,20);

Rl2.setBounds(5,155,150,20);
Rl3.setBounds(140,155,150,20);
Rl4.setBounds(240,155,150,20);
Rl5.setBounds(360,155,150,20);
Rl51.setBounds(455,155,150,20);
Rl52.setBounds(545,155,150,20);

Rt1.setBounds(5,180,90,20);
Rt2.setBounds(140,180,65,20);
Rt3.setBounds(240,180,90,20);
Rt4.setBounds(360,180,90,20);
Rt5.setBounds(545,180,90,20);
Rt51.setBounds(455,180,90,20);

Rl6.setBounds(5,210,200,20);
Rl7.setBounds(5,235,200,20);
Rl8.setBounds(5,260,200,20);
Rl9.setBounds(5,285,200,20);
Rl10.setBounds(5,310,200,20);
Rl11.setBounds(5,335,200,20);
Rl12.setBounds(5,360,200,20);
Rl13.setBounds(5,385,200,20);
Rl14.setBounds(5,410,200,20);

Rt6.setBounds(130,210,90,20);
Rt7.setBounds(130,235,90,20);
Rt8.setBounds(130,260,90,20);
Rt9.setBounds(130,285,90,20);
Rt10.setBounds(130,310,90,20);
Rt11.setBounds(130,335,90,20);
Rt12.setBounds(130,360,90,20);
Rt13.setBounds(130,385,90,20);
Rt14.setBounds(130,410,90,20);


Rl15.setBounds(360,210,200,20);
Rl16.setBounds(360,235,200,20);
Rl17.setBounds(360,260,200,20);
Rl18.setBounds(360,285,200,20);
Rl19.setBounds(360,310,200,20);
Rl20.setBounds(360,335,200,20);
Rl21.setBounds(360,360,200,20);
Rl22.setBounds(360,385,200,20);


Rt15.setBounds(525,210,90,20);
Rt16.setBounds(525,235,90,20);
Rt17.setBounds(525,260,90,20);
Rt18.setBounds(525,285,90,20);
Rt19.setBounds(525,310,90,20);
Rt20.setBounds(525,335,90,20);
Rt21.setBounds(525,360,90,20);
Rt22.setBounds(525,385,90,20);




Rl23.setBounds(240,235,200,20);
Rl24.setBounds(240,285,200,20);


Rt23.setBounds(240,260,90,20);
b1.setBounds(240,310,90,20);

l5.setBounds(210,230,500,20);

b1.addActionListener(this);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);
contentpane.add(Rl2);

contentpane.add(Rt1);
contentpane.add(Rl3);


contentpane.add(Rl4);
contentpane.add(Rt2);
contentpane.add(Rt3);
contentpane.add(Rl5);
contentpane.add(Rl51);
contentpane.add(Rl52);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(Rl9);
contentpane.add(Rl10);
contentpane.add(Rl11);
contentpane.add(Rl12);
contentpane.add(Rl13);
contentpane.add(Rl14);

contentpane.add(Rl15);
contentpane.add(Rl16);
contentpane.add(Rl17);
contentpane.add(Rl18);
contentpane.add(Rl19);
contentpane.add(Rl20);
contentpane.add(Rl21);
contentpane.add(Rl22);
contentpane.add(Rl23);
contentpane.add(Rl24);

contentpane.add(Rt4);
contentpane.add(Rt5);
contentpane.add(Rt51);

contentpane.add(Rt5);
contentpane.add(Rt6);
contentpane.add(Rt7);
contentpane.add(Rt8);
contentpane.add(Rt9);
contentpane.add(Rt10);
contentpane.add(Rt11);
contentpane.add(Rt12);
contentpane.add(Rt13);
contentpane.add(Rt14);

contentpane.add(Rt15);
contentpane.add(Rt16);
contentpane.add(Rt17);
contentpane.add(Rt18);
contentpane.add(Rt19);
contentpane.add(Rt20);
contentpane.add(Rt21);
contentpane.add(Rt22);
contentpane.add(Rt23);
contentpane.add(b1);
contentpane.add(l5);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
statement1=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 

String query="select * from passenger_details where pnr_number="+pnr;

try
{

results=statement.executeQuery(query);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
results.next();



Rt1.setText(results.getString("passport_number"));

Rt2.setText(String.valueOf(results.getInt("pnr_number")));

Rt3.setText(results.getString("passenger_name"));
Rt4.setText(results.getString("passenger_address1"));
Rt5.setText(results.getString("passenger_address2"));
Rt51.setText(results.getString("passenger_address3"));



Rt6.setText(String.valueOf(results.getInt("phone")));


Rt7.setText(results.getString("occuption"));
Rt8.setText(results.getString("nationality"));
Rt9.setText((results.getString("issue_date")));
Rt10.setText((results.getString("flying_date")));
Rt11.setText((results.getString("day")));



Rt12.setText(String.valueOf(results.getInt("status")));


Rt13.setText(results.getString("flight_number"));


Rt14.setText(String.valueOf(results.getInt("ticket_number")));


Rt15.setText(results.getString("sector"));
Rt16.setText(results.getString("class"));
Rt17.setText(results.getString("zone1"));
Rt18.setText(results.getString("zone2"));

Rt19.setText(String.valueOf(results.getInt("seats_required")));

Rt20.setText(String.valueOf(results.getInt("baggage_allowed")));

Rt21.setText(results.getString("aircraft_type"));
Rt22.setText(results.getString("time"));

Rt23.setText(String.valueOf(results.getFloat("amount")));

}
catch(SQLException e1)
{
System.out.println(e1.getMessage());
}


}         // for constructor

public void actionPerformed(ActionEvent e)
{
String s,s4,c1,s3,s5;
s=e.getActionCommand();
s3=Rt2.getText();
s3=s3.trim();

a=Integer.parseInt(s3);
int c,c3;
Float c2;
if(s.equals("CONFIRM"))
{
String h;
h=Rt2.getText();
c=Integer.parseInt(h.trim());

c1=Rt3.getText();

c2=Float.valueOf(Rt23.getText());
float o=c2.floatValue();

String h1;

h1=Rt14.getText();
c3=Integer.parseInt(h1.trim());

s4=Rt15.getText();
s5=Rt11.getText();


if(i==0)
{
String query="delete from passenger_details where pnr_number="+a;
String query1="insert into cancellation_passenger values("+c+","+c3+",'"+s4+"',"+o+",'"+c1+"','"+s5+"')";
try
{
statement.executeUpdate(query1);
statement1.executeUpdate(query);
System.out.println("RECORD IS SUCCESSFULLY ADDED ");
System.out.println("RECORD IS SUCCESSFULLY DELETED ");

}
catch(SQLException e1)
{
System.out.println(e1.getMessage());
}
i=1;
}
if(i==1)
{
d5=new dialog1(this,"hello",true);
d5.setSize(400,100);
d5.setLocation(150,150);
d5.setVisible(true);                            

}
}
}
}


class dialog2 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JLabel l1,l2;
public dialog2(Frame frame,String s,boolean modal)
{
super(frame,"                    CANCELLATION-MESSAGEBOX                ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");

l1=new JLabel("      YOU DO NOT ENTER ALL INFORMATIONS OF RESERVATION     ");
l2=new JLabel("        PLEASE ENTER  ALL INFORMATIONS    ");
b1.addActionListener(this);

contentpane.add(l1);
contentpane.add(b1);

}         // for constructor

public void actionPerformed(ActionEvent e)
{
dispose();
}
}                           // for class


class dialog1 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JLabel l1;
public dialog1(Frame frame,String s,boolean modal)
{
super(frame,"                    CANCELLATION-MESSAGEBOX                ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");

l1=new JLabel("        RECORD  IS   SUCCESSFULLY  DELETED     ");
b1.addActionListener(this);

contentpane.add(l1);
contentpane.add(b1);

}         // for constructor

public void actionPerformed(ActionEvent e)
{
dispose();
}
}                           // for class



class dialog extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;
int i=0;

cancellation r;
String s,query1;
int a;
JFrame j;
dialog2 d;
havai1 jhavai;

public dialog(Frame frame,String s,boolean modal)
{
super(frame,"       CANCELLATION-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

jhavai=new havai1();

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER YOUR PNR NUMBER    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);

}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{

if(i==0)
{
this.dispose();
i=1;
}
if(i==1)
{
String j;
j=t1.getText();
a=Integer.parseInt(j.trim());

r=new cancellation("CANCELLATION",a);
r.setVisible(true);
r.setSize(700,520);
}
}
}
}




class dialog3 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;
int i=0;

Connection connection;
Statement statement;
ResultSet results;
CallableStatement mystmt;
ticketing r;
String s,query1;
int a;


public dialog3(Frame frame,String s,boolean modal)
{
super(frame,"       TICKETING-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER YOUR TICKETING NUMBER    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 
}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{

if(i==0)
{
this.dispose();
i=1;                                 
}
if(i==1)
{
a=Integer.parseInt(t1.getText());
r=new ticketing("TICKETING");

String query="select issue_date,passenger_name,flight_number,class,day,time,status,baggage_allowed,sector,amount from passenger_details where ticket_number="+a;
int h=0;

try
{


results=statement.executeQuery(query);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
results.next();                          

r.Rt1.setText((results.getString("issue_date")));
r.Rt6.setText(results.getString("passenger_name"));
r.Rt7.setText(results.getString("flight_number"));
r.Rt8.setText(results.getString("class"));
r.Rt9.setText(results.getString("day"));
r.Rt10.setText(results.getString("time"));
r.Rt11.setText(String.valueOf(results.getInt("status")));
r.Rt12.setText(String.valueOf(results.getInt("baggage_allowed")));

r.Rt15.setText(results.getString("sector"));
r.Rt18.setText("NEW DELHI");
r.Rt22.setText(String.valueOf(results.getFloat("amount")));


}
catch(SQLException e2)
{
System.out.println(e2.getMessage());
}

i=0;
}
r.setVisible(true);
r.setSize(700,520);
}
}
}                                                            


class reservation extends JFrame implements ActionListener
{


Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl51,Rl52,Rl6,Rl7,Rl8,Rl9,Rl10,Rl11,Rl12,Rl13,Rl14,Rl15,Rl16,Rl17,Rl18,Rl19,Rl20,Rl21,Rl22,Rl23,Rl24;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt51,Rt6,Rt7,Rt8,Rt9,Rt10,Rt11,Rt12,Rt13,Rt14,Rt15,Rt16,Rt17,Rt18,Rt19,Rt20,Rt21,Rt22,Rt23;
JButton b1;

java.util.Date d1;
Font f,f1,f2;
reservation r;


String s0,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,
s21,s22,s23,s24,s25;
int a2,a7,a13,a15,a20,a21;
float a24;
String y,y1,y2,y3,y4,y5,y6=new String();

Connection connection;
Statement statement;
ResultSet results;
int i;

dialog2 d2;

reservation(String s)
{                                                   
super(s);

f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("RESERVATION");

Rl2=new JLabel("PASSPORT NUMBER");
Rl3=new JLabel("PNR NUMBER");
Rl4=new JLabel("PASSENGER NAME");
Rl5=new JLabel("ADDRESS1");
Rl51=new JLabel("ADDRESS2");
Rl52=new JLabel("ADDRESS3");
Rl6=new JLabel("PHONE");
Rl7=new JLabel("OCCUPTION");
Rl8=new JLabel("NATIONALITY");
Rl9=new JLabel("ISSUE DATE");
Rl10=new JLabel("FLYING DATE");
Rl11=new JLabel("DAY");
Rl12=new JLabel("STATUS");
Rl13=new JLabel("FLIGHT NO");
Rl14=new JLabel("TICKET NO");
Rl15=new JLabel("SECTOR");
Rl16=new JLabel("CLASS");
Rl17=new JLabel("ZONE1");
Rl18=new JLabel("ZONE2");
Rl19=new JLabel("SEATS REQUIRED");
Rl20=new JLabel("BAGGAGE ALLOWED");
Rl21=new JLabel("AIRCRAFT TYPE");
Rl22=new JLabel("TIME");
Rl23=new JLabel("AMOUNT");
Rl24=new JLabel("CONFIRM");


Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);
Rt5=new TextField(4);
Rt51=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);
Rt8=new TextField(4);
Rt9=new TextField(4);
Rt10=new TextField(4);
Rt11=new TextField(4);
Rt12=new TextField(4);
Rt13=new TextField(4);
Rt14=new TextField(4);
Rt15=new TextField(4);                     
Rt16=new TextField(4);
Rt17=new TextField(4);
Rt18=new TextField(4);
Rt19=new TextField(4);
Rt20=new TextField(4);
Rt21=new TextField(4);
Rt22=new TextField(4);
Rt23=new TextField(4);
b1=new JButton("CONFIRM");

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

b1.setBackground(Color.darkGray);
b1.setForeground(Color.white);


l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(230,115,200,20);

Rl2.setBounds(5,155,150,20);
Rl3.setBounds(140,155,150,20);
Rl4.setBounds(240,155,150,20);
Rl5.setBounds(360,155,150,20);
Rl51.setBounds(455,155,150,20);
Rl52.setBounds(545,155,150,20);

Rt1.setBounds(5,180,90,20);
Rt2.setBounds(140,180,65,20);
Rt3.setBounds(240,180,90,20);
Rt4.setBounds(360,180,90,20);
Rt5.setBounds(545,180,90,20);
Rt51.setBounds(455,180,90,20);

Rl6.setBounds(5,210,200,20);
Rl7.setBounds(5,235,200,20);
Rl8.setBounds(5,260,200,20);
Rl9.setBounds(5,285,200,20);
Rl10.setBounds(5,310,200,20);
Rl11.setBounds(5,335,200,20);
Rl12.setBounds(5,360,200,20);
Rl13.setBounds(5,385,200,20);
Rl14.setBounds(5,410,200,20);

Rt6.setBounds(130,210,90,20);
Rt7.setBounds(130,235,90,20);
Rt8.setBounds(130,260,90,20);
Rt9.setBounds(130,285,90,20);
Rt10.setBounds(130,310,90,20);
Rt11.setBounds(130,335,90,20);
Rt12.setBounds(130,360,90,20);
Rt13.setBounds(130,385,90,20);
Rt14.setBounds(130,410,90,20);


Rl15.setBounds(360,210,200,20);
Rl16.setBounds(360,235,200,20);
Rl17.setBounds(360,260,200,20);
Rl18.setBounds(360,285,200,20);
Rl19.setBounds(360,310,200,20);
Rl20.setBounds(360,335,200,20);
Rl21.setBounds(360,360,200,20);
Rl22.setBounds(360,385,200,20);


Rt15.setBounds(525,210,90,20);
Rt16.setBounds(525,235,90,20);
Rt17.setBounds(525,260,90,20);
Rt18.setBounds(525,285,90,20);
Rt19.setBounds(525,310,90,20);
Rt20.setBounds(525,335,90,20);
Rt21.setBounds(525,360,90,20);
Rt22.setBounds(525,385,90,20);




Rl23.setBounds(240,235,200,20);
Rl24.setBounds(240,285,200,20);


Rt23.setBounds(240,260,90,20);
b1.setBounds(240,310,90,20);

l5.setBounds(210,230,500,20);

b1.addActionListener(this);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);
contentpane.add(Rl2);

contentpane.add(Rt1);
contentpane.add(Rl3);

contentpane.add(Rt2);
contentpane.add(Rl4);

contentpane.add(Rt3);
contentpane.add(Rl5);
contentpane.add(Rl51);
contentpane.add(Rl52);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(Rl9);
contentpane.add(Rl10);
contentpane.add(Rl11);
contentpane.add(Rl12);
contentpane.add(Rl13);
contentpane.add(Rl14);

contentpane.add(Rl15);
contentpane.add(Rl16);
contentpane.add(Rl17);
contentpane.add(Rl18);
contentpane.add(Rl19);
contentpane.add(Rl20);
contentpane.add(Rl21);
contentpane.add(Rl22);
contentpane.add(Rl23);
contentpane.add(Rl24);

contentpane.add(Rt4);
contentpane.add(Rt5);
contentpane.add(Rt51);

contentpane.add(Rt5);
contentpane.add(Rt6);
contentpane.add(Rt7);
contentpane.add(Rt8);
contentpane.add(Rt9);
contentpane.add(Rt10);
contentpane.add(Rt11);
contentpane.add(Rt12);
contentpane.add(Rt13);
contentpane.add(Rt14);

contentpane.add(Rt15);
contentpane.add(Rt16);
contentpane.add(Rt17);
contentpane.add(Rt18);
contentpane.add(Rt19);
contentpane.add(Rt20);
contentpane.add(Rt21);
contentpane.add(Rt22);
contentpane.add(Rt23);
contentpane.add(b1);
contentpane.add(l5);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 

}

public void actionPerformed(ActionEvent e)
{

String s=new String();
s=e.getActionCommand();

String ss[]=new String[24];
int z=0;


if(s.equals("CONFIRM"))
{

/*ss[0]=Rt1.getText();
ss[1]=Rt2.getText();
ss[2]=Rt3.getText();
ss[3]=Rt4.getText();
ss[4]=Rt5.getText();
ss[5]=Rt51.getText();
ss[6]=Rt6.getText();
ss[7]=Rt7.getText();
ss[8]=Rt8.getText();
ss[9]=Rt9.getText();
ss[10]=Rt10.getText();
ss[11]=Rt11.getText();
ss[12]=Rt12.getText();
ss[13]=Rt13.getText();
ss[14]=Rt14.getText();
ss[15]=Rt15.getText();
ss[16]=Rt16.getText();
ss[17]=Rt17.getText();
ss[18]=Rt18.getText();
ss[19]=Rt19.getText();
ss[20]=Rt20.getText();
ss[21]=Rt21.getText();
ss[22]=Rt22.getText();
ss[23]=Rt23.getText();

if(ss[0]==" "||ss[1]==" "||ss[2]==" "||ss[3]==" "||ss[4]==" "||ss[5]==" "||ss[6]==" "||ss[7]==" "||ss[8]==" "||
ss[9]==" "||ss[10]==" "||ss[11]==" "||ss[12]==" "||ss[13]==" "||ss[14]==" "||ss[15]==" "||ss[16]==" "||ss[17]==" "||ss[18]==" "||
ss[19]==" "||ss[20]==" "||ss[21]==" "||ss[22]==" "||ss[23]==" ")
{
d2=new dialog2(this,"MESSAGE BOX FOR RESERVATION",true);
d2.setVisible(true);
d2.setLocation(300,300);
d2.setSize(200,150);
z=0;
}
else
{   */
if(i==0)
{

s0=Rt1.getText();

y=Rt2.getText();
a2=Integer.parseInt(y.trim());

s3=Rt3.getText();
s4=Rt4.getText();
s5=Rt5.getText();
s6=Rt51.getText();



y1=Rt6.getText();
a7=Integer.parseInt(y1.trim());

s8=Rt7.getText();
s9=Rt8.getText();
s10=Rt9.getText();
s11=Rt10.getText();
s12=Rt11.getText();



y2=Rt12.getText();
a13=Integer.parseInt(y2.trim());

s14=Rt13.getText();


y3=Rt14.getText();
a15=Integer.parseInt(y3.trim());

s16=Rt15.getText();
s17=Rt16.getText();
s18=Rt17.getText();
s19=Rt18.getText();


y4=Rt19.getText();
a20=Integer.parseInt(y4.trim());


y5=Rt20.getText();
a21=Integer.parseInt(y5.trim());

s22=Rt21.getText();
s23=Rt22.getText();


y6=Rt23.getText();
Float f;
f=Float.valueOf(y6);


a24=f.floatValue();


String query="insert into passenger_details values('"+s0+"',"+a2+",'"+s3+"','"+s4+"','"+s5+"','"+s6+"',"+a7+",'"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"',"+a13+",'"+s14+"',"+a15+",'"+s16+"','"+s17+"','"+s18+"','"+s19+"',"+a20+","+a21+",'"+s22+"','"+s23+"',"+a24+")";

try
{

statement.executeUpdate(query);
System.out.println("RECORD IS SUCCESSFULLY ADDED ");

results.close();
connection.commit();
connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
connection.close();


}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
i=1;
}
}
if(i==1)
{
JFrame j=new reservationslip("-------------RESERVATION SLIP-------------",a2);
j.setSize(700,620);
j.setVisible(true);
i=0;
}
}
}     
//} 


class reservationslip extends JFrame
{

Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5;
TextField Rt1,Rt2,Rt3,Rt4;
java.util.Date d1;
Font f,f1,f2;
String s1,s2,s3,s4;

Connection connection;
Statement statement;
ResultSet results;
String query,query1;
boolean more;
ResultSetMetaData rsmd;
int numcols;
int i;
int c;
reservationslip(String s,int a)
{                                                   
super(s);

f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("RESERVATION SLIP");

Rl2=new JLabel("NAME OF PASSENGER");
Rl3=new JLabel("STATUS");
Rl4=new JLabel("PNR NUMBER");
Rl5=new JLabel("FARE AMOUNT");


Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);

Rl1.setBounds(200,155,200,20);
Rl2.setBounds(5,250,200,20);
Rl3.setBounds(5,350,200,20);
Rl4.setBounds(360,250,200,20);
Rl5.setBounds(360,350,200,20);

l5.setBounds(210,230,500,20);

Rt1.setBounds(180,250,90,20);
Rt2.setBounds(180,350,90,20);
Rt3.setBounds(530,250,90,20);
Rt4.setBounds(530,350,90,20);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);
contentpane.add(Rl2);
contentpane.add(Rl3);
contentpane.add(Rl4);
contentpane.add(Rl5);

contentpane.add(Rt1);
contentpane.add(Rt2);
contentpane.add(Rt3);
contentpane.add(Rt4);

contentpane.add(l5);



try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println(e.getMessage());
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
}


query="select passenger_name,status,pnr_number,amount from passenger_details where pnr_number="+a;

try
{

results=statement.executeQuery(query);
results.next();

Rt1.setText(results.getString("passenger_name"));
Rt2.setText(String.valueOf(results.getInt("status")));
Rt3.setText(String.valueOf(results.getInt("pnr_number")));
Rt4.setText(String.valueOf(results.getFloat("amount")));
System.out.println("QUERY IS SUCCESSFULLY EXECUTED");
results.close();
connection.commit();
connection.setTransactionIsolation(Connection.TRANSACTION_NONE);
connection.close();
}
catch(Exception y)
{

System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED");
System.out.println(y.getMessage());
} 

}
}


class dialog4 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;
int i=0;

Connection connection;
Statement statement;
ResultSet results;

refund r;
String s,query1;
int a;


public dialog4(Frame frame,String s,boolean modal)
{
super(frame,"       CANCELLATION-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER YOUR PNR NUMBER    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 
}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{

if(i==0)
{
this.dispose();
i=1;
}
if(i==1)
{
String j;
j=t1.getText();
a=Integer.parseInt(j.trim());
String query="select pnr_number,passenger_name,amount from cancellation_passenger where pnr_number="+a;
int h=0;

try
{

results=statement.executeQuery(query);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
results.next();
r=new refund("DETAILS OF CANCELLATION PASSENGER");                                      


r.t1.setText(String.valueOf(results.getInt("pnr_number")));
r.t2.setText(results.getString("passenger_name"));
r.t3.setText(String.valueOf(results.getFloat("amount")));

results.close();
connection.commit();
connection.setTransactionIsolation(Connection.TRANSACTION_NONE);
connection.close();

}
catch(SQLException e1)
{
System.out.println(e1.getMessage());
}
  
i=0;
}
}

r.setVisible(true);
r.setSize(700,520);
}
}



class ticketing extends JFrame
{

Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl51,Rl52,Rl6,Rl7,Rl8,Rl9,Rl10,Rl11,Rl12,Rl13,Rl14,Rl15,Rl16,Rl17,Rl18,Rl19,Rl20,Rl21,Rl22,Rl23,Rl24;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt51,Rt6,Rt7,Rt8,Rt9,Rt10,Rt11,Rt12,Rt13,Rt14,Rt15,Rt16,Rt17,Rt18,Rt19,Rt20,Rt21,Rt22,Rt23,Rt24;
java.util.Date d1;
Font f,f1,f2;

int i=0;

ticketing(String s)
{                                                   
super(s);

f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("PASSENGER TICKET AND BAGGAGE CHECK");
Rl2=new JLabel("NOT-TRANSFERABLE");
Rl5=new JLabel("DATE-OF-ISSUE");
Rl6=new JLabel("NAME OF PASSENGER");
Rl7=new JLabel("FLIGHT-NUMBER");
Rl8=new JLabel("CLASS");
Rl9=new JLabel("DATE");
Rl10=new JLabel("TIME");
Rl11=new JLabel("STATUS");
Rl12=new JLabel("BAGGAGE-ALLOWED");
Rl15=new JLabel("FROM");
Rl18=new JLabel("TO");
Rl22=new JLabel("FARE");

Rt1=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);
Rt8=new TextField(4);
Rt9=new TextField(4);
Rt10=new TextField(4);
Rt11=new TextField(4);
Rt12=new TextField(4);
Rt15=new TextField(4);                     
Rt18=new TextField(4);
Rt19=new TextField(4);
Rt20=new TextField(4);
Rt21=new TextField(4);
Rt22=new TextField(4);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(150,115,450,20);

Rl2.setBounds(5,155,150,20);
Rl5.setBounds(360,155,150,20);


Rl6.setBounds(5,210,200,20);
Rl7.setBounds(5,235,200,20);
Rl8.setBounds(5,260,200,20);
Rl9.setBounds(5,285,200,20);
Rl10.setBounds(5,310,200,20);
Rl11.setBounds(5,335,200,20);
Rl12.setBounds(5,360,200,20);


Rt1.setBounds(525,155,90,20);
Rt6.setBounds(140,210,90,20);
Rt7.setBounds(140,235,90,20);
Rt8.setBounds(140,260,90,20);
Rt9.setBounds(140,285,90,20);
Rt10.setBounds(140,310,90,20);
Rt11.setBounds(140,335,90,20);
Rt12.setBounds(140,360,90,20);


Rl15.setBounds(360,210,200,20);
Rl18.setBounds(360,285,200,20);
Rl22.setBounds(360,385,200,20);


Rt15.setBounds(525,210,90,20);
Rt18.setBounds(525,285,90,20);
Rt22.setBounds(525,385,90,20);

l5.setBounds(210,230,500,20);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);
contentpane.add(Rl2);

contentpane.add(Rl5);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(Rl9);
contentpane.add(Rl10);
contentpane.add(Rl11);
contentpane.add(Rl12);
contentpane.add(Rl15);
contentpane.add(Rl18);
contentpane.add(Rl22);

contentpane.add(Rt1);
contentpane.add(Rt6);
contentpane.add(Rt7);
contentpane.add(Rt8);
contentpane.add(Rt9);
contentpane.add(Rt10);
contentpane.add(Rt11);
contentpane.add(Rt12);

contentpane.add(Rt15);
contentpane.add(Rt18);
contentpane.add(Rt19);
contentpane.add(Rt20);
contentpane.add(Rt21);
contentpane.add(Rt22);
contentpane.add(l5);


}         // for constructor

}



class refund extends JFrame
{

Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
DateFormat d1;
Font f,f1,f2;

TextField t1,t2,t3;

String d2,query;

Connection connection;
Statement statement;
ResultSet results;

refund(String s)
{                                                   
super(s);

f=new Font("TimesNewRoman",Font.BOLD,24);
f1=new Font("TimesNewRoman",Font.BOLD,15);
f2=new Font("ariso",Font.ITALIC+Font.BOLD,15);
d1=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
d2=d1.format(new java.util.Date());


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ",JLabel.CENTER);
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d2);
l5=new JLabel(" REFUND RECIPT ");


l7=new JLabel(" PNR NUMBER ");
l8=new JLabel(" PASSENGER_NAME ");
l9=new JLabel(" PASSENGER_AMOUNT ");
l10=new JLabel(" SIGNATURE ");

l6=new JLabel(" ");

t1=new TextField(8);
t2=new TextField(8);
t3=new TextField(8);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
l5.setFont(f);
l10.setFont(f2);

l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

l5.setBackground(Color.blue);
l5.setForeground(Color.magenta);


l1.setBounds(75,40,500,20);
l2.setBounds(130,70,500,20);
l3.setBounds(150,100,500,20);
l4.setBounds(130,130,500,20);
l5.setBounds(200,160,500,20);


l7.setBounds(130,235,200,20);
l8.setBounds(130,285,200,20);
l9.setBounds(130,335,200,20);
l10.setBounds(490,435,200,20);

t1.setBounds(330,235,90,20);
t2.setBounds(330,285,90,20);
t3.setBounds(330,335,90,20);

l6.setBounds(160,170,500,20);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);
contentpane.add(l5);

contentpane.add(l7);
contentpane.add(l8);
contentpane.add(l9);
contentpane.add(l10);

contentpane.add(t1);
contentpane.add(t2);
contentpane.add(t3);

contentpane.add(l6);

}
public Insets getInsets()
{
return new Insets(0,0,0,0);
}

}






class dialog5 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;

String s,query1;
int i=0,i1=0;

flightwisereport flight;

public dialog5(Frame frame,String s,boolean modal)
{
super(frame,"       CANCELLATION-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER YOUR FLIGHT NUMBER    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);


}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{
if(i==0)
{
this.dispose();
i=1;
}
if(i==1)
{
query1=t1.getText();


flight=new flightwisereport("FLIGHT WISE REPORT",query1);
flight.setVisible(true);
flight.setSize(700,580);
i=0;
}
}
}
}


class dialog6 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;

String s,query1;
int i=0,i1=0;

dailypassengerreport flight;

public dialog6(Frame frame,String s,boolean modal)
{
super(frame,"       CANCELLATION-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER CURRENT DATE    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);


}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{
if(i==0)
{
this.dispose();
i=1;
}
if(i==1)
{
query1=t1.getText();

flight=new dailypassengerreport("DAILY PASSENGER REPORT",query1);
flight.setVisible(true);
flight.setSize(700,580);
i=0;
}
}
}
}


class dialog7 extends JDialog implements ActionListener
{
Container contentpane=getContentPane();

JButton b1;
JTextField t1;
JLabel l1,l2;

String s,query1;
int i=0,i1=0;

dailycollectionreport flight;

public dialog7(Frame frame,String s,boolean modal)
{
super(frame,"       CANCELLATION-MESSAGEBOX       ",modal);
contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,10,18));

b1=new JButton("OK");
t1=new JTextField(5);
l1=new JLabel("ENTER CURRENT DATE    :");
b1.addActionListener(this);
contentpane.add(l1);
contentpane.add(t1);
contentpane.add(b1);


}                                       // for constructor

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();

if(s.equals("OK"))
{
if(i==0)
{
this.dispose();
i=1;
}
if(i==1)
{
query1=t1.getText();

flight=new dailycollectionreport("DAILY COLLECTION REPORT",query1);
flight.setVisible(true);
flight.setSize(700,580);
i=0;
}
}
}
}



class report extends JFrame implements ActionListener
{
Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,l6;
Button b1,b2,b3;

DateFormat d1;
Connection connection;
Statement statement;
ResultSet results;

Font f,f1,f2;

String d2;
JFrame JF1,JF2,JF3;

dialog5 d5;
dialog6 d6;
dialog7 d7;

report(String s)
{                                                   
super(s);


f=new Font("TimesNewRoman",Font.BOLD,24);
f1=new Font("TimesNewRoman",Font.BOLD,15);
f2=new Font("ariso",Font.ITALIC+Font.BOLD,15);
d1=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
d2=d1.format(new java.util.Date());


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ",JLabel.CENTER);
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d2);
l5=new JLabel(" REPORT ");
l6=new JLabel(" ");

b1=new Button("FLIGHT WISE REPORT");
b2=new Button("DAILY PASSENGER REPORT");
b3=new Button("DAILY COLLECTION REPORT");


l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
l5.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

l5.setBackground(Color.gray);
l5.setForeground(Color.magenta);

b1.setBackground(Color.gray);
b1.setForeground(Color.white);

b2.setBackground(Color.gray);
b2.setForeground(Color.white);

b3.setBackground(Color.gray);
b3.setForeground(Color.white);

b1.setSize(100,40);
b2.setSize(100,40);
b3.setSize(100,40);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

l1.setBounds(85,40,500,20);
l2.setBounds(140,70,500,20);
l3.setBounds(160,100,500,20);
l4.setBounds(140,130,500,20);
l5.setBounds(260,160,500,20);


b1.setBounds(170,235,300,40);
b2.setBounds(170,315,300,40);
b3.setBounds(170,395,300,40);      

l6.setBounds(160,400,500,20);

contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);
contentpane.add(l5);

contentpane.add(b1);
contentpane.add(b2);
contentpane.add(b3);

contentpane.add(l6);

}
public Insets getInsets()
{
return new Insets(0,0,0,0);
}

public void actionPerformed(ActionEvent e)
{
String s;
s=e.getActionCommand();

if(s.equals("FLIGHT WISE REPORT"))
{
d5=new dialog5(this,"hello",true);
d5.setSize(400,100);
d5.setLocation(150,150);
d5.setVisible(true);
}
if(s.equals("DAILY PASSENGER REPORT"))
{
d6=new dialog6(this,"hello",true);
d6.setSize(400,100);
d6.setLocation(150,150);
d6.setVisible(true);

}
if(s.equals("DAILY COLLECTION REPORT"))
{
d7=new dialog7(this,"hello",true);
d7.setSize(400,100);
d7.setLocation(150,150);
d7.setVisible(true);
}
}
}



class flightwisereport extends JFrame implements ItemListener
{
Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl6,Rl7,Rl8,Rl9,Rl10,Rl11,Rl12;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt6,Rt7,Rt8,Rt9,Rt10,Rt11,Rt12;
java.util.Date d1;
Font f,f1,f2;

Connection connection;
Statement statement,statement1;
ResultSet results;
int i=0,a=0;

Choice pnrnumber;
PreparedStatement ps;

flightwisereport(String s,String q)
{                                                   
super(s);

pnrnumber=new Choice();


f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("FLIGHT WISE REPORT");

Rl2=new JLabel("FLIGHT NUMBER");
Rl3=new JLabel("FROM");
Rl4=new JLabel("TO");
Rl5=new JLabel("TIME");
Rl6=new JLabel("DATE");
Rl7=new JLabel("PASSENGER NAME");
Rl8=new JLabel("CLASS");
Rl9=new JLabel("ZONE1");
Rl10=new JLabel("ZONE2");
Rl11=new JLabel("STATUS");
Rl12=new JLabel("BAGGAGE ALLOWED");



Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);
Rt5=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);
Rt8=new TextField(4);
Rt9=new TextField(4);
Rt10=new TextField(4);
Rt11=new TextField(4);


l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

pnrnumber.setForeground(Color.blue);

l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(230,115,200,20);

pnrnumber.setBounds(50,210,100,20);

Rl2.setBounds(150,210,200,20);
Rl3.setBounds(150,235,200,20);
Rl4.setBounds(150,260,200,20);
Rl5.setBounds(150,285,200,20);
Rl6.setBounds(150,310,200,20);
Rl7.setBounds(150,335,200,20);
Rl8.setBounds(150,360,200,20);

Rt1.setBounds(280,210,90,20);
Rt2.setBounds(280,235,90,20);
Rt3.setBounds(280,260,90,20);
Rt4.setBounds(280,285,90,20);
Rt5.setBounds(280,310,90,20);
Rt6.setBounds(280,335,90,20);
Rt7.setBounds(280,360,90,20);

Rl9.setBounds(390,210,200,20);
Rl10.setBounds(390,235,200,20);
Rl11.setBounds(390,260,200,20);
Rl12.setBounds(390,285,200,20);


Rt8.setBounds(510,210,90,20);
Rt9.setBounds(510,235,90,20);
Rt10.setBounds(510,260,90,20);
Rt11.setBounds(510,285,90,20);




l5.setBounds(210,230,500,20);

pnrnumber.addItemListener(this);


contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);

contentpane.add(Rl2);
contentpane.add(Rl3);
contentpane.add(Rl4);
contentpane.add(Rl5);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(Rl9);
contentpane.add(Rl10);
contentpane.add(Rl11);
contentpane.add(Rl12);



contentpane.add(Rt1);
contentpane.add(Rt2);
contentpane.add(Rt3);
contentpane.add(Rt4);
contentpane.add(Rt5);
contentpane.add(Rt6);
contentpane.add(Rt7);
contentpane.add(Rt8);
contentpane.add(Rt9);
contentpane.add(Rt10);
contentpane.add(Rt11);
contentpane.add(pnrnumber);

contentpane.add(l5);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 

String choice;

try
{
PreparedStatement ps;
ps=connection.prepareStatement("select pnr_number from passenger_details where flight_number=?");                          
ps.setString(1,q);
results=ps.executeQuery();
                     
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
while(results.next())
{
choice=String.valueOf(results.getInt("pnr_number"));
pnrnumber.addItem(choice);
}

}
catch(SQLException e)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED");
System.out.println(e.getMessage());
}
}
public void itemStateChanged(ItemEvent e1)
{
String select,query;
int a=0;

if(e1.getItemSelectable()==pnrnumber)
{
select=(String)pnrnumber.getSelectedItem();
a=Integer.parseInt(select);

query="select flight_number,sector,time,day,passenger_name,class,zone1,zone2,status,baggage_allowed from passenger_details where pnr_number="+a;

try
{

results=statement.executeQuery(query);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
results.next();

                                                
Rt1.setText(results.getString("flight_number"));
Rt2.setText("NEW DELHI");
Rt3.setText(results.getString("sector"));
Rt4.setText(results.getString("time"));
Rt5.setText((results.getString("day")));
Rt6.setText(results.getString("passenger_name"));
Rt7.setText(results.getString("class"));
Rt8.setText(results.getString("zone1"));
Rt9.setText(results.getString("zone2"));
Rt10.setText(String.valueOf(results.getInt("status")));
Rt11.setText(String.valueOf(results.getInt("baggage_allowed")));

}
catch(SQLException ey)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED");
System.out.println(ey.getMessage());
}
}
}



}


class dailypassengerreport extends JFrame implements ItemListener
{
Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl6,Rl7,Rl8;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt6,Rt7;
java.util.Date d1;
Font f,f1,f2;

Connection connection;
Statement statement,statement1;
ResultSet results;
int i=0,a=0;

Choice pnrnumber;
PreparedStatement ps;

dailypassengerreport(String s,String q)
{                                                   
super(s);

pnrnumber=new Choice();


f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("FLIGHT WISE REPORT");

Rl2=new JLabel("FLIGHT NUMBER");
Rl3=new JLabel("PASSENGER NAME");
Rl4=new JLabel("FROM");
Rl5=new JLabel("TO");
Rl6=new JLabel("CLASS");
Rl7=new JLabel("BAGGAGE ALLOWED");
Rl8=new JLabel("AIRCRAFT TYPE");


Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);
Rt5=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

pnrnumber.setForeground(Color.blue);

l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(230,115,200,20);

pnrnumber.setBounds(105,210,100,20);

Rl2.setBounds(230,210,200,20);
Rl3.setBounds(230,235,200,20);
Rl4.setBounds(230,260,200,20);
Rl5.setBounds(230,285,200,20);
Rl6.setBounds(230,310,200,20);
Rl7.setBounds(230,335,200,20);
Rl8.setBounds(230,360,200,20);

Rt1.setBounds(360,210,90,20);
Rt2.setBounds(360,235,90,20);
Rt3.setBounds(360,260,90,20);
Rt4.setBounds(360,285,90,20);
Rt5.setBounds(360,310,90,20);
Rt6.setBounds(360,335,90,20);
Rt7.setBounds(360,360,90,20);


l5.setBounds(210,230,500,20);


contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);

contentpane.add(Rl2);
contentpane.add(Rl3);
contentpane.add(Rl4);
contentpane.add(Rl5);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(pnrnumber);

contentpane.add(Rt1);
contentpane.add(Rt2);
contentpane.add(Rt3);
contentpane.add(Rt4);
contentpane.add(Rt5);
contentpane.add(Rt6);
contentpane.add(Rt7);

contentpane.add(l5);

pnrnumber.addItemListener(this);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED");
System.out.println(e.getMessage());
} 

String choice;


try
{

ps=connection.prepareStatement("select pnr_number from passenger_details where day=?");                          
ps.setString(1,q);
results=ps.executeQuery();
                     
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
while(results.next())
{
choice=String.valueOf(results.getInt("pnr_number"));
pnrnumber.addItem(choice);
}
}
catch(SQLException e)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED");
System.out.println(e.getMessage());
}
}
public void itemStateChanged(ItemEvent e1)
{
String select,query;
int a=0;

if(e1.getItemSelectable()==pnrnumber)
{
select=(String)e1.getItem();
a=Integer.parseInt(select);

query="select flight_number,passenger_name,sector,class,baggage_allowed,aircraft_type from passenger_details where pnr_number="+a;
try
{

results=statement.executeQuery(query);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
results.next();

Rt1.setText(results.getString("flight_number"));
Rt2.setText(results.getString("passenger_name"));
Rt3.setText(results.getString("sector"));
Rt4.setText(results.getString("class"));
Rt5.setText("NEW DELHI");
Rt6.setText(String.valueOf(results.getInt("baggage_allowed")));
Rt7.setText(results.getString("aircraft_type"));

}
catch(SQLException ey)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED");
System.out.println(ey.getMessage());
}
}
}
}


class dailycollectionreport extends JFrame implements ItemListener
{

Container contentpane=getContentPane();

JLabel l1,l2,l3,l4,l5,Rl1,Rl2,Rl3,Rl4,Rl5,Rl6,Rl7,Rl8;
TextField Rt1,Rt2,Rt3,Rt4,Rt5,Rt6,Rt7;
java.util.Date d1;
Font f,f1,f2;

Connection connection;
Statement statement,statement1;
ResultSet results,results1;
int i=0,a=0;                                                            

Choice pnrnumber;

float amo,amo1,ref,ref1,res;

PreparedStatement ps;
dailycollectionreport(String s,String q)
{                                                   
super(s);

pnrnumber=new Choice();

f=new Font("TimesNewRoman",Font.BOLD,20);
f1=new Font("TimesNewRoman",Font.BOLD,13);
d1=new java.util.Date();
f2=new Font("TimesNewRoman",Font.BOLD,15);


l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d1);
l5=new JLabel(" ");

Rl1=new JLabel("FLIGHT WISE REPORT");

Rl2=new JLabel("TICKET NUMBER");
Rl3=new JLabel("SECTOR");
Rl4=new JLabel("AMOUNT");
Rl5=new JLabel("REFUND");
Rl6=new JLabel("TOTAL COLLECTION");
Rl7=new JLabel("TOTAL REFUNDS");
Rl8=new JLabel("NET COLLECTION");


Rt1=new TextField(4);
Rt2=new TextField(4);
Rt3=new TextField(4);
Rt4=new TextField(4);
Rt5=new TextField(4);
Rt6=new TextField(4);
Rt7=new TextField(4);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);
Rl1.setFont(f);


l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);

Rl1.setBackground(Color.gray);
Rl1.setForeground(Color.magenta);

pnrnumber.setForeground(Color.blue);

l1.setBounds(120,15,500,20);
l2.setBounds(140,40,500,20);
l3.setBounds(170,65,500,20);
l4.setBounds(130,90,500,20);
Rl1.setBounds(230,115,200,20);

pnrnumber.setBounds(105,210,100,20);

Rl2.setBounds(230,210,200,20);
Rl3.setBounds(230,235,200,20);
Rl4.setBounds(230,260,200,20);
Rl5.setBounds(230,285,200,20);
Rl6.setBounds(230,310,200,20);
Rl7.setBounds(230,335,200,20);
Rl8.setBounds(230,360,200,20);

Rt1.setBounds(360,210,90,20);
Rt2.setBounds(360,235,90,20);
Rt3.setBounds(360,260,90,20);
Rt4.setBounds(360,285,90,20);
Rt5.setBounds(360,310,90,20);
Rt6.setBounds(360,335,90,20);
Rt7.setBounds(360,360,90,20);


l5.setBounds(210,230,500,20);


contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);

contentpane.add(Rl1);

contentpane.add(Rl2);
contentpane.add(Rl3);
contentpane.add(Rl4);
contentpane.add(Rl5);
contentpane.add(Rl6);
contentpane.add(Rl7);
contentpane.add(Rl8);
contentpane.add(pnrnumber);

contentpane.add(Rt1);
contentpane.add(Rt2);
contentpane.add(Rt3);
contentpane.add(Rt4);
contentpane.add(Rt5);
contentpane.add(Rt6);
contentpane.add(Rt7);

contentpane.add(l5);

pnrnumber.addItemListener(this);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection =DriverManager.getConnection("jdbc:odbc:service","scott","tiger");
statement=connection.createStatement();
System.out.println("DRIVER IS SUCCESSFULLY CREATED FOR DAILY COLLECTION REPORT");
}
catch(Exception e)
{
System.out.println("WHEN CREATING DRIVER ERROR IS OCCURED IN DAILY COLLECTION REPORT");
System.out.println(e.getMessage());
} 

String choice,query="select pnr_number from passenger_details where day="+q;
String refun="select pnr_number from cancellation_passenger where day="+q;
try
{
ps=connection.prepareStatement("select pnr_number from passenger_details where day=?");                          
ps.setString(1,q);
results=ps.executeQuery();
                     
System.out.println("RECORD IS SUCCESSFULLY SELECTED");
while(results.next())
{
choice=String.valueOf(results.getInt("pnr_number"));
pnrnumber.addItem(choice);
}

System.out.println("RECORD IS SUCCESSFULLY SELECTED");

}
catch(SQLException e7)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED IN DAILY COLLECTION REPORT");
System.out.println(e7.getMessage());
}

try
{
ps=connection.prepareStatement("select pnr_number from cancellation_passenger where day=?");                          
ps.setString(1,q);
results1=ps.executeQuery();
                     

System.out.println("RECORD IS SUCCESSFULLY SELECTED");
while(results1.next())
{
choice=String.valueOf(results1.getInt("pnr_number"));
pnrnumber.addItem(choice);
}

}
catch(SQLException e)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED IN DAILY COLLECTION REPORT");
System.out.println(e.getMessage());
}

String amount="select amount from passenger_details";
String refund="select amount from cancellation_passenger";

try
{

results=statement.executeQuery(amount);
while(results.next())
{
amo=results.getFloat("amount");
amo1=amo+amo1;
}
results1=statement.executeQuery(refund);
System.out.println("RECORD IS SUCCESSFULLY SELECTED");         

while(results1.next())
{
ref=results1.getFloat("amount");
ref1=ref+ref1;
}
res=amo1-ref1;
}
catch(SQLException ey)
{
System.out.println("WHEN CALCULLATING ERROR IS OCCURED");
System.out.println(ey.getMessage());
}

}


public void itemStateChanged(ItemEvent e1)
{
String select,query,query1;
int a=0,b=0;

if(e1.getItemSelectable()==pnrnumber)
{
select=(String)e1.getItem();
a=Integer.parseInt(select);

query="select ticket_number,sector,amount from passenger_details where pnr_number="+a;
query1="select ticket_number,sector,amount from cancellation_passenger where pnr_number="+a;

try
{

Rt5.setText(String.valueOf(amo1));
Rt6.setText(String.valueOf(ref1));
Rt7.setText(String.valueOf(res));

results=statement.executeQuery(query);
results.next();

Rt1.setText(String.valueOf(results.getInt("ticket_number")));
Rt2.setText(results.getString("sector"));
Rt3.setText(String.valueOf(results.getFloat("amount")));
Rt4.setText(" ");
}
catch(SQLException e5)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED IN DAILY CALL");
System.out.println(e5.getMessage());
}
try
{
results1=statement.executeQuery(query1);
results1.next();
Rt1.setText(String.valueOf(results1.getInt("ticket_number")));
Rt2.setText(results1.getString("sector"));
Rt4.setText(String.valueOf(results1.getFloat("amount")));
String sd=Rt4.getText();
Rt3.setText(sd);
}
catch(SQLException ey)
{
System.out.println("WHEN EXECUTING QUERY ERROR IS OCCURED IN DAILY CALL");
System.out.println(ey.getMessage());
}
}
}
}



public class havai1 extends JFrame implements ActionListener
{

JButton b1,b2,b3,b4,b5,b6;
Container contentpane=getContentPane();

JLabel l1,l2,l3,l4;
DateFormat d1;
Font f,f1;

JFrame JF1;
JFrame JF2;
JFrame JF3;
JFrame JF4;
JFrame JF5;
String d2;
dialog d;
dialog3 d3;
dialog4 d4;

havai1()
{

contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,240,18));

contentpane.setSize(100,10);

f=new Font("TimesNewRoman",Font.BOLD,24);
f1=new Font("TimesNewRoman",Font.BOLD,15);
d1=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
d2=d1.format(new java.util.Date());

b1=new JButton("                       RESERVATION                    ");
b2=new JButton("                       CANCELLATION                   ");
b3=new JButton("                           TICKETTING                       ");
b4=new JButton("                              REFUND                          ");
b5=new JButton("                              REPORT                          ");  
b6=new JButton("                                  EXIT                              ");

l1=new JLabel("  HAVAI AIRWAYS INTERNATIONAL   ");
l2=new JLabel("    B-46 , CONNAUGHT CIRCUS     ");
l3=new JLabel("            NEW DELHI           ");
l4=new JLabel(" DATE AND TIME : "+d2);


JF1=new reservation("RESERVATION");
JF2=new cancellation("CANCELLATION",0);

JF4=new refund("REFUND FOR CANCELLATION PASSENGER");
JF5=new report("REPORT FOR AIRWAYS");



l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f1);



l1.setBackground(Color.gray);
l1.setForeground(Color.blue);

l2.setBackground(Color.gray);
l2.setForeground(Color.blue);

l3.setBackground(Color.gray);
l3.setForeground(Color.blue);


b1.setBackground(Color.gray);
b1.setForeground(Color.white);

b2.setBackground(Color.gray);
b2.setForeground(Color.white);

b3.setBackground(Color.gray);
b3.setForeground(Color.white);

b4.setBackground(Color.gray);
b4.setForeground(Color.white);

b5.setBackground(Color.gray);
b5.setForeground(Color.white);

b6.setBackground(Color.gray);
b6.setForeground(Color.white);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);


contentpane.add(l1);
contentpane.add(l2);
contentpane.add(l3);
contentpane.add(l4);
contentpane.add(b1);
contentpane.add(b2);
contentpane.add(b3);
contentpane.add(b4);
contentpane.add(b5);
contentpane.add(b6);

}
public Insets getInsets()
{
return new Insets(20,10,10,20);
}
public void actionPerformed(ActionEvent e)
{
String s=new String();
s=e.getActionCommand();

if(s.equals("RESERVATION")||s.equals("                       RESERVATION                    "))
{
JF1.setVisible(true);
JF1.setSize(700,620);
}

if(s.equals("CANCELLATION")||s.equals("                       CANCELLATION                   "))
{

d=new dialog(this,"hello",true);
d.setSize(400,100);
d.setLocation(150,150);
d.setVisible(true);


}

if(s.equals("                           TICKETTING                       "))
{
d3=new dialog3(this,"hello",true);
d3.setSize(400,100);
d3.setLocation(150,150);
d3.setVisible(true);


}

if(s.equals("                              REFUND                          "))
{

d4=new dialog4(this,"hello",true);
d4.setSize(400,100);
d4.setLocation(150,150);
d4.setVisible(true);
  
}


if(s.equals("                              REPORT                          "))
{
JF5.setVisible(true);
JF5.setSize(700,520);
}

if(s.equals("                                  EXIT                              "))
{
System.exit(0);     
}

}


public static void main(String args[])
{
havai1 h=new havai1();
h.setVisible(true);
h.setSize(700,520);
}

}


