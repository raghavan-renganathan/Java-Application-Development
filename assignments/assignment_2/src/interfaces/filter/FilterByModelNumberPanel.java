/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.filter;

import business.Car;
import business.Fleet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raghavan
 */
public class FilterByModelNumberPanel extends javax.swing.JPanel {

    private Fleet fleet;
    private JTable resultsTable;
    private JSplitPane advFilterSplitPane;
    /**
     * Creates new form filterByModelNumberPanel
     */
    public FilterByModelNumberPanel() {
        initComponents();
    }

    public FilterByModelNumberPanel(Fleet fleet, JTable resultsTable, JSplitPane advFilterSplitPane) {
        this.advFilterSplitPane = advFilterSplitPane;
        this.fleet = fleet;
        this.resultsTable = resultsTable;
        
        initComponents();
        hideErrorLables();
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
        modelNumberFilterTextField = new javax.swing.JTextField();
        modelNumberErrorLabel = new javax.swing.JLabel();
        showResultsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        moreFiltersButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(850, 130));
        setPreferredSize(new java.awt.Dimension(850, 130));

        jLabel1.setText("Model Number");

        modelNumberErrorLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        modelNumberErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        modelNumberErrorLabel.setText("Invalid value");

        showResultsButton.setText("Show Results");
        showResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultsButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        moreFiltersButton.setText("More Filter");
        moreFiltersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreFiltersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modelNumberErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                        .addComponent(moreFiltersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(modelNumberFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showResultsButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelNumberFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelNumberErrorLabel)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showResultsButton)
                    .addComponent(moreFiltersButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultsButtonActionPerformed
        if(validateForm()) {
            String filterByModelNumber = modelNumberFilterTextField.getText();
            
            DefaultTableModel tableModel = (DefaultTableModel) resultsTable.getModel();
            Object row[] = new Object[tableModel.getColumnCount()];
            
            tableModel.setRowCount(0);
            for(Car c : fleet.filterByModelNumber(filterByModelNumber)) {
                row[0] = c;
                row[1] = c.getManufacturer();
                row[2] = c.getModelNumber();
                tableModel.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid values in the form!");
        }
    }//GEN-LAST:event_showResultsButtonActionPerformed

    private void moreFiltersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreFiltersButtonActionPerformed
        DefaultTableModel df = (DefaultTableModel) resultsTable.getModel();
        ArrayList<Car> resultCars = new ArrayList<>();
        
        for(int i = 1; i <= resultsTable.getRowCount(); i++) {
            resultCars.add((Car)((Vector)df.getDataVector().elementAt(i)).elementAt(1));
        }
        
        FilterByMultipleEntities filterPanel = 
                new FilterByMultipleEntities(resultCars, this, 
                        advFilterSplitPane, resultsTable);
        
        advFilterSplitPane.setRightComponent(filterPanel);
    }//GEN-LAST:event_moreFiltersButtonActionPerformed

    private void hideErrorLables() {
        modelNumberErrorLabel.setVisible(false);
    }
    
    private boolean validateForm() {
        boolean isValid = true;
        hideErrorLables();
        if("".equals(modelNumberFilterTextField.getText())) {
            isValid = false;
            modelNumberErrorLabel.setVisible(!isValid);
        }
        return isValid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel modelNumberErrorLabel;
    private javax.swing.JTextField modelNumberFilterTextField;
    private javax.swing.JButton moreFiltersButton;
    private javax.swing.JButton showResultsButton;
    // End of variables declaration//GEN-END:variables
}
