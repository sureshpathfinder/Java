import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BookHome extends EJBHome
{
Book create(String person) throws RemoteException,CreateException;
Book create(String person,String id) throws RemoteException,CreateException;
}
  