import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="appbord" width=600 height=400>
</applet>*/
public class appbord extends Applet 
{
        int i;
        Button b1,b2,b3,b4,b5;
        public void init()
        {
                setLayout(new BorderLayout(50,50));
                setBackground(Color.cyan);
                	b1=new Button("North");
                b2=new Button("East");
                b3=new Button("West");
                b4=new Button("South");
                b5=new Button("Center");
                add(b1,BorderLayout.NORTH);
                add(b2,BorderLayout.EAST);
                add(b3,BorderLayout.WEST);
                add(b4,BorderLayout.SOUTH);
                add(b5,BorderLayout.CENTER);
       }
  public Insets getInsets()
       {
                return new Insets(50,50,0,0);
//top,left,bottom,right
        }
}


