import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class cursors extends Applet implements ActionListener
{
     Button bb1,bb2,bb3,bb4,bb5;
     Cursor cr;
     public void init()
     {
          setBackground(Color.cyan);
          bb1=new Button("NormalPointers");
          bb2=new Button("CrossHairPointers");
          bb3=new Button("HandPointers");
          bb4=new Button("TextPointers");
          bb5=new Button("MovePointers");
          add(bb1);
          add(bb2);
          add(bb3);
          add(bb4);
          add(bb5);
          bb1.addActionListener(this);
          bb2.addActionListener(this);
          bb3.addActionListener(this);
          bb4.addActionListener(this);
          bb5.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
     {
          if(ae.getSource()==bb1)
          {
               cr=new Cursor(Cursor.DEFAULT_CURSOR);
               setCursor(cr);
          }
          if(ae.getSource()==bb2)
          {
               cr=new Cursor(Cursor.CROSSHAIR_CURSOR);
               setCursor(cr);
          }
          if(ae.getSource()==bb3)
          {
               cr=new Cursor(Cursor.HAND_CURSOR);
               setCursor(cr);
          }
          if(ae.getSource()==bb4)
          {
               cr=new Cursor(Cursor.TEXT_CURSOR);
               setCursor(cr);
          }
          if(ae.getSource()==bb5)
          {
               cr=new Cursor(Cursor.WAIT_CURSOR);
               setCursor(cr);
          }
     }
}
//<applet code=cursors.class width=500 height=400></applet>
