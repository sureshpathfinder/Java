import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class DataBase extends Frame implements ActionListener
{
	Connection c;
	Statement s;
	ResultSet r;
	TextField t1, t2, t3, t4;
	TextArea ta;
	Label l1, l2, l3, l4;
	Button b1, b2, b3, b4, b5;
    DataBase(String a)
	{
		super(a);
		dbConnection();
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		ta = new TextArea();
		b1 = new Button("Insert");
		b2 = new Button("Update");
		b3 = new Button("Delete");
		b4 = new Button("Result");
		b5 = new Button("Exit");
		l1 = new Label("Rollno");
		l2 = new Label("Name");
		l3 = new Label("Age");
		l4= new Label("Class");
		setLayout(new FlowLayout());
		add(l1); add(t1); add(l2); add(t2); add(l3); add(t3); add(l4); add(t4);
		add(b1); add(b2); add(b3); add(b4); add(b5); add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
      }
	void dbConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c = DriverManager.getConnection("jdbc:odbc:demo");
		    s = c.createStatement();
		}
		catch (SQLException e) { }
		catch (ClassNotFoundException e) { }
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() ==b1)
		{
			try
			{
				s.executeQuery("insert into student values(" + t1.getText() + ",'" + t2.getText() + "'," + t3.getText() + ",'" + t4.getText() + "')");
			}
			catch (SQLException s) { }
			}
		if (e.getSource() == b2)
		{
			try
			{
				s.executeUpdate("update student set Age="+t3.getText()+"  where Rollno="+t1.getText()+" ");
			}
			catch (SQLException s) { }

		}
		if (e.getSource() == b3)
		{
			try
			{
				s.executeUpdate("delete from student where Rollno=" + t1.getText() + "");
			}
			catch (SQLException s) { }
		}
		if (e.getSource() == b4)
		{
			ta.setText("");
			try
			{
				r = s.executeQuery("select * from student");
				while (r.next())
				{
					ta.append(r.getInt(1) + "\t" + r.getString(2) + "\t" + r.getInt(3) + "\t" + r.getString(4)+"\n");
				}
			}
			catch (SQLException s)
			{
			}
		}
		if (e.getSource() == b5)
		{
			System.exit(0);
		}
	}
public static void main(String args[]) 
{
	DataBase d = new DataBase("JDBC");
	d.setVisible(true);
	d.setSize(500, 500);
}
}