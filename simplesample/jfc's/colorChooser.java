import javax.swing.*;
public class colorChooser extends JFrame
{
public colorChooser()
{
setTitle("JColrChooser example");
JColorChooser jcc=new JColorChooser();
JPanel c=(JPanel)getContentPane();
//c.setLayout(new BorderLayout());
c.add(jcc,"Center");
}
public static void main(String args[])
{
JFrame jf=new JFrame("JColorChooser example");
colorChooser c=new colorChooser();
c.setVisible(true);
}
}
 