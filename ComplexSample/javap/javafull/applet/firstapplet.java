import java.awt.*;
import java.applet.*;
public class firstapplet extends Applet
{
public firstapplet()
{
}
public void init()
{
System.out.println("Init method");
}

public void start()
{
System.out.println("start method");
}
public void stop()
{
System.out.println("stop method");
}
public void paint(Graphics g)
{
g.drawString("Welcome To Applet",100,100);
}
public void destroy()
{
System.out.println("Destray method");
}
}

//<applet code=app1 height=200 width=200></applet>


