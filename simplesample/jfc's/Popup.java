import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Popup extends JFrame
{
JPopupMenu jpm;
public Popup()
{
setTitle("Popup Example");
JPanel c=(JPanel)getContentPane();
c.setLayout(new BoxLayout(c,BoxLayout.X_AXIS));
JButton jb=new JButton("press this button to bring up the Popupmenu");
JButton ex=new JButton("Exit");
c.add(jb);
c.add(ex);
jb.addMouseListener(new myListener());
jpm=new JPopupMenu();
JMenuItem one=new JMenuItem("JMenuItem");
jpm.add(one);
JCheckBoxMenuItem cbm1=new JCheckBoxMenuItem("JCheckBoxMenuItem 1");
JCheckBoxMenuItem cbm2=new JCheckBoxMenuItem("JCheckBoxMenuItem 2");
jpm.add(cbm1);
jpm.add(cbm2);
jpm.addSeparator();
jpm.setBackground(Color.lightGray);
JRadioButtonMenuItem rbm1=new JRadioButtonMenuItem("JRadioButtonMenuItem 1");
JRadioButtonMenuItem rbm2=new JRadioButtonMenuItem("JRadioButtonMenuItem 2");
rbm1.setSelected(true);
ButtonGroup bg=new ButtonGroup();
bg.add(rbm1);
bg.add(rbm2);
jpm.add(rbm1);
jpm.add(rbm2);
jpm.addSeparator();
}
class myListener extends MouseAdapter
{
public void mouseReleased(MouseEvent e)
{
jpm.show((JComponent)e.getSource(),e.getX(),e.getY());
}
}
public static void main(String args[])
{
Popup p=new Popup();
p.setForeground(Color.black);
p.setBackground(Color.lightGray);
p.setVisible(true);
}
}

