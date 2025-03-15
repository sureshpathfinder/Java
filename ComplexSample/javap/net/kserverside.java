import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class kserverside extends Frame implements ActionListener
{
        TextField enter,status;
        TextArea display;
        DatagramPacket sendpacket,receivepacket;
        DatagramSocket socket;
        public kserverside()
        {
                super("SERVER IS RUNNING");
                enter=new TextField();
                enter.addActionListener(this);
                add(enter,BorderLayout.NORTH);
                status=new TextField();
                add(status,BorderLayout.SOUTH);
                status.setEnabled(false);
                display=new TextArea();
                add(display,BorderLayout.CENTER);
                enter.setEnabled(false);
                display.setEnabled(false);
                setSize(400,400);
                setVisible(true);
                status.setText("Server is waiting.............");
                try
                {
                        socket=new DatagramSocket(5000);
                        display.setText("Server is started");
                 }
                 catch(SocketException e)
                 {
                        System.out.println("PROBLEM IN STARTING THE SERVER");
                 }
        }//END OF CONSTRUCTOR.
        public void waitingforpacket()
        {
                while(true)
                {
                        try
                        {
                                byte []data=new byte[256];
        receivepacket=new DatagramPacket(data,data.length);
                 //program halts for the packet.
              socket.receive(receivepacket);
            status.setText("Send the reply to the Client");
      enter.setEnabled(true);//you can enter the message to be sent.
                                display.append("\nPacket Received : "+"\n From host :  ");
                                display.append(receivepacket.getAddress() + "\n Host port :  " + receivepacket.getPort());
                                display.append("\n Length  : "+ receivepacket.getLength() + "\n Containing : \n\t" + new String(receivepacket.getData()));
                                display.append("\n Echo YOU CAN SEND THE REPLY NOW..............");
                        }//END of try block.
                        catch(IOException e)
                        {       }
                }//END OF WHILE BLOCK
        }//end of the waitingforpacket function.
        public void actionPerformed(ActionEvent e)
        {
                try
                {
                        enter.setEnabled(false);
                        display.append("\n Sending packet contains : " + e.getActionCommand());
                        String msg =enter.getText();// e.getActionCommand();//you can also use enter.getText()
                        byte data[]=msg.getBytes();
                        sendpacket=new DatagramPacket(data,data.length,InetAddress.getLocalHost()/*receivepacket.getAddress()*/,4000/*receivepacket.getPort()*/);
                        socket.send(sendpacket);
                        display.append("\npacket is send from the server");
                        enter.setText("");
                        status.setText("Server is waiting.............");
                }//end of try block.
                catch(IOException e1)
                {
                }
        }//end of the action Listener.
        public static void main(String arg[])
        {
                kserverside ss=new kserverside();
               ss.waitingforpacket();
        }
}//end of the program.                
                
                                

