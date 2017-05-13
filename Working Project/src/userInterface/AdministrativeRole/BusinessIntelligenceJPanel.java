/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.CongestionProblem.CongestionProblem;
import business.CongestionProblem.CongestionProblemDirectory;
import business.Enterprise.Enterprise;
import business.Location.Location;
import business.Location.LocationDirectory;
import business.Route.Route;
import business.Route.RouteDirectory;
import business.Route.TemporaryRouteList;
import java.awt.CardLayout;
import java.util.Collections;
import javax.swing.JPanel;

/**
 *
 * @author Swarup
 */
public class BusinessIntelligenceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private CongestionProblemDirectory congestionProblemDirectory;
    private TemporaryRouteList temporaryRouteList;
    private LocationDirectory locationDirectory;
    private RouteDirectory routeDirectory;
    /**
     * Creates new form BusinessIntelligenceJPanel
     */
    public BusinessIntelligenceJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        congestionProblemDirectory=enterprise.getCongestionProblemDirectory();
        locationDirectory=enterprise.getLocationDirectory();
        temporaryRouteList=new TemporaryRouteList();
        calculateCongestionProblem();
        calculateRoute();
    }
    
    public void calculateRoute(){
        for(Location location:locationDirectory.getLocationList()){
            for(Route route:location.getRouteDirectory().getRouteList()){
                temporaryRouteList.addRoute(route);
            }
        }
        
        Collections.sort(temporaryRouteList.getRouteList());
    }
    
    public void calculateCongestionProblem()
    {
        Collections.sort(congestionProblemDirectory.getCongestionProblemList());
    }
    
    public void displayRoute()
    {
         int i=0;

            for(Route s:temporaryRouteList.getRouteList())
            {
                if(i<1)
                {
                    txtRoute.setText(s.getRouteName());
                    i++;
                }
            }
    }

    public void displayCongestionProblem()
    {
         int i=0;

            for(CongestionProblem s:congestionProblemDirectory.getCongestionProblemList())
            {
                if(i<1)
                {
                    txtCongestion.setText(s.getProblemName());
                    i++;
                }
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

        btnCongestedRoute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRoute = new javax.swing.JTextField();
        btnCongestionProb = new javax.swing.JButton();
        btnCongestedRouteList = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        btnGraph = new javax.swing.JButton();
        btnNumberOfCongestionsOnRoutes = new javax.swing.JButton();
        btnNumberOfCongestions = new javax.swing.JButton();
        txtCongestion = new javax.swing.JTextField();
        btnProbSolved = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        btnCongestedRoute.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCongestedRoute.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnCongestedRoute.setText("Display Route that gets congested the most>>");
        btnCongestedRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongestedRouteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Business Intelligence:");

        txtRoute.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCongestionProb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCongestionProb.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnCongestionProb.setText("Display Congestion Problem occuring the most>>");
        btnCongestionProb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongestionProbActionPerformed(evt);
            }
        });

        btnCongestedRouteList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCongestedRouteList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnCongestedRouteList.setText("Get List of all Congested Routes");
        btnCongestedRouteList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongestedRouteListActionPerformed(evt);
            }
        });

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Project\\back-icon.png")); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        btnGraph.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGraph.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnGraph.setText("Graphical Representation");
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphActionPerformed(evt);
            }
        });

        btnNumberOfCongestionsOnRoutes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNumberOfCongestionsOnRoutes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnNumberOfCongestionsOnRoutes.setText("Total Number of Congestions on each Routes");
        btnNumberOfCongestionsOnRoutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberOfCongestionsOnRoutesActionPerformed(evt);
            }
        });

        btnNumberOfCongestions.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNumberOfCongestions.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnNumberOfCongestions.setText("Total Number of times a Congestion took place");
        btnNumberOfCongestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberOfCongestionsActionPerformed(evt);
            }
        });

        txtCongestion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnProbSolved.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnProbSolved.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Actions-go-next-icon (1).png")); // NOI18N
        btnProbSolved.setText("Problem Solved by each Employee");
        btnProbSolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbSolvedActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Exclamation-icon.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\Exclamation-icon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGraph, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCongestionProb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCongestedRouteList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCongestedRoute, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumberOfCongestionsOnRoutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumberOfCongestions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProbSolved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtCongestion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCongestedRoute)
                    .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCongestionProb)
                    .addComponent(txtCongestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnCongestedRouteList)
                .addGap(18, 18, 18)
                .addComponent(btnNumberOfCongestionsOnRoutes)
                .addGap(18, 18, 18)
                .addComponent(btnNumberOfCongestions)
                .addGap(18, 18, 18)
                .addComponent(btnProbSolved)
                .addGap(18, 18, 18)
                .addComponent(btnGraph)
                .addGap(18, 18, 18)
                .addComponent(backJButton1)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongestedRouteListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongestedRouteListActionPerformed
        // TODO add your handling code here:
        CongestedRoutesJPanel congestedRoutesJPanel = new CongestedRoutesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("CongestedRoutesJPanel", congestedRoutesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCongestedRouteListActionPerformed

    private void btnCongestedRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongestedRouteActionPerformed
        // TODO add your handling code here:
        displayRoute();
    }//GEN-LAST:event_btnCongestedRouteActionPerformed

    private void btnCongestionProbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongestionProbActionPerformed
        // TODO add your handling code here:
        displayCongestionProblem();
    }//GEN-LAST:event_btnCongestionProbActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed
        // TODO add your handling code here:
        GraphicalRepresentationJPanel graphicalRepresentationJPanel = new GraphicalRepresentationJPanel(userProcessContainer, enterprise, temporaryRouteList);
        userProcessContainer.add("GraphicalRepresentationJPanel", graphicalRepresentationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGraphActionPerformed

    private void btnNumberOfCongestionsOnRoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumberOfCongestionsOnRoutesActionPerformed
        // TODO add your handling code here:
        NumberOfCongestionsOnRouteJPanel numberOfCongestionsOnRouteJPanel = new NumberOfCongestionsOnRouteJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("NumberOfCongestionsOnRouteJPanel", numberOfCongestionsOnRouteJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNumberOfCongestionsOnRoutesActionPerformed

    private void btnNumberOfCongestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumberOfCongestionsActionPerformed
        // TODO add your handling code here:
        NumberOfTimesACongestionTookPlaceJPanel numberOfTimesACongestionTookPlaceJPanel = new NumberOfTimesACongestionTookPlaceJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("NumberOfTimesACongestionTookPlaceJPanel", numberOfTimesACongestionTookPlaceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNumberOfCongestionsActionPerformed

    private void btnProbSolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbSolvedActionPerformed
        // TODO add your handling code here:
        ProblemSolvedJPanel problemSolvedJPanel = new ProblemSolvedJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ProblemSolvedJPanel", problemSolvedJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProbSolvedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnCongestedRoute;
    private javax.swing.JButton btnCongestedRouteList;
    private javax.swing.JButton btnCongestionProb;
    private javax.swing.JButton btnGraph;
    private javax.swing.JButton btnNumberOfCongestions;
    private javax.swing.JButton btnNumberOfCongestionsOnRoutes;
    private javax.swing.JButton btnProbSolved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCongestion;
    private javax.swing.JTextField txtRoute;
    // End of variables declaration//GEN-END:variables
}
