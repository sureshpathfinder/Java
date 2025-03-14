import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Confirm extends JPanel implements ActionListener
{
public Confirm()
{
JButton b1=new JButton("click here");
b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent e)
{
int result;
result=JOptionPane.showConfirmDialog(this,"continue?");
switch(result)
{
case JOptionPane.YES_OPTION:
System.out.println("yes button was pressed");
break;
case JOptionPane.NO_OPTION:
System.out.println("No button was pressed");
case JOptionPane.CANCEL_OPTION:
System.out.println("cancel button was pressed");
break;
case JOptionPane.CLOSED_OPTION:
System.out.println("Dialog closed");
break;
}
}
public Dimension getPreferredSize()
{
return new Dimension(100,60);
}
public static void main(String args[])
{
JFrame frame=new JFrame("Confirm Dialog");
Confirm p=new Confirm();
frame.setForeground(Color.black);
frame.setBackground(Color.lightGray);
frame.addWindowListener(new WindowCloser());
frame.getContentPane().add(p,"Center");
frame.setSize(p.getPreferredSize());
frame.setVisible(true);
}
}
class WindowCloser extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
Window w=e.getWindow();
w.setVisible(false);
System.exit(0);
}
}
 