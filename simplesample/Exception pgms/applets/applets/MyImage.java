import java.applet.Applet;
import java.awt.*;
public class MyImage extends Applet
{
Image img;
public void init()
{
Font f=new Font("TimesRoman",Font.ITALIC,20);
img=createImage(300,75);
Graphics gimg=img.getGraphics();
gimg.setColor(getBackground());
gimg.fillRect(0,0,300,75);
gimg.setColor(Color.pink);
gimg.setFont(f);
gimg.drawString("Hello World",20,20);
}
public void paint(Graphics g)
{
g.drawImage(img,50,30,this);
}
}
//<applet code="MyImage.class" width=500 height=500></applet>