import java.applet.*;
import java.awt.*;

public class panels extends Applet
{
Panel values;
TextField red = new TextField(5);
TextField green = new TextField(5);
TextField blue = new TextField(5);
Canvas mixture;
public void init()
{
setLayout(new GridLayout(1,2,10,10));
mixture = new Canvas();
mixture.setBackground(new Color(0,0,0));
red.setText("0");
green.setText("0");
blue.setText("0");
values = new Panel();
values.setLayout(new GridLayout(3,2,10,10));
values.add(new Label("Red Value:"));
values.add(red);
values.add(new Label("Green Value:"));
values.add(green);
values.add(new Label("Blue Value:"));
values.add(blue);
add(values);
add(mixture);
}
public boolean action(Event evt, Object whatAction)
{
if((evt.target instanceof TextField))
{
setcolor();
return true;
}
return false;
}
public void setcolor()
{
String r = red.getText();
String g = green.getText();
String b = blue.getText();
Color c = new Color(Integer.parseInt(r),Integer.parseInt(g),Integer.parseInt(b));
mixture.setBackground(c);
mixture.repaint();
}
public Insets insets()
{
return new Insets(10,10,10,10);
}
}