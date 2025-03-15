import java.awt.*;
import java.applet.*;
import javax.swing.*;


public class jtabl extends JApplet
{
JTable jt;
Container c;
Object o[][]={{"100","aa","8000"},{"101","bb","5000"},{"102","cc","10000"}};
Object cols[]={"eno","ename","sal"};
public void init()
{
c=getContentPane();
c.setLayout(new BorderLayout());
jt=new JTable(o,cols);
JScrollPane scrollPane = new JScrollPane(jt);
c.add(scrollPane, BorderLayout.CENTER);
}
}
//<applet code="jtabl" width="400" height="50"></applet>



