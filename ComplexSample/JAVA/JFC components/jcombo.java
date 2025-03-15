import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class jcombo extends JFrame implements ItemListener
{
public jcombo()
{
setTitle("JComboBox Example");
JPanel c=(JPanel)getContentPane();
c.setLayout(new BorderLayout());
c.setBorder(new EmptyBorder(10,10,10,10));
JComboBox jcb=new JComboBox();
jcb.addItem("Green");
jcb.addItem("blue");
jcb.addItem("orange");
jcb.addItem("yellow");
jcb.addItemListener(this);
c.add("North",jcb);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getStateChange()==ItemEvent.SELECTED)
System.out.println((String)(e.getItem())+"was selected");
else
System.out.println((String)(e.getItem())+"was de-selected");
}
public static void main(String args[])
{
jcombo jc=new jcombo();
jc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
jc.setForeground(Color.black);
jc.setBackground(Color.lightGray);
jc.setVisible(true);
}
}
