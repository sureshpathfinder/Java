import java.applet.Applet.*;
import java.awt.*;
import java.awt.event.*;

public class panel1 extends Applet implements ActionListener
{
Panel p1,p2;
Button f,b,g;
Button first,prev,next,last;
CardLayout c1;
public void init()
{
setLayout(new BorderLayout());
p1=new  Panel();
c1=new CardLayout();
p1.setLayout(c1);
Panel fp=new Panel();
fp.setLayout(new FlowLayout());
fp.add(new Button("This"));
fp.add(new Button("is"));
fp.add(new Button("FlowLayout"));
p1.add("flow",fp);
Panel bp=new Panel();
bp.setLayout(new BorderLayout());
bp.add("North",new Button("This"));
bp.add("Center",new Button("is"));
bp.add("South",new Button("BorderLayout"));
bp.add("East",new Button("will be"));
bp.add("West",new Button("was"));
p1.add("border",bp);
Panel gp=new Panel();
gp.setLayout(new GridLayout(3,3));
gp.add(new Button("This"));
gp.add(new Button("was"));
gp.add(new Button("GridLayout"));
gp.add(new Button("This"));
gp.add(new Button("is"));
gp.add(new Button("GridLayout"));
gp.add(new Button("This"));
gp.add(new Button("is"));
gp.add(new Button("GridLayout"));
p1.add("grid",gp);
add("Center",gp);
p2=new Panel();
p2.setLayout(new FlowLayout());
first=new Button("<<");first.addActionListener(this);
prev=new Button("<");first.addActionListener(this);
next=new Button(">");first.addActionListener(this);
last=new Button(">>");first.addActionListener(this);
f=new Button("Flow Layout");first.addActionListener(this);
b=new Button("Border  Layout");first.addActionListener(this);
g=new Button("Grid Layout");first.addActionListener(this);
p2.add(first);
p2.add(prev);
p2.add(next);
p2.add(last);
p2.add(f);
p2.add(b);
p2.add(g);
add("South",p2);
}
public void actionerformed(ActionEvent ae)
{
String as=e.getActionCommand();
if(s=="<<")
{
c1.first(p1);
}
if(s=="<")
{
c1.prev(p1);
}
if(s==">")
{
c1.next(p1);
}
if(s==">>")
{
c1.last(p1);
}
if(s=="FlowLayout")
{
c1.show(p1,"flow");
}
if(s=="BorderLayout")
{
c1.show(p1,"border");
}
if(s=="GridLayout")
{
c1.show(p1,"grid");
}
if(s=="GridBagLayout")
{
c1.show(p1,"gridbag");
}
}
}