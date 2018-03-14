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
public enum Combi {
    HOHEKARTE("Hohe Karte", 1),
    PAAR("Paar", 2),
    DRILLING("Drilling", 3),
    FLUSH("Flush", 4),
    STRASSE("Strasse", 5),
    FULLHOUSE("FullHouse", 6),
    VIELING("Vierling", 7),
    STRAIGHTFLUSH("StraightFlush", 8),
    ROYALFLUSH("RoyalFlush", 9);

    private Combi(String name, int wert) {
        this.name = name;
        this.wert = wert;
    }

    private String name;
    private int wert;

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

}
