import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class clientside extends Frame implements ActionListener
{
        TextField enter,status;
        TextArea display;
        DatagramPacket sendpacket,receivepacket;
        DatagramSocket socket;
        public clientside()
        {
                super("CLIENT IS RUNNING");
                enter=new TextField("enter some");
                enter.addActionListener(this);
                add(enter,BorderLayout.NORTH);
                status=new TextField();
                add(status,BorderLayout.SOUTH);
                status.setEnabled(false);
                display=new TextArea();
                add(display,BorderLayout.CENTER);
                enter.setEnabled(true);
                display.setEnabled(false);
                setSize(400,400);
                setVisible(true);
                status.setText("Send the message to the server............");
                try
                {
                        socket=new DatagramSocket(4000);
                        display.setText("Client is started");
                 }
                 catch(SocketException e)
                 {
      System.out.println("PROBLEM IN STARTING THE SERVER");
                 }
        }//END OF CONSTRUCTOR.
        public void waitingforpacket()
        {
                        try
                        {
         display.append("\n  waiting for the reply");
          byte []data=new byte[256];
       receivepacket=new DatagramPacket(data,data.length);
        //program halts for the packet.
        socket.receive(receivepacket);
       status.setText("Send the message to the server...........");
   enter.setEnabled(true);//you can enter the message to be sent.
  display.append("\nPacket Received : "+"\n From host :  "+ receivepacket.getAddress());
  display.append( "\n Host port :  " + receivepacket.getPort());
  display.append("\n Length  : "+ receivepacket.getLength() + "\n Containing : \n\t" + new String(receivepacket.getData()));
  display.append("\n Echo YOU CAN SEND THE REPLY NOW to the server..............");
  enter.setEnabled(true);
       }//END of try block.
        catch(IOException e)
          {
        display.setText("Exception");
           }
    }//end of the waitingforpacket function.
    public void actionPerformed(ActionEvent e)
     {
     try
    {
   enter.setEnabled(true);
   display.append("\n Sending packet containg : " + e.getActionCommand());
   String msg =enter.getText();
   byte data[]=msg.getBytes();
   sendpacket=new DatagramPacket(data,data.length,InetAddress.getLocalHost(),5000);
   socket.send(sendpacket);
   display.append("\npacket is send");
   enter.setText(" ");
   enter.setEnabled(false);
   status.setText("you have to wait till you get the message from the server");
   waitingforpacket();
   }//end of try block.
                catch(IOException e1)
                {}
        }//end of the action Listener.
     public static void main(String arg[])
   {
    clientside ss=new clientside();
   
   }
   }
//end of the program.
                
                                

