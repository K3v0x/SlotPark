/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Combi;
import static beans.Combi.*;
import beans.Farbe;
import static beans.Farbe.*;
import beans.Karte;
import beans.PokerSpieler;
import beans.Spieler;
import java.awt.Color;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin
 */
public class PokerGUI extends javax.swing.JFrame {

    Random rand = new Random();
    String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    LinkedList<PokerSpieler> spielerliste = new LinkedList<>(); //Spielerliste
    Stack<Karte> stapel = new Stack<>(); //Kartenstapel

    int mindesteinsatz = 10; //Minimaler Einsatz
    int flopedcards = 0; //Anzahl der aufgedeckten Karten
    int pot = 0; //Anzahl der Chips im Pot
    PokerSpieler spieler = new PokerSpieler(new Karte[2], HOHEKARTE, false, false, "Hans", "1", 100);
    PokerSpieler com1 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Mike", "1", 100);
    PokerSpieler com2 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Martin", "1", 100);
    PokerSpieler com3 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Sarah", "1", 100);
    PokerSpieler com4 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Tom", "1", 100);

    Karte[] kartentisch = new Karte[5]; //Karten, die auf dem Tisch liegen
    boolean preflop = true; //Preflop-Phase
    boolean flop = false; //Flop-Phase
    boolean raisemode = false;
    private String username;
    private double geld;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        spielerliste.add(com1);
        spielerliste.add(com2);
        spielerliste.add(com3);
        spielerliste.add(com4);
        tfEinsatz.setText("" + mindesteinsatz);
        lbPot.setText("Pot: " + pot);
        newRound(spieler);
        newRound(com1);
        newRound(com2);
        newRound(com3);
        newRound(com4);
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
        jPanel15 = new javax.swing.JPanel();
        lbCom1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lbCom3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lbCom4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbCard1 = new javax.swing.JLabel();
        lbCard2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbDeckWert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel14.setLayout(new java.awt.GridLayout(2, 0));

        jPanel12.setLayout(new java.awt.BorderLayout());

