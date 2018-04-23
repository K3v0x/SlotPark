/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Spieler;
import beans.Symbol;
import static beans.Symbol.*;
import bl.SlotController;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin
 */
public class SlotsGUI extends javax.swing.JFrame {

    private Symbol[] slots = {DIAMOND, LUCK, TREE, CHERRY};
    private String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator;
    JLabel[][] labels;
    SlotController sc;
    
    private Spieler s;

    SlotThread st;
    Thread thread;
    Random rand = new Random();
    int spins = 0;

    public Spieler getS() {
        return s;
    }

    public void setS(Spieler s) {
        this.s = s;
        lbName.setText("Name: " + s.getName());
        lbGeld.setText(String.format("Geld: %.0f Chips", s.getGeld()));
        lbIcon.setIcon(s.getIcon().getIcon());
    }

    public SlotsGUI() {
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);
        initComponents();
        st = new SlotThread();
        thread = new Thread(st);

        sc = new SlotController();
        labels = new JLabel[][]{
            {lb00, lb01, lb02},
            {lb10, lb11, lb12},
            {lb20, lb21, lb22}};
        thread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lb00 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lb01 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lb02 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.GridLayout(3, 0));

        lb00.setBackground(new java.awt.Color(255, 255, 255));
        lb00.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lb00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LuckSlot.png"))); // NOI18N
        lb00.setOpaque(true);
        jPanel7.add(lb00);

        lb10.setBackground(new java.awt.Color(255, 255, 255));
        lb10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lb10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LuckSlot.png"))); // NOI18N
        lb10.setOpaque(true);
        jPanel7.add(lb10);

        lb20.setBackground(new java.awt.Color(255, 255, 255));
        lb20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lb20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LuckSlot.png"))); // NOI18N
        lb20.setOpaque(true);
        jPanel7.add(lb20);

        jPanel2.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.GridLayout(3, 0));

        lb01.setBackground(new java.awt.Color(255, 255, 255));
        lb01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CherrySlot.png"))); // NOI18N
        lb01.setOpaque(true);
        jPanel8.add(lb01);

        lb11.setBackground(new java.awt.Color(255, 255, 255));
        lb11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CherrySlot.png"))); // NOI18N
        lb11.setOpaque(true);
        jPanel8.add(lb11);

        lb21.setBackground(new java.awt.Color(255, 255, 255));
        lb21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CherrySlot.png"))); // NOI18N
        lb21.setOpaque(true);
        jPanel8.add(lb21);

        jPanel2.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.GridLayout(3, 0));

        lb02.setBackground(new java.awt.Color(255, 255, 255));
        lb02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DiamondSlot.png"))); // NOI18N
        lb02.setOpaque(true);
        jPanel9.add(lb02);

        lb12.setBackground(new java.awt.Color(255, 255, 255));
        lb12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DiamondSlot.png"))); // NOI18N
        lb12.setOpaque(true);
        jPanel9.add(lb12);

        lb22.setBackground(new java.awt.Color(255, 255, 255));
        lb22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DiamondSlot.png"))); // NOI18N
        lb22.setOpaque(true);
        jPanel9.add(lb22);

        jPanel2.add(jPanel9);

        jPanel5.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jToggleButton1.setText("10%");
        jPanel6.add(jToggleButton1);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jToggleButton2.setText("25%");
        jPanel6.add(jToggleButton2);

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jToggleButton3.setText("50%");
        jPanel6.add(jToggleButton3);

        jPanel5.add(jPanel6, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Spielen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSpin(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setText("Zurück");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        jPanel3.add(jButton2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pillar.png"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.LINE_END);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pillar.png"))); // NOI18N
        getContentPane().add(jLabel2, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lbIcon.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jPanel1.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        lbName.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbName.setText("Name:");
        jPanel4.add(lbName);

        lbGeld.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbGeld.setText("Geld:");
        jPanel4.add(lbGeld);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSpin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSpin
        sc.spin();
        Symbol[][] symbole = sc.getSlotdisplay();
        for (int i = 0; i < symbole.length; i++) {
            for (int j = 0; j < symbole.length; j++) {
                labels[i][j].setIcon(new ImageIcon(imagepath + symbole[i][j].getName() + "Slot.png"));
            }

        }
    }//GEN-LAST:event_onSpin

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        MenuGUI menugui = new MenuGUI();
        menugui.setS(s);
        menugui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onBack

    public class SlotThread implements Runnable {

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                for (int i = 0; i < labels.length; i++) {
                    for (int j = 0; j < labels.length; j++) {
                        labels[i][j].setIcon(new ImageIcon(imagepath + slots[rand.nextInt((slots.length - 1) - 0 + 1) + 0] + "Slot.png"));
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SlotsGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                spins++;
                if (spins == 20) {
                    break;
                }
            }

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlotsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lb00;
    private javax.swing.JLabel lb01;
    private javax.swing.JLabel lb02;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb21;
    private javax.swing.JLabel lb22;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
