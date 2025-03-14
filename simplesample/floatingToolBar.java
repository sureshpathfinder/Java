import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class floatingToolBar extends JFrame 
{
public floatingToolBar()
{
setTitle("JToolBar as a Tool palette-Example");
JPanel jp=(JPanel)getContentPane();
jp.setLayout(new BorderLayout());
JDesktopPane dt=new JDesktopPane();
dt.setBackground(jp.getBackground());
jp.add("Center",dt);
TFrame tf=new TFrame("Tools");
dt.add(tf);
}
public static void main(String args[])
{
floatingToolBar tb=new floatingToolBar();
tb.setForeground(Color.black);
tb.setBackground(Color.lightGray);
tb.setVisible(true);
}
class TFrame extends JInternalFrame implements ActionListener,ComponentListener
{
public TFrame(String title)
{
super(title);
JToolBar thar;
JButton newB;
setClosable(true);
setIconifiable(true);
setResizable(true);
JPanel jp1=(JPanel)getContentPane();
addComponentListener(this);
jp1.setLayout(new BorderLayout());
thar=new JToolBar();
thar.setLayout(new GridLayout(3,2));
thar.setBorder(new BevelBorder(BevelBorder.LOWERED));
jp1.add("Center",thar);
newB=new JButton(new ImageIcon("c://BDK1.1/demo/sunw/demo/juggler/juggler0.gif"));
thar.add(newB);
newB.setToolTipText("New");
newB.setMargin(new Insets(0,0,0,0));
newB.addActionListener(this);
newB.setActionCommand("New");
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Toolbar button pressed.command string:"+e.getActionCommand());
}
public void componentHidden(ComponentEvent e)
{
}
public void componentMoved(ComponentEvent e)
{
}
public void componentResized(ComponentEvent e)
{
}
public void componentShown(ComponentEvent e)
{
int extwidth=getSize().width-getContentPane().getSize().width;
int extheight=getSize().height-getContentPane().getSize().height;
System.out.println(extwidth+","+extheight);
}
}
}

