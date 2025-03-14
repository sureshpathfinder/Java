import java.applet.Applet;
import java.awt.*;
public class clip extends Applet
{
public void paint(Graphics g)
{
g.clipRect(10,10,100,150);
g.fillOval(0,0,200,200);
}
}
/*<applet code="clip.java" height=400 width=400></applet>*/