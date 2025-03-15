import java.awt.*;
import java.awt.event.*;

public class smidialog extends Frame

	{
		
		smidialog()

		{
				addWindowListener(new b());
		}
class b extends WindowAdapter
	{
		public void windowClosing(WindowEvent w)
			 {
			   setVisible(false);
			   dispose();
			   System.exit(0);
			 }

	}


		public static void main (String ar[])
			{

			smidialog s1=new smidialog();
			s1.setSize(400,400);
			s1.setVisible(true);
			s1.setTitle("smita");
		FileDialog f1=new FileDialog(s1,"open1");
				f1.setVisible(true);
			}

}