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

    public PokerSpieler(Karte[] karten, String name, String password, int geld) {
        super(name, password, geld);
        this.karten = karten;
    }

    public Karte[] getKarten() {
        return karten;
    }

    public void setKarten(Karte[] karten) {
        this.karten = karten;
    }
    
   
    
}
