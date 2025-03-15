import java.awt.event.*;
import java.io.*;
import java.net.*;
public class AppServer extends Thread
{
 ServerSocket serverSocket;
 public AppServer()
 {
  try
  {
   serverSocket=new ServerSocket(1001);
  }
  catch(IOException e)
  {
   fail(e,"Could not Start Server");
  }
  System.out.println("Server Started");
  this.start();
 }
 public static void fail(Exception e,String str)
 {
  System.out.println(str +" . "+ e);
 }
 public void run()
 {
  try
  {
   while(true)
   {
    Socket client=serverSocket.accept();
    Connection con=new Connection(client);
   }
  }
  catch(IOException e)
  {
   fail(e,"Not Listening");
  } 
 }
 public static void main(String args[])
 {
  new AppServer();
 }
}

class Connection extends Thread
{
 protected Socket netClient;
 protected ObjectInputStream fromClient;
 protected PrintStream toClient;
 
 public Connection(Socket client)
 {
  netClient=client;
  try
  {
   fromClient=new ObjectInputStream(netClient.getInputStream());
   toClient=new PrintStream(netClient.getOutputStream());
  }
  catch(IOException e)
  {
   try{
    netClient.close();
   }
   catch(IOException e1)
   {
    System.err.println("Unable to set up Streams "+e1);
    return;
   }
  }
  this.start();
 }
 public void run()
 {
  Customer clientMessage;
  try{
   for(;;){
    clientMessage=(Customer)fromClient.readObject();
    if(clientMessage==null)
     break;
    toClient.println("Received from: "+clientMessage.custName);
   }
  }
  catch(IOException e)
  {}
  catch(ClassNotFoundException e1)
  {
   System.out.println("Error in reading Object"+e1);
  }
  finally
  {
   try{
    netClient.close();
   }
   catch(IOException e)
   {}
  }
 }
}
class Customer implements Serializable
{
 String custName,custPassword;
}

    
   