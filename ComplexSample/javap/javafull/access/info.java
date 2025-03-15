import java.awt.*;
import java.awt.event.*;
imort javax.swing.*;
public class info extends JFrame
{
        JLabel title=new JLabel("Title :",SwingConstants.RIGHT);
        JTextField title;
        JLabel address=new JLabel("Address : ",SwingConstants.RIGHT);
        JTextField address;
        JLabel type=new JLable("Type :",SwingConstants.RIGHT);
        JTextField type;
        public info()
        {
                super("Site Information");
                String res1=JOptionPane.showInputDialog(null,Enter the site title:");
                title=new JTextField(res1,20);
                String res2=JOptionPane.showInputDialog(null,Enter the site title:");
                title=new JTextField(res2,20);
                String[]choices={"Personal","Commercial",























