import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.*;
public interface SavingBankHome extends EJBHome
{
public SavingBank create(String id,String firstName,String lastName,double balance) throws RemoteException,CreateException; 
public SavingBank findByPrimaryKey(String id) throws FinderException,RemoteException;
public Collection findByLastName(String lastName) throws FinderException,RemoteException;
public Collection findInRange(double low,double high) throws FinderException,RemoteException;
}
