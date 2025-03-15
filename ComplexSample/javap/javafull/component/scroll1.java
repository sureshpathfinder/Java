import java.awt.*;
import java.applet.*;
/*<applet code="scroll1.class" width=250 height=150>
</applet>*/
public class scroll1 extends Applet
{
        Scrollbar kar1,kar2;
        public void init()
        {
                kar1=new Scrollbar(Scrollbar.VERTICAL,790,10,1,800);
                kar2=new Scrollbar(Scrollbar.HORIZONTAL,1,10,1,800);
                add(kar1);
                add(kar2);


        }      

}



