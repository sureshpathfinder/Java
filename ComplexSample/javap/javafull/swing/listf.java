import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class listf extends JFrame
{
        JList j;
        String kar[]={"Kanya","Vidya","Srija","Kalai",
                      "Padmavathi","Padmasree","Jothi","Gayathri"};

        public listf()
        {
                setTitle("Karthik Girl Friends");
                 JPanel cp=(JPanel)getContentPane();
                cp.setLayout(new FlowLayout());
                j=new JList();
                j.setListData(kar);
                j.setSelectedIndex(7);
                cp.add(new JScrollPane(j),"Center");

                myadapter myapp=new myadapter();
                addWindowListener(myapp);
        }
        class myadapter extends WindowAdapter
        {
                public void windowClosing(WindowEvent e)
                {
                        System.exit(0);
                }
        }
        public static void main(String ar[])
        {
                listf l=new listf();
                l.setVisible(true);
                l.setSize(300,300);
        }
                
}


