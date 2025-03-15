import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;

public class messagePane extends JPanel implements ActionListener
{
public messagePane()
{
JButton b1=new JButton("Click Here");
b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent e)
{
JOptionPane.showMessageDialog(this,"Hai , Look at this Informationmessage dialog","Information Message Pane",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(this,"Hai , Look at this Error message dialog","Information Message Pane",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(this,"Hai , Look at this Question message dialog","Information Message Pane",JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(this,"Hai , Look at this Plain  message dialog","Information Message Pane",JOptionPane.PLAIN_MESSAGE);

}
public Dimension getPreferredSize()
{
return new Dimension(100,60);
}
public static void main(String args[])
{
JFrame frame=new JFrame("Info");
messagePane panel=new messagePane();
frame.setForeground(Color.black);
frame.setBackground(Color.lightGray);
frame.addWindowListener(new WindowCloser());
frame.getContentPane().add(panel,"Center");
frame.setSize(panel.getPreferredSize());
frame.setVisible(true);
}
}

class WindowCloser extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
Window win=e.getWindow();
win.setVisible(false);
System.exit(0);
}
}
