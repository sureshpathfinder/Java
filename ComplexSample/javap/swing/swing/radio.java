import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=radio width=400 height=50>
</applet>*/
public class radio extends JApplet implements ActionListener
{
        JTextField t1;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());

              
                JRadioButton jb1=new JRadioButton("Karthik");
                jb1.addActionListener(this);
                cp.add(jb1);

                JRadioButton jb2=new JRadioButton("Gayathri");
                jb2.addActionListener(this);
                cp.add(jb2);

                JRadioButton jb3=new JRadioButton("Prakash");
                jb3.addActionListener(this);
                cp.add(jb3);

                ButtonGroup bg=new ButtonGroup();
                bg.add(jb1);
                bg.add(jb2);
                bg.add(jb3);


                t1=new JTextField(15);
                cp.add(t1);
        }
        public void actionPerformed(ActionEvent e)
        {

                t1.setText(e.getActionCommand());
                
        }
}



