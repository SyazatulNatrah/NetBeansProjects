/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiasnaf;

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
public class GuiAsnaf {

    ArrayList<Asnaf> asnaflist = new ArrayList<Asnaf>();
    String header[] = new String[]{"IC", "Name", "Address", "Monthly Income", "Date", "No. Family Member", "Monthly Received"};
    DefaultTableModel dtm = new DefaultTableModel(header, 1);

    GuiAsnaf() {

        JFrame frame = new JFrame("Asnaf Registration System");
        frame.setSize(850, 550);

        JLabel jlabel = new JLabel("Name");
        jlabel.setBounds(30, 10, 150, 20);
        frame.add(jlabel);

        JLabel jlabela = new JLabel("IC Number");
        jlabela.setBounds(30, 30, 150, 20);
        frame.add(jlabela);

        JLabel jlabelb = new JLabel("Address");
        jlabelb.setBounds(30, 50, 150, 20);
        frame.add(jlabelb);

        JLabel jlabelc = new JLabel("Monthly Income");
        jlabelc.setBounds(30, 70, 150, 20);
        frame.add(jlabelc);

        JLabel jlabeld = new JLabel("Date Registration");
        jlabeld.setBounds(30, 90, 150, 20);
        frame.add(jlabeld);

        JLabel jlabele = new JLabel("Number of Family Member");
        jlabele.setBounds(30, 110, 150, 20);
        frame.add(jlabele);

        JLabel jlabelf = new JLabel("Monthly Received");
        jlabelf.setBounds(30, 130, 150, 20);
        frame.add(jlabelf);

        JTextField jtfname = new JTextField();
        jtfname.setBounds(190, 10, 230, 20);
        frame.add(jtfname);

        JTextField jtfIC = new JTextField();
        jtfIC.setBounds(190, 30, 200, 20);
        frame.add(jtfIC);

        JTextField jtfaddress = new JTextField();
        jtfaddress.setBounds(190, 50, 200, 20);
        frame.add(jtfaddress);

        JTextField jtfincome = new JTextField();
        jtfincome.setBounds(190, 70, 200, 20);
        frame.add(jtfincome);

        JTextField jtfdate = new JTextField();
        jtfdate.setBounds(190, 90, 200, 20);
        frame.add(jtfdate);

        JTextField jtffamily = new JTextField();
        jtffamily.setBounds(190, 110, 200, 20);
        frame.add(jtffamily);

        JTextField jtfreceived = new JTextField();
        jtfreceived.setBounds(190, 130, 200, 20);
        frame.add(jtfreceived);

        JButton jbuttoninsert = new JButton("INSERT");
        jbuttoninsert.setBounds(190, 160, 90, 20);
        frame.add(jbuttoninsert);

        JButton jbuttondelete = new JButton("DELETE");
        jbuttondelete.setBounds(300, 160, 90, 20);
        frame.add(jbuttondelete);

        JButton jbuttonsearch = new JButton("SEARCH");
        jbuttonsearch.setBounds(190, 190, 90, 20);
        frame.add(jbuttonsearch);

        JButton jbuttonupdate = new JButton("UPDATE");
        jbuttonupdate.setBounds(300, 160, 90, 20);
        frame.add(jbuttonupdate);

        JButton jbuttonexit = new JButton("EXIT");
        jbuttonexit.setBounds(710, 480, 100, 20);
        frame.add(jbuttonexit);

        //table creation
        JTable jtable = new JTable();
        jtable.setBounds(20, 220, 500, 250);
        frame.add(jtable);
        jtable.setModel(dtm);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 220, 800, 250);
        frame.add(scrollPane);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(300);
        jtable.getColumnModel().getColumn(2).setPreferredWidth(250);
        jtable.getColumnModel().getColumn(3).setPreferredWidth(290);
        jtable.getColumnModel().getColumn(4).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(5).setPreferredWidth(310);
        jtable.getColumnModel().getColumn(6).setPreferredWidth(290);

        jbuttoninsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = jtfname.getText().toUpperCase();
                String IC = jtfIC.getText();
                String address = jtfaddress.getText();
                String income = jtfincome.getText();
                String date = jtfdate.getText();
                String family = jtffamily.getText();
                String received = jtfreceived.getText();
                if (name.length() < 5) {
                    JOptionPane.showMessageDialog(frame, "Name should contain more than 5 char!!!");
                    return;
                }
                if (!isInteger(IC)) {
                    JOptionPane.showMessageDialog(frame, "IC should only contain integer!!!");
                    return;
                }

