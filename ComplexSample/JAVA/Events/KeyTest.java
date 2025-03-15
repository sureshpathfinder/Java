import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class KeyTest extends Applet implements KeyListener
{
public void init()
{
Label l=new Label("Enter characters");
add(l);
TextField tf=new TextField(20);
tf.addKeyListener(this);
add(tf);
}
public void keyPressed(KeyEvent e)
{
}
public void keyReleased(KeyEvent e)
{
}
public void keyTyped(KeyEvent e)
{
showStatus("Recently typed character in the text field is:"+e.getKeyChar());
}
}
//<applet code="KeyTest.class" width=500 height=500></applet>
