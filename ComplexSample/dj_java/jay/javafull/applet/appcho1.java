import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="appcho1" width=600 height=400>
</applet>*/
public class appcho1 extends Applet implements ItemListener,ActionListener
{
        Choice c,d;
        
        Button b;
        public void init()
        {
                c=new Choice();
                d=new Choice();
                b=new Button("Add");
                c.add("Karthik");
                c.add("Suguna");
                c.add("Agathiyar");
                c.add("Gayathri");
                d.add("Rajesh");
                add(c);
                add(b);
                add(d);
                c.addItemListener(this);
                b.addActionListener(this);
                c.select(2);
                
        }
                public void actionPerformed(ActionEvent e)
                {
//                c.insert("Asik",2);
                d.add(c.getSelectedItem());
                }
                
        public void itemStateChanged(ItemEvent e)
        {
                repaint();
        }
        public void paint(Graphics g)
        {
                g.drawString("There are "+c.getItemCount()+" Items in the Choice",50,100);
                g.drawString("The Selected Item is: "+c.getSelectedItem(),50,120);
                g.drawString("The Selected Item index is: "+c.getSelectedIndex(),50,140);
                
        }
}
        
