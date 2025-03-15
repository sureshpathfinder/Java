import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;
import java.awt.*;

public class tree1 extends JFrame
{
  JTree tr;
  JTextField tf;
  TreePath tp;

  tree1()
  {
     Container c=getContentPane();

     tf=new JTextField(20);
     c.add("South",tf);

     DefaultMutableTreeNode root=new 
DefaultMutableTreeNode("Top");
     DefaultMutableTreeNode parent1=new 
DefaultMutableTreeNode("parent1");
     DefaultMutableTreeNode c1=new 
DefaultMutableTreeNode("child1");
     DefaultMutableTreeNode c2=new 
DefaultMutableTreeNode("child2");
     parent1.add(c1);
     parent1.add(c2);
     root.add(parent1);
     DefaultMutableTreeNode parent2=new 
DefaultMutableTreeNode("parent2");
     DefaultMutableTreeNode c3=new DefaultMutableTreeNode("child3");
     DefaultMutableTreeNode c4=new DefaultMutableTreeNode("child4");
     parent2.add(c3);
     parent2.add(c4);
     root.add(parent2);
     tr=new JTree(root);
     c.add(tr);
     tr.addMouseListener(new MouseAdapter()
     {       public void mouseClicked(MouseEvent e)
       {
         tp=tr.getPathForLocation(e.getX(),e.getY());
         if(tp!=null)
        {
         tf.setText(""+tp);
       }
       else
       tf.setText(" ");
       }
       });
       }
       public static void main(String args[])
       {
          tree1 t=new tree1();
          t.setSize(300,300);
          t.show();
          }
          }
