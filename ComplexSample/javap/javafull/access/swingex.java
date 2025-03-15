import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class swingex extends JFrame 
{
        JLabel l1,l2,l3,l4;
        JTextField t1,t2,t3,t4;
        JButton b;
        public swingex()
        {
                Container cp=getContentPane();
                cp.setLayout(new GridLayout(0,2));
                l1=new JLabel("Roll Number");
                t1=new JTextField(15);
                cp.add(l1);
                cp.add(t1);
                l2=new JLabel("Student Name");
                t2=new JTextField(15);
                cp.add(l2);
                cp.add(t2);
                l3=new JLabel("Course");
                t3=new JTextField(15);
                cp.add(l3);
                cp.add(t3);
                l4=new JLabel("Marks");
                t4=new JTextField(15);
                cp.add(l4);
                cp.add(t4);
                cp.setLayout(new BorderLayout());
                b=new JButton("Submit");
                cp.add(b,BorderLayout.SOUTH);
        }
        public static void main(String ar[])throws Exception
        {
                swingex e=new swingex();
		e.setVisible(true);
                e.setSize(500,500);
        }
}





