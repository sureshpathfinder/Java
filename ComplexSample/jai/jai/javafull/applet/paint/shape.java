import java.applet.*;
import java.awt.*;

public class shape extends Applet
{
public void paint(Graphics g)
{
g.drawString("Drawing object",40,20);
g.drawLine(40,30,200,30);//drawLine(x1,y1,x2,y2);
g.drawRect(40,60,70,40);//drawRect(x,y,width,height);
g.drawRoundRect(240,60,70,40,5,5);//drawRoundRect(x,y,w1,h1,w2,h2);
g.fillRoundRect(40,120,70,40,10,20);
g.drawOval(240,120,70,40); //drawOval(x,y,w,h);
g.fillOval(40,180,70,40);
g.drawArc(140,180,70,30,0,180); //(x,y,w,h,start-angle,end-angle);

}
}
//<applet code=shape width=300 height=300></applet>
