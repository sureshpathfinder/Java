import java.util.*;
import javax.ejb.*;
public class BookEJB implements SessionBean
{
String customername;
String customerid;
Vector contents;
public void ejbCreate (String person) throws CreateException
{
if(person==null)
throw new CreateException ("Null person not allowed");
else
customername=person;
customerid="0";
contents=new Vector();
}
public void ejbCreate(String person,String id)throws CreateException
{
if(person==null)
throw new CreateException ("Null person not allowed");
else
customername=person;
IdVerifier idchecker=new IdVerifier();
if(idchecker.validate(id))
customerid=id;
else
throw new CreateException ("Invalid id:"+id);
contents=new Vector();
}
public void addBook(String title)
{
contents.addElement(title);
}
public void removeBook(String title)throws BookException
{
boolean result=contents.removeElement(title);
if(result==false)
throw new BookException(title+"not in cart.");
}
public Vector getContents()
{
return contents;
}
public BookEJB()
{
}
public void ejbRemove()
{
}
public void ejbActivate()
{
}
public void ejbPassivate()
{
}
public void setSessionContext(SessionContext sc)
{
}
}

 