import java.awt.*;
import java.awt.event.*;

public class CloseButton{
  public static void main(String[] args){
    Frame frame = new Frame("Close Operation Frame");
    Label lbl = new Label("Welcome in Frame",Label.CENTER);
    frame.add(lbl);
    frame.setSize(400,400);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });
  }
}

