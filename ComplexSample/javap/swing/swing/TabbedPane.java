import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TabbedPane extends JFrame
{
        JTabbedPane tp;

        public TabbedPane()
        {
                setTitle("Karthik Tabbed Panes");
                JPanel cp=(JPanel)getContentPane();
                tp=new JTabbedPane();
                tp.addTab("Girls",new girl());
                tp.addTab("Boys",new boy());
                tp.addTab("Films",new film());
                cp.add(tp);
                myadapter myapp=new myadapter();
                addWindowListener(myapp);
        }

        class girl extends JPanel
        {
                public girl()
                {
                        JButton g1=new JButton("Kanya");
                        add(g1);
                        JButton g2=new JButton("Jothi");
                        add(g2);
                        JButton g3=new JButton("Gayathri");
                        add(g3);
                }
        }

        class boy extends JPanel
        {
                public boy()
                {
                        JCheckBox c1=new JCheckBox("Karthik");
                        add(c1);
                        JCheckBox c2=new JCheckBox("Asik");
                        add(c2);
                        JCheckBox c3=new JCheckBox("Agathiyar");
                        add(c3);
                }
        }

        class film extends JPanel
        {
                public film()
                {
                        JComboBox jcb=new JComboBox();
                        jcb.addItem("Dalapathi");
                        jcb.addItem("Love Today");
                        jcb.addItem("Valli");
                        add(jcb);
                }
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
                TabbedPane t=new TabbedPane();
                t.setSize(400,100);
                t.setVisible(true);
        }
}        
        




                



                
