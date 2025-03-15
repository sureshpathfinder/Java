import java.awt.*;
import java.applet.*;

public class rand extends Applet implements Runnable
{
	Thread t = null;
	int ps=0;
	int re,gr,bl;
	public void start()
	{
		t= new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			for(ps=0;ps<getSize().width;ps+=5)
			{
re = (int)(Math.random()*255);
gr = (int)(Math.random()*255);
bl = (int)(Math.random()*255);
repaint();
				try
				{
                                    t.sleep(200);
				}
				catch(InterruptedException e)
				{

				}

			}
		}
	}


	public void stop()
	{
		t.stop();
		t = null;
	}

	public void paint(Graphics g)
	{
            g.setColor(new Color(re,gr,bl));
            g.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,30));
            g.drawString("Hello Students",ps+85,85);
	}
}


//<applet code=rand width=400 height=400></applet>