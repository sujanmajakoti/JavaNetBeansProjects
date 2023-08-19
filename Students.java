/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinetutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class Students extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
    public Students() {
        initComponents();
        DisplayStudents();
        GetTeacher();
    }

 Connection Con= null;
  PreparedStatement pst=null;
  ResultSet Rs=null, Rs1=null;
  Statement St=null,St1=null;  
  private void DisplayStudents()
  {
      try
      { Class.forName("java.sql.DriverManager");
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
           St=Con.createStatement();
           String query="select * from students";
           Rs=St.executeQuery(query);
           
           
          
          
           
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(this, e);
        
      }}
  
  int Tnum=0;
    private void CountStudents()
           {
              try{
                  St1=Con.createStatement();
                  Rs1=St1.executeQuery("select MAX(Id)n from students");
                  Rs1.next();
                  Tnum=Rs1.getInt(1)+1;
                  
                  
              } catch(Exception e)
              {
                  
              }
               
           }
    
    
    private void GetTeacher()
    {
       try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
           St=Con.createStatement();
           String Query ="Select* from students where sName="+Key;
           Rs=st.executeQuery(Query);
           while(Rs.next())
           {
              String TeacherName= Rs.getString("tName");
              sTeacher.addItem(TeacherName);
           }
           
       }catch(Exception e)
       {
           
           
       }
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sPhone = new javax.swing.JTextField();
        sAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        sTime = new javax.swing.JComboBox<>();
        sTeacher = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Manage Teachers");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Payments");
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

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel13.setText("Switch To :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Students");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 29, 216, 47));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Student Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 123, -1, -1));

        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });
        jPanel2.add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 177, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 123, -1, -1));

        sPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(sPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 160, 177, -1));

        sAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAgeActionPerformed(evt);
            }
        });
        jPanel2.add(sAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 61, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 123, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Amount");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 220, -1, -1));
        jPanel2.add(sAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 257, 177, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Age");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 123, -1, -1));

        sGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sGenderActionPerformed(evt);
            }
        });
        jPanel2.add(sGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Time");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 220, -1, -1));

        sTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6-7", "7-8", "8-9" }));
        sTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTimeActionPerformed(evt);
            }
        });
        jPanel2.add(sTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 257, 105, -1));

        sTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tutor A", "Tutor B", "Tutor C" }));
        sTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTeacherActionPerformed(evt);
            }
        });
        jPanel2.add(sTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 257, 105, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Teacher");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 220, -1, -1));

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
        jLabel12.setText("Student List");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 374, -1, -1));

        sTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Phone", "Age", "Gender", "Amount", "Time", "Teacher"
            }
        ));
        sTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 710, 250));

        jPanel4.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 750, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sGenderActionPerformed

    private void sTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTimeActionPerformed

    private void sTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTeacherActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

    private void sPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sPhoneActionPerformed

    private void sAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sAgeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         new Teachers().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
new Payment().setVisible(true); 
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

      int Snum=0;
    private void CountStudent()
           {
              try{
                  St1=Con.createStatement();
                  Rs1=St1.executeQuery("select MAX(Id)n from students");
                  Rs1.next();
                  Snum=Rs1.getInt(1)+1;
                  
                  
              } catch(Exception e)
              {
                  
              }
               
           }
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(sName.getText().isEmpty() || sPhone.getText().isEmpty() || sAge.getText().isEmpty() || sAmount.getText().isEmpty()  || sGender.getSelectedIndex()==-1 ||sTeacher.getSelectedIndex()==-1 || sTime.getSelectedIndex()==-1)
     {
         
      JOptionPane.showMessageDialog(this, " Please Fill up the details properly ..");
         
     }
     else{
         try{
             CountStudent();
            
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
             PreparedStatement Add= Con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?)");
             Add.setInt(1, Key);
             Add.setString(1,sName.getText() );
             Add.setString(2, sPhone.getText());
             Add.setInt(3,Integer.parseInt(sAge.getText()));
             Add.setString(4,sGender.getSelectedItem().toString());
              Add.setInt(5,Integer.parseInt(sAmount.getText()));
             

             Add.setString(7,sTime.getSelectedItem().toString());
             Add.setString(8,sTeacher.getSelectedItem().toString());
             int row=Add.executeUpdate();
             JOptionPane.showMessageDialog(this,"Student information Added successfully..");
             Con.close();
             DisplayStudents();
         }
         catch(Exception e)
         {
          JOptionPane.showMessageDialog(this,e);
         }
     }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        // TODO add your handling code here:
        int Key = 0;
        if(Key==0)
        {
           JOptionPane.showMessageDialog(this, "Select Students first...");
        }else
        {
           try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
                String Query="Update students set sName=?,sPhone=?,sAge=?,sGender=?,sAmount=?, sTime=?, sTeacher=? where id=?";
             PreparedStatement edit= Con.prepareStatement(Query);
             edit.setString(1,sName.getText());
             edit.setString(2,sPhone.getText());
             edit.setInt(3,Integer.parseInt(sAge.getText()));
             edit.setString(4,sGender.getSelectedItem().toString());
              edit.setString(5,sAmount.getText());
                  edit.setString(6,sTime.getSelectedItem().toString());
                      edit.setString(7,sTeacher.getSelectedItem().toString());
             edit.setInt(8,Key);
             int row=edit.executeUpdate();
             JOptionPane.showMessageDialog(this,"Student information Updated successfully..");
             Con.close();
             DisplayStudents();
             
               
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, e);
           }
        }
        
        
        
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        int Key = 0;
        if(Key==0)
        {
            JOptionPane.showMessageDialog(this, "Select the student to delete..");
        }
        else
        {
           try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetutor","root","1234");
                String Query="Delete from students where id="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Student Deleted");
                DisplayStudents();
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void sTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sTableMouseClicked
DefaultTableModel model= (DefaultTableModel)sTable.getModel();
       int MyIndex= sTable.getSelectedRow();
      
        Integer Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       sName.setText(model.getValueAt(MyIndex, 1).toString());
       sPhone.setText(model.getValueAt(MyIndex, 2).toString());
       sAge.setText(model.getValueAt(MyIndex,3).toString());
       sGender.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
       sAmount.setText(model.getValueAt(MyIndex, 5).toString());     
         sTime.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
  sTeacher.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
    }//GEN-LAST:event_sTableMouseClicked

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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField sAge;
    private javax.swing.JTextField sAmount;
    private javax.swing.JComboBox<String> sGender;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField sPhone;
    private javax.swing.JTable sTable;
    private javax.swing.JComboBox<String> sTeacher;
    private javax.swing.JComboBox<String> sTime;
    // End of variables declaration//GEN-END:variables
}
