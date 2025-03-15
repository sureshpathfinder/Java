 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class pogrsbar extends JFrame implements ActionListener
{
  Container c;
  JButton start, stop;
  JProgressBar pbar;
  JTextField input, output;
  int counter =0;
  Timer timer1;

  pogrsbar()
  {
 
    c = getContentPane();
    c.setLayout(new BorderLayout());
//    c.setTitle("ProgressBar Example");

    JPanel p1, p2;
    p1 = new JPanel();
    p2 = new JPanel();

    start = new JButton("Start");
    stop = new JButton("Stop");
    pbar = new JProgressBar();
    pbar.setMinimum(0);
    pbar.setMaximum(1);
	pbar.setForeground(Color.magenta);
    pbar.setStringPainted(true);

    input = new JTextField(10);
    output = new JTextField(10);

    p1.add(start);
    p1.add(stop);
    p1.add(pbar);

    p2.add(input);  
    p2.add(output); 

    c.add(p1, BorderLayout.NORTH);
    c.add(p2, BorderLayout.SOUTH);

    start.addActionListener(this);
    stop.addActionListener(this);

    timer1 = new Timer(1000, this);
  }

  public void actionPerformed(ActionEvent ae)
  {
     if (ae.getSource() == start)
     {
       int max = Integer.parseInt(input.getText());
       if ((String.valueOf(max) == null) || (max == 0)
                 || (String.valueOf(max) == ""))
       {
          max=5;
          input.setText(String.valueOf(max));
       }
       pbar.setMaximum(max);       
       timer1.start();
     }
     else if (ae.getSource() == stop)
     {
       timer1.stop();
       input.setText("0");
       output.setText("0");
       pbar.setValue(0);
       counter = 0;
     }
     else if (ae.getSource() == timer1)
     {
       ++counter;
       if (counter <= Integer.parseInt(input.getText()))
       {
         output.setText(String.valueOf(counter));
         pbar.setValue(counter);
       }
       else
       {
          timer1.stop();
          counter =0;
       }
     }
   }

   public static void main(String args[])
   {
     pogrsbar progressbr = new pogrsbar();
   progressbr.setVisible(true);     
progressbr.setSize(400,400);
  
   }
}
           