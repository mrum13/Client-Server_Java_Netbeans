/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProgressBar.java
 *
 * Created on Jan 27, 2011, 9:55:00 PM
 */

package com.wordpress.yyaayyaatt.JFrame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.PanelUI;

/**
 *
 * @author Ahza
 */
public class LaunchProgressBar extends javax.swing.JDialog{

    /** Creates new form ProgressBar */
    public LaunchProgressBar() {
        setUndecorated(true);
        initComponents();
        splashPanel.setUI(new BackgroundUI());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x, y);
       progressBar.setStringPainted(true);
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashPanel = new javax.swing.JPanel();
        jPanelImage1 = new org.tm.container.JPanelImage();
        progressBar = new javax.swing.JProgressBar();
        jPanelImage2 = new org.tm.container.JPanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelImage1.setPosition(1);
        jPanelImage1.setWallpaper(new javax.swing.ImageIcon(getClass().getResource("/krs/immg.jpg"))); // NOI18N

        progressBar.setValue(50);

        jPanelImage2.setPosition(1);
        jPanelImage2.setWallpaper(new javax.swing.ImageIcon(getClass().getResource("/krs/splash.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImage2Layout = new javax.swing.GroupLayout(jPanelImage2);
        jPanelImage2.setLayout(jPanelImage2Layout);
        jPanelImage2Layout.setHorizontalGroup(
            jPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jPanelImage2Layout.setVerticalGroup(
            jPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelImage1Layout = new javax.swing.GroupLayout(jPanelImage1);
        jPanelImage1.setLayout(jPanelImage1Layout);
        jPanelImage1Layout.setHorizontalGroup(
            jPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addGroup(jPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanelImage1Layout.setVerticalGroup(
            jPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout splashPanelLayout = new javax.swing.GroupLayout(splashPanel);
        splashPanel.setLayout(splashPanelLayout);
        splashPanelLayout.setHorizontalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        splashPanelLayout.setVerticalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(splashPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        LaunchProgressBar pb = new LaunchProgressBar();
        pb.setVisible(true);
        for(int i=0;i<=100;i++){
            try {
                pb.getProgressBar().setValue(i);
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(LaunchProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pb.dispose();
        LoginDialog fl = new LoginDialog(null, true);
        fl.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.tm.container.JPanelImage jPanelImage1;
    private org.tm.container.JPanelImage jPanelImage2;
    public javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel splashPanel;
    // End of variables declaration//GEN-END:variables

}

class BackgroundUI extends PanelUI {
    ImageIcon background = new ImageIcon(getClass().getResource("/krs/immg.jpg"));
    @Override
    public void paint(Graphics g, JComponent c) {
         g.drawImage(background.getImage(), 0, 0, null);
    }
}
