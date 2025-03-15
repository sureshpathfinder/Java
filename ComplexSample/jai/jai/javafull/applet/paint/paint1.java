import java.applet.*;
import java.awt.*;
/*<applet code="paint1.class" width=300 height=300>
</applet>*/
public class paint1 extends Applet
{
Font f;
public void init()
{
	 f=new Font("TimesRoman",3,30);
}
        public void paint(Graphics g)
        {
	g.setFont(f);
	g.drawString("Hello Saravanan",50,50);

	
	}
}
