import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class text extends JFrame implements ActionListener
{
  JTextArea ta;
  Container c;
  JButton b1;
  JPanel j1,j2;
  
 text()
 {
 c=getContentPane();
 c.setLayout(new BorderLayout());
 c.setTitle("Program Using Files");

 ta=new JTextArea(); 
 
  j1=new JPanel();
  j2=new JPanel();

  b1=new JButton("Create File");
  
  j1.add(ta);
  j2.add(b1);

 c.add(j1,BorderLayout.NORTH);
 c.add(j2,BorderLayout.SOUTH);

 b1.addActionListener(this);

}
}

public void ActionPerformed(ActionEvent ae)
{
  if(ae.getSource() == b1)
   {
       ta.setText("HAI");
   }
}

public static void main(String args[])

{
  text t1=new text();
    t1.setSize(300,300);
    t1.setForeground(Color.green);
    t1.setBackground(Color.red);
    t1.setVisible(true);
}


 




    
  
    
