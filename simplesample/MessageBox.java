import java.awt.*;
import java.awt.event.*;
public class MessageBox extends Dialog
{
MessageBox(Frame fm,String lab)
{
super(fm,"Message",true);
setLayout(new GridLayout(2,1,0,0));
Panel p1=new Panel();
Panel p2=new Panel();
Button b1,b2;
p1.setFont(new Font("TimesRoman",Font.BOLD,18));
p1.setLayout(new FlowLayout(FlowLayout.CENTER,20,15));
p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
p1.add(new Label(lab));
b1=new Button("ok");
b1.addActionListener(new B1());
p2.add(b1);
b2=new Button("cancel");
b2.addActionListener(new B1());
p2.add(b2);
add(p1);
add(p2);
setSize(350,125);
setTitle("Message Box");
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent w){
System.exit(0);
}
}
);
}
class B1 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
try
{
System.exit(0);
}
catch(Exception n)
{
}
}
}
}

 
