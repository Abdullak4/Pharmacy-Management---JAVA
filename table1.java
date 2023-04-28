package project;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class table1 extends JFrame {

    private DefaultTableModel d ;
    private JTable info;
    private JLabel j4;
    private JLabel j5;
    private JLabel j6;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
     
    public table1() {
        Comp();
    }

    
    public void addTableRow(String a, String c, String b, int e) {
        d = (DefaultTableModel) info.getModel();
        d.addRow(new Object[]{a, b, c, e});
    }
    public void set(int a, int b,int c){
        j4.setText(String.valueOf(a));
        j5.setText(String.valueOf(b));
        j6.setText(String.valueOf(c));
    }
                  
    private void Comp() {

        jScrollPane1 = new JScrollPane();
        info = new JTable();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        j4 = new JLabel();
        j5 = new JLabel();
        j6 = new JLabel();

        setBackground(new Color(74, 31, 61));

        info.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(info);

        jLabel1.setFont(new Font("Segoe UI", 1, 14)); 
        jLabel1.setText("Total");
        jLabel2.setFont(new Font("Segoe UI", 1, 14)); 
        jLabel2.setText("Pay");

        jLabel3.setFont(new Font("Segoe UI", 1, 14)); 
        jLabel3.setText("Remaining");

        j4.setFont(new Font("Segoe UI", 1, 14)); 
        j4.setText("jLabel4      ");

        j5.setFont(new Font("Segoe UI", 1, 14)); 
        j5.setText("jLabel5      ");

        j6.setFont(new Font("Segoe UI", 1, 14)); 
        j6.setText("jLabel6      ");
        getContentPane().setBackground(Color.white);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(j4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(j5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(j4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(j5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(j6))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        setSize(500,500);
    }                      

    public static void main(String args[]) {
 
        new table1();
    }
}
