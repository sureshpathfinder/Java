import java.awt.*;
import java.applet.*;
/*<applet code="panel" width=600 height=400>
</applet>*/
public class panel extends Applet
{
        Checkbox c1,c2;
Button b1,b2;
Panel p1,p2;
               public void init()
        {
p1=new Panel();
p2=new Panel();
       setLayout(new GridLayout(1,2,50,50));
             
                c1=new Checkbox("Karthik",true);
                c2=new Checkbox("Agathiyar");
               b1=new Button("one");
	b2=new Button("two");
	p1.setLayout(new FlowLayout(FlowLayout.RIGHT,30,30)) ;               
add(c1);
	p2.setLayout(new GridLayout(1,2,40,40)) ;               
add(c1);
                p1.add(c1);
                p1.add(c2);
	p2.add(b1);
	p2.add(b2);
	add(p1);
	add(p2);
        }
}


