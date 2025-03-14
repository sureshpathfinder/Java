import java.applet.Applet;
import java.awt.*;
public class font extends Applet
{
Font f=new Font("CourierNew",Font.BOLD,20);
public void paint(Graphics g)
{
Font f1=g.getFont();
String s=f1.getName()+" , "+String.valueOf(f1.getSize());
g.drawString(s,30,40);
FontMetrics fm=g.getFontMetrics();
s="height "+String.valueOf(fm.getHeight())+" ascent "+String.valueOf(fm.getAscent()); g.drawString(s,30,70);
s="Leading "+String.valueOf(fm.getLeading())+" Desent "+String.valueOf(fm.getDescent());
g.drawString(s,30,100);
g.setFont(f);
s=f.getName()+" , "+String.valueOf(f.getSize());
g.drawString(s,30,140);
fm=g.getFontMetrics();
s="height "+String.valueOf(fm.getHeight())+" ascent "+String.valueOf(fm.getAscent()); g.drawString(s,10,200);
s="Leading "+String.valueOf(fm.getLeading())+" Desent "+String.valueOf(fm.getDescent());
g.drawString(s,10,240);
}
}
/*<applet code="font.class" height=300 width=400></applet>*/