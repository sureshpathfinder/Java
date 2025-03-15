import java.applet.*;
import java.awt.*;
//<applet code="Font1.class" height=500 width=500></applet>
public class Font1 extends Applet
{
	Image img;
	public void init()
	{
		img = getImage(getCodeBase(),"hhh.jpg");
	}
	public void paint(Graphics g) throws Exception
	{
		g.drawString("FONT CLASS", 100, 20);
		try
		{
		for (int i = 100; i <= 1000; i += 50)
		{
			Thread.sleep(1000);
			g.drawImage(img, i, i, this);
		}
		}
		catch(Exception e)
		{
		}
	}
}