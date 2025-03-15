import java.awt.*;
import java.applet.*;
//<applet code="Controls.class" height=500 width=500></applet>
public class Controls extends Applet
{
	Label l1;
	public void init()
	{
		//setLayout(null);
		l1=new Label("Enter",Label.LEFT);
		TextField tf=new TextField("DFKJHGSDFJHSDG");
		tf.setEchoChar('*');
		Button b = new Button("ADD");
		Checkbox c = new Checkbox("AAA",true);
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("MALE",false,cg);
		Checkbox c2 = new Checkbox("FEMALE",cg,false);
		Choice ch = new Choice();
		ch.add("India");
		ch.add("Germany");
		ch.add("Spain");
		List l = new List(3,true);
		l.add("aaaaa");
		l.add("bbbbb");
		l.add("ccccc");
		l.add("ddddd");
		l.add("eeeee");
		Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 10);
		Scrollbar s1 = new Scrollbar(Scrollbar.VERTICAL, 5, 1, 0, 10);
		TextField t = new TextField("aaaaa",7);
		t.setEditable(true);
		TextArea ta = new 		TextArea("hgahjdgadhasgdhjsagdhsdgjhasdgshd",10,30);
		/*ta.setEditable(true);
		l1.setBounds(50, 20, 30, 30);
		t.setBounds(90,20,150,20);
		c.setBounds(50,50,90,20);
		c1.setBounds(160,50,120,20);
		c2.setBounds(270, 50, 120, 20);
		ch.setBounds(50,80,120,30);
		l.setBounds(50,110,200,100);
		s.setBounds(50,300,300,20);
		s1.setBounds(350,20,20,300);
		ta.setBounds(400,20,100,70);*/
		add(s1);
		add(s);	
		add(l);
		add(ch);
		add(c2);
		add(c1);
		add(c);
		add(t);
		add(l1);add(ta);
		add(tf);add(b);
	}
}