import java.applet.*;
import java.awt.*;
/*<applet code="paint1.class" width=300 height=300>
</applet>*/
public class paint1 extends Applet
{
        public void paint(Graphics g)
        {
	g.drawString("Hello Saravanan",50,50);
//           	g.drawLine(50,70,150,70);
        g.fillRect(50,70,100,50);
//g.fillOval(150,150,50,50);
g.fillArc(150,150,50,50,0,180);
	
	}
}
