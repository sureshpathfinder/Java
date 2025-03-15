import javax.swing.*;
import java.awt.*;
class SampleEx
{
public static void main(String args[])
{
TextField t=new TextField();
 short b=Short.parseShort(JOptionPane.showInputDialog("Enter a number"));
JOptionPane.showMessageDialog(t,"B="+b,"result",JOptionPane.PLAIN_MESSAGE);
}
}