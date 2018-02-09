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

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * The landing page of the application. This is where the application is 
 * started.
 * 
 * @author Raghavan Renganathan <renganathan.raghavan@gmail.com>
 * @version 1.0
 * @since   Feb 9, 2018
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
        initIcons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlLandingPage = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnAgent = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1360, 760));

        pnlContainer.setPreferredSize(new java.awt.Dimension(1360, 768));
        pnlContainer.setLayout(new java.awt.CardLayout());

        lblLogo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("The Flight Agency");

        btnAgent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgent.setText("Agent Login");
        btnAgent.setFocusable(false);
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCustomer.setText("Customer Login");
        btnCustomer.setFocusable(false);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLandingPageLayout = new javax.swing.GroupLayout(pnlLandingPage);
        pnlLandingPage.setLayout(pnlLandingPageLayout);
        pnlLandingPageLayout.setHorizontalGroup(
            pnlLandingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLandingPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlLandingPageLayout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addGroup(pnlLandingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        pnlLandingPageLayout.setVerticalGroup(
            pnlLandingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLandingPageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );

        pnlContainer.add(pnlLandingPage, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The callback function for Agent Login button click event
     * @param evt Java ActionEvent object
     */
    private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentActionPerformed
        LoginPage loginPage = new LoginPage(pnlContainer, "Agent");
        pnlContainer.add("LoginPage", loginPage);
        CardLayout layout = (CardLayout) pnlContainer.getLayout();
        layout.next(pnlContainer);
    }//GEN-LAST:event_btnAgentActionPerformed

    /**
     * The callback function for Customer Login button click event
     * @param evt Java ActionEvent object
     */
    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        LoginPage loginPage = new LoginPage(pnlContainer, "Customer");
        pnlContainer.add("LoginPage", loginPage);
        CardLayout layout = (CardLayout) pnlContainer.getLayout();
        layout.next(pnlContainer);
    }//GEN-LAST:event_btnCustomerActionPerformed

    /**
     * A function to initialize all the image labels in the JFrame
     */
    private void initIcons() {    
        setIcon(lblLogo, "flight-logo.png", 100, 100);
        setIcon(btnAgent, "agent-logo.png", 50, 50);
        setIcon(btnCustomer, "customer-logo.png", 50, 50);
    }
    
    /**
     * This method sets icon for the JComponents.
     * 
     * @param component A JComponent for which the icon has to be set.
     *                  <b>Should be a JButton or JLabel</b>
     * @param filename  The filename of the icon.
     *                  <b>Should be located in /resources/images/ directory</b>
     * @param width     Desired width of the icon
     * @param height    Desired height of the icon
     */
    private void setIcon(JComponent component, String filename, 
                            int width, int height) {
        if(!(component instanceof JButton) && !(component instanceof JLabel))
            return;
        
        JButton _button;
        JLabel _label;

        File f;
        BufferedImage image;
        Image scaledImage;
        try {
            f = new File(System.getProperty("user.dir") + 
                    "/resources/images/" + filename);
            image = ImageIO.read(f);
            scaledImage = image.getScaledInstance(width, height, 
                    Image.SCALE_FAST);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error rendering Picture!");
            return;
        }
        
        if(component instanceof JButton){
            _button = (JButton) component;
            _button.setIcon(new ImageIcon(scaledImage));
        } else {
            _label = (JLabel) component;
            _label.setIcon(new ImageIcon(scaledImage));
        }
    }
    
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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        LandingPage landingPage = new LandingPage();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                landingPage.setTitle("TFA - The Flight Agency");
                landingPage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLandingPage;
    // End of variables declaration//GEN-END:variables
}
