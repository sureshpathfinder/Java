import java.applet.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

class frontback1 extends Applet implements ActionListener

	{

		Label l1,l2,l3;
		TextField t1,t2,t3;
		Button b1,b2,b3;
	                   Connection con=DriverManager.getConnection("jdbc:odbc:ram","sa","");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str="";

        PreparedStatement psmt=con.prepareStatement("insert into worker values(?,?,?)");




		public void init()
		{
			t1=new 			TextField(10);
			t2=new 			TextField(10);
			t3=new 			TextField(10);
			b1=new 			Button("click");
			b2=new Button();
			b3=new Button();
			l1=new Label();
			l2=new Label();
			l3=new Label();
					b1.addActionListener(this);
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(l3);
			add(t3);
			add(b1);
			t1.requestFocus();

		}


public void actionPerformed(ActionEvent a1)

	{
 		String s="";
		int a,b;

try

	{


		if(a1.getActionCommand() == "click")

                                   {
			do
 				{

                  
				
				a=Integer.parseInt(t1.getText());
				
			s=t2.getText();
				
				b=Integer.parseInt(t3.getText());
            psmt.setInt(1,a);
            psmt.setString(2,s);
            psmt.setInt(3,b);
            psmt.executeUpdate();
            System.out.println("Enter (yes) for insert (no) for quit");
        }
        while((str=br.readLine()).equals("yes"));

}
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from worker");
        System.out.println("Recordset Selected");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }

}catch(Exception e){}

    }



		      }					

	