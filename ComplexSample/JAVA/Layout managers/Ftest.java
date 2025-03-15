import java.awt.*;
public class Ftest extends java.applet.Applet
{
String str[]={"one","Two","Three","Four","Five"};
public void init()
{
setLayout(new FlowLayout());
for(int i=0;i<str.length;i++)
{
add(new Button(str[i]));
}
}
}
//<applet code="Ftest.class" width=500 height=500></applet>
  