                Asnaf asnaf = new Asnaf(name, IC, address, income, date, family, received);
                asnaflist.add(asnaf);//create object list array
                writeData();
            }
        });

        jbuttondelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String IC = JOptionPane.showInputDialog("IC number to delete?");
                if (IC != null) {
                    System.out.println("not null");
                    for (int i = 0; i < asnaflist.size(); i++) {
                        if (asnaflist.get(i).getIC().equalsIgnoreCase(IC)) {
                            asnaflist.remove(i);
                        }
                    }
                    writeData();
                }
            }
        });

        jbuttonsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String IC = JOptionPane.showInputDialog("Enter IC Number?");
                if (IC != null) {
                    for (int i = 0; i < asnaflist.size(); i++) {
                        if (asnaflist.get(i).getIC().equalsIgnoreCase(IC)) {
                            JOptionPane.showMessageDialog(frame, "Found!!!");
                            jtfIC.setText(asnaflist.get(i).getIC());
                            jtfname.setText(asnaflist.get(i).getName());
                            jtfaddress.setText(asnaflist.get(i).getAddress());
                            jtfincome.setText(asnaflist.get(i).getIncome());
                            jtfdate.setText(asnaflist.get(i).getDate());
                            jtffamily.setText(asnaflist.get(i).getFamily());
                            jtfreceived.setText(asnaflist.get(i).getReceived());
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Not Found!!!");
                }
            }
        });

        jbuttonupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String IC = jtfIC.getText();
                String name = jtfname.getText();
                String address = jtfaddress.getText();
                String income = jtfincome.getText();
                String date = jtfdate.getText();
                String family = jtffamily.getText();
                String received = jtfreceived.getText();

                if (IC != null) {
                    for (int i = 0; i < asnaflist.size(); i++) {
                        if (asnaflist.get(i).getIC().equalsIgnoreCase(IC)) {
                            asnaflist.get(i).setName(name);
                            asnaflist.get(i).setAddress(address);
                            asnaflist.get(i).setIncome(income);
                            asnaflist.get(i).setDate(date);
                            asnaflist.get(i).setFamily(family);
                            asnaflist.get(i).setReceived(received);

                            JOptionPane.showMessageDialog(frame, "Updated!!!");
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
                jtfIC.setText(dtm.getValueAt(row, 0).toString());
                jtfname.setText(dtm.getValueAt(row, 1).toString());
                jtfaddress.setText(dtm.getValueAt(row, 2).toString());
                jtfincome.setText(dtm.getValueAt(row, 3).toString());
                jtfdate.setText(dtm.getValueAt(row, 4).toString());
                jtffamily.setText(dtm.getValueAt(row, 5).toString());
                jtfreceived.setText(dtm.getValueAt(row, 6).toString());
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
        GuiAsnaf guiasnaf = new GuiAsnaf();

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
                    String asnafarray[] = sb.toString().split(",");
                    Asnaf asnaf = new Asnaf(asnafarray[0], asnafarray[1], asnafarray[2], asnafarray[3], asnafarray[4], asnafarray[5], asnafarray[6]);
                    asnaflist.add(asnaf);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            dtm.setRowCount(0); //update table
            for (int i = 0; i < asnaflist.size(); i++) {//populate table using object list
                Object[] objs = {asnaflist.get(i).getIC(), asnaflist.get(i).getName(), asnaflist.get(i).getAddress(), asnaflist.get(i).getIncome(), asnaflist.get(i).getDate(), asnaflist.get(i).getFamily(), asnaflist.get(i).getReceived()};
                dtm.addRow(objs);
            }
        } catch (IOException e) {
        }
    }

    private void writeData() { //write data to file "data.txt"
        try (FileWriter f = new FileWriter("data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < asnaflist.size(); i++) {
                sb.append(asnaflist.get(i).getName() + "," + asnaflist.get(i).getIC() + "," + asnaflist.get(i).getAddress() + "," + asnaflist.get(i).getIncome() + "," + asnaflist.get(i).getDate() + "," + asnaflist.get(i).getFamily() + "," + asnaflist.get(i).getReceived() +  "-");
            }
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            return;
        }
        dtm.setRowCount(0); //update table content
        for (int i = 0; i < asnaflist.size(); i++) {//populate table using object list
            Object[] objs = {asnaflist.get(i).getIC(), asnaflist.get(i).getName(), asnaflist.get(i).getAddress(), asnaflist.get(i).getIncome(), asnaflist.get(i).getDate(), asnaflist.get(i).getFamily(), asnaflist.get(i).getReceived()};
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

