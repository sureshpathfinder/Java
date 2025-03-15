import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class inputDialog extends JPanel implements ActionListener
{
public inputDialog()
{
JButton b1=new JButton("click here");
b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent e)
{
String output;
output=JOptionPane.showInputDialog(this,"Enter your favourite place");
if((output==null)||(output.length()==0))
{
System.out.println("zero data:");
System.out.println("Enter data in the text field");
}
else
{
System.out.println("Entered data is:"+output);
}
}
public Dimension getPreferredSize()
{
return new Dimension(100,60);
}
public static void main(String args[])
{
JFrame frame=new JFrame("Input Dialog");
inputDialog p=new inputDialog();
frame.setForeground(Color.black);
frame.setBackground(Color.lightGray);
frame.addWindowListener(new WindowCloser());
frame.getContentPane().add(p,"Center");
frame.setSize(p.getPreferredSize());
frame.setVisible(true);
}


public void windowClosing(WindowEvent e)
{
Window w=e.getWindow();
w.setVisible(false);
System.exit(0);
}
}
 