import java.rmi.*;
public interface Greater extends Remote
{
public String getResult(int first,int second)throws RemoteException;
}
