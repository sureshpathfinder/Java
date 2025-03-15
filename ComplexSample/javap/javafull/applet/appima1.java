import java.awt.*;
import java.applet.*;
/*<applet code="appima1" width=600 height=400>
</applet>*/
public class appima1 extends Applet
{
       
        Image img;
          Canvas c;
        public void init()
        {
                c=new Canvas();
                img=c.createImage(533,368);
                img=getImage(getCodeBase(),"car1.jpg");
        }
        public void paint(Graphics g)
        {
                setBackground(Color.white);
                g.drawImage(img,0,0,this);
        }
}

              
