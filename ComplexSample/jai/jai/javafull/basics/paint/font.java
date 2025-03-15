import java.awt.*;
import java.applet.*;
        public class font extends Applet{
                Font f,f1,f2;
             Color c1,c2,c3;
	  int style,size;
                String s,s1;

        public void init(){
        c1=new Color(138,43,226);
        c2=new Color(0,255,0);
	c3=new Color(233,150,122);
        f=new Font("Helvetica",Font.BOLD,30);
        f1=new Font("TimesRoman",Font.BOLD+Font.ITALIC,30);
        f2=new Font("Courier",Font.ITALIC,30);
        }

        public void paint(Graphics g){
setBackground(c3);
   g.setColor(c1);
       g.setFont(f);
        g.drawString("font name is helvetica",30,30);

   g.setColor(c2);
        g.setFont(f1);
        g.drawString("font name is times",30,80);

       g.setColor(Color.blue);
        g.setFont(f2);
        g.drawString("font name is courier",30,130);

     style=f.getStyle();

        if(style==Font.PLAIN)
        s="PLAIN";
        else if(style==Font.BOLD)
        s="BOLD";
        else if(style==Font.ITALIC)
        s="ITALIC";
        else
        s="bold and italic";

       size=f2.getSize();
        s1=f2.getName();
        s1+="size is "+size+"style is "+s;
        g.drawString(s1,30,180);
         }
        }


//<applet code="font.class" width=400 height=400></applet>

