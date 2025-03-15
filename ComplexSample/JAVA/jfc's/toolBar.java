import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class toolBar extends JFrame implements ActionListener
{
JToolBar mytool;
public toolBar()
{
setTitle("JToolBar example");
JPanel jp=(JPanel)getContentPane();
jp.setLayout(new BorderLayout());
mytool=new JToolBar();
mytool.setBorder(new BevelBorder(BevelBorder.LOWERED));
JButton b=new JButton(new ImageIcon("C:\\BDK1.1\beans.gif"));
mytool.add(b);
b.setToolTipText("Beans");
b.setMargin(new Insets(0,0,0,0));
b.addActionListener(this);
b.setActionCommand("Beans");
jp.add("North",mytool);
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Toolbar button pressed.command string:"+e.getActionCommand());
}
public static void main(String args[])
{
toolBar tb=new toolBar();
tb.setForeground(Color.black);
tb.setBackground(Color.lightGray);
tb.setVisible(true);
}
}
 