import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="applis1" width=500 height=500>
</applet>*/
public class applis1 extends Applet implements ActionListener
{
        List l1;
        public void init()
        {
                l1=new List(3,false);
                l1.add("Karthik");
                l1.add("Ramesh");
                l1.add("Agathiyar");
                l1.add("Asik");
                add(l1);
                l1.addActionListener(this);
                l1.select(1);
        }
        public void actionPerformed(ActionEvent e)
        {
                repaint();
        }
        public void paint(Graphics g)
        {
                g.drawString("Item in the 2nd position is: "+l1.getItem(2),50,100);
                g.drawString("Selected item is: "+l1.getSelectedItem(),50,120);
               g.drawString("Selected item Index is: "+l1.getSelectedIndex(),50,140);
        }
}




