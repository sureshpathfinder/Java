import java.awt.*;
import java.applet.*;
/*<applet code="choice1.class" width=250 height=150>
</applet>*/
public class choice1 extends Applet
{
        Choice kar;
        public void init()
        {
                kar=new Choice();
                kar.add("Karthik");
                kar.add("Thirumal");
                kar.add("Ramesh");
                kar.add("Priya");
           kar.select("Thirumal");
                add(kar);
        }


}



