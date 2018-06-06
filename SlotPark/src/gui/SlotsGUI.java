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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Kevin
 */
public class SlotsGUI extends javax.swing.JFrame {

    private Symbol[] slots = {Symbol.CHERRY, Symbol.TREE, Symbol.LUCK, Symbol.DIAMOND};
    private String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator;
    private String currMoney;
    private int gewinnFaktor = 1;
    private int kontoStand;
    private int zz;
    private int roll = 0;
    private int[][] berechnung = new int[3][3];
    JLabel[][] labels;
    SlotController sc;

    private Spieler s;
    Random rand = new Random();

    public Spieler getS() {
        return s;
    }

    public void setS(Spieler s) {
        this.s = s;
        lbName.setText("Name: " + s.getName());
        lbGeld.setText(String.format("Geld: %.0f Chips", s.getGeld() * 5));
        lbIcon.setIcon(s.getIcon().getIcon());
    }

    public SlotsGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        initComponents();
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(width, height);

        sc = new SlotController();

        kontoStand = Integer.parseInt(lbGeld.getText().replaceAll("Geld: ", "").trim());
        btSpielen.setEnabled(false);

        labels = new JLabel[][]{
            {lb00, lb01, lb02},
            {lb10, lb11, lb12},
            {lb20, lb21, lb22}};
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
        btSet1 = new javax.swing.JButton();
        btSet3 = new javax.swing.JButton();
        btSet5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btSpielen = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

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
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

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
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

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

