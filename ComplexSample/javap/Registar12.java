import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
 
public class Registar12 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13; 
 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
 JCheckBox cb1,cb2,cb3;
 JRadioButton r1,r2;
 ButtonGroup bg;
 boolean bbb,ccc;
 String male,female;
 JComboBox c1,c2,c3;
 JButton b1,b2;
 String name,fathername,address,city;
 String religion,community,course;
 String tam,eng, hin;
 boolean bn1,bn2,bn3; 
 int age,date1,month1,year1,percent1,phoneno;

 public Registar12()
 {
   JPanel  con=new JPanel();
  con.setLayout(new FlowLayout());
  l1=new JLabel("NAME:");
  l1.setBounds(100,40,145,20);
  l2=new JLabel("FATHER'S NAME:");
  l2.setBounds(100,70,145,20);
  l3=new JLabel("AGE:");
  l3.setBounds(100,100,145,20);
  l4=new JLabel("SEX");
  l4.setBounds(100,130,145,20);
  l5=new JLabel("D.O.B:");
  l5.setBounds(100,160,145,20);
  l6=new JLabel("RELIGION:");
  l6.setBounds(100,190,145,20);
  l7=new JLabel("COMMUNITY:");
  l7.setBounds(100,220,145,20);
  l8=new JLabel("COURSE:");
  l8.setBounds(100,250,145,20);
  l9=new JLabel("ADDRESS:");
  l9.setBounds(100,280,145,20);
  l10=new JLabel("PHONE NO:");
  l10.setBounds(100,310,145,20);
  l11=new JLabel("CITY");
  l11.setBounds(100,340,145,20);
  l12=new JLabel("LANGUAGES KNOWN:");
  l12.setBounds(100,370,145,20);
  l13=new JLabel("% of MARKS");
  l13.setBounds(100,400,145,20);

  t1=new JTextField(10);
  t1.setBounds(275,40,130,20);
  t2=new JTextField(10);
  t2.setBounds(275,70,130,20);
  t3=new JTextField(10);
  t3.setBounds(275,100,130,20);
  t4=new JTextField(10);
  t4.setBounds(275,160,80,20);
  t5=new JTextField(10);
  t5.setBounds(400,160,80,20);
  t6=new JTextField(15);
  t6.setBounds(525,160,80,20);
  t7=new JTextField(10);
  t7.setBounds(275,280,130,20);
  t8=new JTextField(10);
  t8.setBounds(275,310,130,20);
  t9=new JTextField(10);
  t9.setBounds(275,340,130,20);
  t10=new JTextField(5);
  t10.setBounds(275,400,130,20);

  cb1=new JCheckBox("TAMIL");
  cb1.setBounds(275,370,80,20);
  cb2=new JCheckBox("ENGLISH");
  cb2.setBounds(400,370,80,20);
  cb3=new JCheckBox("HINDI");
  cb3.setBounds(525,370,80,20);
  
  bg=new ButtonGroup();
  r1=new JRadioButton("MALE"); 
  r1.setBounds(275,130,100,20);
  r2=new JRadioButton("FEMALE"); 
  r2.setBounds(375,130,100,20);
  bg.add(r1);bg.add(r2);
  
  c1=new JComboBox();
  c1.setBounds(275,190,130,20); 
  c1.addItem("HINDUISM");
  c1.addItem("ISLAM"); 
  c1.addItem("CHRISTAINITY"); 
  c1.addItem("BUDDHISM"); 
  c1.addItem("JAINISM"); 

  c2=new JComboBox();
  c2.setBounds(275,220,130,20);
  c2.addItem("BC"); 
  c2.addItem("MBC"); 
  c2.addItem("SC"); 
  c2.addItem("ST"); 
  c2.addItem("OC");
  
  c3=new JComboBox();
  c3.setBounds(275,250,130,20);
  c3.addItem("B.COM"); 
  c3.addItem("B.A HISTORY"); 
  c3.addItem("B.C.A"); 
  c3.addItem("B.Sc PHYSICS"); 
  c3.addItem("B.Sc MATHS");
  c3.addItem("M.C.A");  
  c3.addItem("M.B.A ");  
  c3.addItem("M.Sc IT"); 

  b1=new JButton("INSERT");
  b1.setBounds(150,450,100,20);
  b2=new JButton("CLEAR"); 
  b2.setBounds(275,450,100,20);
 
  con.add(l1);con.add(t1);con.add(l2);con.add(t2);
  con.add(l3);con.add(t3);con.add(l4);con.add(r1);con.add(r2);
  con.add(l5);con.add(t4);con.add(t5);con.add(t6);
  con.add(l6);con.add(c1);con.add(l7);con.add(c2);
  con.add(l8);con.add(c3);
  con.add(l9);con.add(t7);con.add(l10);con.add(t8);
  con.add(l11);con.add(t9);
  con.add(l12);con.add(cb1);con.add(cb2);con.add(cb3);
  con.add(l13);con.add(t10);
  con.add(b1);con.add(b2);

  b1.addActionListener(this);
  b2.addActionListener(this);
  
  con.setLayout(null);
  getContentPane().add(con);
 }
  
 
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getActionCommand().equals("INSERT"))
  {
   name=t1.getText().trim();
   System.out.println(name);
   fathername=t2.getText().trim();
   System.out.println(fathername);
   age=Integer.parseInt(t3.getText().trim());  
   System.out.println(age);
   bbb=r1.isSelected();
   ccc=r2.isSelected();
   if(bbb)
      male="true";
   else
      male="false";
   if(ccc)
      female="true";
   else
      female="false";
   System.out.println(bbb);
   date1=Integer.parseInt(t4.getText().trim());   
   System.out.println(date1);
   month1=Integer.parseInt(t5.getText().trim());   
   System.out.println(month1);
   year1=Integer.parseInt(t6.getText().trim());   
   System.out.println(year1);
   religion=(String)c1.getSelectedItem();
   System.out.println(religion);
   community=(String)c2.getSelectedItem();
   System.out.println(community);
   course=(String)c3.getSelectedItem();
   System.out.println(course);
   address=t7.getText().trim();
   System.out.println(address);
   phoneno=Integer.parseInt(t8.getText().trim());
   System.out.println(phoneno);
   city=t9.getText().trim();
   System.out.println(city);
   bn1=cb1.isSelected();   
   bn2=cb2.isSelected();
   bn3=cb3.isSelected();
   if(bn1)
      tam="true";
   else
      tam="false";
   if(bn2)
      eng="true";
   else
      eng="false";
   if(bn3)
      hin="true";
   else
      hin="false";
   percent1=Integer.parseInt(t10.getText().trim());
   System.out.println(percent1);

   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:hai","sa","");
    PreparedStatement ps=con.prepareStatement("update Registration set fathername=?,age=?,male=?,female=?,date1=?,month1=?,year1=?,religion=?,community=?,course=?,address=?,phoneno=?,city=?,tam=?,eng=?,hin=?,percent1=? where name='"+name+"'");
	

	ps.setString(1,fathername);System.out.println("2");	
	ps.setInt(2,age);System.out.println("3");	
	ps.setString(3,male);	System.out.println("4");
	ps.setString(4,female);	System.out.println("5");
	ps.setInt(5,date1);	System.out.println("6");
	ps.setInt(6,month1);	System.out.println("7");
	ps.setInt(7,year1);	System.out.println("8");
	ps.setString(8,religion);	System.out.println("9");
	ps.setString(9,community);	System.out.println("10");
	ps.setString(10,course);	System.out.println("11");
	ps.setString(11,address);	System.out.println("12");
	ps.setInt(12,phoneno);	System.out.println("13");
	ps.setString(13,city);	System.out.println("14");
	ps.setString(14,tam);	System.out.println("15");
	ps.setString(15,eng);	System.out.println("16");
	ps.setString(16,hin);	System.out.println("17");
	ps.setInt(17,percent1);	System.out.println("18");


    int i=ps.executeUpdate();
    if(i>0)
      JOptionPane.showMessageDialog(this,"Updated");
    else
      JOptionPane.showMessageDialog(this,"Not Updated");
   }
   
   catch(Exception e)
   {
     e.printStackTrace();
   }
   }

   if(ae.getActionCommand().equals("CLEAR"))
   {
    t1.setText(" ");     
    t2.setText(" "); 
    t3.setText(" ");      
    t4.setText(" ");     
    t5.setText(" ");
    t6.setText(" ");
    t7.setText(" ");     
    t8.setText(" ");    
    t9.setText(" ");
    t10.setText(" ");
   }
  }
  public static void main(String args[])
  {
   Registar12 ss=new Registar12();
   ss.setVisible(true);
   ss.setSize(300,300);
  }
}




