import java.awt.*;
import javax.swing.*;

public class jtool extends JFrame
  
{
  
public jtool()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
JToolBar jt=new JToolBar();
JButton b=new JButton("Enter the name");
JTextField t=new JTextField(10);
JCheckBox jc=new JCheckBox("Entered");
jt.setBackground(Color.yellow);
jt.add(b);
jt.add(t);
jt.add(jc);
c.add(jt);
}
public static void main(String args[])
{
jtool j=new jtool();
j.setSize(300,300);
j.setVisible(true);
}
}
