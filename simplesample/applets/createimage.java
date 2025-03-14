import java.applet.Applet;
import java.awt.*;
public class createimage extends Applet
{
Image img;
public void paint(Graphics g)
{
Graphics g1=g.create(10,10,100,100);
g1.drawString("Within the image area ",10,10);
g.drawString("Within the applet area",110,110);

}
}
/*<applet code="createimage.java" height=400 width=400></applet>*/