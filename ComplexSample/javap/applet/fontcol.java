import java.awt.*;
import java.applet.*;

public class fontcol extends Applet
{
	Font f,f1;
	public void init()
	{
		f = new Font("Garmond",Font.BOLD,25);	
f1 = new Font("Courier",Font.BOLD+Font.ITALIC,18);		
		setBackground(Color.yellow);
	}
	
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString("GARMOND FONT",75,50);
		g.setFont(f1);
		g.setColor(new Color(145,67,134));
		g.drawString("Courier Font",175,150);		
	}
}
