/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author micha
 */
public enum Satz {
    
    RED("RED", 1),
    BLACK("BLACK", 1),
    ODD("ODD", 1),
    EVEN("EVEN", 1),
    EINSBIS18("EINSBIS18", 1),
    NEUNZEHNBIS36("NEUNZEHNBIS36", 1),
    FIRSTDOZEN("FIRSTDOZEN", 2),
    SECONDDOZEN("SECONDDOZEN", 2),
    THIRDDOZEN("THIRDDOZEN", 2),
    SIXLINE("SIXLINE", 5),
    CORNER("CORNER", 8),
    STREET("STREET", 11),
    SPLIT("SPLIT", 17),
    STRAIGHTUP("STRAIGHTUP", 35);
    
    
    
    private String art;
    private int multiplikator;

    private Satz(String art, int multiplikator) {
        this.art = art;
        this.multiplikator = multiplikator;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getMultiplikator() {
        return multiplikator;
    }

    public void setMultiplikator(int multiplikator) {
        this.multiplikator = multiplikator;
    } 
}
