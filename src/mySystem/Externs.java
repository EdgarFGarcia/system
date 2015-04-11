/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mySystem;

/**
 *
 * @author iamAxylle
 */
public class Externs {
    //centers a 

    public static void centerForm(java.awt.Component component) {
        java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        component.setLocation((dim.width - component.getWidth()) / 2, (dim.height - component.getHeight()) / 2);
    }

    public static void showSales(javax.swing.JTable table) {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from sales";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                table.setValueAt(rs.getObject("itemname"), count, 0);
                table.setValueAt(rs.getObject("quantity"), count, 1);
                table.setValueAt(rs.getObject("stock"), count, 2);
                table.setValueAt(rs.getObject("sellprice"), count, 3);
                table.setValueAt(rs.getDouble("subtotal"), count, 4);
                count++;
            }

            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    public static void deleteSales() {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "delete from SALES";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    public static void fillTable(javax.swing.JTable table) {
        clearTable(table);
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from PERSONS where isdeleted = 0 and userkey != 'axylle'";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                table.setValueAt(rs.getObject("idnumber"), count, 0);
                table.setValueAt(rs.getObject("firstname") + " " + rs.getObject("LASTNAME"), count, 1);
                table.setValueAt(rs.getObject("email"), count, 2);
                table.setValueAt(rs.getObject("phone"), count, 3);
                table.setValueAt(rs.getObject("address"), count, 4);
                count++;
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    public static void fillTable2(javax.swing.JTable table) {
        clearTable(table);
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from ITEMS";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                table.setValueAt(rs.getObject("id"), count, 0);
                table.setValueAt(rs.getObject("itemname"), count, 1);
                table.setValueAt(rs.getObject("supplier"), count, 2);
                table.setValueAt(rs.getObject("rawprice"), count, 3);
                table.setValueAt(rs.getObject("sellprice"), count, 4);
                table.setValueAt(rs.getObject("quantity"), count, 5);
                count++;
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    public static void itemEditFlag(String itemname) {
        String SQL;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            if ("".equals(itemname)) {
                SQL = "UPDATE ITEMS SET editflag = 0";
            } else {
                SQL = "UPDATE ITEMS SET editflag = 1 WHERE ITEMNAME = '" + itemname + "'";
            }
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
    }

    public static int setTab() {
        int user = 0;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from EXTERNALS";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                user = rs.getInt("TABINDEX");
            }
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        return user;
    }

    public static void deletePerson(String employeeid) {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "UPDATE PERSONS SET isdeleted = 1 WHERE IDNUMBER = '" + employeeid + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
    }

    public static void updatePerson(String employeeid) {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "UPDATE PERSONS SET isupdate = 1 WHERE IDNUMBER = '" + employeeid + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
    }

    public static void clearTable(javax.swing.JTable table) {
        int columnCount = table.getColumnCount();
        int rowCount = table.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int h = 0; h < columnCount; h++) {
                table.setValueAt(null, i, h);
            }
        }
    }

    public static String passkey(String pass) {
        String passWord = "";
        try {
            passWord = Password.encrypt(pass);
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
        return passWord;
    }

    public static boolean checkDuplicateUser(String userkey) {
        boolean found = false;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from PERSONS WHERE userkey = '" + userkey + "' and type = 0";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            if (count > 0) {
                found = true;
            }
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        return found;
    }

    public static String employeeid(String lastname) {
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy");
        String employeeid = "" + dateFormat.format(java.util.Calendar.getInstance().getTime());

        for (int x = String.valueOf(Externs.getLastID()).length(); x < 4; x++) {
            employeeid += "0";
        }
        employeeid += "" + Externs.getLastID();

        if (lastname.length() < 10) {
            employeeid += "0";
        }
        employeeid += "" + lastname.length();
        return (employeeid);
    }

