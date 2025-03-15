import java.awt.*;
import java.applet.*;
//<applet code="ControlDemo.class" height="700" width="700"></applet>
public class ControlDemo extends Applet
{
	Label l1,l2;
	Button b1;
	Checkbox c1,c2,c5,c4;
	CheckboxGroup cbg;
	Choice ch;
	List lt;
	Scrollbar s1,s2;
	TextField tf1,tf2;
	TextArea ta;
	public void init()
	{
		
		l1=new Label();
		l2=new Label("Its Label 2");
		l1.setText("Its Label1");
		b1=new Button("CLICK ME");
		c1=new Checkbox("SELECT");
		c1.setState(true);
		c2=new Checkbox();
		c2.setLabel("HELLO");
		cbg=new CheckboxGroup();
		c4=new  Checkbox("check4",cbg,false);
		c5=new  Checkbox("check5",cbg,true);
		ch=new Choice();
		ch.add("INDIA");
		ch.add("CHINA");
		ch.add("AMERICA");
		lt=new List(3,true);
		lt.add("HAMAM");
		lt.add("COLGATE");
		lt.add("ORALB");
		lt.add("GLITTE");
		lt.add("AXE");
		s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,250);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,10,30,0,250);
		tf1=new TextField(6);
		tf2=new TextField();
		tf2.setEchoChar('*');                                                                                                                                                                                                                                                                              
		ta=new TextArea("TYPE UR FEEDBACK",3,25,4);
		//s1.setBounds(550,100,15,250);
		//s2.setBounds(30,310,250,15);
		add(l1);add(l2);add(b1);add(c1);
		add(c2);add(c4);add(c5);add(ch);
		add(lt);add(s1);add(s2);add(tf1);
		add(tf2);add(ta);
}
	public void paint(Graphics g)
	{
		g.drawString(cbg.getSelectedCheckbox().toString(),300,350);
		g.drawString(ch.getSelectedItem(),300,330);
		g.drawString(ch.getItem(2),300,380);
		
	}
}