import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Button extends JFrame implements ActionListener
{
JButton j1;
JButton j2;
public Button()
{
setTitle("Button Example");
JPanel c=(JPanel)getContentPane();
c.setLayout(new GridLayout(2,2));
j1=new JButton("Enabled");
j1.setMnemonic('E');
j1.addActionListener(this);
c.add(j1);
j2=new JButton("Disabled");
j2.setMnemonic('D');
j2.addActionListener(this);
c.add(j2);
j1.setEnabled(true);
myadapter myapp=new myadapter();
addWindowListener(myapp);
}
class myadapter extends WindowAdapter
{
public void WindowClosing(WindowEvent e)
{
System.exit(0);
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==j1)
{
setTitle("First button clicked");
}
else if(e.getSource()==j2)
{
setTitle("second button clicked");
}
}
public static void main(String args[])
{
Button b=new Button();
b.setSize(100,100);
b.setVisible(true);
}
}

 