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
public class Karte {

    String name;
    int wert;
    Farbe farbe;

    public Karte(String name, int wert, Farbe farbe) {
        this.name = name;
        this.wert = wert;
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Karte{" + "name=" + name + ", wert=" + wert + ", farbe=" + farbe + '}';
    }

}
