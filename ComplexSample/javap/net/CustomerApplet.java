import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class CustomerApplet extends JApplet
{
 JPanel panelObject;
 JLabel labelCustName,labelCustPassword;
 JTextField textCustName;
 JPasswordField textCustPassword;
 JButton buttonLogin;
 GridBagLayout g1;
 GridBagConstraints gbc;
 
 public void init()
 {
  labelCustName=new JLabel("Custormer Name");
  labelCustPassword=new JLabel("Customer Password");
  textCustName=new JTextField(20);
  textCustPassword=new JPasswordField(20);
  buttonLogin=new JButton("Click"); 
  
  g1=new GridBagLayout();
  gbc=new GridBagConstraints();

  panelObject=(JPanel)getContentPane();
  panelObject.setLayout(g1);

  gbc.anchor=GridBagConstraints.NORTHWEST;
  gbc.gridx=1;gbc.gridy=2;
  g1.setConstraints(labelCustName,gbc);
  panelObject.add(labelCustName);
  
  gbc.anchor=GridBagConstraints.NORTHWEST;
  gbc.gridx=4;gbc.gridy=2;
  g1.setConstraints(textCustName,gbc);
  panelObject.add(textCustName);

  gbc.anchor=GridBagConstraints.NORTHWEST;
  gbc.gridx=1;gbc.gridy=4;
  g1.setConstraints(labelCustPassword,gbc);
  panelObject.add(labelCustPassword);

  gbc.anchor=GridBagConstraints.NORTHWEST;
  gbc.gridx=4;gbc.gridy=4;
  g1.setConstraints(labelCustPassword,gbc);
  panelObject.add(labelCustPassword);

  gbc.anchor=GridBagConstraints.NORTHWEST;
  gbc.gridx=2;gbc.gridy=13;
  g1.setConstraints(buttonLogin,gbc);
  panelObject.add(buttonLogin);

  LoginAction loginRequest=new LoginAction();
  buttonLogin.addActionListener(loginRequest);

  
 }
 
 class LoginAction implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   Object obj=ae.getSource();
   if(obj==buttonLogin)
   { PrintStream out=null;BufferedReader in=null;
    Customer data=new Customer();
    data.custName=textCustName.getText();
    data.custPassword=textCustPassword.getText();
    try{
     Socket toServer;
     toServer=new Socket("localhost",1001);
     out=new PrintStream(toServer.getOutputStream());
     in=new BufferedReader(new InputStreamReader(toServer.getInputStream()));
     ObjectOutputStream streamToServer=new ObjectOutputStream(toServer.getOutputStream());
     
     streamToServer.writeObject((Customer)data);
     BufferedReader fromServer=new BufferedReader(new InputStreamReader(toServer.getInputStream()));
  
     String status=fromServer.readLine();
     getAppletContext().showStatus(status);

     streamToServer.close();
     fromServer.close();
    }
    catch(InvalidClassException e)
    {
     getAppletContext().showStatus("The Customer Class is Invalid "+e);
    }
    catch(NotSerializableException e)
    {
     getAppletContext().showStatus("The Object not Serialized "+e);
    }
    catch(IOException e)
    {
     getAppletContext().showStatus("Cannot write to Server "+e);
    }
   }
  }
 }
 public static void main(String args[])
 { new CustomerApplet(); }
}
class Customer extends Object implements java.io.Serializable
{
 String custName,custPassword;
}

/* <applet code="CustomerApplet.class" height=600 width=800>
</applet>*/