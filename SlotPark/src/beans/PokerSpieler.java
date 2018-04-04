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
public class PokerSpieler extends Spieler{
    private Karte [] karten;
    private boolean computer;

    public PokerSpieler(Karte[] karten, boolean computer, String name, String password, double geld) {
        super(name, password, geld);
        this.karten = karten;
        this.computer = computer;
    }

   

    public Karte[] getKarten() {
        return karten;
    }

    public void setKarten(Karte[] karten) {
        this.karten = karten;
    }

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }
    
   
    
}
