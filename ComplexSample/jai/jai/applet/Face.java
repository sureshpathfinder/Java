import java.applet.*;
import java.awt.*;
//<applet code="Face" width=500 height=500></applet>
public class Face extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.pink);
		g.drawString("Be Happy",160,30);
		g.drawOval(150,70,60,60);
		g.drawOval(156,85,15,7);
		g.fillOval(162,87,5,5);
		g.drawOval(188,85,15,7);
		g.fillOval(194,87,5,5);	
		g.drawOval(178,91,5,15);
		g.drawArc(175,108,13,13,180,180);
	}	
	
}