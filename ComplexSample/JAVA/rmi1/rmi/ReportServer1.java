import java.awt.*;
import java.awt.event.*;
import java.rmi.*;
import java.rmi.server.*;
public class ReportServer1 extends UnicastRemoteObject implements ReportInt1
{
public final TextArea ta=new TextArea();
public ReportServer1() throws RemoteException
{
}
public String getText() throws RemoteException
{
return ta.getText();
}
public void appendText(String tex)throws RemoteException
{
ta.appendText(" ");
ta.appendText(tex);
}
public static void main(String args[])
{
try
{
ReportServer1 server=new ReportServer1();
Naming.rebind("ReportServer1",server);
Frame f=new Frame("Report Box");
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
f.add("Center",server.ta);
f.setVisible(true);
}
catch(Exception e)
{
System.exit(0);
}
}
}
