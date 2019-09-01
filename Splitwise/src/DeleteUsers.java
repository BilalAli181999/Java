
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author najam
 */
public class DeleteUsers extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUsers
     */
    Vector<String> colName;
    Vector<Vector<Object>> tbData;
    UserManager refg;
    public DeleteUsers(UserManager ref) {
        initComponents();
        this.refg=ref;
        setTable();
      
        
    }
     public static  Connection connectDatabase() throws Exception
{
    Connection con;
    PreparedStatement stmt;
    
    
   
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:8080/splitwise", "root", "");
    
        return con;
       
    
}

    private DeleteUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int getGid(String col1,String col2) throws Exception
    {
        String sql = "Select * from Groups where GName=? and Type=?";
        int id=0;
        try (Connection conn = this.connectDatabase();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
      pstmt.setString(1,col1);
      pstmt.setString(2,col2);
      ResultSet rs = pstmt.executeQuery();
      while(rs.next())
      {
          id= rs.getInt("GId");}
         
     } 
    return id;
    
    }
 public void deleteQuery(String Name) throws Exception
 {
     String sql = "delete from Users where Name=?";
            
        
        try (Connection conn = this.connectDatabase();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
      pstmt.setString(1,Name);
     
     
      int rs = pstmt.executeUpdate();
        }
   
 }
 
 public boolean ifTableExists(String Name) throws Exception
 {  
      String sql = "select * from Users where Name=?";
            
        
        try (Connection conn = this.connectDatabase();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
      pstmt.setString(1,Name);
     
     
          ResultSet rs = pstmt.executeQuery();
          if(rs.next())
              return true;
        }
     
     return false;
}
 
 public DefaultTableModel makeTable(ResultSet rs)
    {   
        
        
        try {
               
            ResultSetMetaData rsMeta = rs.getMetaData();
            
            int colCount = rsMeta.getColumnCount();
           
             colName = new Vector<String>();
            for(int i=1;i<=colCount;i++)
            {
                
                colName.add(rsMeta.getColumnName(i));
            }
            
            tbData = new Vector<Vector<Object>>();
            
            while(rs.next())
            {
                Vector<Object> row = new Vector<Object>();
                
                for(int i = 1;i<=colCount;i++)
                {
                    row.add(rs.getObject(i));
                }
                tbData.add(row);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return new DefaultTableModel(tbData, colName);
    }
        
    public void setTable()
    {
              String sql = "Select * from Users";
        
        try (Connection conn = this.connectDatabase();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
       ResultSet rs = pstmt.executeQuery();
         
        DefaultTableModel model=this.makeTable(rs);
        jTable1.setModel(model);
     

        
   
              
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(AddGBill.class.getName()).log(Level.SEVERE, null, ex);
        } }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Users");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(255, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setRowMargin(3);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 13)); // NOI18N
        jLabel2.setText("Select to Delete the Member");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        refg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             JTable temp = (JTable) evt.getSource();
        int row = temp.getSelectedRow();
        
        String Name = (String) temp.getModel().getValueAt(row, 0);
       
    try {
         int input = JOptionPane.showConfirmDialog(null, "Do you want to Delete "+Name+" ?");
         if(input==0)
         {
       
        if(ifTableExists(Name))
        { 
            deleteQuery(Name);
            
        }
        
         this.dispose();
        
         refg.setVisible(true);}
    } catch (Exception ex) {
        Logger.getLogger(DeleteGrp.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_jTable1MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
