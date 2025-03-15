import java.awt.*;
import java.applet.*;
/*<applet code="Jay.class" height=500 width=500>
</applet>*/
public class Jay extends Applet
{
Image a;
public void init()
{
a=getImage(getCodeBase(),"Winter.jpg");
}
public void paint(Graphics g)
{
try
{
for(int i=10;i<=500;i+=10)
{
g.drawImage(a,400,150,(100+i),(100+i),this);
Thread.sleep(100);
}
}
catch(Exception e)
{
}
}
}