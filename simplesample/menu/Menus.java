import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Menus extends JPanel implements ActionListener,MenuListener
{
JTextField field;
public Menus(JFrame frm)
{
JMenuBar bar=new JMenuBar();
JMenu menu=new JMenu("Employee names");
JMenuItem tmp;
setBackground(Color.gray);
setLayout(new BorderLayout());
menu.addActionListener(this);
tmp=new JMenuItem("Ajay");
tmp.addActionListener(this);
tmp.setActionCommand("Ajay");
menu.add(tmp);
tmp=new JMenuItem("Arun");
tmp.addActionListener(this);
tmp.setActionCommand("Arun");
menu.add(tmp);
tmp=new JMenuItem("Ashok");
tmp.addActionListener(this);
tmp.setActionCommand("Ashok");
menu.add(tmp);
tmp=new JMenuItem("Quit");
tmp.addActionListener(this);
tmp.setActionCommand("Quit");
menu.add(tmp);
bar.add(menu);
frm.setJMenuBar(bar);
field=new JTextField(10);
field.addActionListener(this);
field.setActionCommand("Text Field Activated");
add(field,"South");
}
public void actionPerformed(ActionEvent e)
{
String cmd;
cmd=e.getActionCommand();
field.setText("Action :"+cmd);
if(cmd.equals("Quit"))
{
System.exit(0);
}
}
public void menuSelected(MenuEvent e)
{
field.setText("Menu selected");
}
public void menuDeselected(MenuEvent e)
{
field.setText("menu deselected");
}
public void menuCanceled(MenuEvent e)
{
field.setText("menu canceled");
}
public Dimension getPreferredSize()
{
return new Dimension(200,100);
}
public static void main(String args[])
{
JFrame frame=new JFrame("Menus");
Menus panel=new Menus(frame);
frame.setForeground(Color.black);
frame.setBackground(Color.gray);
frame.addWindowListener(new WindowCloser());
frame.getContentPane().add(panel,"Center");
frame.setSize(panel.getPreferredSize());
frame.setVisible(true);
}
}
class WindowCloser extends WindowAdapter
{
public void WindowClosing(WindowEvent e)
{
Window win=e.getWindow();
win.setVisible(false);
System.exit(0);
}
}
 


 