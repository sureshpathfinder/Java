import java.awt.*;
import java.applet.*;
/*<applet code="ckgroup1.class" width=250 height=150>
</applet>*/
public class ckgroup1 extends Applet
{
        Checkbox c1,c2;
        CheckboxGroup cbg;
        public void init()
        {
                cbg=new CheckboxGroup();
                c1=new Checkbox("one",cbg,true);
                c2=new Checkbox("two",cbg,false);

        //adding componenet to applet window
                add(c1);
                add(c2);
        }
}



