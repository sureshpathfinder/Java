import java.awt.*;
import java.applet.*;
public class IMG_app extends Applet
  {
        Image img;
        Font f;

        public void init()
        {
                f=new Font("Arial Black",Font.BOLD,50);
                img=getImage(getCodeBase(),"worldcup.gif");
        }
        public void paint(Graphics g)
        {
                g.setFont(f);
                g.setColor(Color.red);
                g.drawString("COME ON INDIA",350,350);
                g.drawImage(img,20,20,this);
                
        }
  }
//<applet code=imag width=400 height=400></applet>