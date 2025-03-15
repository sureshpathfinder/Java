import java.applet.Applet;

import java.awt.*;

public class Drawings extends Applet
{
	public void init()
	{
		setBackground(new Color(180,108,10));	
		setForeground(new Color(50,190,100));
	}
	public void paint(Graphics g)
	{
		g.drawLine(50,50,200,50);
		g.drawLine(50,50,50,200);
		g.drawLine(50,200,200,50);
		g.drawRect(120,200,200,30);
		g.drawRect(170,50,30,200);
		g.setColor(new Color(0,78,100));
		g.fillRect(350,50,70,300);			
		g.setColor(new Color(100,255,100));
		g.drawRoundRect(50,300,180,80,20,30);
		g.fillRoundRect(50,410,180,80,20,30);
		g.drawOval(350,300,200,70);
		g.drawOval(350,400,190,190);
		g.fillOval(450,400,190,190);
		g.drawArc(440,50,200,150,0,180);
		g.drawArc(640,50,200,150,180,180);
		g.fillArc(640,250,200,200,0,270);
		g.draw3DRect(750,50,200,200,false);
		g.drawRect(750,280,200,200);
	}
	
}