/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.CongestionProblem.CongestionProblem;
import business.CongestionProblem.CongestionProblemDirectory;
import business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swarup
 */
public class NumberOfTimesACongestionTookPlaceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private CongestionProblemDirectory congestionProblemDirectory;
    /**
     * Creates new form NumberOfTimesACongestionTookPlace
     */
    public NumberOfTimesACongestionTookPlaceJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        congestionProblemDirectory=enterprise.getCongestionProblemDirectory();
        constructTable();
    }
    
    public void constructTable(){
        DefaultTableModel defaultTableModel=(DefaultTableModel)congestionTable.getModel();
        defaultTableModel.setRowCount(0);
        
            for(CongestionProblem congestionProblem:congestionProblemDirectory.getCongestionProblemList()){
                
                    
                    Object[] row = new Object[2];
                    row[0] = congestionProblem;   
                    row[1] = congestionProblem.getProbConCount();
                    defaultTableModel.addRow(row);
                
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        congestionTable = new javax.swing.JTable();
        backJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        congestionTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        congestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Congestion Name", "Occurence"
            }
        ));
        jScrollPane1.setViewportView(congestionTable);

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Project\\back-icon.png")); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Number of times a Congestion Took Place:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton1)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton1)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTable congestionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
