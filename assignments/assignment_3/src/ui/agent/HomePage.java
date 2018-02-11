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
package ui.agent;

import collections.AirlinesDirectory;
import collections.CustomerDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.Airline;
import models.Flight;
import ui.AirlineSpecificForm;
import ui.AirlineSpecificPage;
import utils.ImageTools;

/**
 * This class renders the HomePage when an agent logs in
 *
 * @author Raghavan Renganathan <renganathan.raghavan@gmail.com>
 */
public class HomePage extends javax.swing.JPanel {

    /**
     * Private members which will hold the data regarding Customers, Flights,
     * Airliners and Agents
     */
    private final AirlinesDirectory airlinesDir;
    private final CustomerDirectory customerDir;
    private final JPanel pnlContainer;
    
    /**
     * Date Formatter
     */
    private final DateFormat DATE_FORMAT = new SimpleDateFormat("mm/dd/yyyy");
    
    /**
     * Creates new form HomePage
     * @param airlinesDir  The Directory of airlines
     * @param customerDir  The Directory of customers
     * @param pnlContainer The Parent container with card layout
     */
    public HomePage(AirlinesDirectory airlinesDir, 
                        CustomerDirectory customerDir, JPanel pnlContainer) {
        this.airlinesDir = airlinesDir;
        this.customerDir = customerDir;
        this.pnlContainer = pnlContainer;
        initComponents();
        populateTable();
        ImageTools.setIcon(lblLogo, "flight-logo.png", 100, 100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTripType = new javax.swing.ButtonGroup();
        pnlTitle = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        tabPnlMain = new javax.swing.JTabbedPane();
        pnlManage = new javax.swing.JPanel();
        pnlInnerManage = new javax.swing.JPanel();
        lblSubtitle = new javax.swing.JLabel();
        sepFirst = new javax.swing.JSeparator();
        scrollTblCntr = new javax.swing.JScrollPane();
        tblAirlines = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btmCreate = new javax.swing.JButton();
        pnlSearch = new javax.swing.JPanel();
        pnlInnerSearch = new javax.swing.JPanel();
        lblSubtitle1 = new javax.swing.JLabel();
        sepFirst1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilteredResults = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1360, 768));

        pnlTitle.setPreferredSize(new java.awt.Dimension(1360, 100));

        lblLogo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("The Flight Agency");

