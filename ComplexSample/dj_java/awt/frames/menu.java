import java.awt.*;
import java.awt.event.*;

public class menu extends Frame implements ActionListener,ItemListener
{
 Menu m1,m2;
 MenuItem mi1,mi2,mi3,mi4;
 MenuBar mb;
 CheckboxMenuItem cbm1;
 TextField t1;
 Label l1;
 menu()
 {
  setVisible(true);
  setTitle("Frame Window");
  setSize(400,400);
  setLayout(new FlowLayout());
  m1 = new Menu("File");
  m2 = new Menu("Edit");
  mi1 = new MenuItem("New"); 
  mi2 = new MenuItem("Open");
  mi3 = new MenuItem("Undo");
  mi4 = new MenuItem("Redo");
 cbm1 = new CheckboxMenuItem("Click");
  m1.add(mi1);
  m1.add(mi2);
  m2.add(mi3);
  m2.add(mi4);
  m2.addSeparator();
  m2.add(cbm1);
  mb = new MenuBar();
  mb.add(m1);
  mb.add(m2);
  setMenuBar(mb);
  t1 = new TextField(18);
  add(t1);
  l1 = new Label("Checked");
  add(l1);
  mi1.addActionListener(this);
  mi2.addActionListener(this);
  mi3.addActionListener(this);
  mi4.addActionListener(this);
  cbm1.addItemListener(this);
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent we)
   {
   System.exit(0);
   }
  });
 }
public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==mi1)
  {
   t1.setText(mi1.getLabel());
  }
  else if(ae.getSource()==mi2)
  {
   t1.setText(mi2.getLabel());
  }
  else if(ae.getSource()==mi3)
  {
   t1.setText(mi3.getLabel());
  }
  else if(ae.getSource()==mi4)
  {
   t1.setText(mi4.getLabel());
  }
 }
 public void itemStateChanged(ItemEvent ie)
 {
  if(cbm1.getState()==true)
   l1.setText("Checked"); 
  else 
   l1.setText("Not Checked");
 }
 public static void main(String args[])
 { 
  menu me =new menu();
  me.setSize(400, 400);
  me.setVisible(true);
 }
}