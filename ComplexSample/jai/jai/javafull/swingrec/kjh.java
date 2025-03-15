import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class kjh extends JFrame implements ChangeListener,ActionListener
{
	JSlider js;
	JProgressBar jpb;
        kjh()
	{
		super("JSlider/JProgressBar");
		js=new JSlider(JSlider.HORIZONTAL,0,300,10);
//		js=new JSlider(JSlider.HORIZONTAL,0,300,10);
		jpb=new JProgressBar();
		js.setMajorTickSpacing(50);
		js.setMinorTickSpacing(10);
	js.setPaintTicks(true);
	js.setPaintLabels(true);
        jpb.setMaximum(300);
	jpb.setMinimum(0);
	jpb.setValue(0);
	js.addChangeListener(this);
	Container cp=getContentPane();
	cp.add("North",js);
	cp.add("South",jpb);
	setSize(400,300);
	setVisible(true);
	}
	public void stateChanged(ChangeEvent ce)
	{
		if(ce.getSource()==js)
		{
                        jpb.setValue(js.getValue());
		}
	}
	public static void main(String ar[])
	{
                kjh jsp=new kjh();
	}
}
	
	
		
		

