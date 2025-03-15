import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=apptex1 width=790 height=580>
</applet>*/
public class apptex1 extends Applet 
{
     
        Color c;
        Panel p1,p2;
        Label l1,l2,l3;
        TextField r1,g1,b1;
        Button b;
        public void init()
        {
                p1=new Panel();
                p2=new Panel();
//                setLayout(new FlowLayout(2,25,50));
setLayout(new BorderLayout(300,100));
                l1=new Label("Red");
                l2=new Label("Green");
                l3=new Label("Blue");
                r1=new TextField("",12);
                g1=new TextField("",12);
                b1=new TextField("",12);
                b=new Button("Click");
                p1.add("South",l1);
                p2.add("South",r1);
                p1.add("North",l2);
                p2.add("North",g1);
                p1.add("East",l3);
                p2.add("East",b1);
                p1.add("Center",b);
        }
/*        public void actionPerformed(ActionEvent e)
        {
                repaint();
        }

        public void paint(Graphics g)
        {
                c=
        }*/
                
        public Insets getInsets()
        {
                return new Insets(10,5,15,20);
        }
}


