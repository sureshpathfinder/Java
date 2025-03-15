import javax.swing.*;
import java.awt.event.*;
public class but1
{
   public static void main(String arg[])
  {
    but cl = new but();
   }
}
class but
{
  JButton b;
  but()
  {
    JFrame frame = new JFrame("Change JButton Label");
    b = new JButton("Click Me");
    b.addActionListener(new MyAction());
    frame.add(b);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  

  public class MyAction implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String text = (String)e.getActionCommand();
      if (text.equals("Click Me"))
      {
        b.setText("Welcome to swing");
      }
      else
      {
        b.setText("Click Me");
      }
    }
  }
}
