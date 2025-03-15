import java.awt.*;
import java.util.*;
import javax.swing.*;
/*<applet code=list width=300 height=400>
</applet>*/
public class list extends JApplet
{
        JList j;
        String kar[]={"Kanya","Vidya","Srija","Kalai",
                      "Padmavathi","Padmasree","Jothi","Gayathri"};

        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());
                j=new JList();
                j.setListData(kar);//It will adds the items declared in the array
                j.setSelectedIndex(7);
                cp.add(j);
        }
}


