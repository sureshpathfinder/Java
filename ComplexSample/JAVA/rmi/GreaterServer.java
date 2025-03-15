import java.rmi.*;
import java.rmi.server.*;
public class GreaterServer extends UnicastRemoteObject implements Greater
{
public GreaterServer() throws RemoteException
{
}
public String getResult(int first,int second) throws RemoteException
{
if(first<second)
return(Integer.toString(second));
else
{
if(second<first)
return(Integer.toString(first));
else
return("Equal");
}
}
public static void main(String args[])
{
try
{
GreaterServer f=new GreaterServer();
Naming.rebind("GreaterServer",f);
System.out.println("server is ready");
}
catch(Exception e)
{
System.out.println("Error from server side:"+e);
}
}
}
 