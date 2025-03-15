import java.awt.*;
public class BorderDemo extends java.applet.Applet
{
public void init()
{
setLayout(new BorderLayout(5,5));
Button b1=new Button("Bottom of the Applet");
add("South",b1);
add("North",new Button("Top of the Applet"));
add("East",new Button("Right"));
add("West",new Button("Left"));
add("Center",new TextArea("Appears at the center"));
}
public Insets getInsets()
{
return new Insets(20,20,10,10);
}
}
//<applet code="BorderDemo.class" height=500 width=500></applet>
