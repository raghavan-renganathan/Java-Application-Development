/*
 * Copyright (C) 2018 Raghavan Renganathan <renganathan.raghavan@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ui;

import collections.AirlinesDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.Airline;
import models.Flight;
import ui.agent.HomePage;

/**
 * This class renders the create/edit Airlines page
 * 
 * @author Raghavan Renganathan <renganathan.raghavan@gmail.com>
 */
public class AirlineSpecificForm extends javax.swing.JPanel {

    /**
     * Declaring member variables
     */
    private JPanel pnlManage;
    private AirlinesDirectory airlinesDir;
    private Airline temp;
    
    /**
     * Creates new form AirlineSpecificForm
     * @param pnlManage   Parent JPanel with card layout
     * @param airlinesDir Directory of airlines
     */
    public AirlineSpecificForm(JPanel pnlManage, 
                                    AirlinesDirectory airlinesDir) {
        this.pnlManage = pnlManage;
        this.airlinesDir = airlinesDir;
        this.temp = null;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        btnAddFlight = new javax.swing.JButton();
        btnDeleteFlight = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1360, 597));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airline Details");

        jLabel2.setText("Name");

        jLabel3.setText("Flights");

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Model", "Origin", "Destination", "Departure", "Arrival", "Total Seats"
            }
        ));
        jScrollPane1.setViewportView(tblFlights);

        btnAddFlight.setText("Add");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        btnDeleteFlight.setText("Delete");
        btnDeleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFlightActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFlightActionPerformed
        int selectedRowIndex = tblFlights.getSelectedRow();
        
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        Flight selectedFlight =  
                (Flight) tblFlights.getValueAt(selectedRowIndex, 0);
        this.temp.getFlights().remove(selectedFlight);
        ((DefaultTableModel) tblFlights.getModel()).removeRow(selectedRowIndex);
    }//GEN-LAST:event_btnDeleteFlightActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        closeThis();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        temp = temp == null ? airlinesDir.create() : temp;
        FlightSpecificForm createFlightForm = 
                           new FlightSpecificForm(pnlManage, tblFlights, 
                                                             temp.getFlights());
        pnlManage.add(createFlightForm);
        CardLayout layout = (CardLayout) pnlManage.getLayout();
        layout.next(pnlManage);
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if("".equals(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "Name cannot be empty!");
            return;
        }
        Airline airline = temp == null ? airlinesDir.create() : temp;
        airline.setName(txtName.getText());
        airlinesDir.add(airline);
        closeThis();
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Method to close this view
     */
    public void closeThis() {
        pnlManage.remove(this);
        ((HomePage) pnlManage.getParent().getParent()).populateTable();        
        CardLayout layout = (CardLayout) pnlManage.getLayout();
        layout.previous(pnlManage);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteFlight;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
