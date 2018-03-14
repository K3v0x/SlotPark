/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Kevin
 */
public class Spieler {
    private String name;
    private String password;
    private double geld;

    public Spieler(String name, String password, double geld) {
        this.name = name;
        this.password = password;
        this.geld = geld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getGeld() {
        return geld;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }

    @Override
    public String toString() {
        return "Spieler{" + "name=" + name + ", password=" + password + ", geld=" + geld + '}';
    }
    
    
}
