import java.awt.*;
import java.applet.*;
import java.net.*;
public class image extends Applet
  {
        Image img;
        URL u;	
        public void init()
        {
	try
	{
	u = new URL("file:/d:/");
                img=getImage(u,"Juggler.gif");
	}
	catch(Exception e) 
	{ 
	System.out.println(e); 
	}
        }
        public void paint(Graphics g)
        {
                g.drawImage(img,20,20,this);
        }
  }
//<applet code=image width=400 height=400></applet>