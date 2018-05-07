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
    private Status status;
    private boolean computer;

    public PokerSpieler(Karte[] karten, Combi combo, Status status, boolean computer, String name, String password, double geld, Icon icon) {
        super(name, password, geld, icon);
        this.karten = karten;
        this.combo = combo;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }

  
   

}
