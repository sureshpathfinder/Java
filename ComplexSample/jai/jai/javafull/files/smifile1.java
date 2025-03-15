
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class smifile1 extends Frame implements ActionListener

	{
  		TextArea t1;
		Button b1;
		String s1;
		smifile1()

			{
			setLayout(null);
			t1=new TextArea();
			b1=new Button("click");		
			t1.setBounds(20,20,500,200);
			add(t1);
			b1.setBounds(250,250,50,50);
			add(b1);								b1.addActionListener(this);
			addWindowListener(new a2());
			t1.requestFocus();
		
			}

	public void actionPerformed(ActionEvent e) 
	
		{

			if(e.getActionCommand() =="click")
				s1=t1.getText();

               try {
               byte b[] = s1.getBytes();
	OutputStream f=new FileOutputStream("sample1.txt");
	for(int i = 0 ; i < b.length ; i++)
		{

     		f.write(b[i]);
		}
                     }catch(Exception e1){}
		}

    class a2 extends WindowAdapter
	{


	public void windowClosing(WindowEvent w)

		{

			System.exit(0);
			dispose();

		}

				
			
	}

			


public static void main(String args[]) 
{

smifile1 f1=new smifile1();
f1.setSize(500,500);
f1.setTitle("FILE OF SMITA");
f1.setVisible(true);
}

}

