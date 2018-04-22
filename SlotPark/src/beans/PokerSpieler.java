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
public class PokerSpieler extends Spieler {

    private Karte[] karten;
    private Combi combo;
    private String status;
    private boolean folded;
    private boolean bankrott;
    private boolean computer;

    public PokerSpieler(Karte[] karten, Combi combo, String status, boolean folded, boolean bankrott, boolean computer, String name, String password, double geld) {
        super(name, password, geld);
        this.karten = karten;
        this.combo = combo;
        this.status = status;
        this.folded = folded;
        this.bankrott = bankrott;
        this.computer = computer;
    }

    public Karte[] getKarten() {
        return karten;
    }

    public void setKarten(Karte[] karten) {
        this.karten = karten;
    }

    public Combi getCombo() {
        return combo;
    }

    public void setCombo(Combi combo) {
        this.combo = combo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFolded() {
        return folded;
    }

    public void setFolded(boolean folded) {
        this.folded = folded;
    }

    public boolean isBankrott() {
        return bankrott;
    }

    public void setBankrott(boolean bankrott) {
        this.bankrott = bankrott;
    }

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }

   

}
