/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mySystem;

/**
 *
 * @author iamAxylle
 */
public class DebtForm extends javax.swing.JDialog {

    /**
     * Creates new form SalesReport
     */
    public DebtForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Names();
        Externs.centerForm(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Debt Reports");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Sales ", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(100);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(2).setMinWidth(80);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(80);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 600, 250));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 30));

        jLabel9.setText("Costumer Name");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 20));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/debtreport2.jpg"))); // NOI18N
        jPanel1.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel157.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel157.setText("Debt Report");
        jLabel157.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 270, 30));

        jLabel15.setText("- View debt reports");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("View Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Grand Total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 100, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("Record");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 80, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setEnabled(false);
        jTextField2.setOpaque(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 210, 200, 30));

        jLabel2.setText("Enter Payment");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        jButton3.setText("Cancel");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Externs.clearTable(jTable1);
        double grandtotal = 0;
        String SQL;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            SQL = "SELECT * FROM TRANSACTIONS WHERE "
                    + "COSTUMERNAME = '" + (String) jComboBox1.getSelectedItem() + "' "
                    + "ORDER BY TRANSACTIONDATE ASC";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                jTable1.setValueAt(rs.getDate("TRANSACTIONDATE"), count, 0);
                jTable1.setValueAt(rs.getString("SOLDITEMS"), count, 1);
                jTable1.setValueAt(rs.getDouble("TOTAL"), count, 2);
                grandtotal += rs.getDouble("total");
                count++;
            }
            jTextField1.setText(String.valueOf(grandtotal));
            if(grandtotal < 0){
            jTextField2.setEnabled(true);
            }else {
                jTextField2.setEnabled(false);
            if (count == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Querry result: 0");
            }}
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String date = "" + dateFormat.format(java.util.Calendar.getInstance().getTime());
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "INSERT INTO transactions (transactiondate, solditems, total, costumername, cashier) values ("
                    + "'" + date + "', "
                    + "'Payment', "
                    + Double.parseDouble(jTextField2.getText()) * -1 + ", "
                    + "'" + jComboBox1.getSelectedItem() + "', "
                    + "'" + Externs.whoLoggedIn() + "')";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null, "Payment Added.");
            con.close();
        } catch (java.sql.SQLException | NumberFormatException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        System.out.println(Qwerty.date);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        jButton6.setEnabled(true);
    }//GEN-LAST:event_jTextField2KeyTyped

    private void Names() {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "SELECT * FROM PERSONS WHERE ISDELETED = 0 AND DEPARTMENT = 4 ORDER BY LASTNAME ASC";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME"));
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DebtForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DebtForm dialog = new DebtForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}