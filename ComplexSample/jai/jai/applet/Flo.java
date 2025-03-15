import javax.swing.*;
import java.awt.*;


public class Flo extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	FlowLayout f;
	public Flo()
	{
		super("LayOut");
		f=new FlowLayout(FlowLayout.LEFT,10,10);
		setLayout(f);	
		b1=new JButton("one");
		b2=new JButton("two");
		b3=new JButton("three");
		b4=new JButton("four");
		b5=new JButton("five");
		b6=new JButton("six");
		b7=new JButton("seven");
		b8=new JButton("eight");
		add(b1);add(b2);add(b3);add(b4);add(b5);
		add(b6);add(b7);add(b8);
	}
	public static void main(String ar[])
	{
		Flo fl=new Flo();
		fl.show();
		fl.setSize(400,300);
	}
}
