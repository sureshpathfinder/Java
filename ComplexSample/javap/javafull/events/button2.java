//<applet code=button2 height=300 width=300></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class button2 extends Applet implements ActionListener
{
Button b1;
public void init()
{
b1=new Button("Click");
add(b1);
b1.addActionListener(this);
setBackground(Color.cyan);
}
public void actionPerformed(ActionEvent e)
{
showStatus("You pressed button");
}
}

