import java.awt.*;
import java.awt.event.*;
class FrameApp extends Frame
{
boolean a;
FrameApp()
{
a=false;
setTitle("Stand Alone Application");
addWindowListener(new W());
}
class W extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
if(a)
dispose();
else
System.exit(0);
}
}
public static void main(String args[])
{
FrameApp fm=new FrameApp();
fm.setSize(300,300);
fm.setVisible(true);
}
}
