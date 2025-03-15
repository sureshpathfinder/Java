import javax.swing.*;
import java.awt.*;


public class Border extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	BorderLayout b;
	public Border()
	{
		super("LayOut");
		b=new BorderLayout(10,10);
		setLayout(b);	
		b1=new JButton("one");
		b2=new JButton("two");
		b3=new JButton("three");
		b4=new JButton("four");
		b5=new JButton("five");
		/*b6=new JButton("six");
		b7=new JButton("seven");
		b8=new JButton("eight");*/
		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.NORTH);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.EAST);
		add(b5,BorderLayout.WEST);
		//add(b6);add(b7);add(b8);
	}
	public Insets getInsets()
	{
		Insets i=new Insets(10,20,10,50);
		return i; 
	}
	public static void main(String ar[])
	{
		Border fl=new Border();
		fl.show();
		fl.setSize(400,300);
	}
}