        btSet1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btSet1.setText("1");
        btSet1.setPreferredSize(new java.awt.Dimension(59, 67));
        btSet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSet1(evt);
            }
        });
        jPanel6.add(btSet1);

        btSet3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btSet3.setText("3");
        btSet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSet3(evt);
            }
        });
        jPanel6.add(btSet3);

        btSet5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btSet5.setText("5");
        btSet5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSet5(evt);
            }
        });
        jPanel6.add(btSet5);

        jPanel5.add(jPanel6, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        btSpielen.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btSpielen.setText("Spielen");
        btSpielen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSpin(evt);
            }
        });
        jPanel3.add(btSpielen);

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

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pillar.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, java.awt.BorderLayout.LINE_END);

        jLabel2.setBackground(new java.awt.Color(102, 51, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pillar.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, java.awt.BorderLayout.LINE_START);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new java.awt.BorderLayout(40, 0));

        lbIcon.setBackground(new java.awt.Color(0, 153, 153));
        lbIcon.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbIcon.setOpaque(true);
        jPanel1.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(2, 0, 10, 0));

        lbName.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbName.setText("Name:");
        jPanel4.add(lbName);

        lbGeld.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbGeld.setText("Geld: 10");
        jPanel4.add(lbGeld);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSpin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSpin
        SlotThread st = new SlotThread();
        Thread thread = new Thread(st);
        thread.start();
        setBackgroundOnLabels();
        btSet1.setEnabled(false);
        btSet3.setEnabled(false);
        btSet5.setEnabled(false);
        btSpielen.setEnabled(false);
    }//GEN-LAST:event_onSpin

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        MenuGUI menugui = new MenuGUI();
        menugui.setS(s);
        menugui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onBack

    private void onSet1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSet1
      String geld = lbGeld.getText().replaceAll("Geld: ", "");
        geld = geld.replaceAll(" Chips", "").trim();
        kontoStand = Integer.parseInt(geld);
        kontoStand = kontoStand - 1;
        if (kontoStand <= 0) {
            stopTheZock();
            kontoStand = 0;
        }
        lbGeld.setText("Geld: " + kontoStand + " Chips");
    }//GEN-LAST:event_onSet1

    private void onSet3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSet3
        String geld = lbGeld.getText().replaceAll("Geld: ", "");
        geld = geld.replaceAll(" Chips", "").trim();
        kontoStand = Integer.parseInt(geld);
        kontoStand = kontoStand - 3;
        if (kontoStand <= 0) {
            stopTheZock();
            kontoStand = 0;
        }
        lbGeld.setText("Geld: " + kontoStand + " Chips");
    }//GEN-LAST:event_onSet3

    private void onSet5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSet5
    String geld = lbGeld.getText().replaceAll("Geld: ", "");
        geld = geld.replaceAll(" Chips", "").trim();
        kontoStand = Integer.parseInt(geld);
        kontoStand = kontoStand - 5;
        if (kontoStand <= 0) {
            stopTheZock();
            kontoStand = 0;
        }
        lbGeld.setText("Geld: " + kontoStand + " Chips");
    }//GEN-LAST:event_onSet5

    public void stopTheZock() {
        btSet1.setEnabled(false);
        btSet3.setEnabled(false);
        btSet5.setEnabled(false);
        btSpielen.setEnabled(false);
    }
    
     public void addGewinnToKonto(int gewinn) {
        kontoStand += gewinn;
        lbGeld.setText("Geld: " + kontoStand + " Chips");
    }

    public void setBackgroundOnLabels() {
        lb00.setBackground(Color.white);
        lb01.setBackground(Color.white);
        lb02.setBackground(Color.white);
        lb10.setBackground(Color.white);
        lb11.setBackground(Color.white);
        lb12.setBackground(Color.white);
        lb20.setBackground(Color.white);
        lb21.setBackground(Color.white);
        lb22.setBackground(Color.white);
    }

    public void checkMoney() {
        if (kontoStand >= 1 && kontoStand < 3) {
            btSet1.setEnabled(true);
            btSet3.setEnabled(false);
            btSet5.setEnabled(false);
        } else if (kontoStand >= 3 && kontoStand < 5) {
            btSet1.setEnabled(true);
            btSet3.setEnabled(true);
            btSet5.setEnabled(false);
        } else if (kontoStand >= 5) {
            btSet1.setEnabled(true);
            btSet3.setEnabled(true);
            btSet5.setEnabled(true);
        } else if (kontoStand == 0) {
            stopTheZock();
        }
    }

    public void addGewinnToKonto(int[] gewinn, int gewinnFaktor) {
        kontoStand += gewinn[0];
        lbGeld.setText("Geld: " + kontoStand);
        if (gewinn[1] == 1) {
            lb00.setBackground(Color.green);
            lb01.setBackground(Color.green);
            lb02.setBackground(Color.green);
        }
        if (gewinn[1] == 2) {
            lb10.setBackground(Color.green);
            lb11.setBackground(Color.green);
            lb12.setBackground(Color.green);
        }
        if (gewinn[1] == 3) {
            lb20.setBackground(Color.green);
            lb21.setBackground(Color.green);
            lb22.setBackground(Color.green);
        }
    }

    public class SlotThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < labels.length; i++) {
                for (int k = 0; k < 20; k++) {
                    zz = rand.nextInt(slots.length - 1) - 0 + 1;
                    labels[0][i].setIcon(new ImageIcon(imagepath + slots[zz] + "Slot.png"));

                    berechnung[0][i] = zz;
                    if (k >= 3) {
                        zz = rand.nextInt(slots.length - 1) - 0 + 1;
                        labels[1][i].setIcon(new ImageIcon(imagepath + slots[zz] + "Slot.png"));
                        berechnung[1][i] = zz + 1;
                    }
                    if (k >= 6) {
                        zz = rand.nextInt(slots.length - 1) - 0 + 1;
                        labels[2][i].setIcon(new ImageIcon(imagepath + slots[zz] + "Slot.png"));
                        berechnung[2][i] = zz;
                    }
                    try {
                        Thread.sleep(65);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SlotsGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            int[] gewinn = sc.getGewinn(berechnung);
            addGewinnToKonto(gewinn, gewinnFaktor);
            checkMoney();
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
    private javax.swing.JButton btSet1;
    private javax.swing.JButton btSet3;
    private javax.swing.JButton btSet5;
    private javax.swing.JButton btSpielen;
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
