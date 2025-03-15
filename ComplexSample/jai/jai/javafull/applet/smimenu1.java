import java.awt.*;
import java.awt.event.*;

public class smimenu1 extends Frame implements ActionListener

	{
  		
		MenuBar mb1;		
		Menu file,edit,format,help;
		MenuItem red,green ,blue;
		public smimenu1(String t)

		{

			mb1=new MenuBar();
			setMenuBar(mb1);
			file=new Menu("FILE");
			edit=new Menu("EDIT");
			format=new Menu("FORMAT");
			help=new Menu("HELP");
			red=new MenuItem("RED");
			green=new MenuItem("GREEN");
			blue=new MenuItem("BLUE");
			file.add(red);
			file.add(green);
			file.add(blue);
			mb1.add(file);
			

			mb1.add(edit);
			mb1.add(format);
			mb1.add(help);

			red.addActionListener(this);
			green.addActionListener(this);
			blue.addActionListener(this);
			addWindowListener(new a2());

	}

		public void actionPerformed(ActionEvent e1)

		{
   
			String s;
			s=e1.getActionCommand();
			if(s.equals("RED"))
				setBackground(Color.red);
			else
			if(s.equals("GREEN"))
				setBackground(Color.green);
			else
			if(s.equals("BLUE"))
				setBackground(Color.blue);
		}


	class a2 extends WindowAdapter

		{
		public void windowClosing(WindowEvent w)

			{
				dispose();
				System.exit(0);

			}


		}
	public static void main(String ar[])

	{
		smimenu1 s2=new smimenu1(" ");
		s2.setSize(500,500);
		s2.setVisible(true);
		s2.setTitle("SUCHISMITA");
	}


}
				
