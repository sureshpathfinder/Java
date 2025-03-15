import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class confirm extends JFrame implements ActionListener
{
  confirm()
  {
    getContentPane().setLayout(new FlowLayout());
    JButton b1=new JButton("Click");
    getContentPane().add(b1);
    b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    int result;
    result=JOptionPane.showConfirmDialog(this,"Continue?");
    switch(result)
    {
      case JOptionPane.YES_OPTION:
        JOptionPane.showMessageDialog(this,"Yes Button was pressed","yes dialog",JOptionPane.INFORMATION_MESSAGE);
        break;
      case JOptionPane.NO_OPTION:
        JOptionPane.showMessageDialog(this,"No Button was pressed","no dialog",JOptionPane.INFORMATION_MESSAGE);
        break;
      case JOptionPane.CANCEL_OPTION:
        JOptionPane.showMessageDialog(this,"Cancel Button was pressed","cancel dialog",JOptionPane.INFORMATION_MESSAGE);
        break;
    }
  }
  public static void main(String args[])
  {
    confirm c=new confirm();
    c.setSize(300,300);
    c.setForeground(Color.green);
    c.setBackground(Color.red);
    c.setVisible(true);
  }
}
  