    public static int getLastID() {
        int lastID = 1;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from PERSONS order by id desc fetch first row only";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                lastID = 1 + rs.getInt("id");
            }
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        return lastID;
    }

    public static void resetLoggedIn() {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "UPDATE PERSONS SET islogin = 0";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
    }

    public static void resetIsUpdate() {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "UPDATE PERSONS SET isupdate = 0";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
    }

    //find who logs in
    public static String whoLoggedIn() {
        String name = "Administrator";
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "SELECT * FROM PERSONS where islogin = 1";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                name = "" + rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME");
            }
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        return name;
    }

    public static String fixImagePath(String filepath) {
        String imagepath = "";
        for (int i = 0; i < filepath.length(); i++) {
            char path = filepath.charAt(i);
            if (path == '\\') {
                imagepath = imagepath + path + '\\';
            } else {
                imagepath = imagepath + path;
            }
        }
        return imagepath;
    }

    public static double checkSales() {
        double quota = 0;
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "SELECT * FROM TRANSACTIONS where cashier = '" + Externs.whoLoggedIn() + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                quota += rs.getDouble("total");
            }
            con.close();
        } catch (java.sql.SQLException err) {
            javax.swing.JOptionPane.showMessageDialog(null, err);
        }
        return quota;
    }
    // <editor-fold defaultstate="collapsed">
    public static String host = "jdbc:derby://localhost:1527/mySystem";
    public static String username = "axylle";
    public static String password = "XRV1YNBL9FG";
    public static String poweruser = "system101";
    public static String powerpass = "P0SfZ13R5JG2yF7";
    // </editor-fold>

    public static String initialPasskey() {
        return new java.math.BigInteger(50, new java.security.SecureRandom()).toString(32);
    }

    public static javax.swing.JPanel BarChart2Panel() {
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            for (int i = 0; i < 12; i++) {
                int x = i + 1;
                double totalsales = 0;
                double expense = 0;
                String SQL = "select * from TRANSACTIONS where month(TRANSACTIONDATE) = " + x;
                java.sql.PreparedStatement pst = con.prepareStatement(SQL);
                java.sql.ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    totalsales += rs.getDouble("total");
                }
                SQL = "select * from EXPENSE where month(REGDATE) = " + x;
                pst = con.prepareStatement(SQL);
                rs = pst.executeQuery();
                while (rs.next()) {
                    expense += rs.getDouble("price");
                }
                dataset.setValue(expense, "Expense", month[i]);
                dataset.setValue(totalsales, "Sales", month[i]);
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
        org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart3D("Sales and Expense", "Month", "Amount", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, true, true, false);
        //chart.setBackgroundPaint(java.awt.Color.yellow);
        chart.getTitle().setPaint(java.awt.Color.blue);
        org.jfree.chart.plot.CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(java.awt.Color.black);
        p.setBackgroundPaint(java.awt.Color.black);
        p.setRangeGridlinePaint(java.awt.Color.red);
        return new org.jfree.chart.ChartPanel(chart);
    }

    public static void fillTable3(javax.swing.JTable table) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            for (int i = 0; i < 12; i++) {
                int x = i + 1;
                double totalsales = 0;
                double expense = 0;
                String SQL = "select * from TRANSACTIONS where month(TRANSACTIONDATE) = " + x;
                java.sql.PreparedStatement pst = con.prepareStatement(SQL);
                java.sql.ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    totalsales += rs.getDouble("total");
                }
                SQL = "select * from EXPENSE where month(REGDATE) = " + x;
                pst = con.prepareStatement(SQL);
                rs = pst.executeQuery();
                while (rs.next()) {
                    expense += rs.getDouble("price");
                }
                table.setValueAt(month[i], i, 0);
                table.setValueAt(totalsales, i, 1);
                table.setValueAt(expense, i, 2);
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }

    public static void fillTable4(javax.swing.JTable table) {
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(Externs.host, Externs.username, Externs.password)) {
            String SQL = "select * from ATTENDANCE";
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            java.sql.ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                table.setValueAt(rs.getDate("REGDATE"), count, 0);
                table.setValueAt(rs.getObject("EMPLOYEENAME"), count, 1);
                table.setValueAt(rs.getTime("LOGIN"), count, 2);
                table.setValueAt(rs.getTime("LOGOUT"), count, 3);
                table.setValueAt(rs.getObject("SALARY"), count, 4);
                count++;
            }
            con.close();
        } catch (java.sql.SQLException err) {
            System.out.println(err);
        }
    }
}
