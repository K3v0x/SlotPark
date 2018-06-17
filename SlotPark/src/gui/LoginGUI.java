/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Icon;
import beans.Spieler;
import bl.ComboboxRenderer;
import bl.LoginController;
import bl.SoundPlayer;
import database.DB_Access;
import java.awt.Color;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class LoginGUI extends javax.swing.JFrame {

    private SoundPlayer player = SoundPlayer.getInstance();
    private DB_Access access;
    private LinkedList<Spieler> spieler = new LinkedList<>();
    private LinkedList<Icon> icons = new LinkedList<>();

    private LoginController login = new LoginController();

    public LoginGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        initComponents();
        paRegister.setVisible(false);
        paLogin.setVisible(false);
        access = DB_Access.getInstance();
        try {
            spieler = (LinkedList<Spieler>) access.getAllUsers();
        } catch (Exception ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbImages.setRenderer(new ComboboxRenderer());
        try {
            icons = (LinkedList<Icon>) access.getIcons();
            for (Icon i : icons) {
                cbImages.addItem(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
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

        lbMenu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btLogin = new javax.swing.JButton();
        paLogin = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        paLoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfLogin = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btRegister = new javax.swing.JButton();
        paRegister = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        paRegisterPanel = new javax.swing.JPanel();
        cbImages = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfRegister = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pfRegister = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        pfRegister2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        lbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu.jpg.jpg"))); // NOI18N
        getContentPane().add(lbMenu);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.CardLayout());

        btLogin.setBackground(new java.awt.Color(0, 0, 0));
        btLogin.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        btLogin.setText("Anmelden");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLogin(evt);
            }
        });
        jPanel2.add(btLogin, "card2");

        paLogin.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jButton4.setText("Anmelden");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRealLogin(evt);
            }
        });
        paLogin.add(jButton4, java.awt.BorderLayout.SOUTH);

        paLoginPanel.setLayout(new java.awt.GridLayout(2, 1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel2.setText("Benutzername:");
        paLoginPanel.add(jLabel2);

        tfLogin.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoginEnter(evt);
            }
        });
        paLoginPanel.add(tfLogin);

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel3.setText("Passwort:");
        paLoginPanel.add(jLabel3);

        pfLogin.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        pfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoginEnter(evt);
            }
        });
        paLoginPanel.add(pfLogin);

        paLogin.add(paLoginPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(paLogin, "card3");

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.CardLayout());

        btRegister.setBackground(new java.awt.Color(0, 0, 0));
        btRegister.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        btRegister.setText("Registrieren");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRegister(evt);
            }
        });
        jPanel3.add(btRegister, "card3");

        paRegister.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jButton5.setText("Registrieren");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRealRegister(evt);
            }
        });
        paRegister.add(jButton5, java.awt.BorderLayout.SOUTH);

        paRegisterPanel.setLayout(new java.awt.BorderLayout());

        cbImages.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        paRegisterPanel.add(cbImages, java.awt.BorderLayout.SOUTH);

        jPanel6.setLayout(new java.awt.GridLayout(3, 2));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Benutzername:");
        jPanel6.add(jLabel4);

        tfRegister.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        tfRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRegisterEnter(evt);
            }
        });
        jPanel6.add(tfRegister);

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Passwort:");
        jPanel6.add(jLabel5);

        pfRegister.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        pfRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRegisterEnter(evt);
            }
        });
        jPanel6.add(pfRegister);

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Passwort bestätigen:");
        jPanel6.add(jLabel6);

        pfRegister2.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        pfRegister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRegisterEnter(evt);
            }
        });
        jPanel6.add(pfRegister2);

        paRegisterPanel.add(jPanel6, java.awt.BorderLayout.CENTER);

        paRegister.add(paRegisterPanel, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));
        jPanel4.add(jLabel1);

        paRegister.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.add(paRegister, "card3");

        jPanel1.add(jPanel3);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton3.setText("Beenden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExit(evt);
            }
        });
        jPanel1.add(jButton3);

        jPanel5.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onExit
        System.exit(0);
    }//GEN-LAST:event_onExit

    private void onLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLogin
        btLogin.setVisible(false);
        paLogin.setVisible(true);
        btRegister.setVisible(true);
        paRegister.setVisible(false);
    }//GEN-LAST:event_onLogin

    private void onRealLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRealLogin
        String user = tfLogin.getText();
        String password = new String(pfLogin.getPassword());
        try {
            Spieler s = login.checkLogin(user, password);
            if (s != null) {
                MenuGUI menugui = new MenuGUI();
                menugui.setS(s);
                menugui.setVisible(true);
                this.dispose();
            } else {
                tfLogin.setBackground(Color.red);
                pfLogin.setBackground(Color.red);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_onRealLogin

    private void onRealRegister(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRealRegister
        try {
            Icon icon = (Icon) cbImages.getSelectedItem();
            String user = tfRegister.getText();
            String password = pfRegister.getText();
            String password2 = pfRegister2.getText();
            Spieler s = login.checkRegistration(user, password2, password2, icon);
            if (s != null) {
                MenuGUI menugui = new MenuGUI();
                menugui.setS(s);
                menugui.setVisible(true);
                this.dispose();
            } else {
                tfRegister.setBackground(Color.red);
                pfRegister.setBackground(Color.red);
                pfRegister2.setBackground(Color.red);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_onRealRegister

    private void onRegister(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRegister
        btRegister.setVisible(false);
        paRegister.setVisible(true);
        btLogin.setVisible(true);
        paLogin.setVisible(false);
    }//GEN-LAST:event_onRegister

    private void onLoginEnter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoginEnter
        String user = tfLogin.getText();
        String password = new String(pfLogin.getPassword());
        try {
            Spieler s = login.checkLogin(user, password);
            if (s != null) {
                MenuGUI menugui = new MenuGUI();
                menugui.setS(s);
                menugui.setVisible(true);
                this.dispose();
            } else {
                tfLogin.setBackground(Color.red);
                pfLogin.setBackground(Color.red);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_onLoginEnter

    private void onRegisterEnter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRegisterEnter
        try {
            Icon icon = (Icon) cbImages.getSelectedItem();
            String user = tfRegister.getText();
            String password = pfRegister.getText();
            String password2 = pfRegister2.getText();
            Spieler s = login.checkRegistration(user, password2, password2, icon);
            if (s != null) {
                MenuGUI menugui = new MenuGUI();
                menugui.setS(s);
                menugui.setVisible(true);
                this.dispose();
            } else {
                tfRegister.setBackground(Color.red);
                pfRegister.setBackground(Color.red);
                pfRegister2.setBackground(Color.red);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_onRegisterEnter

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRegister;
    private javax.swing.JComboBox<Icon> cbImages;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JPanel paLogin;
    private javax.swing.JPanel paLoginPanel;
    private javax.swing.JPanel paRegister;
    private javax.swing.JPanel paRegisterPanel;
    private javax.swing.JPasswordField pfLogin;
    private javax.swing.JPasswordField pfRegister;
    private javax.swing.JPasswordField pfRegister2;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfRegister;
    // End of variables declaration//GEN-END:variables
}
