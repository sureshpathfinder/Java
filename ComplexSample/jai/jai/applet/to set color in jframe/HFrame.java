import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HFrame extends JFrame implements ActionListener
{
	JButton jb;
	JLabel jl;
	Label l;
	Button b;
	public HFrame(String str)
	{	
		super(str);
		setLayout(null);
		Container c=this.getContentPane();
		c.setBackground(Color.pink);
		b=new Button("HELLO");
		jb=new JButton("HEY");
		l=new Label("AWT LABEL");
		jl=new JLabel("SWING LABEL");
		jb.setBounds(100,100,100,20);
		b.setBounds(210,100,100,20);
		l.setBounds(100,140,200,20);
		jl.setBounds(310,140,200,20);
		jb.addActionListener(this);
		b.addActionListener(this);
		add(jb);
		add(l);
		add(jl);
		add(b);
	}
	public  void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			Container c=this.getContentPane();
			c.setBackground(Color.green);
			l.setText(b.getLabel()+" is clicked");
			jl.setText(b.getLabel()+" is clicked");
		}
		if(ae.getSource()==jb)
		{
			Container c=this.getContentPane();
			c.setBackground(Color.cyan);
			l.setText(jb.getLabel()+" is clicked");
			jl.setText(jb.getLabel()+" is clicked");
			Hello h=new Hello();
			h.show();
			h.setSize(200,200);
		}
	}
	public static void main(String args[])
	{
		HFrame hf=new HFrame("MY WINDOW");
		hf.show();
		hf.setSize(700,700);	
	}	
}