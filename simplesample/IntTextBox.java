import java.awt.*;
import java.awt.event.*;
import java.beans.*;
public class IntTextBox extends TextField implements KeyListener
{
public IntTextBox()
{
super(15);
this.addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
int a=k.getKeyCode();
if(((a>=48)&&(a<=57))||(a==8)||(a==37)||(a==39)||(a==35)||(a==16)||(a==20)||(a==127)||(a==36)||(a==144))
k.setKeyCode(a);
else
{
this.setText(this.getText());
k.setKeyCode(8);
Toolkit.getDefaultToolkit().beep();
}
}
public void keyTyped(KeyEvent k)
{
}
public void keyReleased(KeyEvent k)
{
}
}
