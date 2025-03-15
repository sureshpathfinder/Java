import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class intro3 extends Applet implements ActionListener

	{

		Label l1,l2,l3;
		Button b1,b2,b3;
		TextField t1,t2,t3;
		public void init()


			{
				setLayout(new FlowLayout(FlowLayout.LEFT,30,50));
				l1=new Label("number1");
				l2=new Label("number2");
				l1.setBackground(Color.green);
				l2.setBackground(Color.red);
				l3=new Label("n3");
				l3.setBackground(Color.blue);
				b1=new Button("click");
				b1.setBackground(Color.cyan);
				b2=new Button("stringclick");
				b2.setBackground(Color.orange);
				b3=new Button("clear");
				b3.setBackground(Color.gray);

				t1=new TextField(10);
				t1.setBackground(Color.magenta);
				t2=new TextField(10);
				t2.setBackground(Color.pink);
				t3=new TextField(10);
				t3.setBackground(Color.yellow);
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
				t1.requestFocus();
		}
		
		public void actionPerformed(ActionEvent a1)

			{

				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a+b;
				if((a1.getActionCommand()) =="click")
				t3.setText(""+c);
				else 
			if((a1.getActionCommand()) =="stringclick")
				t3.setText(t1.getText()+t2.getText());
			else
			  if((a1.getActionCommand()) =="clear")	
				{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t1.requestFocus();
				}
			}

}

/*<applet code=intro3 width=300 height=300>
</applet>*/