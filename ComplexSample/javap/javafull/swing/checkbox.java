import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=checkbox width=600 height=50>
</applet>*/
public class checkbox extends JApplet implements ItemListener
{
        JTextField t1;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());

                ImageIcon normal=new ImageIcon("normal.gif");
                ImageIcon rollover=new ImageIcon("rollover.gif");
                ImageIcon selected=new ImageIcon("selected.gif");

                JCheckBox jb1=new JCheckBox("Karthik",normal);
                jb1.setRolloverIcon(rollover);
                jb1.setSelectedIcon(selected);
                jb1.addItemListener(this);
                cp.add(jb1);


                jb1=new JCheckBox("Gayathri",normal);
                jb1.setRolloverIcon(rollover);
                jb1.setSelectedIcon(selected);
                jb1.addItemListener(this);
                cp.add(jb1);

                jb1=new JCheckBox("Prakash",normal);
                jb1.setRolloverIcon(rollover);
                jb1.setSelectedIcon(selected);
                jb1.addItemListener(this);
                cp.add(jb1);



                t1=new JTextField(15);
                cp.add(t1);
        }
        public void itemStateChanged(ItemEvent e)
        {

                JCheckBox jb1=(JCheckBox)e.getItem();
                t1.setText(jb1.getText());
                
        }
}



