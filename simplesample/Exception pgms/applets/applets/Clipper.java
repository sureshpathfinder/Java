import java.awt.*;
import java.applet.*;
public class  Clipper extends Applet
{
public void paint(Graphics g)
{
g.clipRect(10,10,150,100);
g.setFont(new Font("TimesRoman",Font.ITALIC,20));
g.fillOval(100,60,80,80);
g.drawString("Happy New Year",50,30);
}
}

//<applet code="Clipper.class" width=300 height=150></applet>



































































