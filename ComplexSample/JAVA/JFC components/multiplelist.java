import javax.swing.*;
import java.awt.*;
import java.util.*;
public class multiplelist extends JPanel
{
JList list;
public multiplelist()
{

String arr[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
list=new JList();
list.setListData(arr);
list.setSelectedIndex(0);
int mode=ListSelectionModel.SINGLE_INTERVAL_SELECTION;
list.setSelectionMode(mode);
add(new JScrollPane(list),"Center");
}
public static void main(String args[])
{
JFrame jf=new JFrame("List Selection Example");
multiplelist m1=new multiplelist();
jf.setForeground(Color.black);
jf.setBackground(Color.lightGray);
jf.getContentPane().add(m1,"Center");
jf.setVisible(true);
}
}