        btnLogout.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
            .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTitleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTitleLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lblLogo)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        pnlManage.setLayout(new java.awt.CardLayout());

        lblSubtitle.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        lblSubtitle.setText("Airlines");

        tblAirlines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total Number Of Flights"
            }
        ));
        scrollTblCntr.setViewportView(tblAirlines);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btmCreate.setText("Create");
        btmCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInnerManageLayout = new javax.swing.GroupLayout(pnlInnerManage);
        pnlInnerManage.setLayout(pnlInnerManageLayout);
        pnlInnerManageLayout.setHorizontalGroup(
            pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInnerManageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInnerManageLayout.createSequentialGroup()
                        .addComponent(lblSubtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepFirst))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInnerManageLayout.createSequentialGroup()
                        .addGroup(pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollTblCntr, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                            .addGroup(pnlInnerManageLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btmCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        pnlInnerManageLayout.setVerticalGroup(
            pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInnerManageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInnerManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sepFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTblCntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pnlManage.add(pnlInnerManage, "card2");

        tabPnlMain.addTab("Manage Airliners", pnlManage);

        pnlSearch.setLayout(new java.awt.CardLayout());

        lblSubtitle1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        lblSubtitle1.setText("Search");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel1.setText("From");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setText("To");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("Start Date");

        btnSearch.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSearch.setText("Search Flights");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblFilteredResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight", "Departure", "Arrival", "Available Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFilteredResults);

        btnBook.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBook.setText("Book Flight");

        javax.swing.GroupLayout pnlInnerSearchLayout = new javax.swing.GroupLayout(pnlInnerSearch);
        pnlInnerSearch.setLayout(pnlInnerSearchLayout);
        pnlInnerSearchLayout.setHorizontalGroup(
            pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                        .addComponent(lblSubtitle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepFirst1))
                    .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                        .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 473, Short.MAX_VALUE))
                            .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        pnlInnerSearchLayout.setVerticalGroup(
            pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sepFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtitle1))
                .addGap(18, 18, 18)
                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInnerSearchLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInnerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pnlSearch.add(pnlInnerSearch, "card3");

        tabPnlMain.addTab("Search Flights", pnlSearch);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPnlMain)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(tabPnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handler for Logout button click event
     * @param evt Java ActionEvent object
     */
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        pnlContainer.remove(this);
        CardLayout layout = (CardLayout) pnlContainer.getLayout();
        layout.previous(pnlContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * Handler for Create button click event
     * @param evt Java ActionEvent object
     */
    private void btmCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCreateActionPerformed
        AirlineSpecificForm createAirlineForm = 
                new AirlineSpecificForm(pnlManage, airlinesDir);
        pnlManage.add(createAirlineForm);
        CardLayout layout = (CardLayout) pnlManage.getLayout();
        layout.next(pnlManage);
    }//GEN-LAST:event_btmCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRowIndex = tblAirlines.getSelectedRow();
        
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        Airline airline = (Airline) tblAirlines.getValueAt(selectedRowIndex, 0);
        
        AirlineSpecificPage viewAirlinePage = 
                new AirlineSpecificPage(pnlManage, airline, airlinesDir);
        pnlManage.add(viewAirlinePage);
        CardLayout layout = (CardLayout) pnlManage.getLayout();
        layout.next(pnlManage);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String from = txtFrom.getText();
        String to = txtTo.getText();

        if ("".equals(from) || "".equals(to)) {
            JOptionPane.showMessageDialog(null, "From and To should be given!");
            return;
        }

        Date date;
        try {
            date = DATE_FORMAT.parse(txtStartDate.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Not a valid date!");
            date = new Date();
        }

        ArrayList<Flight> flights;
        Object[] row = new Object[5];
        clearFilterTable();
        for(Airline a : airlinesDir.getList()) {
            flights = a.getFlights().getConnectingFlights(from, to);
            for(Flight f : flights) {
                row[0] = a;
                row[1] = f;
                row[2] = f.getDeparture();
                row[3] = f.getArrival();
                row[4] = f.getAvailableSeats(date).size();
                addToFilterTable(row);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Method that populates the table records
     */
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAirlines.getModel();
        Object[] row = new Object[2];
        dtm.setRowCount(0);
        
        if(airlinesDir.isEmpty())
            return;
        
        airlinesDir.getList().stream().map((item) -> {
            row[0] = item;
            return item;
        }).map((item) -> {
            row[1] = item.getFlights().size();
            return item;
        }).forEachOrdered((_item) -> {
            dtm.addRow(row);
        });
    }
    
    /**
     * Method that populates the table records
     * @param row Row object to be added to the table
     */
    public void addToFilterTable(Object[] row) {
        DefaultTableModel dtm = 
                (DefaultTableModel) tblFilteredResults.getModel();
        dtm.addRow(row);
    }
    
    /**
     * Method that populates the table records
     */
    public void clearFilterTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAirlines.getModel();
        Object[] row = new Object[2];
        dtm.setRowCount(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCreate;
    private javax.swing.JButton btnBook;
    private javax.swing.ButtonGroup btnGrpTripType;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JPanel pnlInnerManage;
    private javax.swing.JPanel pnlInnerSearch;
    private javax.swing.JPanel pnlManage;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JScrollPane scrollTblCntr;
    private javax.swing.JSeparator sepFirst;
    private javax.swing.JSeparator sepFirst1;
    private javax.swing.JTabbedPane tabPnlMain;
    private javax.swing.JTable tblAirlines;
    private javax.swing.JTable tblFilteredResults;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
