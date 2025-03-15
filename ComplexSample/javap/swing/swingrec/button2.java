import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=button2 width=600 height=100>
</applet>*/
public class button2 extends JApplet implements ActionListener {
     JButton b1, b2, b3;

    public void init()
    {
        Container cp=getContentPane();
        cp.setLayout(new FlowLayout());
        ImageIcon leftButtonIcon = new ImageIcon("right.gif");
        ImageIcon middleButtonIcon = new ImageIcon("middle.gif");
        ImageIcon rightButtonIcon = new ImageIcon("left.gif");

        b1 = new JButton("Disable middle button", leftButtonIcon);
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEFT);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");

        b2 = new JButton("Middle button", middleButtonIcon);
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
       b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        b3 = new JButton("Enable middle button", rightButtonIcon);
        //Use the default text position of CENTER, RIGHT.
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.setEnabled(false);

        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b3.addActionListener(this);

        b1.setToolTipText("Karthik click this button to disable the middle button.");
        b2.setToolTipText("Karthik this middle button does nothing when you click it.");
        b3.setToolTipText("Karthik click this button to enable the middle button.");

        //Add Components to this container, using the default FlowLayout. 
        cp.add(b1);
        cp.add(b2);
        cp.add(b3);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("disable"))
        {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        }
        else
        {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }
    
}
