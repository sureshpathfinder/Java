import java.awt . * ;
import java.applet . * ;
import java.awt .event . * ;
//<applet code="scroll.class" width=300 height=300></applet>
public class scroll extends Applet implements AdjustmentListener
{
Scrollbar red = new Scrollbar (Scrollbar .HORIZONTAL,0,100,0,355) ;
Scrollbar green = new Scrollbar (Scrollbar .HORIZONTAL,0,100,0,355) ;
Scrollbar blue = new Scrollbar (Scrollbar .HORIZONTAL,0,100,0,355) ;
Label l1 = new Label ( ) ;

Label l2=new Label();
public void init ( )
{
setLayout (new GridLayout (4,1) ) ;

add(l1);
add( red) ;
add(green) ;
add(blue);
add(l2);
red.addAdjustmentListener ( this) ;
green.addAdjustmentListener ( this) ;
blue.addAdjustmentListener ( this) ;
}
public void adjustmentValueChanged
(AdjustmentEvent e)
{
int r = red.getValue( ) ;
int g = green.getValue( ) ;
int b = blue.getValue( ) ;
Color nc = new Color ( r ,g,b) ;
l1.setBackground(nc) ;
l2.setBackground(nc) ;
showStatus( "Red: "+r+"Green: "+g+"Blue: "+b) ;
}
}