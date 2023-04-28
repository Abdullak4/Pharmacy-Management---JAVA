package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class main extends JFrame {

    protected JButton add;
    protected JButton recipt;
    protected JButton inventory;
    protected JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8;
    protected JPanel jPanel1, jPanel2;
    protected JScrollPane jScrollPane1;
    protected JTable jTable1;
    protected JSpinner qwt;
    protected JTextField txtPrice, txtMname, txtbal, txtmcost, txtmid, txtpay;
    public table1 t;

    public main() {
        Com();
    }
    DefaultTableModel df;

    private void Com() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        txtmid = new JTextField();
        txtMname = new JTextField();
        qwt = new JSpinner();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        txtpay = new JTextField();
        txtmcost = new JTextField();
        txtbal = new JTextField();
        add = new JButton();
        jLabel8 = new JLabel();
        txtPrice = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        recipt = new JButton();
        inventory = new JButton();
        t = new table1();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Management");
        setBackground(new Color(135, 206, 235));
        setVisible(true);

        setForeground(Color.red);

        jPanel1.setBackground(new Color(74, 31, 61));

        jLabel1.setFont(new Font("Comic Sans MS", 1, 24)); 
        jLabel1.setForeground(new Color(255, 255, 0));
        jLabel1.setText("                  Pharmacy Management System");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new Color(247, 247, 247));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new Font("Segoe UI", 1, 14));
        jLabel2.setText("Medicine ID");

        jLabel3.setFont(new Font("Segoe UI", 1, 14));
        jLabel3.setText("Medicine Name");

        jLabel4.setFont(new Font("Segoe UI", 1, 14));
        jLabel4.setText("Quantity");

        txtmid.setFont(new Font("Segoe UI", 1, 14));
        txtmid.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    press(e);
                }
        });

        txtMname.setFont(new Font("Segoe UI", 1, 14));

        qwt.setFont(new Font("Segoe UI", 1, 14));

        jLabel5.setFont(new Font("Segoe UI", 1, 14));
        jLabel5.setText("Total Cost");

        jLabel6.setFont(new Font("Segoe UI", 1, 14));
        jLabel6.setText("Payment");

        jLabel7.setFont(new Font("Segoe UI", 1, 14));
        jLabel7.setText("Balance");

        txtpay.setFont(new Font("Segoe UI", 1, 14));

        txtmcost.setFont(new Font("Segoe UI", 1, 14));

        txtbal.setFont(new Font("Segoe UI", 1, 14));

        add.setFont(new Font("Segoe UI", 1, 14));
        add.setText("      ADD      ");
//        add.setBackground(new Color(18, 19, 54));
        add.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        recipt.setFont(new Font("Segoe UI", 1, 14));
        
//        recipt.setBackground(new Color(18, 19, 54));
        recipt.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inventory.setFont(new Font("Segoe UI", 1, 14));
        
//        inventory.setBackground(new Color(18, 19, 54));
        inventory.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new Font("Segoe UI", 1, 14)); 
        jLabel8.setText("Price");

        txtPrice.setFont(new Font("Segoe UI", 1, 14)); 

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtmid)
                                                        .addComponent(txtMname, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                                        .addComponent(txtPrice, GroupLayout.Alignment.TRAILING))
                                                .addGap(175, 175, 175)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(73, 73, 73)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtpay)
                                                        .addComponent(txtmcost)
                                                        .addComponent(txtbal, GroupLayout.Alignment.TRAILING))
                                                .addGap(432, 432, 432))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(qwt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)
                                                .addComponent(add)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtmid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(txtmcost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(txtpay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtbal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)))
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(add)
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(qwt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(25, Short.MAX_VALUE))))
        );

        jTable1.setBackground(new Color(247, 247, 247));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Medicine Name", "Price", "Quantity", "Total"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        recipt.setText("Print Invoice");
        recipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reciptActionPerformed(evt);
            }
        });

        inventory.setText("Available Medicines");
        inventory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(recipt, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inventory, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(recipt, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(inventory, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(1000, 800);
    }
private void reciptActionPerformed(ActionEvent evt) {
        int total = Integer.parseInt(txtmcost.getText());
        int pay = Integer.parseInt(txtpay.getText());
        int tot = pay - total;
        txtbal.setText(String.valueOf(tot));
        JOptionPane.showMessageDialog(null, "Sales Completed", "Finish", JOptionPane.PLAIN_MESSAGE);
        
        t.set(total, pay, tot);
        t.setVisible(true);
        setVisible(false);
        
        
    }

    private void inventoryActionPerformed(ActionEvent evt) {
        inventory d = new inventory();
        d.setVisible(true);
        
        
    }

    private void addActionPerformed(ActionEvent evt) {
        int price, qt, total;
        price = Integer.parseInt(txtPrice.getText());
        qt = Integer.parseInt(qwt.getValue().toString());
        String mid = txtmid.getText();
        total = price * qt;
        try {
              
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abd", "root", "Abdulla");
                String sql = "UPDATE product SET qty = qty - ? WHERE id = ?";
                  PreparedStatement ps = con.prepareStatement(sql);
                  ps.setInt(1, qt);
                  ps.setString(2, mid);
                  int rowsUpdated = ps.executeUpdate();
                
                
                if (rowsUpdated > 0) {
                   System.out.println("Column value decremented successfully.");
                } 
                else {
                   System.out.println("Column value not decremented.");
                }
             } 
             catch (SQLException e) {
                e.printStackTrace();
             } 
        
        df = (DefaultTableModel) jTable1.getModel();
        df.addRow(new Object[]{
            txtMname.getText(), txtPrice.getText(), qwt.getValue().toString(), total
        });
        int sum = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        txtmcost.setText(String.valueOf(sum));

        t.addTableRow(txtMname.getText(), txtPrice.getText(), qwt.getValue().toString(), total);
       
        txtMname.setText("");
        txtmid.setText("");
        qwt.setValue(0);
        txtPrice.setText("");
    }
    
    protected void press(KeyEvent e) {
        new T();
}
    public static void main(String args[]) {

       new main();
       

    }

}
class T extends main{
        
        protected void press(KeyEvent e) {
                String Mcode;
        
       
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        Mcode = txtmid.getText();
                        try{
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abd","root","Abdulla");
                                PreparedStatement pst = con.prepareStatement("select * from product where id =  ?");
                                pst.setString(1, Mcode);
                                ResultSet rs = pst.executeQuery();
                                if (rs.next() == false){
                                        JOptionPane.showMessageDialog(null, "id not found", "", JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                        String dname = rs.getString("MedicineName");
                                        txtMname.setText(dname);
                                        String price = rs.getString("price");
                                        txtPrice.setText(price.trim());
                                        String quan = rs.getString("qty");
                                        String q = (String) qwt.getValue();
                                        int quan1 = Integer.parseInt(quan);
                                        int q1 = Integer.parseInt(q);
                                        if(q1 > quan1){
                                                JOptionPane.showMessageDialog(null, "Not in stock", "", JOptionPane.ERROR_MESSAGE);
                                        }
                                       
                        }
                
                        }
                        catch(Exception t){
                
                        }
  }
}
}
