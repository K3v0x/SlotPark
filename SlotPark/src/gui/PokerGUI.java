/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.PokerSpieler;
import beans.Spieler;
import bl.CasinoController;
import bl.SoundPlayer;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class PokerGUI extends javax.swing.JFrame {

    private Random rand = new Random();
    private String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    private CasinoController cc;
    private SoundPlayer player = SoundPlayer.getInstance();
    private TurnThread tt = new TurnThread();
    private Thread thread = new Thread(tt);

    private JLabel[] labels;
    private JLabel[] kartenlabels;
    private JLabel[] comlabels;
    private JLabel[] statuslabels;
    private JPanel[] panels;

    private Spieler s = null;
    private int einsatz = 0;
    boolean aufdecken = false;

    public Spieler getS() {
        return s;
    }

    public void setS(Spieler s) {
        this.s = s;
        lbName.setText("Name: " + s.getName());
        lbGeld.setText(String.format("Geld: %.0f Chips", s.getGeld() * 5));
        lbIcon.setIcon(s.getIcon().getIcon());
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

        jPanel18 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        paCom1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbCom1 = new javax.swing.JLabel();
        lbStatus1 = new javax.swing.JLabel();
        paCom2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbCom2 = new javax.swing.JLabel();
        lbStatus2 = new javax.swing.JLabel();
        paCom3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbCom3 = new javax.swing.JLabel();
        lbStatus3 = new javax.swing.JLabel();
        paCom4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbCom4 = new javax.swing.JLabel();
        lbStatus4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        tfEinsatz = new javax.swing.JTextField();
        jsEinsatz = new javax.swing.JSlider();
        jPanel4 = new javax.swing.JPanel();
        btCheck = new javax.swing.JButton();
        btRaise = new javax.swing.JButton();
        btFold = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbC1 = new javax.swing.JLabel();
        lbC2 = new javax.swing.JLabel();
        lbC3 = new javax.swing.JLabel();
        lbC4 = new javax.swing.JLabel();
        lbC5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        lbDeckWert = new javax.swing.JLabel();
        lbMindesteinsatz = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbCard1 = new javax.swing.JLabel();
        lbCard2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbWinner = new javax.swing.JLabel();
        lbPot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onLoad(evt);
            }
        });

        jPanel18.setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setLayout(new java.awt.BorderLayout());

        lbIcon.setBackground(new java.awt.Color(0, 204, 204));
        lbIcon.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbIcon.setOpaque(true);
        jPanel1.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        lbName.setBackground(new java.awt.Color(0, 204, 204));
        lbName.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbName.setOpaque(true);
        jPanel7.add(lbName);

        lbGeld.setBackground(new java.awt.Color(0, 204, 204));
        lbGeld.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbGeld.setOpaque(true);
        jPanel7.add(lbGeld);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel1);

        jPanel19.setForeground(new java.awt.Color(153, 102, 0));
        jPanel19.setLayout(new java.awt.GridLayout(1, 4));

        paCom1.setBackground(new java.awt.Color(255, 255, 255));
        paCom1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paCom1.setLayout(new java.awt.GridLayout(3, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Spieler");
        paCom1.add(jLabel5);

        lbCom1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom1.setText("...");
        lbCom1.setToolTipText("");
        paCom1.add(lbCom1);

        lbStatus1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus1.setText("...");
        paCom1.add(lbStatus1);

        jPanel19.add(paCom1);

        paCom2.setBackground(new java.awt.Color(255, 255, 255));
        paCom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paCom2.setLayout(new java.awt.GridLayout(3, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Spieler");
        paCom2.add(jLabel4);

        lbCom2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom2.setText("...");
        paCom2.add(lbCom2);

        lbStatus2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus2.setText("...");
        paCom2.add(lbStatus2);

        jPanel19.add(paCom2);

        paCom3.setBackground(new java.awt.Color(255, 255, 255));
        paCom3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paCom3.setLayout(new java.awt.GridLayout(3, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Spieler");
        paCom3.add(jLabel3);

        lbCom3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom3.setText("...");
        paCom3.add(lbCom3);

        lbStatus3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus3.setText("...");
        paCom3.add(lbStatus3);

        jPanel19.add(paCom3);

        paCom4.setBackground(new java.awt.Color(255, 255, 255));
        paCom4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paCom4.setLayout(new java.awt.GridLayout(3, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Spieler");
        paCom4.add(jLabel2);

        lbCom4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCom4.setText("...");
        paCom4.add(lbCom4);

        lbStatus4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbStatus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus4.setText("...");
        paCom4.add(lbStatus4);

        jPanel19.add(paCom4);

        jPanel18.add(jPanel19);

        getContentPane().add(jPanel18, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jButton1.setText("Zurück");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.SOUTH);

        jPanel9.setLayout(new java.awt.GridLayout(2, 0));

        tfEinsatz.setEditable(false);
        tfEinsatz.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        tfEinsatz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(tfEinsatz);

        jsEinsatz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onChange(evt);
            }
        });
        jPanel9.add(jsEinsatz);

        jPanel2.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        btCheck.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        btCheck.setText("Check");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCheck(evt);
            }
        });
        jPanel4.add(btCheck);

        btRaise.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        btRaise.setText("Erhöhen");
        btRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRaise(evt);
            }
        });
        jPanel4.add(btRaise);

        btFold.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        btFold.setText("Fold");
        btFold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFold(evt);
            }
        });
        jPanel4.add(btFold);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

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

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.GridLayout(1, 2));

        lbDeckWert.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbDeckWert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDeckWert.setText("Checking...");
        jPanel20.add(lbDeckWert);

        lbMindesteinsatz.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbMindesteinsatz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel20.add(lbMindesteinsatz);

        jPanel11.add(jPanel20, java.awt.BorderLayout.SOUTH);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(1, 2));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        lbCard1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard1);

        lbCard2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard2);

        jPanel13.add(jPanel8);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(2, 0));

        lbWinner.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(lbWinner);

        jPanel13.add(jPanel14);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        lbPot.setBackground(new java.awt.Color(153, 102, 0));
        lbPot.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbPot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPot.setText("POT: 0 Chips");
        jPanel11.add(lbPot, java.awt.BorderLayout.NORTH);

        jPanel6.add(jPanel11);

        jPanel3.add(jPanel6);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onLoad(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onLoad
        if (s == null) {
            s = new Spieler("Testspieler", "123", 500, null);
        }
        cc = new CasinoController(s.getName(), (int) (s.getGeld() * 5));

        thread.start();

        cc.load();
        player.play("music", "Poker.mp3", true);
        tfEinsatz.setText(0 + "/" + (int) cc.getSpielerliste().getFirst().getGeld());
        jsEinsatz.setMajorTickSpacing((int) cc.getSpielerliste().getFirst().getGeld() / 4);
        jsEinsatz.setMinorTickSpacing((int) cc.getSpielerliste().getFirst().getGeld() / 10);
        jsEinsatz.setMaximum((int) cc.getSpielerliste().getFirst().getGeld());
        labels = new JLabel[]{lbC1, lbC2, lbC3, lbC4, lbC5};
        kartenlabels = new JLabel[]{lbCard1, lbCard2};
        comlabels = new JLabel[]{lbCom1, lbCom2, lbCom3, lbCom4};
        statuslabels = new JLabel[]{lbStatus1, lbStatus2, lbStatus3, lbStatus4};
        panels = new JPanel[]{paCom1, paCom2, paCom3, paCom4};
        updateUI();

    }//GEN-LAST:event_onLoad

    private void onFold(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFold
        cc.newRound();
        updateUI();
    }//GEN-LAST:event_onFold

    private void onRaise(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRaise
        try {
            if (einsatz == cc.getSpielerliste().getFirst().getGeld()) {
                int antwort = JOptionPane.showConfirmDialog(this, "Wollen Sie wirklich All-in gehen?");
                if (antwort == 0) {
                    cc.raise(einsatz);
                    cc.check();
                    aufdecken = true;
                }
            } else {
                cc.raise(einsatz);
                cc.check();
                aufdecken = true;
            }

        } catch (NumberFormatException e) {
            System.out.println("is keine zahl");
        }
        updateUI();
    }//GEN-LAST:event_onRaise

    private void onCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCheck

        if (btCheck.getText().equals("Neues Spiel")) {
            lbWinner.setText("");
            btCheck.setText("Check");
            btFold.setEnabled(true);
            btRaise.setEnabled(true);
            cc.load();
            cc.newRound();
            paCom1.setBackground(Color.WHITE);
            paCom2.setBackground(Color.WHITE);
            paCom3.setBackground(Color.WHITE);
            paCom4.setBackground(Color.WHITE);
        } else if (btCheck.getText().equals("Neue Runde")) {
            lbWinner.setText("");
            btCheck.setText("Check");
            btFold.setEnabled(true);
            btRaise.setEnabled(true);
            cc.newRound();
        } else if (cc.getFlopedcards() == 5) {
            btCheck.setText("Neue Runde");
            btFold.setEnabled(false);
            btRaise.setEnabled(false);
            if (cc.getSpielerliste().getFirst().getStatus().equals("WINNER")) {
                lbWinner.setText(cc.checkwin().getName() + " hat das ganze Spiel gewonnen!");
                btCheck.setText("Neues Spiel");
            } else {
                lbWinner.setText(cc.checkwin().getName() + " hat gewonnen!");
            }
        } else if (btCheck.getText().equals("Check")) {
            btCheck.setEnabled(false);
            btFold.setEnabled(false);
            btRaise.setEnabled(false);
            cc.check();
            aufdecken = true;
        }

        updateUI();
    }//GEN-LAST:event_onCheck

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        MenuGUI menugui = new MenuGUI();
        s.setGeld(cc.getSpielerliste().getFirst().getGeld() / 5);
        s.setName(cc.getSpielerliste().getFirst().getName());
        menugui.setS(s);
        menugui.setVisible(true);
        player.close("music");
        this.dispose();
    }//GEN-LAST:event_onBack

    private void onChange(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onChange
        einsatz = jsEinsatz.getValue();
        tfEinsatz.setText(einsatz + "/" + (int) cc.getSpielerliste().getFirst().getGeld());
    }//GEN-LAST:event_onChange

    public void updateUI() {

        LinkedList<PokerSpieler> spielerliste = cc.getSpielerliste();
        lbPot.setText("Pot: " + cc.getPot());
        lbDeckWert.setText(spielerliste.getFirst().getCombo().getName());
        lbMindesteinsatz.setText("Min.: " + cc.getMindesteinsatz());
        lbGeld.setText("Geld: " + (int) cc.getSpielerliste().getFirst().getGeld() + " Chips");

        tfEinsatz.setText(einsatz + "/" + (int) spielerliste.getFirst().getGeld());

        jsEinsatz.setMajorTickSpacing((int) cc.getSpielerliste().getFirst().getGeld() / 4);
        jsEinsatz.setMinorTickSpacing((int) cc.getSpielerliste().getFirst().getGeld() / 10);
        jsEinsatz.setMaximum((int) cc.getSpielerliste().getFirst().getGeld());
        jsEinsatz.setMinimum((int) cc.getMindesteinsatz());

        for (int i = 0; i < kartenlabels.length; i++) {
            ImageIcon imageIcon = new ImageIcon(imagepath + spielerliste.getFirst().getKarten()[i].getWert() + "" + spielerliste.getFirst().getKarten()[i].getFarbe().getName() + ".png"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
            kartenlabels[i].setIcon(imageIcon);
        }
        if (cc.getFlopedcards() == 0) {
            lbC1.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC2.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC3.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC4.setIcon(new ImageIcon(imagepath + "red_back.png"));
            lbC5.setIcon(new ImageIcon(imagepath + "red_back.png"));
        }
        if (cc.getSpielerliste().getFirst().getGeld() <= 0) {
            btFold.setEnabled(false);
            btRaise.setEnabled(false);
            btCheck.setEnabled(false);
        }
        dispayCombo(comlabels, statuslabels);
        if (spielerliste.getFirst().getStatus().equals("WINNER")) {
            btRaise.setEnabled(false);
            btFold.setEnabled(false);
        }
    }

    public void dispayCombo(JLabel[] lbCom, JLabel[] lbStatus) {
        LinkedList<PokerSpieler> liste = cc.getSpielerliste();
        for (int i = 1; i < liste.size(); i++) {
            System.out.println(cc.getSpielerliste().get(i).getName());
            if (!cc.getSpielerliste().get(i).isBankrott()) {
                lbCom[i - 1].setText("" + cc.getSpielerliste().get(i).getCombo());
                lbStatus[i - 1].setText("" + cc.getSpielerliste().get(i).getStatus());
            } else {
                lbStatus[i - 1].setText("Bankrott");
                lbCom[i - 1].setText("---");
                panels[i - 1].setBackground(Color.GRAY);
            }
        }
        System.out.println("\n");

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokerGUI().setVisible(true);
            }
        });

    }

    class TurnThread implements Runnable {

        @Override
        public void run() {
            synchronized (cc) {
                while (!Thread.interrupted()) {
                    if (!cc.isPreflop() && aufdecken) {
                        if (cc.getFlopedcards() == 3) {

                            for (int i = 0; i < cc.getFlopedcards(); i++) {
                                labels[i].setIcon(new ImageIcon(imagepath + cc.getKartentisch()[i].getWert() + "" + cc.getKartentisch()[i].getFarbe().getName() + ".png"));

                                try {
                                    Thread.sleep(200);
                                } catch (InterruptedException ex) {
                                    return;
                                }
                            }
                        } else {
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException ex) {
                                return;
                            }

                            labels[cc.getFlopedcards() - 1].setIcon(new ImageIcon(imagepath + cc.getKartentisch()[cc.getFlopedcards() - 1].getWert() + "" + cc.getKartentisch()[cc.getFlopedcards() - 1].getFarbe().getName() + ".png"));
                        }
                        aufdecken = false;
                        btCheck.setEnabled(true);
                        btFold.setEnabled(true);
                        btRaise.setEnabled(true);
                    }

                }
            }
            return;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheck;
    private javax.swing.JButton btFold;
    private javax.swing.JButton btRaise;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jsEinsatz;
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
    private javax.swing.JLabel lbMindesteinsatz;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPot;
    private javax.swing.JLabel lbStatus1;
    private javax.swing.JLabel lbStatus2;
    private javax.swing.JLabel lbStatus3;
    private javax.swing.JLabel lbStatus4;
    private javax.swing.JLabel lbWinner;
    private javax.swing.JPanel paCom1;
    private javax.swing.JPanel paCom2;
    private javax.swing.JPanel paCom3;
    private javax.swing.JPanel paCom4;
    private javax.swing.JTextField tfEinsatz;
    // End of variables declaration//GEN-END:variables
}
