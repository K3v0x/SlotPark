/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Satz;
import beans.Wette;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author micha
 */
public class RouletteController {

    private Random rand = new Random();
    private List<Wette> wetten = new LinkedList<>();
    int zz;
    double gewinn = 0.0;

    public int play() {
        zz = rand.nextInt(37);
        return zz;
    }

    public void setWette(Wette w) {
        wetten.add(w);
    }    
    
    public double getAuszahlung()
    {
        return gewinn;
    }

    public void checkWin() {
        for (Wette wette : wetten) {
            if (wette.getS().equals(Satz.STRAIGHTUP) && wette.getNummern().size() == 1) {
                if (wette.getNummern().get(0) == zz) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.SPLIT) && wette.getNummern().size() == 2) {
                if (wette.getNummern().contains(zz)) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.STREET) && wette.getNummern().size() == 3) {
                if (wette.getNummern().contains(zz)) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.CORNER) && wette.getNummern().size() == 4) {
                if (wette.getNummern().contains(zz)) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.SIXLINE) && wette.getNummern().size() == 5) {
                if (wette.getNummern().contains(zz)) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.FIRSTDOZEN)) {
                if (zz > 0 && zz < 13) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.SECONDDOZEN)) {
                if (zz > 12 && zz < 25) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.THIRDDOZEN)) {
                if (zz > 24 && zz < 37) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.EINSBIS18)) {
                if (zz > 0 && zz < 19) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.NEUNZEHNBIS36)) {
                if (zz > 18 && zz < 37) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.EVEN)) {
                if (zz % 2 == 0) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if (wette.getS().equals(Satz.ODD)) {
                if (zz % 2 == 1) {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
            if(getColor(zz) != null)
            {
                if(wette.getS().equals(getColor(zz)))
                {
                    gewinn = gewinn + wette.getEinsatz() * wette.getS().getMultiplikator();
                }
            }
        }
    }
    
    private Satz getColor(int zahl)
    {
        Satz s = null;
        switch(zahl)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
            case 14:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 36:
                s = s.RED;
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 20:
            case 22:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 33:
            case 35:
                s = s.BLACK;
                break;
        }
        return s;
    }

}
