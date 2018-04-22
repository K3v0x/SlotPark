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
    PAAR("Ein Paar", 2),
    ZWEIPAARE("Zwei Paare", 3),
    DRILLING("Drilling", 4),
    FLUSH("Flush", 5),
    STRASSE("Strasse", 6),
    FULLHOUSE("FullHouse", 7),
    VIERLING("Vierling", 8),
    STRAIGHTFLUSH("StraightFlush", 9),
    ROYALFLUSH("RoyalFlush", 10);

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
