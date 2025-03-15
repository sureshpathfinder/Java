import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
public class ReportClient1
{
public static void main(String args[])
{
try
{
final ReportInt1 ServerReportArea=(ReportInt1)Naming.lookup("ReportServer1");
Frame f=new Frame("Branch Report");
Panel ptext=new Panel();
Panel pbutton=new Panel();
ptext.setLayout(new GridLayout(5,1));
pbutton.setLayout(new BorderLayout());
final Label clilbbr=new Label("Branch Name");
final Label clilbproj=new Label("Project Name");
final Label clilbcli=new Label("No. of clients joined");
final Label clilbpro=new Label("Profit from the client side");
final TextField clitfbr=new TextField(7);
final TextField clitfproj=new TextField(7);
final TextField clitfcli=new TextField(7);
final TextField clitfpro=new TextField(7);
final TextField clitext=new TextField(25);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
f.setLayout(new BorderLayout());
ptext.add(clilbbr);
ptext.add(clitfbr);
ptext.add(clilbproj);
ptext.add(clitfproj);
ptext.add(clilbcli);
ptext.add(clitfcli);
ptext.add(clilbpro);
ptext.add(clitfpro);
Button apply=new Button("send to Head office");
pbutton.add("South",apply);
apply.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
try
{
ServerReportArea.appendText("Branch name");
ServerReportArea.appendText(clitfbr.getText()+"\n\n");
ServerReportArea.appendText("Course Name :");
ServerReportArea.appendText(clitfproj.getText()+"\n");
ServerReportArea.appendText("No. of projects come : ");
ServerReportArea.appendText(clitfcli.getText()+"\n");
ServerReportArea.appendText("profit from the client");
ServerReportArea.appendText(clitfpro.getText()+"\n");
ServerReportArea.appendText("----------------\n");
ServerReportArea.appendText("\n");
}
catch(Exception e)
{
}
}
}
);
f.add("North",ptext);
f.add("South",pbutton);
f.setVisible(true);
}
catch(Exception e)
{
System.exit(0);
}
}
}






