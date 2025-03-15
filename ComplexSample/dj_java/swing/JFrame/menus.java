import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class menus extends JFrame implements MenuListener
{
  JTextField t1;
  menus()
  {
    t1=new JTextField(20);
    JMenuBar mb=new JMenuBar();
    JMenu m1=new JMenu("File");
    JMenu m2=new JMenu("Edit");
    m1.addMenuListener(this);
    JMenuItem mi1=new JMenuItem("New");
    JMenuItem mi2=new JMenuItem("Open");
    JMenuItem mi3=new JMenuItem("Save");
    JMenuItem mi4=new JMenuItem("Exit");
    JMenuItem mi5=new JMenuItem("Copy");
    JMenuItem mi6=new JMenuItem("Paste");
    JCheckBoxMenuItem cb1=new JCheckBoxMenuItem("Check1");
    JCheckBoxMenuItem cb2=new JCheckBoxMenuItem("Check1");
    JRadioButtonMenuItem rb1=new JRadioButtonMenuItem("Radio1");
    JRadioButtonMenuItem rb2=new JRadioButtonMenuItem("Radio2");
    ButtonGroup bg=new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    m1.add(mi1);
    m1.add(mi2);
    m1.add(mi3);
    m1.add(mi4);

    m2.add(mi5);
    m2.add(mi6);
    m2.addSeparator();
    m2.add(cb1);
    m2.add(cb2);
    m2.addSeparator();
    m2.add(rb1);
    m2.add(rb2);

    mb.add(m1);
    mb.add(m2);

    setJMenuBar(mb);
    getContentPane().setLayout(new BorderLayout());
//  JPanel con=(JPanel)getContentPane();
    getContentPane().add(t1,"South");
    addWindowListener(new win());
  }
  public void menuSelected(MenuEvent e)
  {
    t1.setText("Menu Selected");
  }
     public void menuDeselected(MenuEvent e)
  {
    t1.setText("Menu Deselected");
  }
  public void menuCanceled(MenuEvent e)
  {
  }
  class win extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
  public static void main(String args[])
  {
    menus m=new menus();
    m.setSize(300,300);
    m.setVisible(true);
  }
}

