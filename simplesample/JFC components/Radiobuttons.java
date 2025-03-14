import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Radiobuttons extends JFrame implements ActionListener
{
JRadioButton j1,j2;
ButtonGroup g=new ButtonGroup();
public Radiobuttons()
{
setTitle("Radio Buttons Example");
JPanel c=(JPanel)getContentPane();
c.setLayout(new FlowLayout());
j1=new JRadioButton("Enabled");
j1.addActionListener(this);
j1.setActionCommand("one Activated");
j1.setSelected(true);
c.add(j1);
j2=new JRadioButton("Disabled");
j2.addActionListener(this);
j2.setActionCommand("Two Activated");
c.add(j2);
g.add(j1);
g.add(j2);
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
setTitle("First radio button enabled.");
j1.setEnabled(false);
j2.setEnabled(true);
}
else if(e.getSource()==j2)
{
setTitle("second radio button enabled.");
j1.setEnabled(true);
j2.setEnabled(false);
}
}
public static void main(String args[])
{
Radiobuttons rb=new Radiobuttons();
rb.setSize(100,100);
rb.setVisible(true);
}
}