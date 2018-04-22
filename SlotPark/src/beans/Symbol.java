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
public enum Symbol {

    //  private String[] slots = {"Diamond", "Luck", "Tree", "Cherry"};
    CHERRY("Cherry", 1),
    TREE("Tree", 2),
    LUCK("Luck", 3),
    DIAMOND("Diamond", 4);

    private Symbol(String name, int wert) {
        this.name = name;
        this.wert = wert;
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

    String name;
    int wert;
}
