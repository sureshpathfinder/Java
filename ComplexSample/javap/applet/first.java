import java.awt.*;
import java.applet.*;

public class first extends Applet
{
	public void init()
	{
		System.out.println("init");
	}
	public void start()
	{
		System.out.println("start");
	}
	public void paint(Graphics g)
	{
		g.drawString("WELCOME TO APPLET",150,50);
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
}
