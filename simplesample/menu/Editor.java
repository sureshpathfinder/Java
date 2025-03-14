import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.io.*;
public class Editor extends Frame
{
String filename;
TextArea tx;
Clipboard clip=getToolkit().getSystemClipboard();
Editor()
{
setLayout(new GridLayout(1,1));
tx=new TextArea();
add(tx);
MenuBar mb=new MenuBar();
Menu F=new Menu("File");
MenuItem n=new MenuItem("New");
MenuItem o=new MenuItem("Open");
MenuItem s=new MenuItem("Save");
MenuItem e=new MenuItem("Exit");
n.addActionListener(new New());
F.add(n);
o.addActionListener(new Open());
F.add(o);
s.addActionListener(new Save());
F.add(s);
e.addActionListener(new Exit());
F.add(e);
mb.add(F);
Menu E=new Menu("Edit");
MenuItem cut=new MenuItem("Cut");  
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
cut.addActionListener(new Cut());
E.add(cut);
copy.addActionListener(new Copy());
E.add(copy);
paste.addActionListener(new Paste());
E.add(paste);
mb.add(E);
setMenuBar(mb);
}
}


