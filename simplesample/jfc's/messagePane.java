import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
public class messagePane extends JPanel implements ActionListener
{
public messagePane()
{
JButton b1=new JButton("click here");
b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent e)
{
JOptionPane.showMessageDialog(this,"Hai,look at this message dialog","Informational Message Pane",JOptionPane.INFORMATION_MESSAGE);
}
public Dimension getPreferredSize()
{
return new Dimension(100,60);
}
public static void main(String args[])
{
JFrame frame=new JFrame("Info");
messagePane p=new messagePane();
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
 