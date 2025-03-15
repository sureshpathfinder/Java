import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class appmenu1 extends Frame implements ActionListener
{
        MenuBar mb;
        Menu file,karthik,sub,checkbox;
        MenuItem red,green,blue;
        public appmenu1(String title)
        {
//Creating Menu Bar
                mb=new MenuBar();
                setMenuBar(mb);

//Creating File menu
                file=new Menu("File");

//Creating MenuItems to File Menu
                red=new MenuItem("Red");
                green=new MenuItem("Green");
                blue=new MenuItem("Blue");
//Adding MenuItems to file menu
                file.add(red);
                file.add(green);
                file.add(blue);

//Adding File menu to menubar
                mb.add(file);

//Creating Karthik Menu
                karthik=new Menu("Karthik");
                MenuItem kanya=new MenuItem("Kanya");
                MenuItem vidya=new MenuItem("Vidya");
                MenuItem jothi=new MenuItem("Jothi");
                karthik.add(kanya);
                karthik.add(vidya);
                karthik.add(jothi);
	karthik.addSeparator();
//Creating SubMenu
                sub=new Menu("Festivals");
                MenuItem d=new MenuItem("Deepavali");
                MenuItem p=new MenuItem("Pongal");
                MenuItem n=new MenuItem("New Year");
                sub.add(d);
                sub.add(p);
                sub.add(n);

//adding sub menu in karthik menu
                karthik.add(sub);

//creating checkbox menuitems
                checkbox=new Menu("Checkbox");
                CheckboxMenuItem g=new CheckboxMenuItem("Goat");
                CheckboxMenuItem c=new CheckboxMenuItem("Cow");
                checkbox.add(g);
                checkbox.add(c);
                karthik.add(checkbox);


        
//adding karthik to menubar
                mb.add(karthik);

                red.addActionListener(this);
                green.addActionListener(this);
                blue.addActionListener(this);
                addWindowListener(new a());
        }
        public void actionPerformed(ActionEvent e)
        {
                String s=e.getActionCommand();
                if(s.equals("Red"))
                {
                        setBackground(Color.red);
                }
                if(s.equals("Green"))
                {
                        setBackground(Color.green);
                }
                if(s.equals("Blue"))
                {
                        setBackground(Color.blue);
                }
                
        }
        class a extends WindowAdapter
        {
             public void windowClosing(WindowEvent e)
             {
                     setVisible(false);
                      System.exit(0);
              }
         }
         public static void main(String ar[])
         {
                appmenu1 f=new appmenu1(" ");
                f.setVisible(true);
                f.setSize(400,400);
                f.setTitle("Karthik's Menu");
                f.show();
         }
}
