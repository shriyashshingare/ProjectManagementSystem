import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on Sep 16, 2019, 11:02:54 AM
 */

/**
 *
 * @author EXAM
 */
public class login extends javax.swing.JFrame {

     static public String adminLogin="Admin";
        String pass="root";

    /** Creates new form login */
    public login() {
        initComponents();
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        adminRadio = new javax.swing.JRadioButton();
        deptmRadio = new javax.swing.JRadioButton();
        teamlRadio = new javax.swing.JRadioButton();
        empRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        loginpanel.setBackground(new java.awt.Color(51, 51, 51));
        loginpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginpanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROJECT MANAGEMENT SYSTEM");
        loginpanel.add(jLabel1);
        jLabel1.setBounds(118, 40, 382, 56);

        jLabel6.setIcon(new javax.swing.ImageIcon("B:\\Netbeans projects\\ProjectManagementSystem\\images\\close_window_48px.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        loginpanel.add(jLabel6);
        jLabel6.setBounds(950, 0, 50, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1001, 140);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        adminRadio.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(adminRadio);
        adminRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminRadio.setForeground(new java.awt.Color(51, 51, 51));
        adminRadio.setText("Admin");
        adminRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deptmRadio.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(deptmRadio);
        deptmRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deptmRadio.setForeground(new java.awt.Color(51, 51, 51));
        deptmRadio.setText("Department Manager");
        deptmRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        teamlRadio.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(teamlRadio);
        teamlRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        teamlRadio.setForeground(new java.awt.Color(51, 51, 51));
        teamlRadio.setText("Team Leader");
        teamlRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        empRadio.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(empRadio);
        empRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empRadio.setForeground(new java.awt.Color(51, 51, 51));
        empRadio.setText("Employee");
        empRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("SELECT EMPLOYEE TYPE :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deptmRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(teamlRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(adminRadio)
                .addGap(18, 18, 18)
                .addComponent(deptmRadio)
                .addGap(18, 18, 18)
                .addComponent(teamlRadio)
                .addGap(18, 18, 18)
                .addComponent(empRadio)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(tPassword))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 140, 1000, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

/*try{
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pms","root","1234");   
}
catch(Exception e)
{
JOptionPane.showMessageDialog(rootPane, e);
}
        */    
     AdminFrame adf = null;
         try {
             adf = new AdminFrame();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
         }            
DeptManagerFrame deptf=new DeptManagerFrame();
TeamLeaderFrame tlf=new TeamLeaderFrame();
EmployeeFrame empf=new EmployeeFrame();
String user_name=tUserName.getText();
String password=tPassword.getPassword().toString();

if(adminRadio.isSelected()==true)
{
if(tUserName.getText().trim().toString().equals(adminLogin) && String.valueOf(tPassword.getPassword()).equals(pass))
{    
this .setVisible(false);
  
adf.setVisible(true);
}
else{
   JOptionPane.showMessageDialog(rootPane,"Invalid Login");
}
}
else if(deptmRadio.isSelected()==true){
    this .setVisible(false);
    deptf.setVisible(true);
}
else if(teamlRadio.isSelected()==true)
{
    this .setVisible(false);
    tlf.setVisible(true);
}
else if(empRadio.isSelected()==true)
{
    this .setVisible(false);
    empf.setVisible(true);
}
else{
    JOptionPane.showMessageDialog(rootPane,"Please select the Employee Type");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
      System.exit(0);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton adminRadio;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JRadioButton deptmRadio;
    public static javax.swing.JRadioButton empRadio;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JPanel loginpanel;
    public static javax.swing.JPasswordField tPassword;
    public static javax.swing.JTextField tUserName;
    public static javax.swing.JRadioButton teamlRadio;
    // End of variables declaration//GEN-END:variables

}
