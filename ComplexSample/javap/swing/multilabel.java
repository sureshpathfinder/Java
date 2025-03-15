import javax.swing.*;
import javax.swing.text.html.*;
import java.awt.*;

public class multilabel
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Multiline Label for Button");
    String lbl = "<html>" + "This label" + "<br>" + "is in two lines" + "</html>";
    Panel panel = new Panel();
    Panel panel2 = new Panel();
    JButton button = new JButton(lbl);
    panel.add(button);
    //panel.setForeColor(Color.RED);
    panel2.add(button);
    frame.add(button);
    frame.add(panel, BorderLayout.NORTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}