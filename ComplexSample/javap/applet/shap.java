import java.awt.*;
import java.applet.*;

public class shap extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.yellow);
        int a[]={220,334,270,280,320};
        int b[]={325,240,358,380,345};
        Font  f = new Font("helvectica",Font.BOLD,25);
        g.setFont(f);
        g.drawString("Hello these are shapes in awt",250,50);
        g.fillOval(150,150,150,300);
        g.setColor(Color.red);
        g.drawRect(20,20,40,80);
        g.fillRect(20,20,40,80);
        g.setColor(Color.blue);
        g.drawOval(50,50,50,50);
        g.setColor(Color.green);
        g.drawRoundRect(80,80,120,120,45,45);
        g.fillRoundRect(80,80,120,120,45,45);
        g.setColor(new Color(130,70,175));
        g.drawLine(4,4,250,250);
        g.draw3DRect(400,400,100,100,false);
        g.setColor(Color.pink);
        g.fill3DRect(400,400,100,100,false);
        g.setColor(Color.lightGray);
        g.drawPolygon(a,b,5);
        g.fillPolygon(a,b,5);
    }
}



