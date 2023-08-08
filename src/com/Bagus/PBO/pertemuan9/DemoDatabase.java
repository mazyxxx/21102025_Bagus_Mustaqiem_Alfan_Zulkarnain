package com.Bagus.PBO.pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class DemoDatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainpanel;
    private JTextField txtnama;
    private JTextField txtNIM;
    private JSpinner spnnilai;
    private JButton submitButton;
    private JButton clearButton;
    private JTable datatable;
    private DefaultTableModel model;

    private static Connection c;
    private static Statement s;
    private static ResultSet rs;


    public DemoDatabase(){
        super("Demo Database");
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = txtNIM.getText();
                String nama = txtnama.getText();
                int nilai = (int) spnnilai.getValue();
                try {
                    openDb();
                    s.executeUpdate(
                            "INSERT INTO mahasiswa VALUES ('"+ nim +"','"+ nama + "','"+ nilai +"')"
                    );
                    Object[] row = {nim,nama,nilai};
                    model.addRow(row);
                    JOptionPane.showMessageDialog(null, "Data added!");
                }catch (SQLException | ClassNotFoundException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                    closeDb();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtnama.setText("");
                txtNIM.setText("");
                spnnilai.setValue(0);
                JOptionPane.showMessageDialog(null, "Force cleared");

            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }

    public static void openDb() throws ClassNotFoundException, SQLException{
        String URL = "jdbc:mysql://localhost:3306/db_demo";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL,Username,Password);
        s = c.createStatement();
    }
    private void closeDb(){
        try{
            rs.close();
            s.close();
            c.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void createUIComponents() {

        model = new DefaultTableModel();
        datatable = new JTable(model);
        model.addColumn("Nim");
        model.addColumn("Nama");
        model.addColumn("Nilai");

        try{
            openDb();
            rs = s.executeQuery("SELECT * FROM tb_mahasiswa");

            while (rs.next()){
                Object[] row = {
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("nilai")
                };
                model.addRow(row);
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            closeDb();
        }
    }
}
