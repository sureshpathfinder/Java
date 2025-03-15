import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class netFramSer1 extends Frame implements ActionListener
{
        Button b1;
        TextArea ta1;

        static String s1="";

        netFramSer1()
        {
                setLayout(new FlowLayout());
                b1=new Button("View Message");
                ta1=new TextArea(10,50);

                add(ta1);add(b1);

                b1.addActionListener(this);
                addWindowListener(new close1());
        }
        public void actionPerformed(ActionEvent ae1)
        {
                        ta1.setText(""+s1);
        }
        class close1 extends WindowAdapter
        {
                public void windowClosing(WindowEvent we1)
                {
                        System.exit(0);
                }
        }
        public static void main(String args[])throws IOException
        {
                netFramSer1 nfs1=new netFramSer1();
                nfs1.setVisible(true);
                nfs1.setSize(600,400);
                byte by1[]=new byte[500];
                try
                {
                        DatagramSocket ds1=new DatagramSocket(2000);
                        DatagramPacket dp1=new DatagramPacket(by1,by1.length);
                        ds1.receive(dp1);
                        s1=new String(dp1.getData(),0,500);

			DatagramSocket ds2=new DatagramSocket(1000);
                        DatagramPacket dp2=new DatagramPacket(by1,by1.length,InetAddress.getLocalHost(),2000);
                        ds2.send(dp2);
                }
                catch(Exception ex1)
                {
                        System.out.println(ex1);
                }

        }
}
