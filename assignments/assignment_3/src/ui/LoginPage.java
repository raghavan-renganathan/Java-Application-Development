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

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Raghavan Renganathan <renganathan.raghavan@gmail.com>
 */
public class LoginPage extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(loadImage("flight-background.png", 1360, 768), 0, 0, null);
    }
    
    /**
     * The method to generate an Image object from a file.
     * 
     * @param filename  The filename of the icon.
     *                  <b>Should be located in /resources/images/ directory</b>
     * @param width     Desired width of the image
     * @param height    Desired height of the image
     * @return          The Image object of the desired image file
     */
    private Image loadImage(String filename, int width, int height) {
        File f;
        BufferedImage image;
        Image scaledImage;
        try {
            f = new File(System.getProperty("user.dir") + 
                    "/resources/images/" + filename);
            image = ImageIO.read(f);
            scaledImage = image.getScaledInstance(width, height, 
                    Image.SCALE_FAST);
            return scaledImage;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error rendering Picture!");
            return null;
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

        setPreferredSize(new java.awt.Dimension(1360, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}