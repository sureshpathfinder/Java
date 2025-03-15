import java.applet.Applet;
import java.awt.*;
public class image extends Applet
{
Image img;
public void paint(Graphics g)
{
img=getImage(getCodeBase(),"beans.gif");
g.drawImage(img,10,10,this);
}
}
/*<applet code="image.java" height=400 width=400></applet>*/