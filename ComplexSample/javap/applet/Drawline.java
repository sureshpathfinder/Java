import java.applet.*;
import java.awt.*;


public class Drawline extends Applet

{

public void init()
{
setBackground(Color.PINK);
setForeground(Color.YELLOW);

}

public void paint(Graphics g)

{

g.drawString("hi applet",400,100);

g.drawLine(45,90,100,18);
g.drawLine(45,90,45,18);
g.drawLine(200,90,200,18);
g.drawLine(45,90,45,18);

}

}

