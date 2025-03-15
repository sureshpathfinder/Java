import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class mouse extends Applet implements MouseListener,MouseMotionListener
{
  TextField t;
 public void init()
 {
   t=new TextField();
  add(t);
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 public void mousePressed(MouseEvent me)
 {
  showStatus("mouse pressed");
   t.setText("mouse pressed");
 }
public void mouseReleased(MouseEvent me)
 {
  showStatus("mouse released");
   t.setText("mouse  released");
 }
 public void mouseEntered(MouseEvent me)
 {
  showStatus("mouse entered");
   t.setText("mouse entered");
 }
 public void mouseExited(MouseEvent me)
 {
  showStatus("mouse exited");
   t.setText("mouse exited");
 }
 public void mouseMoved(MouseEvent me)
 {
  showStatus("x : "+me.getX()+"y :"+me.getY());
   t.setText("mouse Moved"+"x : "+me.getX()+"y :"+me.getY());
 }
 public void mouseDragged(MouseEvent me)
 {
  showStatus("mouse dragged");
   t.setText("mouse dragged");
 }
 public void mouseClicked(MouseEvent me)
 {
  showStatus("mouse clicked"); 
   t.setText("mouse clicked");
 }
}

