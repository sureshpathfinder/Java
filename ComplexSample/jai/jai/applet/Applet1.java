import java.awt.*;
import java.applet.*;
/*<applet code="Applet1.class" width=1000 height=1000></applet>*/
public class Applet1 extends Applet
{
public void paint(Graphics g)
{
g.drawLine(200,150,200,800);
g.drawString("Example",500,50);
}
}