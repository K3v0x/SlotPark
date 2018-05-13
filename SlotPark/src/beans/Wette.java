/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author micha
 */
public class Wette {
    private Satz s;
    private List<Integer> nummern;
    private int einsatz;
    private List<Color> nummernfarben;

    public Wette(Satz s, List<Integer> nummern, int einsatz, List<Color> nummernfarben) {
        this.s = s;
        this.nummern = nummern;
        this.einsatz = einsatz;
        this.nummernfarben = nummernfarben;
    }

    public Satz getS() {
        return s;
    }

    public void setS(Satz s) {
        this.s = s;
    }

    public List<Integer> getNummern() {
        return nummern;
    }

    public void setNummern(List<Integer> nummern) {
        this.nummern = nummern;
    }

    public int getEinsatz() {
        return einsatz;
    }

    public void setEinsatz(int einsatz) {
        this.einsatz = einsatz;
    }

    public List<Color> getNummernfarben() {
        return nummernfarben;
    }

    public void setNummernfarben(List<Color> nummernfarben) {
        this.nummernfarben = nummernfarben;
    }
}