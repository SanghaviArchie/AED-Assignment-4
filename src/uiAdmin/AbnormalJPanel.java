/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;

/**
 *
 * @author krishnamayavat
 */
public class AbnormalJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    public AbnormalJPanel(JPanel upc, PersonDirectory pd) {
        initComponents();
        userProcessContainer = upc;
        personDirectory = pd;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        citycombobox = new javax.swing.JComboBox<>();
        lblcom1 = new javax.swing.JLabel();
        checkboxA = new javax.swing.JCheckBox();
        checkboxB = new javax.swing.JCheckBox();
        checkboxC = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txthouse = new javax.swing.JTextField();
        btnback11 = new javax.swing.JButton();
        btndisplay = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Abnormal Blood Pressure");

        jLabel2.setText(" City:");

        citycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston" }));
        citycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citycomboboxActionPerformed(evt);
            }
        });

        lblcom1.setText("Community :");

        checkboxA.setText("A");

        checkboxB.setText("B");

        checkboxC.setText("C");

        jLabel3.setText("House:");

        btnback11.setText("<< back");
        btnback11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback11ActionPerformed(evt);
            }
        });

        btndisplay.setText("Display");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcom1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnback11)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthouse, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxA)
                        .addGap(36, 36, 36)
                        .addComponent(checkboxB)
                        .addGap(41, 41, 41)
                        .addComponent(checkboxC)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(btndisplay)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback11))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(citycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcom1)
                    .addComponent(checkboxA)
                    .addComponent(checkboxB)
                    .addComponent(checkboxC))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(btndisplay)
                    .addGap(124, 124, 124)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void citycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citycomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citycomboboxActionPerformed

    private void btnback11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback11ActionPerformed

      userProcessContainer.remove(this);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnback11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback11;
    private javax.swing.JButton btndisplay;
    private javax.swing.JCheckBox checkboxA;
    private javax.swing.JCheckBox checkboxB;
    private javax.swing.JCheckBox checkboxC;
    private javax.swing.JComboBox<String> citycombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcom1;
    private javax.swing.JTextField txthouse;
    // End of variables declaration//GEN-END:variables
}
