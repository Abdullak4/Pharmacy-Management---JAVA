package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

interface Details{
    public void check(String a,String b,String c);
    public int check(String a,String b);
}

public class Login extends JFrame implements ActionListener{
    private JButton jButton1,jButton2;
    private JLabel jLabel1,jLabel2,exit;
    private JPanel jPanel1;
    private JPanel jPanel2;
    protected JPasswordField pass;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    public JTextField user;
    public JTextField mobile;
    public Login() {
        Comp();
    }                      
    private void Comp() {
        
        
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        user = new JTextField();
        mobile = new JTextField();
        pass = new JPasswordField();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        exit = new JLabel();
        jLabel2 = new JLabel(new ImageIcon("C://Users//abdul//OneDrive//Desktop//java//project//2.jpg"));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(800,500);
        jPanel1.setBackground(new Color(74, 31, 61));
        jPanel1.setForeground(new java.awt.Color(74, 31, 61));
        
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jLabel2,BorderLayout.CENTER);
        jPanel2.setBackground(new java.awt.Color(186, 79, 84));
        jPanel2.setBorder(BorderFactory.createCompoundBorder());

        user.setBackground(new Color(186, 79, 84));
        user.setForeground(new Color(187, 187, 187));
        user.setText("Username");
        user.setBorder(null);
        user.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
                user.setText("");
                pass.setText("");
                mobile.setText("");
            }
        });


        mobile.setBackground(new Color(186, 79, 84));
        mobile.setForeground(new Color(187, 187, 187));
        mobile.setText("Mobile");
        mobile.setBorder(null);

        pass.setBackground(new Color(186, 79, 84));
        pass.setForeground(new Color(187, 187, 187));
        pass.setText("password");
        pass.setBorder(null);

        jSeparator1.setBackground(new Color(0, 0, 0));
        jSeparator1.setMinimumSize(new Dimension(100, 10));
        jSeparator1.setPreferredSize(new Dimension(100, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        
        exit.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        exit.setForeground(new java.awt.Color(187, 187, 187));
        exit.setText("Please Enter Your Details");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new Color(247, 247, 247));
        jButton1.setFont(new Font("Segoe UI", 1, 12)); 
        jButton1.setText("Sign-up");
        jButton1.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(this);


        jButton2.setBackground(new Color(247, 247, 247));
        jButton2.setFont(new Font("Segoe UI", 1, 12)); 
        jButton2.setText("Login");
        jButton2.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(this);

        jLabel1.setFont(new Font("Segoe UI", 1, 18)); 
        jLabel1.setText("X");
        
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
       
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user)
                            .addComponent(mobile, GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))) // added jButton2 here
                    .addGap(62, 110, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(exit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1)
                    .addContainerGap())
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(exit, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(user, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(mobile, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)
                    .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(pass, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) // modified this line
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)) // added jButton2 here
                    .addGap(66, 66, 66))
        );
        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
       
        setLocationRelativeTo(null);
    }       
    
        public void actionPerformed(ActionEvent evt) {
            
            if(evt.getSource() == jButton1){
                Details i = new info();
                String str = mobile.getText();
                if(user.getText().isEmpty() || pass.getPassword().length == 0  || mobile.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter all the fields", "Invalid", JOptionPane.ERROR_MESSAGE);
                }
                else if(str.length()!=10){
                    JOptionPane.showMessageDialog(null,"Enter 10 digits", "Invalid", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    String usr = user.getText();
                    char[] pa = pass.getPassword();
                    String pas = String.valueOf(pa);
                    i.check(usr,pas,str);
                    setVisible(false);
                    main p = new main();
                    p.setVisible(true);
                }
            }
            else{
                String usr = user.getText();
                char[] pa = pass.getPassword();
                String pas = String.valueOf(pa);
                Details i = new info();
                int a = i.check(usr,pas);

                if(a == 1){
                    JOptionPane.showMessageDialog(null, "Login success!", "", JOptionPane.PLAIN_MESSAGE);
                    user.setText("");
                    pass.setText("");
                    mobile.setText("");
                    main m = new main();
                    m.setVisible(true);
                    setVisible(false);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid id/pass", "", JOptionPane.ERROR_MESSAGE);
                    user.setText("");
                    pass.setText("");
                    mobile.setText("");
                }
                
            }
        

            
    }
                                         
                                    

        private void jLabel1MouseClicked(MouseEvent evt) {                                     
        dispose();        
        }                                    

    public static void main(String args[]) {
        new Login();
    }
             
}

class info extends Login implements Details{
    
    Connection con ;
    String sql ;
    PreparedStatement ps ;
    ResultSet rs ;
    public void check(String a,String b,String c){
        user.setText(a);
        pass.setText(b);
        mobile.setText(c);
       
        
        try {
            String u = user.getText();
            char[] p1 = pass.getPassword();
            String p = String.valueOf(p1);
            String m = mobile.getText();
           
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/abd","root","Abdulla");
            sql = "INSERT INTO LoginData (mobile,name,password) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, m);
            ps.setString(2, u);
            ps.setString(3, p);
            
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Login success!", "", JOptionPane.PLAIN_MESSAGE);
                user.setText("");
                pass.setText("");
                mobile.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add data to table.", "", JOptionPane.ERROR_MESSAGE);
            }
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int  check(String a, String b) {
    int isValid = 0;
    try {
        
        con = DriverManager.getConnection("jdbc:mysql://localhost/abd", "root", "Abdulla");
        ps = con.prepareStatement("SELECT * FROM LoginData  WHERE name = ? AND password = ?");
        ps.setString(1, a);
        ps.setString(2, b);
        rs = ps.executeQuery();
        if (rs.next()) {
            isValid = 1;
        }
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
    return isValid;
}
}

