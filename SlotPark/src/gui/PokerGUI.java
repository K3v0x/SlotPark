/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.PokerSpieler;
import bl.CasinoController;
import bl.SoundPlayer;
import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin
 */
public class PokerGUI extends javax.swing.JFrame {
    
    Random rand = new Random();
    String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    CasinoController cc = new CasinoController();
    SoundPlayer player = SoundPlayer.getInstance();
    
    private String username;
    private double geld;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
        cc.setUsername(username);
        lbName.setText("Name: " + username);
    }
    
    public double getGeld() {
        return geld;
    }
    
    public void setGeld(double geld) {
        this.geld = geld;
        
        lbGeld.setText(String.format("Geld: %.0f Chips", geld));
    }
    
    public PokerGUI() {
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);

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

        jPanel14 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbCom2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbStatus1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbCom1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbStatus2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lbCom3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbStatus3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lbCom4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbStatus4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btCheck = new javax.swing.JButton();
        tfEinsatz = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lbPot = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbC1 = new javax.swing.JLabel();
        lbC2 = new javax.swing.JLabel();
        lbC3 = new javax.swing.JLabel();
        lbC4 = new javax.swing.JLabel();
        lbC5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbCard1 = new javax.swing.JLabel();
        lbCard2 = new javax.swing.JLabel();
        lbDeckWert = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onLoad(evt);
            }
        });

        jPanel14.setLayout(new java.awt.GridLayout(2, 0));

        jPanel12.setLayout(new java.awt.BorderLayout());

        lbCom2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom2.setText("...");
        jPanel12.add(lbCom2, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Spieler");
        jPanel12.add(jLabel2, java.awt.BorderLayout.NORTH);

        lbStatus1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus1.setText("...");
        jPanel12.add(lbStatus1, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel12);

        jPanel15.setLayout(new java.awt.BorderLayout());

        lbCom1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom1.setText("...");
        lbCom1.setToolTipText("");
        jPanel15.add(lbCom1, java.awt.BorderLayout.SOUTH);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Spieler");
        jPanel15.add(jLabel3, java.awt.BorderLayout.NORTH);

        lbStatus2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus2.setText("...");
        jPanel15.add(lbStatus2, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel15);

        getContentPane().add(jPanel14, java.awt.BorderLayout.WEST);

        jPanel13.setLayout(new java.awt.GridLayout(2, 0));

        jPanel17.setLayout(new java.awt.BorderLayout());

        lbCom3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom3.setText("...");
        jPanel17.add(lbCom3, java.awt.BorderLayout.PAGE_END);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Spieler");
        jPanel17.add(jLabel4, java.awt.BorderLayout.NORTH);

        lbStatus3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus3.setText("...");
        jPanel17.add(lbStatus3, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel17);

        jPanel16.setLayout(new java.awt.BorderLayout());

        lbCom4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom4.setText("...");
        jPanel16.add(lbCom4, java.awt.BorderLayout.PAGE_END);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Spieler");
        jPanel16.add(jLabel5, java.awt.BorderLayout.NORTH);

        lbStatus4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbStatus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus4.setText("...");
        jPanel16.add(lbStatus4, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel16);

        getContentPane().add(jPanel13, java.awt.BorderLayout.EAST);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lbIcon.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbIcon.setText("Icon");
        jPanel1.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        lbName.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.add(lbName);

        lbGeld.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.add(lbGeld);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        btCheck.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btCheck.setText("Check");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCheck(evt);
            }
        });
        jPanel4.add(btCheck);

        tfEinsatz.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tfEinsatz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tfEinsatz);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton4.setText("Fold");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFold(evt);
            }
        });
        jPanel4.add(jButton4);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setText("Erhöhen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRaise(evt);
            }
        });
        jPanel4.add(jButton2);

        jPanel2.add(jPanel4);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Zurück");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        lbPot.setBackground(new java.awt.Color(153, 102, 0));
        lbPot.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbPot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPot.setText("POT: 0 Chips");
        lbPot.setOpaque(true);
        jPanel10.add(lbPot, java.awt.BorderLayout.NORTH);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 5));

        lbC1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC1);

        lbC2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC2);

        lbC3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC3);

        lbC4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC4);

        lbC5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC5);

        jPanel10.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        lbCard1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard1);

        lbCard2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard2);

        jPanel11.add(jPanel8, java.awt.BorderLayout.CENTER);

        lbDeckWert.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbDeckWert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDeckWert.setText("Checking...");
        jPanel11.add(lbDeckWert, java.awt.BorderLayout.NORTH);

        jPanel6.add(jPanel11);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());
        jPanel6.add(jPanel9);

        jPanel3.add(jPanel6);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        MenuGUI menugui = new MenuGUI();
        menugui.setUsername(username);
        menugui.setGeld((int) (geld / 5));
        menugui.setVisible(true);
        player.close("music");
        this.dispose();
    }//GEN-LAST:event_onBack

    private void onCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCheck
        if (btCheck.getText().equals("Neue Runde")) {
            btCheck.setText("Check");
            cc.newRound();
        } else if (cc.getFlopedcards() == 5) {
            PokerSpieler winner = cc.checkwin();
            if(winner.getName().equals(username))
            {
                setGeld(geld+cc.getPot());
                cc.setPot(0);
            }
            System.out.println(winner.getName());
            btCheck.setText("Neue Runde");
        } else if (btCheck.getText().equals("Check")) {
            cc.check();
        }
        updateUI();
    }//GEN-LAST:event_onCheck

    private void onRaise(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRaise
        try {
            int einsatz = Integer.parseInt(tfEinsatz.getText());
            cc.raise(einsatz);
        } catch (NumberFormatException e) {
            System.out.println("is keine zahl");
        }
        updateUI();

    }//GEN-LAST:event_onRaise

    private void onFold(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFold
        cc.fold();
        
        cc.newRound();
        updateUI();
    }//GEN-LAST:event_onFold

    private void onLoad(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onLoad
        cc.load();
        player.play("music", "Poker.mp3", true);
        updateUI();
    }//GEN-LAST:event_onLoad
    
    public void updateUI() {
        lbPot.setText("Pot: " + cc.getPot());
        lbDeckWert.setText(cc.getSpielerliste().getFirst().getCombo().getName());
        
        lbCard1.setIcon(new ImageIcon(imagepath + cc.getSpielerliste().getFirst().getKarten()[0].getWert() + "" + cc.getSpielerliste().getFirst().getKarten()[0].getFarbe().getName() + ".png"));
        lbCard2.setIcon(new ImageIcon(imagepath + cc.getSpielerliste().getFirst().getKarten()[1].getWert() + "" + cc.getSpielerliste().getFirst().getKarten()[1].getFarbe().getName() + ".png"));
        lbCom1.setText(username);
        if (cc.getFlopedcards() == 0) {
            lbC1.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC2.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC3.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC4.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC5.setIcon(new ImageIcon(imagepath + "red_back.png"));
        }
        if (!cc.isPreflop()) {
            try {
                switch (cc.getFlopedcards()) {
                    case 3:
                        lbC1.setIcon(new ImageIcon(imagepath + cc.getKartentisch()[0].getWert() + "" + cc.getKartentisch()[0].getFarbe().getName() + ".png"));
                        lbC2.setIcon(new ImageIcon(imagepath + cc.getKartentisch()[1].getWert() + "" + cc.getKartentisch()[1].getFarbe().getName() + ".png"));
                        lbC3.setIcon(new ImageIcon(imagepath + cc.getKartentisch()[2].getWert() + "" + cc.getKartentisch()[2].getFarbe().getName() + ".png"));
                        break;
                    case 4:
                        lbC4.setIcon(new ImageIcon(imagepath + cc.getKartentisch()[3].getWert() + "" + cc.getKartentisch()[3].getFarbe().getName() + ".png"));
                        break;
                    case 5:
                        lbC5.setIcon(new ImageIcon(imagepath + cc.getKartentisch()[4].getWert() + "" + cc.getKartentisch()[4].getFarbe().getName() + ".png"));
                        break;
                }
                
            } catch (NullPointerException e) {
                System.out.println("karte nicht aufgedeckt");
            }
        }
        lbCom1.setText("" + cc.getSpielerliste().get(1).getCombo());
        lbCom2.setText("" + cc.getSpielerliste().get(2).getCombo());
        lbCom3.setText("" + cc.getSpielerliste().get(3).getCombo());
        lbCom4.setText("" + cc.getSpielerliste().get(4).getCombo());
        
        lbStatus1.setText("" + cc.getSpielerliste().get(1).getStatus());
        lbStatus2.setText("" + cc.getSpielerliste().get(2).getStatus());
        lbStatus3.setText("" + cc.getSpielerliste().get(3).getStatus());
        lbStatus4.setText("" + cc.getSpielerliste().get(4).getStatus());
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
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbC2;
    private javax.swing.JLabel lbC3;
    private javax.swing.JLabel lbC4;
    private javax.swing.JLabel lbC5;
    private javax.swing.JLabel lbCard1;
    private javax.swing.JLabel lbCard2;
    private javax.swing.JLabel lbCom1;
    private javax.swing.JLabel lbCom2;
    private javax.swing.JLabel lbCom3;
    private javax.swing.JLabel lbCom4;
    private javax.swing.JLabel lbDeckWert;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPot;
    private javax.swing.JLabel lbStatus1;
    private javax.swing.JLabel lbStatus2;
    private javax.swing.JLabel lbStatus3;
    private javax.swing.JLabel lbStatus4;
    private javax.swing.JTextField tfEinsatz;
    // End of variables declaration//GEN-END:variables
}
