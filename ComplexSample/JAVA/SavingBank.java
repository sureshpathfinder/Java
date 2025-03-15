import javax.ejb.EJBObject;
import java.rmi.RemoteException;
public interface SavingBank extends EJBObject
{
public void cusDebit(double amount) throws InadequateBalanceException,RemoteException;
public void cusCredit(double amount) throws RemoteException;
public String getFirstName()  throws RemoteException;
public String getLastName()  throws RemoteException;
public double getBalance()  throws RemoteException;
}

