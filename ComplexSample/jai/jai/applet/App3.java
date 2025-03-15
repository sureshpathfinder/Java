import java.applet.*;
import java.awt.*;
//<applet code="App3" height=500 width=500></applet>
public class App3 extends Applet
{
	Color c1,c2;
	public void init()
	{
		c1=new Color(95,210,185);
		setBackground(c1);	
	}
	public void paint(Graphics g)
	{
		c2=new Color(165,45,80);
		setForeground(c2);
		g.drawRect(170,40,100,70);
                g.fillRect(50,40,100,70);
		g.drawRoundRect(280,40,100,70,30,40);
                g.fillRoundRect(50,150,100,70,30,40);
                g.drawOval(ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