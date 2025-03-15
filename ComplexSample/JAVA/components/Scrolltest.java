import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class Scrolltest extends Applet
{
Scrollbar red,green,blue;
public void init()
{
setLayout(new FlowLayout());
Color clr=getBackground();
red=new Scrollbar(Scrollbar.VERTICAL,clr.getRed(),0,0,255);
green=new Scrollbar(Scrollbar.HORIZONTAL,clr.getGreen(),0,0,255); 
blue=new Scrollbar(Scrollbar.HORIZONTAL,clr.getBlue(),0,0,255);
red.addAdjustmentListener(new Scroll1());
add(red);
green.addAdjustmentListener(new Scroll1());
add(green);
blue.addAdjustmentListener(new Scroll1());
add(blue);
}
class Scroll1 implements AdjustmentListener
{
public void adjustmentValueChanged(AdjustmentEvent e)
{
int r=red.getValue();
int g=green.getValue();
int b=blue.getValue();
Color clr=new Color(r,g,b);
setBackground(clr);
repaint();
}
}
public Insets getInsets()
{
return(new Insets(30,30,30,30));
}
}
//<applet code="Scrolltest.class" height=500 width=500></applet>  