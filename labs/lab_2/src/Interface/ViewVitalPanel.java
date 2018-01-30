/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghavan
 */
public class ViewVitalPanel extends javax.swing.JPanel {

    private VitalSignHistory vitalSignHistory;
    /**
     * Creates new form ViewVitalPanel
     * @param vitalSignHistory ArrayList containing VitalSign Objects
     */
    public ViewVitalPanel(VitalSignHistory vitalSignHistory) {
        initComponents();
        
        temperatureTextField.setEditable(false);
        bloodPressureTextField.setEditable(false);
        pulseTextField.setEditable(false);
        dateTextField.setEditable(false);
        
        this.vitalSignHistory = vitalSignHistory;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        viewDetailsButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        temperatureLabel = new javax.swing.JLabel();
        temperatureTextField = new javax.swing.JTextField();
        bloodPressureLabel = new javax.swing.JLabel();
        bloodPressureTextField = new javax.swing.JTextField();
        pulseLabel = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1166, 768));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Vital Sign");
        jLabel1.setAlignmentX(0.5F);

        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        viewDetailsButton.setText("View Details");
        viewDetailsButton.setMaximumSize(new java.awt.Dimension(120, 30));
        viewDetailsButton.setMinimumSize(new java.awt.Dimension(120, 30));
        viewDetailsButton.setPreferredSize(new java.awt.Dimension(120, 30));
        viewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setMaximumSize(new java.awt.Dimension(120, 30));
        deleteButton.setMinimumSize(new java.awt.Dimension(120, 30));
        deleteButton.setPreferredSize(new java.awt.Dimension(120, 30));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        temperatureLabel.setText("Temperature");

        bloodPressureLabel.setText("Blood Pressure");

        pulseLabel.setText("Pulse");

        dateLabel.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloodPressureLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(temperatureLabel)
                                        .addGap(90, 90, 90)
                                        .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pulseLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(dateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(viewDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 482, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodPressureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseLabel)
                    .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButtonActionPerformed
        int selectedRowIndex = vitalSignTable.getSelectedRow();
        
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        
        VitalSigns selectedRecord = 
                (VitalSigns) vitalSignTable.getValueAt(selectedRowIndex, 0);
        
        temperatureTextField.setEnabled(true);
        bloodPressureTextField.setEnabled(true);
        pulseTextField.setEnabled(true);
        dateTextField.setEnabled(true);
        
        temperatureTextField.setText(String.valueOf(selectedRecord.getTemperature()));
        bloodPressureTextField.setText(String.valueOf(selectedRecord.getBloodPressure()));
        pulseTextField.setText(String.valueOf(selectedRecord.getPulse()));
        dateTextField.setText(String.valueOf(selectedRecord.getDate()));
    }//GEN-LAST:event_viewDetailsButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRowIndex = vitalSignTable.getSelectedRow();
        
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        
        VitalSigns selectedRecord = 
                (VitalSigns) vitalSignTable.getValueAt(selectedRowIndex, 0);
        
        vitalSignHistory.deleteVitalSign(selectedRecord);
        JOptionPane.showMessageDialog(null, "Record Deleted Successfully!");
        populateTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void populateTable() {
        DefaultTableModel vitalTableModel = 
                (DefaultTableModel) vitalSignTable.getModel();
        
        clearTable(vitalTableModel);
        clearTextFields();
        
        for(VitalSigns vitalSign : vitalSignHistory.getVitalSignHistory()) {
            // Creating object tostore data. 2 columns hence an array of size 2
            Object row[] = new Object[2];
            
            row[0] = vitalSign;
            row[1] = vitalSign.getBloodPressure();
            
            vitalTableModel.addRow(row);
        }
    }
    
    private void clearTable(DefaultTableModel tableModel) {
        tableModel.setRowCount(0);
    }
    
    private void clearTextFields() {
        temperatureTextField.setEnabled(false);
        bloodPressureTextField.setEnabled(false);
        pulseTextField.setEnabled(false);
        dateTextField.setEnabled(false);
        
        temperatureTextField.setText("");
        bloodPressureTextField.setText("");
        pulseTextField.setText("");
        dateTextField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodPressureLabel;
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JTextField temperatureTextField;
    private javax.swing.JButton viewDetailsButton;
    private javax.swing.JTable vitalSignTable;
    // End of variables declaration//GEN-END:variables
}