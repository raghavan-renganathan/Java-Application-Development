/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.filter;

import business.Car;
import business.Fleet;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author raghavan
 */
public class FilterByCity extends javax.swing.JPanel {

    private Fleet fleet;
    private JTable resultsTable;
    private JSplitPane advFilterSplitPane;
    /**
     * Creates new form FilterByCity
     */
    public FilterByCity() {
        initComponents();
    }

    public FilterByCity(Fleet fleet, JTable resultsTable, JSplitPane advFilterSplitPane) {
        this.fleet = fleet;
        this.resultsTable = resultsTable;
        this.advFilterSplitPane = advFilterSplitPane;
        
        initComponents();
        populateComboBox();
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
        cityListComboBox = new javax.swing.JComboBox<>();
        showResultsButton = new javax.swing.JButton();
        moreFiltersButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(850, 130));
        setPreferredSize(new java.awt.Dimension(850, 130));

        jLabel1.setText("City");

        cityListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        showResultsButton.setText("Show Results");
        showResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultsButtonActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel1)
                    .addComponent(cityListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(634, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moreFiltersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showResultsButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showResultsButton)
                    .addComponent(moreFiltersButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultsButtonActionPerformed
        String filterByCity = (String) cityListComboBox.getSelectedItem();
        
        DefaultTableModel tableModel = (DefaultTableModel) resultsTable.getModel();
        Object row[] = new Object[tableModel.getColumnCount()];

        tableModel.setRowCount(0);
        for(Car c : fleet.filterByCityAndAvailibility(filterByCity)) {
            row[0] = c;
            row[1] = c.getCity();
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_showResultsButtonActionPerformed

    private void moreFiltersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreFiltersButtonActionPerformed
        DefaultTableModel df = (DefaultTableModel) resultsTable.getModel();
        ArrayList<Car> resultCars = new ArrayList<>();
        
        for(int i = 0; i < resultsTable.getRowCount(); i++) {
            resultCars.add((Car) df.getValueAt(i, 0));
        }
        
        FilterByMultipleEntities filterPanel = 
                new FilterByMultipleEntities(resultCars, this, 
                        advFilterSplitPane, resultsTable);
        advFilterSplitPane.setRightComponent(filterPanel);
    }//GEN-LAST:event_moreFiltersButtonActionPerformed


    private void populateComboBox() {
        TreeSet<String> citySet = fleet.getCities();
        String[] cityList = citySet.toArray(new String[citySet.size()]);
        
        cityListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(cityList));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityListComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton moreFiltersButton;
    private javax.swing.JButton showResultsButton;
    // End of variables declaration//GEN-END:variables
}
