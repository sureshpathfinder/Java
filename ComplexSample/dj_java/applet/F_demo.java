import java.awt.*;
import java.applet.*;

/*<applet code=F_demo height=100 width=100></applet>*/
public class F_demo extends Applet
{
  Font f,f1;
  public void init()
  {
    f=new Font("Arial Black",Font.BOLD,25);
    f1=new Font("Times Roman",Font.ITALIC,100);
    setBackground(Color.gray);
    //setForeground(Color.BLUE);
  }
  
  public void paint(Graphics g)
  {
    
    g.setFont(f);
    g.setColor(Color.RED);
    g.drawString("Hai",50,100);
    g.setFont(f1);
    g.setColor(Color.yellow);
    g.drawString("Welcome to Applet",100,100);
  }
}
    