import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=checkbox width=600 height=50>
</applet>*/
public class checkbox extends JApplet implements ItemListener
{
        JTextField t1;
        JCheckBox jb1,jb2,jb3;
        
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());       

                jb1=new JCheckBox("Karthik");
               // jb1.setRolloverIcon(rollover);
               //  jb1.setSelectedIcon(selected);
                jb1.addItemListener(this);
                cp.add(jb1);


                jb2=new JCheckBox("Gayathri");
               //  jb2.setRolloverIcon(rollover);
              // jb2.setSelectedIcon("selected");
                jb2.addItemListener(this);
                cp.add(jb2);

                jb3=new JCheckBox("Prakash");
               //  jb3.setRolloverIcon(rollover);
               //  jb3.setSelectedIcon(selected);
                jb3.addItemListener(this);
                cp.add(jb3);



                t1=new JTextField(15);
                cp.add(t1);
        }
        public void itemStateChanged(ItemEvent e)
        {

                JCheckBox jb1=(JCheckBox)e.getItem();
                t1.setText(jb1.getText());
                
        }
}



