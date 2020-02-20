/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
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
public class LabTest {

    ArrayList<Cattle> cattlelist = new ArrayList<Cattle>();
    String header[] = new String[]{"Id", "Weight", "Breed Type", "Date Registered"};
    DefaultTableModel dtm = new DefaultTableModel(header, 1);

    LabTest() {

        JFrame frame = new JFrame("Cattle System Information");
        frame.setSize(400, 450);

        JLabel jlabel = new JLabel("Id");
        jlabel.setBounds(10, 10, 60, 20);
        frame.add(jlabel);

        JLabel jlabela = new JLabel("Weight");
        jlabela.setBounds(10, 30, 60, 20);
        frame.add(jlabela);

        JLabel jlabelb = new JLabel("Breed Type");
        jlabelb.setBounds(10, 50, 100, 20);
        frame.add(jlabelb);

        JLabel jlabelc = new JLabel("Date Registered");
        jlabelc.setBounds(10, 70, 100, 20);
        frame.add(jlabelc);

        JTextField jtfid = new JTextField();
        jtfid.setBounds(120, 10, 100, 20);
        frame.add(jtfid);

        JTextField jtfweight = new JTextField();
        jtfweight.setBounds(120, 30, 100, 20);
        frame.add(jtfweight);

        JTextField jtfbreedtype = new JTextField();
        jtfbreedtype.setBounds(120, 50, 100, 20);
        frame.add(jtfbreedtype);

        JTextField jtfdateregistered = new JTextField();
        jtfdateregistered.setBounds(120, 70, 100, 20);
        frame.add(jtfdateregistered);

        JButton jbuttoninsert = new JButton("INSERT");
        jbuttoninsert.setBounds(120, 90, 90, 20);
        frame.add(jbuttoninsert);

        //table creation
        JTable jtable = new JTable();
        jtable.setBounds(20, 140, 250, 250);
        frame.add(jtable);
        jtable.setModel(dtm);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 140, 350, 250);
        frame.add(scrollPane);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(70);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtable.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtable.getColumnModel().getColumn(3).setPreferredWidth(150);

        jbuttoninsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String id = jtfid.getText();
                String weight = jtfweight.getText();
                String breedType = jtfbreedtype.getText();
                String dateRegistered = jtfdateregistered.getText();
                if (!isInteger(id)) {
                    JOptionPane.showMessageDialog(frame, "Id should only contain integer!!!");
                    return;
                }
                Cattle cattle = new Cattle(id, weight, breedType, dateRegistered);
                cattlelist.add(cattle);//create object list array
                writeData();
            }
        });

        readData();
        jtable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtable.getSelectedRow();
                jtfid.setText(dtm.getValueAt(row, 0).toString());
                jtfweight.setText(dtm.getValueAt(row, 1).toString());
                jtfbreedtype.setText(dtm.getValueAt(row, 2).toString());
                jtfdateregistered.setText(dtm.getValueAt(row, 3).toString());
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
        LabTest labtest = new LabTest();

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
                    String cattlearray[] = sb.toString().split(",");
                    Cattle cattle = new Cattle(cattlearray[0], cattlearray[1], cattlearray[2], cattlearray[3]);
                    cattlelist.add(cattle);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            dtm.setRowCount(0); //update table
            for (int i = 0; i < cattlelist.size(); i++) {//populate table using object list
                Object[] objs = {cattlelist.get(i).getId(), cattlelist.get(i).getWeight(), cattlelist.get(i).getBreedType(), cattlelist.get(i).getDateRegistered};
                dtm.addRow(objs);
            }
        } catch (IOException e) {
        }
    }
    
     private void writeData() { //write data to file "data.txt"
       
        dtm.setRowCount(0); //update table content
        for (int i = 0; i < cattlelist.size(); i++) {//populate table using object list
            Object[] objs = {cattlelist.get(i).getId(), cattlelist.get(i).getWeight(), cattlelist.get(i).getBreedType(), cattlelist.get(i).getDateRegistered()};
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
