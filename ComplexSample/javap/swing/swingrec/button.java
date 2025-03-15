import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=button width=250 height=300>
</applet>*/
public class button extends JApplet implements ActionListener
{
        JTextField t1;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());

                ImageIcon india=new ImageIcon("india.gif");
                JButton jb1=new JButton(india);
                jb1.setActionCommand("India");
                jb1.addActionListener(this);
                cp.add(jb1);

                ImageIcon pak=new ImageIcon("pakistan.gif");
                JButton jb2=new JButton(pak);
                jb2.setActionCommand("Pakistan");
                jb2.addActionListener(this);
                cp.add(jb2);


                ImageIcon sri=new ImageIcon("srilanka.gif");
                JButton jb3=new JButton(sri);
                jb3.setActionCommand("SriLanka");
                jb3.addActionListener(this);

                cp.add(jb3);

                t1=new JTextField(15);
                cp.add(t1);
        }
        public void actionPerformed(ActionEvent e)
        {
                t1.setText(e.getActionCommand());
        }
}



