/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;

/**
 *
 * @author micha
 */
public class Wette {
    private Satz s;
    private List<Integer> nummern;
    private int einsatz;

    public Wette(Satz s, List<Integer> nummern, int einsatz) {
        this.s = s;
        this.nummern = nummern;
        this.einsatz = einsatz;
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
}
