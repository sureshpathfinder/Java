import java.rmi.*;
import java.awt.event.*;
public interface ReportInt1 extends Remote
{
public String getText() throws RemoteException;
public void appendText(String text)throws RemoteException;
}
