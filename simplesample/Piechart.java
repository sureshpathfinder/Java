import java.awt.*;
public class Piechart extends Canvas
{
public String title;
public Piechart()
{
title="piechart";
setSize(300,300);
}
public String getTitle1()
{
return title;
}
public void setTitle1(String t)
{
title=t;
}
public void paint(Graphics g)
{
Dimension size=getSize();
int height=size.height;
int width=size.width;
g.setColor(Color.black);
g.drawRect(0,0,width-1,height-1);
FontMetrics fm=g.getFontMetrics();
int fmheight=fm.getHeight();
int fmwidth=fm.stringWidth(title);
int x=(width-fmwidth)/2;
int y=fmheight;
g.drawString(title,x,y);
int radius=(int)(width*0.4);
int centerx=(int)(width*0.5);
x=centerx-radius;
y+=fmheight;
g.drawOval(x,y,2*radius,2*radius);
}
}
