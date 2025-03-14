import java.sql.*;
import javax.sql.*;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;
public class SavingBankEJB implements EntityBean
{
public String id;
public String firstName;
public String lastName;
public double balance;
public EntityContext context;
public void cusDebit(double amount) throws InadequateBalanceException
{
if(balance-amount<250.00)
{
throw new InadequateBalanceException();
}
balance-=amount;
}
public void cusCredit(double amount)
{
balance+=amount;
}
public String getFirstName() 
{
return firstName;
}
public String getLastName() 
{
return lastName;
}
public double getBalance() 
{
return balance;
}
public String ejbCreate(String id,String firstName,String lastName,double balance) throws CreateException
{
if(balance<250.00)
{
throw new CreateException("opening balance should be Rs.250.00");
}
this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.balance=balance;
return null;
}
public void setEntityContext(EntityContext context)
{
this.context=context;
}
public void ejbRemove()
{
}
public void unsetEntityContext()
{
}
public void ejbActivate()
{
id=(String)context.getPrimaryKey();
}
public void ejbPassivate()
{
id=null;
}
public void ejbLoad()
{
}
public void ejbStore()
{
}
public void ejbPostCreate(String id,String firstName,String lastName,double balance)
{
}
}
