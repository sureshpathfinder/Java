import javax.swing.*;
import java.awt.*;
import java.applet.*;
//<applet code="SwingDemo.class" height="500" width="500"></applet>
public class SwingDemo extends JApplet
{
	JLabel l1,l2;
	JButton b1;
	JCheckBox c1,c2;
	JComboBox ch;
	JList lt;
	JScrollBar s1,s2;
	JTextField tf1,tf2;
	JTextArea ta;
	JRadioButton r1,r2;
	String str[]={"HAMAM","COLGATE","ORALB","GLITTE","AXE"};
	public void init()
	{
		setLayout(new FlowLayout());
		l1=new JLabel();
		l2=new JLabel("Its Label 2");
		l1.setText("Its Label1");
		b1=new JButton("CLICK ME");
		c1=new JCheckBox("SELECT");
		c2=new JCheckBox();
		c2.setLabel("HELLO");
		ch=new JComboBox();
		ch.addItem("INDIA");
		ch.addItem("CHINA");
		ch.addItem("AMERICA");
		lt=new JList();
		lt.setListData(str);
		r1=new JRadioButton("MALE");
		r2=new JRadioButton("FEMALE");
		s1=new JScrollBar(JScrollBar.VERTICAL,0,30,0,250);
		s2=new JScrollBar(JScrollBar.HORIZONTAL,10,30,0,250);
		tf1=new JTextField(6);
		tf2=new JTextField();                                                                     
		ta=new JTextArea("TYPE UR FEEDBACK",3,25);
		add(l1);add(l2);add(b1);add(c1);
		add(c2);add(ch);
		add(lt);add(s1);add(s2);add(tf1);
		add(tf2);add(ta);add(r1);add(r2);
}
}