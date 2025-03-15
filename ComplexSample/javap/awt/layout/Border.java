import java.awt.*; 
 
public class Border extends java.applet.Applet 
{  
    public void init()
    { 
        setLayout( new BorderLayout()); 
        add( new Button("North"), "North" ); 
        add( new Button("East"), "East" ); 
        add( new Button("South"), "South" ); 
        add( new Button("West"), "West" ); 
        add( new Button("Center"), "Center" ); 
    } 
} 
