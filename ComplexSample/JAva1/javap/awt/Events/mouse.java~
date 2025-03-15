import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class mouse extends Applet implements MouseListener,MouseMotionListener
{
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		showStatus("mouse pressed");
	}
public void mouseReleased(MouseEvent me)
	{
		showStatus("mouse released");
	}
	public void mouseEntered(MouseEvent me)
	{
		showStatus("mouse entered");
	}
	public void mouseExited(MouseEvent me)
	{
		showStatus("mouse exited");
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("x : "+me.getX()+"y :"+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("mouse dragged");
	}
	public void mouseClicked(MouseEvent me)
	{
		showStatus("mouse clicked");	
	}
}

//<applet code=mouse width=400 height=400></applet>