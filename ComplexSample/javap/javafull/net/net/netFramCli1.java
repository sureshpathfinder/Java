import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class netFramCli1 extends Frame implements ActionListener
{
        Button b1;
        TextArea ta1;
        String s1;
        byte by1[]=new byte[500];

        netFramCli1()
        {
                setLayout(new FlowLayout());
                b1=new Button("Send");
                ta1=new TextArea(10,50);

                add(ta1);add(b1);

                b1.addActionListener(this);
                addWindowListener(new close1());
      }
        public void actionPerformed(ActionEvent ae1)
        {
                s1=ta1.getText();
                by1=s1.getBytes();
                int SerPort=2000,CliPort=1000;
                try
                {
                        DatagramSocket ds1=new DatagramSocket(1000);
                        DatagramPacket dp1=new DatagramPacket(by1,by1.length,InetAddress.getLocalHost(),2000);
                        ds1.send(dp1);

			DatagramSocket ds2=new DatagramSocket(2000);
                        DatagramPacket dp2=new DatagramPacket(by1,by1.length);
                        ds2.receive(dp2);
                        s1=new String(dp2.getData(),0,500);
                        System.out.println("Data is been Transfered from Clinet to Server");
                }
                catch(Exception ex)
                {
                        System.out.println(ex);
                }
         }

        class close1 extends WindowAdapter
        {
                public void windowClosing(WindowEvent we1)
                {
                        System.exit(0);
                }
        }
        public static void main(String args[])throws Exception
        {
                netFramCli1 nfc1=new netFramCli1();
                nfc1.setVisible(true);
                nfc1.setSize(800,400);

        }
}
