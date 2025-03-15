import java.awt.*;
import java.applet.*;
/*<applet code="list1.class" width=250 height=150>
</applet>*/
public class list1 extends Applet
{
        List kar;
        public void init()
        {
                kar=new List(3,true);
                kar.add("Thirumal");
                kar.add("Karthik");
                kar.add("Priya");
                kar.add("Ramesh");
                kar.add("SSI");
kar.select(2);
kar.select(4);
                add(kar);
        }      

}



