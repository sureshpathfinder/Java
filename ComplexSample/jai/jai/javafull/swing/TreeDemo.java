import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TreeDemo extends JFrame
{
        JTree tree;
        JTextField jtf;
        public TreeDemo()
        {
                JPanel cp=(JPanel)getContentPane();
                cp.setLayout(new FlowLayout());
                DefaultMutableTreeNode top=new DefaultMutableTreeNode("C:");
                DefaultMutableTreeNode a=new DefaultMutableTreeNode("Windows");
                top.add(a);
                DefaultMutableTreeNode a1=new DefaultMutableTreeNode("System");
                top.add(a1);
                DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Color");
                top.add(a2);
                tree = new JTree(top);
                int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
                int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
                JScrollPane jsp=new JScrollPane(tree,v,h);
                cp.add(jsp,BorderLayout.CENTER);
                jtf=new JTextField("",20);
                cp.add(jtf,BorderLayout.SOUTH);
                tree.addMouseListener(new MouseAdapter()
                {
                        public void mouseClicked(MouseEvent e)
                        {
                                domouseClicked(e);
                        }
                });
        }
        void domouseClicked(MouseEvent e)
        {
                TreePath tp=tree.getPathForLocation(e.getX(),e.getY());
                if(tp!=null)
                        jtf.setText(tp.toString());
                        else
                        jtf.setText("");
        }
        public static void main(String ar[])
        {
                TreeDemo f=new TreeDemo();
                f.setVisible(true);
                f.setSize(400,200);
                f.setTitle("Karthik's Tree Demo");
        }
               

}







