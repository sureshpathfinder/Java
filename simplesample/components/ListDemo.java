import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ListDemo extends Applet
{
List acts=new List();
TextField tf=new TextField(10);
Button add=new Button("add");
String stringlist[]={"one","two","three"};
public void start()
{
add(new Label("text"));
add(tf);
for(int i=0;i<stringlist.length;++i)
acts.addItem(stringlist[i]);
add(acts);
add.addActionListener(new Add());
add(add);
}
class Add implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
acts.addItem(tf.getText());
}
}
}
//<applet code="ListDemo.class" height=500 width=500></applet>