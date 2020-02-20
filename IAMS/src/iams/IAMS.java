/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class IAMS {

    ArrayList<Inventory> inventorylist = new ArrayList<Inventory>();
    String header[] = new String[]{"Item", "Quantity"};
    DefaultTableModel dtm = new DefaultTableModel(header, 1);

    IAMS() {

        JFrame frame = new JFrame("MANAGE INVENTORY");
        frame.setSize(400, 450);

        JLabel jlabel = new JLabel("Type of Items   :");
        jlabel.setBounds(10, 10, 100, 20);
        frame.add(jlabel);

        JLabel jlabela = new JLabel("Quantity   :");
        jlabela.setBounds(10, 30, 100, 20);
        frame.add(jlabela);


        JTextField jtfitem = new JTextField();
        jtfitem.setBounds(110, 10, 200, 20);
        frame.add(jtfitem);

        JTextField jtfquantity = new JTextField();
        jtfquantity.setBounds(110, 30, 150, 20);
        frame.add(jtfquantity);


        JButton jbuttonadd = new JButton("ADD");
        jbuttonadd.setBounds(110, 60, 90, 20);
        frame.add(jbuttonadd);

        JButton jbuttondelete = new JButton("DELETE");
        jbuttondelete.setBounds(210, 60, 90, 20);
        frame.add(jbuttondelete);

        JButton jbuttonedit = new JButton("EDIT");
        jbuttonedit.setBounds(110, 90, 90, 20);
        frame.add(jbuttonedit);

        JButton jbuttonexit = new JButton("BACK");
        jbuttonexit.setBounds(280, 390, 90, 20);
        frame.add(jbuttonexit);

        //table creation
        JTable jtable = new JTable();
        jtable.setBounds(20, 140, 350, 250);
        frame.add(jtable);
        jtable.setModel(dtm);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 140, 350, 250);
        frame.add(scrollPane);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        jbuttonadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String item = jtfitem.getText().toUpperCase();
                String quantity = jtfquantity.getText();
                if (item.length() < 1) {
                    JOptionPane.showMessageDialog(frame, "Item should contain more than 1 char!!!");
                    return;
                }
                if (!isInteger(quantity)) {
                    JOptionPane.showMessageDialog(frame, "Quantity should only contain integer!!!");
                    return;
                }

                Inventory inventory = new Inventory(item, quantity);
                inventorylist.add(inventory);//create object list array
                writeData();
            }
        });

        jbuttondelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String item = JOptionPane.showInputDialog("Item to delete?");
                if (item != null) {
                    System.out.println("not null");
                    for (int i = 0; i < inventorylist.size(); i++) {
                        if (inventorylist.get(i).getItem().equalsIgnoreCase(item)) {
                            inventorylist.remove(i);
                        }
                    }
                    writeData();
                }
            }
        });


        jbuttonedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String quantity = jtfquantity.getText();
                String item = jtfitem.getText();

                if (quantity != null) {
                    for (int i = 0; i < inventorylist.size(); i++) {
                        if (inventorylist.get(i).getQuantity().equalsIgnoreCase(quantity)) {
                            inventorylist.get(i).set(item);
                            JOptionPane.showMessageDialog(frame, "Edited!!!");
                        }
                    }
                }
                writeData();
            }
        });
        jbuttonexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false); //you can't see me!
                frame.dispose();
            }
        });

        readData();
        jtable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtable.getSelectedRow();
                jtfitem.setText(dtm.getValueAt(row, 0).toString());
                jtfquantity.setText(dtm.getValueAt(row, 1).toString());
                
            }
        });

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IAMS iams = new IAMS();

    }

    void readData() { //read data from "data.txt" and display on table
        try {
            File file = new File("data.txt"); //create file
            file.createNewFile();//if not exit
            FileReader f = new FileReader("data.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '-') {
                    System.out.println(sb);
                    String inventoryarray[] = sb.toString().split(",");
                    Inventory inventory = new Inventory(inventoryarray[0], inventoryarray[1]);
                    inventorylist.add(inventory);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            dtm.setRowCount(0); //update table
            for (int i = 0; i < inventorylist.size(); i++) {//populate table using object list
                Object[] objs = {inventorylist.get(i).getItem(), inventorylist.get(i).getQuantity()};
                dtm.addRow(objs);
            }
        } catch (IOException e) {
        }
    }

    private void writeData() { //write data to file "data.txt"
        try (FileWriter f = new FileWriter("data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < inventorylist.size(); i++) {
                sb.append(inventorylist.get(i).getItem() + "," + inventorylist.get(i).getQuantity() + "-");
            }
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            return;
        }
        dtm.setRowCount(0); //update table content
        for (int i = 0; i < inventorylist.size(); i++) {//populate table using object list
            Object[] objs = {inventorylist.get(i).getItem(), inventorylist.get(i).getQuantity()};
            dtm.addRow(objs);
        }
    }

    public boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