        lbCom2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom2.setText("...");
        jPanel12.add(lbCom2, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Spieler");
        jPanel12.add(jLabel2, java.awt.BorderLayout.NORTH);

        jPanel14.add(jPanel12);

        jPanel15.setLayout(new java.awt.BorderLayout());

        lbCom1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom1.setText("...");
        lbCom1.setToolTipText("");
        jPanel15.add(lbCom1, java.awt.BorderLayout.SOUTH);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Spieler");
        jPanel15.add(jLabel3, java.awt.BorderLayout.NORTH);

        jPanel14.add(jPanel15);

        getContentPane().add(jPanel14, java.awt.BorderLayout.WEST);

        jPanel13.setLayout(new java.awt.GridLayout(2, 0));

        jPanel17.setLayout(new java.awt.BorderLayout());

        lbCom3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom3.setText("...");
        jPanel17.add(lbCom3, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel17);

        jPanel16.setLayout(new java.awt.BorderLayout());

        lbCom4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom4.setText("...");
        jPanel16.add(lbCom4, java.awt.BorderLayout.CENTER);

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

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCheck(evt);
            }
        });
        jPanel4.add(jButton3);

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

        jLabel1.setBackground(new java.awt.Color(153, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eigene Karten");
        jPanel11.add(jLabel1, java.awt.BorderLayout.PAGE_START);

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

        jPanel6.add(jPanel11);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        lbDeckWert.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbDeckWert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDeckWert.setText("Checking...");
        jPanel9.add(lbDeckWert, java.awt.BorderLayout.PAGE_START);

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
        this.dispose();
    }//GEN-LAST:event_onBack

    private void onCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCheck
        raisemode = false;
        if (preflop) {
            //Preflop: 3 Karten werden auf dem Tisch aufgedeckt
            kartentisch[0] = flop(lbC1);
            kartentisch[1] = flop(lbC2);
            kartentisch[2] = flop(lbC3);
            flopedcards = 3;
            preflop = false;

            lbDeckWert.setText("" + checkCombi(spieler));
            letcomplay(com1, lbCom1);
            letcomplay(com1, lbCom2);
            letcomplay(com1, lbCom3);
            letcomplay(com1, lbCom4);

        } else {
            //Flop: 1 weitere Karte wird auf dem Tisch aufgedeckt
            if (flopedcards < 5 && !raisemode) {
                switch (flopedcards) {
                    case 3:
                        kartentisch[3] = flop(lbC4);
                        break;
                    case 4:
                        kartentisch[4] = flop(lbC5);
                        break;
                }
                flopedcards++;
                lbDeckWert.setText("" + checkCombi(spieler));
                letcomplay(com1, lbCom1);
                letcomplay(com2, lbCom2);
                letcomplay(com3, lbCom3);
                letcomplay(com4, lbCom4);
            } else if (flopedcards == 5) {
                Combi winnercombo = spieler.getCombo();
                String winner = spieler.getName();
                for (PokerSpieler pokerSpieler : spielerliste) {
                    if (pokerSpieler.getCombo().getWert() > winnercombo.getWert()) {
                        winnercombo = pokerSpieler.getCombo();
                        winner = pokerSpieler.getName();
                    }
                }
                System.out.println(winner + " hat das Spiel gewonnen! : " + winnercombo);
            }

        }

    }//GEN-LAST:event_onCheck

    private void onRaise(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRaise
        try {
            //Einsatz erhöhen
            raisemode = true;
            int einsatz = Integer.parseInt(tfEinsatz.getText());
            tfEinsatz.setBackground(Color.WHITE);
            pot = pot + einsatz;
            letcomplay(com1, lbCom1);
            letcomplay(com2, lbCom2);
            letcomplay(com3, lbCom3);
            letcomplay(com4, lbCom4);

        } catch (NumberFormatException e) {
            System.out.println("Einsatz muss eine Zahl sein!");
            tfEinsatz.setBackground(Color.RED);
        }


    }//GEN-LAST:event_onRaise

    private void onFold(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFold
        stapel.clear();
        newRound(spieler);
        for (PokerSpieler pokerSpieler : spielerliste) {
            newRound(pokerSpieler);
        }
    }//GEN-LAST:event_onFold

    public void newRound(PokerSpieler spieler) { //Neue Runde starten
        preflop = true;

        flopedcards = 0;
        if (!spieler.isComputer()) {
            createCards(HERZ);
            createCards(PIK);
            createCards(KARO);
            createCards(KREUZ);
            lbC1.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC2.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC3.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC4.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC5.setIcon(new ImageIcon(imagepath + "red_back.png"));
        }
        //Karte 1
        Karte karte = stapel.pop();
        if (stapel.size() - 1 > -1) {
            if (!spieler.isComputer()) {
                if (karte.getWert() == 1) {
                    lbCard1.setIcon(new ImageIcon(imagepath + ("A" + karte.getFarbe().getName() + ".png")));
                } else {
                    lbCard1.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));
                }
            }
            spieler.getKarten()[0] = karte;

            //Karte 2
            karte = stapel.pop();
            if (!spieler.isComputer()) {
                if (karte.getWert() == 1) {
                    lbCard2.setIcon(new ImageIcon(imagepath + ("A" + karte.getFarbe().getName() + ".png")));
                } else {
                    lbCard2.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));
                }
            }
            spieler.getKarten()[1] = karte;

            //Wert der Karten
            if (!spieler.isComputer()) {
                lbDeckWert.setText("" + checkCombi(spieler));
            }

        }

    }

    //Karten erstellen
    public void createCards(Farbe farbe) {
        for (int i = 0; i < 10; i++) {
            stapel.add(new Karte(i + 1, farbe));
        }
        Collections.shuffle(stapel);
    }

    //Karte aufdecken
    public Karte flop(JLabel lb) {

        if (stapel.size() - 1 > -1) {
            Karte karte = stapel.pop();

            if (karte.getWert() == 1) {
                lb.setIcon(new ImageIcon(imagepath + ("A" + karte.getFarbe().getName() + ".png")));
            } else {
                lb.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));
            }

            return karte;
        }
        return null;
    }

    //Auf Combis prüfen
    public Combi checkCombi(PokerSpieler spieler) {

        HashMap<Integer, Integer> anzahl = new HashMap<>();
        Karte[] deck = spieler.getKarten();
        Karte[] alle = new Karte[7];
        Combi combi = HOHEKARTE;

        //Eigene Karten übertragen
        for (int i = 0; i < deck.length; i++) {
            alle[i] = deck[i];

        }

        //Community-Karten übertragen
        for (int i = 0; i < flopedcards; i++) {
            alle[i + 2] = kartentisch[i];

        }

        //Hashmap setzen
        for (int i = 0; i < 10; i++) {
            anzahl.put(i + 1, 0);
        }

        //Anzahl der Karten im Deck zählen
        for (int i = 0; i < anzahl.size(); i++) {
            for (int j = 0; j < alle.length; j++) {
                if (alle[j] != null) {
                    if (i == alle[j].getWert()) {
                        anzahl.put(i + 1, anzahl.get(i + 1) + 1);
                    }

                }
            }

        }

        //Combo prüfen
        for (int i = 0; i < 10; i++) {
            if (anzahl.get(i + 1) == 4) {
                combi = VIERLING;
                spieler.setCombo(combi);
                return combi;
            } else if (anzahl.get(i + 1) == 3) {
                combi = DRILLING;
                spieler.setCombo(combi);
                return combi;
            } else if (anzahl.get(i + 1) == 2) {
                combi = PAAR;
                spieler.setCombo(combi);
                return combi;
            }
        }

        return combi;
    }

    public void letcomplay(PokerSpieler spieler, JLabel lbComState) {
        //wenn jemand erhöht hat und 
        if (!spieler.isFolded()) {
            Combi combo = checkCombi(spieler);
            if (raisemode && combo == HOHEKARTE) {
                lbComState.setText("Folded");
                spieler.setFolded(true);
            } else if (!raisemode && combo != HOHEKARTE) {
                int chance = rand.nextInt(2 - 1 + 1) + 1;
                switch (chance) {
                    case 1:
                        lbComState.setText("Raised");
                        spieler.setGeld(spieler.getGeld() - mindesteinsatz * 2);
                        pot = (int) (pot + mindesteinsatz * 2);
                        break;
                    case 2:
                        lbComState.setText("Checked");
                        break;
                }
            } else {
                lbComState.setText("Checked");
            }
            update();
        }
    }

    public void update() {
        lbPot.setText("POT: " + pot);
        int anz = 0;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.isFolded()) {
                anz++;
            }
        }
        if (anz == 4) {
            System.out.println("gewonnen!");
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField tfEinsatz;
    // End of variables declaration//GEN-END:variables
}
