import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class Shapes extends Applet
{
public Shapes()
{
setSize(375,340);
}
public void paint(Graphics g)
{
Dimension dimension=getSize();
Font fb=new Font("TimesRoman",Font.BOLD,24);
Font f=new Font("TimesRoman",Font.PLAIN,12);
g.setFont(fb);
g.drawString("Different Standard shapes",200,20);
g.drawLine(10,50,300,50);
g.setFont(f);
g.drawString("Line",140,70);
g.drawRect(70,80,100,50);
g.drawString("Rectangle",100,150);
g.fillRect(220,80,100,50);
g.drawString("Filled rectangle",240,150);
g.drawRoundRect(70,170,100,50,15,15);
g.drawString("Rounded rectangle",220,240);
g.drawOval(100,260,50,50);
g.drawString("Circle",110,330);
g.fillOval(250,260,50,50);
g.drawString("Filled circle",250,330);
g.drawOval(80,350,90,50);
g.drawString("Ellipse",100,420);
g.fillOval(230,350,90,50);
g.drawString("Filled ellipse",245,420);
}
public static void main(String[] args)
{
JFrame window=new JFrame("Bean Tester");
window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
Shapes myBean=new Shapes();
window.getContentPane().add(myBean);
window.setSize(new Dimension(575,600));
window.setVisible(true);
}
}/*<applet code=Shapes.class width=500 height=500>
</applet>*/

