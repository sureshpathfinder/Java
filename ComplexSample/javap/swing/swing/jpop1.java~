import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class jpop1 extends JFrame implements ActionListener
{
JPopupMenu p;
JMenuItem m1,m2;
    public jpop1()
    {
        p=new JPopupMenu();
        m1=new JMenuItem("first");
        m2=new JMenuItem("second");
        p.add(m1);
        p.add(m2);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
         c.add(p);
m1.addActionListener(this);
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent m)
            {
                 p.show((Component)null,m.getX(),m.getY());
            }
      });
}
      public void actionPerformed(ActionEvent ae)
      {
       if(ae.getSource()==m1)
       {
         FileDialog fd=new FileDialog(this);
         fd.setVisible(true);
       }
      }

    public static void main(String args[])
    {
        jpop1 obj=new jpop1();
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}

