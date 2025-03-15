import java.awt.*;
import java.applet.*;
public class imag extends Applet
  {
        Image img;

        public void init()
        {
                img=getImage(getCodeBase(),"fish.gif");
        }
        public void paint(Graphics g)
        {
                g.drawImage(img,20,20,this);
        }
  }
//<applet code=imag width=400 height=400></applet>