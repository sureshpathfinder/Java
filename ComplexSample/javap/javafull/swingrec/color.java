import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class color extends JFrame implements ActionListener
{

JButton showColor,Ok,Cancel;

JColorChooser colorchooser=null;

Container contentpane;

JDialog JD;

JPanel ButtonPanel;

public color()
{
contentpane=this.getContentPane();
ButtonPanel=new JPanel();
Ok=new JButton("Ok");
Cancel=new JButton("Cancel");
ButtonPanel.add(Ok);
ButtonPanel.add(Cancel);

showColor=new JButton("Color Chooser");
colorchooser=new JColorChooser();
contentpane.add(showColor,BorderLayout.NORTH);

JD=new JDialog(this,"JColor Chooser",true);
JD.getContentPane().add(colorchooser,BorderLayout.CENTER);
JD.getContentPane().add(ButtonPanel,BorderLayout.SOUTH);
showColor.addActionListener(this);
Ok.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{getContentPane().setBackground(colorchooser.getColor());
JD.setVisible(false);}});
Cancel.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){JD.setVisible(false);}});
}

public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("Color Chooser"))
{
JD.setLocation(200,200);
JD.setSize(500,500);
JD.setVisible(true);
}
}
public static void main(String args[])
{
color c=new color();
c.setSize(500,500);
c.setVisible(true);
}
}

