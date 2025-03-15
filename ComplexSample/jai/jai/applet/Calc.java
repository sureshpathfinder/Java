import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	int i=0;
	int a=50,b=70,c=40;
	public Calc(String s)
	{
		//super(s);
		setLayout(null);
		l1=new Label();
		b1=new Button("click me");
		l1.setBounds(50,50,200,30);
		b1.setBounds(50,350,100,30);
		b1.addActionListener(this);
		add(l1);add(b1);	

	}
	public void actionPerformed(ActionEvent ae)
	{
		i++;
		l1.setText("click"+i);
		setBackground(new Color(a,b,c));
		a+=90;b+=60;c+=30;
		a%=255;b%=255;c%=255;
		b1.setLabel("button clicked");
	}
	public static void main(String args[])
	{	
		Calc c=new Calc("CALCULATOR");
		c.setVisible(true);
		c.setSize(700,700);
	}
}
