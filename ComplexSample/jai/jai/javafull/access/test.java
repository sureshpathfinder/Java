import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class test extends JFrame
{
        Container c;
        JButton b1,b2,b3,b4,b5;
        JTextField t1,t2,t3,t4,t5,t6,t7;
        test()
        {
                c=getContentPane();
                c.setLayout(null);
                c.setBackground(Color.black);
                labels();
                texts();
                buttons();
                b1.addActionListener(new bu1());
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
        class bu1 implements ActionListener
        {
                public void actionPerformed(ActionEvent a)
                {
                }
        }
       void labels()
        {
                JLabel l1=new JLabel("Register No ");
                l1.setBounds(40,30,100,40);
                l1.setForeground(Color.white);
                c.add(l1);

                JLabel l2=new JLabel("Student Name ");
                l2.setBounds(40,70,100,40);
                l2.setForeground(Color.white);
                c.add(l2);

                JLabel l3=new JLabel("Mark 1 ");
                l3.setBounds(40,110,100,40);
                l3.setForeground(Color.white);
                c.add(l3);

                JLabel l4=new JLabel("Mark 2 ");
                l4.setBounds(40,150,100,40);
                l4.setForeground(Color.white);
                c.add(l4);

                JLabel l5=new JLabel("Mark 3 ");
                l5.setBounds(40,190,100,40);
                l5.setForeground(Color.white);
                c.add(l5);

                JLabel l6=new JLabel("Mark 4 ");
                l6.setBounds(40,230,100,40);
                l6.setForeground(Color.white);
                c.add(l6);

                JLabel l7=new JLabel("Mark 5 ");
                l7.setBounds(40,270,100,40);
                l7.setForeground(Color.white);
                c.add(l7);

        }
        void texts()
        {
                t1=new JTextField();
                t1.setBounds(180,40,100,20);
                c.add(t1);

                t2=new JTextField();
                t2.setBounds(180,80,100,20);
                c.add(t2);

                t3=new JTextField();
                t3.setBounds(180,120,100,20);
                c.add(t3);

                t4=new JTextField();
                t4.setBounds(180,160,100,20);
                c.add(t4);

                t5=new JTextField();
                t5.setBounds(180,200,100,20);
                c.add(t5);

                t6=new JTextField();
                t6.setBounds(180,240,100,20);
                c.add(t6);

                t7=new JTextField();
                t7.setBounds(180,280,100,20);
                c.add(t7);
        }
        void buttons()
        {
                b1=new JButton("Add");
                b2=new JButton("Edit");
                b3=new JButton("Del");
                b4=new JButton("Save");
                b5=new JButton("Exit");
                b1.setBounds(10,330,65,20);
                b2.setBounds(70,330,65,20);
                b3.setBounds(130,330,65,20);
                b4.setBounds(190,330,65,20);
                b5.setBounds(250,330,65,20);
                b1.setToolTipText("Add Records");
                b2.setToolTipText("Edit Records");
                b3.setToolTipText("Delete Records");
                b4.setToolTipText("Save Records");
                b5.setToolTipText("Quit");
                c.add(b1);
                c.add(b2);
                c.add(b3);
                c.add(b4);
                c.add(b5);
          }    

        public static void main(String ar[])throws Exception
        {
                test t=new test();
                t.setSize(330,380);
                t.setVisible(true);
                t.setTitle("Student's Information");
                t.setBackground(Color.darkGray);
        }
}

