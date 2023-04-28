
package project;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inventory extends JFrame {

    private JButton jButton1;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    public inventory() {
        main();
    }

    private void main() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(0, 102, 102));
        setVisible(true);
        setSize(1000, 800);
        jTable1.setBackground(new Color(204, 204, 204));
        jTable1.setBorder(BorderFactory.createTitledBorder(""));
        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {"1", "Crocine"},
                {"2", "Dolo"},
                {"3", "Ondem"},
                {"4", "move"},
                {"5", "Matfall-Spaus"},
                {"6", "Pudin Hara"},
                {"7", "Cofsils"},
                {"8", "Azithromycine"},
                {"9", "Savlon"},
                {"10","Aspirine" },
                {"11","ibuprofen" },
                {"12","Saridon" },
                {"13","Pan-D" },
                {"14","Allegra" },
                {"15","Pre-biotic" },
                {"16","Ethoshine"}
            },
            new String [] {
                "Medicine Id", "Medicine Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new Color(204, 204, 255));
        jPanel1.setForeground(new Color(204, 204, 255));

        jLabel1.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inventory");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel1)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jButton1.setFont(new Font("Segoe UI", 1, 14)); 
        jButton1.setText("<-Back");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
           
           dispose();
    }
    public static void main(String args[]) {
      
       new inventory();
    }
}
