import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="appfram1" width=400 height=400>
</applet>*/
class appfram extends Frame
{
    
        appfram()
        {
       
                addWindowListener(new w());
        }
}
class w extends WindowAdapter
{
        appfram s;
        public void windowClosing(WindowEvent e)
        {
                s.setVisible(false);
                s.dispose();
                System.exit(0);
        }
}
public class appfram1 extends Applet
{
        int num=0;
        public void init()
        {
                Button b=new Button("Create");
                b.addActionListener(new B());
                add(b);
        }
        class B implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
                        appfram a=new appfram();
                        a.setSize(300,200);
                        a.setVisible(true);
                        a.setTitle("Window - "+num);
                        ++num;
                }
        }
}

