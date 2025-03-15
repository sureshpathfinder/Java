import java.applet.*;
import java.awt.*;
/*<applet code="ParamTestApplet.class"  width=500 height=500>

<PARAM NAME=name value="Ramesh">
</applet>*/

public class ParamTestApplet extends java.applet.Applet
{
Font f=new Font("TimesRoman",Font.BOLD,40);
String name;
public void init()
{
name=getParameter("name");
if(name==null)
name="friend";
name=("Have a nice day"+name);
}
public void paint(Graphics g)
{
g.setFont(f);
g.setColor(Color.darkGray);
g.drawString(name,50,50);
}
}




