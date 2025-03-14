import java.awt.*;
public class GridDemo extends java.applet.Applet
{
public void init()
{
setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,24));
setLayout(new GridLayout(3,4,10,1));
for(int i=1;i<=12;i++)
{
add(new Button(" "+i));
}
}
}
//<applet code="GridDemo.class" height=500 width=500></applet>
 