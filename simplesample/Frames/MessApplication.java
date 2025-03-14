import java.awt.*;
import java.awt.event.*;
public class MessApplication extends Frame
{
MessApplication()
{
MessageBox mb=new MessageBox(this,"Java Alert:This is a Message Box");
mb.setLocation(500,200);
mb.setVisible(true);
}
public static void main(String args[])
{
MessApplication fm=new MessApplication();
System.out.println("popping out message box");
}
}
