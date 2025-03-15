import java.awt.*;
import java.applet.*;
/*<applet code=ThreadDemo width=450 height=120>
</applet>*/
public class ThreadDemo extends Applet implements Runnable
{
        Thread karthik=null;
        int pos=0;
        public void start()
        {
                karthik=new Thread(this);
                karthik.start();
        }
        public void run()
        {
                while(true)
                {
                        for(pos=0;pos<getSize().width;pos+=5)
                        {
                                repaint();
                                try
                                {
                                        karthik.sleep(100);
                                }
                                catch(InterruptedException e)
                                {
                                }
                         }
                  }
        }
        public void stop()
        {
                karthik.stop();
                karthik=null;
        }
        public void paint(Graphics g)
        {
                g.setColor(Color.blue);
                g.fillOval(pos,50,30,30);
        }
}

                                
