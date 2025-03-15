import java.awt.*;
public class FontDemo extends Frame
{
	
	Font f1,f2,f3;
	String s1,s2,s3;
	FontDemo(String s)
	{
		
		super(s);
		f1=new Font("Arial Black",Font.BOLD,40);
		f2=new Font("Cambria",Font.ITALIC,50);
		f3=new Font("Corbel",Font.BOLD|Font.ITALIC,60);
		s1="HELLO";
		s2="HAI";
		s3="HEY";
	}
	public void paint(Graphics g)
	{
		g.setFont(f1);
		g.setColor(Color.RED);
		g.drawString(s1,40,140);
		g.setFont(f2);
		g.setColor(Color.ORANGE);
		g.drawString(s2,40,340);
		g.setFont(f3);
		g.setColor(Color.GREEN);
		g.drawString(s3,40,440);
	}
	public static void main(String args[])
	{
		FontDemo f=new FontDemo("FONT DEMO");
		f.show();
		f.setSize(500,500);
	}	
}