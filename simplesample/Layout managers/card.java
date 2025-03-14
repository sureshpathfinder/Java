import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet CODE="card" WIDTH=250 HEIGHT=300>
</applet> */
public class card extends Applet implements ActionListener,MouseListener
{
 Panel mp;
CardLayout cl;
Checkbox winnt,win,soloris,mac;
Button Window,Other;
	public void init()
	{
		Window=new Button("Window");
		Other=new Button("Other");
		add(Window);
		add(Other);
		cl=new CardLayout();
		mp=new Panel(cl);
		win=new Checkbox("Windows 98");
		winnt=new Checkbox("Windows NT");
		soloris=new Checkbox("Soloris");
		mac=new Checkbox("Mac 8");
		Panel winpan=new Panel();
		winpan.add(win);
		winpan.add(winnt);
		Panel other=new Panel();
		other.add(soloris);
		other.add(mac);
		mp.add(winpan,"Windows");
		mp.add(other,"Others");
		add(mp);
		Window.addActionListener(this);
		Other.addActionListener(this);
		addMouseListener(this);
	}

public void mousePressed(MouseEvent me){ 
cl.next(mp);
}
public void mouseEntered(MouseEvent me){}
public void mouseClicked(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mouseReleased(MouseEvent me){}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==Window)
	{
	cl.show(mp,"Windows");
		}		
	else
	{
	cl.show(mp,"Others");
	}
}
}	
