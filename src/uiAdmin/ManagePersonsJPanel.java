/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiAdmin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author krishnamayavat
 */
public class ManagePersonsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
      Person selectedPerson= new Person();
      
    public ManagePersonsJPanel(JPanel upc, PersonDirectory pd) {
        initComponents();
        userProcessContainer = upc;
        personDirectory = pd;
         populateTable();
         
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        mptable = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label1.setText("Manage Persons");

        mptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "HealthID", "Age", "City", "Community", "House", "Zipcode"
            }
        ));
        mptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mptable);

        btnback.setText("<< back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnnew.setText("New..");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnremove.setText("Delete");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnback)
                        .addGap(66, 66, 66)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnremove)
                        .addGap(37, 37, 37)
                        .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnback)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnew)
                    .addComponent(btnremove)
                    .addComponent(btnview))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);




        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed

         AddPersonsJPanel as = new AddPersonsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("Add", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
      
     int selectedRowIndex= mptable.getSelectedRow();
   
      if(selectedRowIndex<0){
   
       JOptionPane.showMessageDialog(this,"Please select a row to delete.");
        return;
   }
   
   DefaultTableModel model= (DefaultTableModel) mptable.getModel();
  
   
   Person selectedPerson = (Person) model.getValueAt(selectedRowIndex,0);
  
    personDirectory.removePerson(selectedPerson);
    JOptionPane.showMessageDialog(this,"Record deleted");
    
    populateTable();
        
    }//GEN-LAST:event_btnremoveActionPerformed

    private void mptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mptableMouseClicked
        
        
    


        // TODO add your handling code here:
    }//GEN-LAST:event_mptableMouseClicked

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed

      int selectedRowIndex = mptable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        Person p = (Person) mptable.getValueAt(selectedRowIndex, 0);
        
        ViewPersonJPanel vpdjp = new ViewPersonJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable mptable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {

    DefaultTableModel model= (DefaultTableModel) mptable.getModel();
        model.setRowCount(0);
        
        for(Person p : personDirectory.getPersonlist())
        {
            Object[] row=new Object[8];
           
            row[0]=p;
           
            row[1]=p.getHealthid();
            row[2]=p.getAge();
            row[3]=p.getCity();
            row[4]=p.getCommunity();
            row[5]=p.getHouse();
            row[6]=p.getZipcode();
           
            model.addRow(row);
        }
        

    }

    
 
}
