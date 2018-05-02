/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Icon;
import beans.Spieler;
import database.DB_Access;
import gui.MenuGUI;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class LoginController {

    private DB_Access access = DB_Access.getInstance();

    public Spieler checkLogin(String username, String password) throws Exception {
        LinkedList<Spieler> spieler = (LinkedList<Spieler>) access.getAllUsers();
        for (Spieler s : spieler) {
            if (s.getName().equals(username) && s.getPassword().equals(password)) {
                return s;
            }
        }
        return null;
    }

    public Spieler checkRegistration(String username, String password1, String password2, Icon icon) throws Exception {
        List<Spieler> spieler = access.getAllUsers();
        if (username.length() == 0) {
            return null;
        }
        if (username.contains(" ")) {
            return null;
        }
        if (password1.length() == 0) {
            return null;
        }
        if (password1.contains(" ")) {
            return null;
        }
        if (!password1.equals(password2)) {
            return null;
        }
        for (Spieler sp : spieler) {
            if (sp.getName().equals(username)) {
                return null;
            }
        }
        Spieler s = new Spieler(username, password1, 100.0, icon);
        boolean erfolg = access.addUser(s);
        if (erfolg) {
            return s;
        }
        return null;
    }
}
