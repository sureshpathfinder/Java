import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="karthik.class" width=300 height=300>
</applet>*/
public class karthik extends Applet implements ActionListener
{
Button b;
public void init()
{
	b=new Button("Click");
	b.addActionListener(this);
	add(b);
}
public void actionPerformed(ActionEvent e)
{
	setBackground(Color.blue);
	showStatus("Hai Karthik");
}
}
