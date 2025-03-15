import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class textfield extends Applet implements ActionListener
{

TextField t1,t2,t3;
Button b1,b2,b3;

Label l1,l2,l3;

public void init()
{

t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);

b1=new Button("add");
b2=new Button("clear");
b3=new Button("multiply");


l1=new Label("enter first no:");
l2=new Label("enter second no:");
l3=new Label("Result  : ");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);

add(b1);
add(b2);
add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

}


public void actionPerformed(ActionEvent e)
{
               int a,b,c;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());


        if(e.getSource()==b1)
        {
                c=a+b;
                t3.setText(""+c);
        }

         else if(e.getSource()==b3)

         {
                 c=a*b;
                 t3.setText(""+c);
         }

         else
         {

         t1.setText("");
         t2.setText("");
         t3.setText("");
         }
 }

 }

 //<applet code=textfield width=300 height=400></applet>
