/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinetutor;

import java.awt.RenderingHints.Key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




/**
 *
 * @author dell
 */
public class Teachers extends javax.swing.JFrame {


    /**
     * Creates new form Teachers
     */
    public Teachers() {
        initComponents();
        DisplayTeachers();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tPhone = new javax.swing.JTextField();
        tAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tGender = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Teachers");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 29, 216, 47));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Member Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 123, -1, -1));

        tName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameActionPerformed(evt);
            }
        });
        jPanel2.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 177, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 123, -1, -1));

        tPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(tPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 160, 177, -1));

        tAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAgeActionPerformed(evt);
            }
        });
        jPanel2.add(tAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 61, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 123, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 220, -1, -1));
        jPanel2.add(tAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 257, 177, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Age");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 123, -1, -1));

        tGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        tGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGenderActionPerformed(evt);
            }
        });
        jPanel2.add(tGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 160, -1, -1));

        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 323, -1, -1));

        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 323, -1, -1));

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 323, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Teachers List");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 374, -1, -1));

        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Phone", "Age", "Gender", "Address"
            }
        ));
        tTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 640, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 750, 700));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Students");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Payment");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Logout");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNameActionPerformed

    private void tPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPhoneActionPerformed

    private void tAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAgeActionPerformed

    private void tGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGenderActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Students().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Payment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
  
  Connection Con= null;
  PreparedStatement pst=null;
  ResultSet Rs=null, Rs1=null;
  Statement St=null,St1=null;  
  private void DisplayTeachers()
  {
      try
      { Class.forName("java.sql.DriverManager");
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
           St=Con.createStatement();
           String query="select * from teachers";
           Rs=St.executeQuery(query);
           
           
          
          
           
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(this, e);
        
      }
  }
  int Tnum=0;
    private void CountTeachers()
           {
              try{
                  St1=Con.createStatement();
                  Rs1=St1.executeQuery("select MAX(Id)n from teachers");
                  Rs1.next();
                  Tnum=Rs1.getInt(1)+1;
                  
                  
              } catch(Exception e)
              {
                  
              }
               
           }
  
  
  
  
  
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
     if(tName.getText().isEmpty() || tPhone.getText().isEmpty() || tAge.getText().isEmpty() || tAddress.getText().isEmpty()  || tGender.getSelectedIndex()==-1)
     {
         
      JOptionPane.showMessageDialog(this, " Please fillup teacher's information properly ..");
         
     }
     else{
         try{
             CountTeachers();
            
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
             PreparedStatement Add= Con.prepareStatement("insert into teachers values(?,?,?,?,?,?)");
             Add.setInt(1, Tnum);
             Add.setString(2,tName.getText() );
             Add.setString(3, tPhone.getText());
             Add.setInt(4,Integer.parseInt(tAge.getText()));
             Add.setString(5,tAddress.getText());
             Add.setString(6,tGender.getSelectedItem().toString());
             int row=Add.executeUpdate();
             JOptionPane.showMessageDialog(this,"Teacher information Added successfully..");
             Con.close();
             DisplayTeachers();
         }
         catch(Exception e)
         {
          JOptionPane.showMessageDialog(this,e);
         }
     }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void tTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTableMouseClicked
       DefaultTableModel model= (DefaultTableModel)tTable.getModel();
       int MyIndex= tTable.getSelectedRow();
        Integer Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       tName.setText(model.getValueAt(MyIndex, 1).toString());
       tPhone.setText(model.getValueAt(MyIndex, 2).toString());
       tAge.setText(model.getValueAt(MyIndex,3).toString());
       tGender.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
       tAddress.setText(model.getValueAt(MyIndex, 5).toString());
    
    }//GEN-LAST:event_tTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        int Key = 0;
        if(Key==0)
        {
            JOptionPane.showMessageDialog(this, "Select the teacher to delete..");
        }
        else
        {
           try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
                String Query="Delete from teachers where id="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Teacher Deleted");
                DisplayTeachers();
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        int Key = 0;
        if(Key==0)
        {
           JOptionPane.showMessageDialog(this, "Select Teachers first...");
        }else
        {
           try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
                String Query="Update teachers set tName=?,tPhone=?,tAge=?,tGender=?,tAddress=? where id=?";
             PreparedStatement edit= Con.prepareStatement(Query);
             edit.setString(1,tName.getText());
             edit.setString(2,tPhone.getText());
             edit.setInt(3,Integer.parseInt(tAge.getText()));
             edit.setString(4,tAddress.getText());
             edit.setString(5,tGender.getSelectedItem().toString());
             edit.setInt(6,Key);
             int row=edit.executeUpdate();
             JOptionPane.showMessageDialog(this,"Teacher information Updated successfully..");
             Con.close();
             DisplayTeachers();
             
               
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tAge;
    private javax.swing.JComboBox<String> tGender;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tPhone;
    private javax.swing.JTable tTable;
    // End of variables declaration//GEN-END:variables

    


        
    }
}
