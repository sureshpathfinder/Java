import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Table extends JFrame {

    public Table() {
        super("Table");

        Object[][] data = {
            {"Karthik", "Naidu", 
             "B.Sc Computers", new Integer(22), new Boolean(true)},
            {"Gayathri", "Iyer", 
             "B.Com", new Integer(19), new Boolean(true)},
            {"Santhosh", "Naidu",
             "B.E", new Integer(20), new Boolean(false)},
            {"Vishal", "Suchde",
             "M.C.A", new Integer(22), new Boolean(false)},
            {"Susan", "Henchard",
             "Beautician", new Integer(21), new Boolean(false)}
        };

        String[] columnNames = {"First Name", 
                                "Last Name",
                                "Qualification",
                                "Age",
                                "Vegetarian"};

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));


        //Create the scroll pane and add the table to it. 
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this window.
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Table frame = new Table();
        frame.pack();
        frame.setVisible(true);
    }
}
