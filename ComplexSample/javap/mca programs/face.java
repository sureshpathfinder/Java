import java.awt.*;
import java.applet.*;
public class face extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawOval(40,40,200,100);
g.drawOval(80,70,20,20);
g.drawOval(180,70,20,20);
g.drawArc(105,95,70,40,0.-180);
g.drawLine(140,70,140,110);
g.setColor(Color.black);
g.fillOval(85,75,10,10);
g.fillOval(185,75,10,10);
}
}
//<applet code=face width=400 height=200></applet>