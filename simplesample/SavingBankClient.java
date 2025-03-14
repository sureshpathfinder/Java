import java.util.*;
import javax.ejb.*;
import javax.naming.Context;
import java.io.*;
import java.rmi.RemoteException;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
public class SavingBankClient
{
String cid,cfn,cln;
double obl,amt;
static SavingBankHome home;
public static void main(String[] args)
{
int option=0;
 SavingBankClient ac=new SavingBankClient();
try
{
Context initial=new InitialContext();
Object objref=initial.lookup("MySavingBank");
home=(SavingBankHome)PortableRemoteObject.narrow(objref,SavingBankHome.class);
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
while(option!=8)
{
System.out.flush();
System.out.println("1. create account \n 2.credit \n 3.Debit \n 4. Balance enquiry \n 5.Search by last name \n6. search balance in range \n 7.Delete account \n 8.exit");
System.out.println("choose an option");
String s=stdin.readLine();
option=Integer.parseInt(s);
switch(option)
{
case 1:
         ac.openAccount();
          break;
case 2:
         ac.mcredit();
         break;
case 3:
         ac.mdebit();
         break;
case 4:
         ac.cbalance();
         break;
case 5:
         ac.searchByIn();
         break;
case 6:
         ac.searchInRange();
         break;
case 7:
         ac.cremove();
         break;
case 8:
        System.out.println("Thank you! visit again"); 
        break;
default:
         System.out.println("option unavailable");
}
}
}
catch(RemoteException ex)
{
System.err.println("caught an UnBalancedexception:"+ex.getMessage());
}
catch(Exception ex)
{
System.err.println("caught an exception.");
ex.printStackTrace();
}
}
public void openAccount()
{
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter account no:");
cid=stdin.readLine();
System.out.println("\n enter first name:");
cfn=stdin.readLine();
System.out.println("\n enter last name:");
cln=stdin.readLine();
System.out.println("\n enter opening balance Rs:");
obl=Double.parseDouble(stdin.readLine());
SavingBank cfn1=home.create(cid,cfn,cln,obl);
System.out.println("creating saving account for "+cfn);
System.out.println("The account has been opened for "+cfn+"with opening balance Rs."+obl);
}
catch(Exception e)
{
System.out.println(e);
}
}
public void mcredit()
{
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter account no:");
cid=stdin.readLine();
System.out.println("\n enter account to be credited:");
amt=Double.parseDouble(stdin.readLine());
SavingBank cre=home.findByPrimaryKey(cid);
cre.cusCredit(amt);
double balance=cre.getBalance();
System.out.println("Available balance Rs."+String.valueOf(balance));
}
catch(Exception e)
{
System.out.println(e);
}
}
public void mdebit()
{
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter account no:");
cid=stdin.readLine(); 
System.out.println("\n enter account to be debited:");
amt=Double.parseDouble(stdin.readLine());
SavingBank dbe=home.findByPrimaryKey(cid);
dbe.cusDebit(amt);
double balance=dbe.getBalance();
System.out.println("Available balance Rs."+String.valueOf(balance));
}
catch(Exception e)
{
System.out.println(e);
}
}
public void cbalance()
{
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter account no:");
cid=stdin.readLine(); 
SavingBank cname=home.findByPrimaryKey(cid);
double balance=cname.getBalance();
System.out.println("Available balance Rs."+String.valueOf(balance));
}
catch(Exception e)
{
System.out.println(e);
}
}
public void cremove()
{
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter account no:");
cid=stdin.readLine(); 
SavingBank cname=home.findByPrimaryKey(cid);
cname.remove();
System.out.println("Account has been removed");
}
catch(Exception e)
{
System.out.println(e);
}
}
public void searchByIn()
{
Collection c;
Iterator i;
String cln;
try
{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter last name:");
cln=stdin.readLine();
c=home.findByLastName(cln);
i=c.iterator();
while(i.hasNext())
{
SavingBank account=(SavingBank)i.next();
String id=(String)account.getPrimaryKey();
double amount=account.getBalance();
System.out.println("customer name:"+cln+"\naccount no:"+id++"\nbalance:"+String.valueOf(amount));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public void searchInRange()
{
Collection c;
Iterator i;
double minbl,maxbl;
try
{
System.out.println("To find out balance between a given range");
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n enter minimum balance:");
minbl=Double.parseDouble(stdin.readLine());
System.out.println("\n enter maximum balance:");
maxbl=Double.parseDouble(stdin.readLine());
c=home.findInRange(minbl,maxbl);
i=c.iterator();
while(i.hasNext())
{
SavingBank account=(SavingBank)i.next();
String id=(String)account.getPrimaryKey();
double amount=account.getbalance();
System.out.println("account no:"+id+"\n balance:"+String.valueOf(amount));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
