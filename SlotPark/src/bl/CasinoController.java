/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Combi;
import static beans.Combi.DRILLING;
import static beans.Combi.HOHEKARTE;
import static beans.Combi.PAAR;
import static beans.Combi.VIERLING;
import beans.Farbe;
import static beans.Farbe.HERZ;
import static beans.Farbe.KARO;
import static beans.Farbe.KREUZ;
import static beans.Farbe.PIK;
import beans.Karte;
import beans.PokerSpieler;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Kevin
 */
public class CasinoController {

    Random rand = new Random();
    String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    LinkedList<PokerSpieler> spielerliste = new LinkedList<>(); //Spielerliste
    Stack<Karte> stapel = new Stack<>(); //Kartenstapel

    int mindesteinsatz = 10; //Minimaler Einsatz
    int flopedcards = 0; //Anzahl der aufgedeckten Karten
    int pot = 0; //Anzahl der Chips im Pot
    private PokerSpieler spieler;
    private PokerSpieler com1;
    private PokerSpieler com2;
    private PokerSpieler com3;
    private PokerSpieler com4;

    Karte[] kartentisch = new Karte[5]; //Karten, die auf dem Tisch liegen
    boolean preflop = true; //Preflop-Phase
    boolean flop = false; //Flop-Phase
    boolean raisemode = false;
    private String username;
    private double geld;

    public void load() {
        spieler = new PokerSpieler(new Karte[2], HOHEKARTE, false, false, "Hans", "1", geld);
        com1 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Mike", "1", 100);
        com2 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Martin", "1", 100);
        com3 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Sarah", "1", 100);
        com4 = new PokerSpieler(new Karte[2], HOHEKARTE, false, true, "Tom", "1", 100);
        spielerliste.add(spieler);
        spielerliste.add(com1);
        spielerliste.add(com2);
        spielerliste.add(com3);
        spielerliste.add(com4);
        newRound();
    }

    public void newRound() { //Neue Runde starten

        stapel.clear();
        flopedcards = 0;
        preflop = true;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (!pokerSpieler.isComputer()) {
                createCards(HERZ);
                createCards(PIK);
                createCards(KARO);
                createCards(KREUZ);
                for (int i = 0; i < kartentisch.length; i++) {
                    if (stapel.size() - 1 > -1) {
                        kartentisch[i] = stapel.pop();

                    }
                }
            }
            //Karte 1
            Karte karte = stapel.pop();
            if (stapel.size() - 1 > -1) {

                Karte[] karten = pokerSpieler.getKarten();
                karten[0] = karte;
                pokerSpieler.setKarten(karten);

                //Karte 2
                karte = stapel.pop();

                karten = pokerSpieler.getKarten();
                karten[1] = karte;
                pokerSpieler.setKarten(karten);

                //Wert der Karten
                checkCombi();

            }
        }

    }

    //Karten erstellen
    public void createCards(Farbe farbe) {
        for (int i = 0; i < 10; i++) {
            stapel.add(new Karte(i + 1, farbe));
        }
        Collections.shuffle(stapel);
    }

    //Auf Combis prüfen
    public void checkCombi() {
        for (PokerSpieler pokerSpieler : spielerliste) {
            HashMap<Integer, Integer> anzahl = new HashMap<>();
            Karte[] deck = pokerSpieler.getKarten();
            Karte[] alle = new Karte[7];
            Combi combi = HOHEKARTE;

            //Eigene Karten übertragen
            for (int i = 0; i < deck.length; i++) {
                alle[i] = deck[i];

            }
            
            //Community-Karten übertragen
            for (int i = 0; i < flopedcards; i++) {
                alle[i + 2] = kartentisch[i];

            }

            //Hashmap setzen
            for (int i = 0; i < 10; i++) {
                anzahl.put(i + 1, 0);
            }

            //Anzahl der Karten im Deck zählen
            for (int i = 0; i < anzahl.size(); i++) {
                for (int j = 0; j < alle.length; j++) {
                    if (alle[j] != null) {
                        if (i == alle[j].getWert()) {
                            anzahl.put(i + 1, anzahl.get(i + 1) + 1);
                        }

                    }
                }

            }

            //Combo prüfen
            for (int i = 0; i < 10; i++) {
                if (anzahl.get(i + 1) == 4) {
                    combi = VIERLING;
                    pokerSpieler.setCombo(combi);

                } else if (anzahl.get(i + 1) == 3) {
                    combi = DRILLING;
                    pokerSpieler.setCombo(combi);

                } else if (anzahl.get(i + 1) == 2) {
                    combi = PAAR;
                    pokerSpieler.setCombo(combi);

                }
            }
        }
    }

    public void letcomplay() {
        //wenn jemand erhöht hat und 
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (!pokerSpieler.isFolded() && pokerSpieler.isComputer()) {
                checkCombi();
                if (raisemode && pokerSpieler.getCombo() == HOHEKARTE) {

                    pokerSpieler.setFolded(true);
                } else if (!raisemode && pokerSpieler.getCombo() != HOHEKARTE) {
                    int chance = rand.nextInt(2 - 1 + 1) + 1;
                    switch (chance) {
                        case 1:
                            pokerSpieler.setGeld(pokerSpieler.getGeld() - mindesteinsatz * 2);
                            pot = (int) (pot + mindesteinsatz * 2);
                            break;
                        case 2:

                            break;
                    }
                } else {

                }
                checkwin();
            }
        }
    }

    public void checkwin() {
        int anz = 0;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.isFolded()) {
                anz++;
            }
        }
        if (anz == 4) {
            System.out.println("gewonnen!");
        }
    }

    public void fold() {

    }

    public void check() {
        raisemode = false;
        if (preflop) {
            //Preflop: 3 Karten werden auf dem Tisch aufgedeckt
            flopedcards = 3;
            preflop = false;
            checkCombi();
            letcomplay();
        } else {
            //Flop: 1 weitere Karte wird auf dem Tisch aufgedeckt
            if (flopedcards < 5 && !raisemode) {
                switch (flopedcards) {
                    case 3:
                        flopedcards = 4;
                        break;
                    case 4:
                        flopedcards = 5;
                        break;
                }
                checkCombi();
                letcomplay();

            } else if (flopedcards == 5) {
                Combi winnercombo = HOHEKARTE;
                String winner = "";
                for (PokerSpieler pokerSpieler : spielerliste) {
                    if (pokerSpieler.getCombo().getWert() > winnercombo.getWert()) {
                        winnercombo = pokerSpieler.getCombo();
                        winner = pokerSpieler.getName();
                    }
                }
                System.out.println(winner + " hat das Spiel gewonnen! : " + winnercombo);
            }

        }
    }

    public void raise(int einsatz) {
        //Einsatz erhöhen
        raisemode = true;
        pot = pot + einsatz;
        letcomplay();
    }

    public LinkedList<PokerSpieler> getSpielerliste() {
        return spielerliste;
    }

    public void setSpielerliste(LinkedList<PokerSpieler> spielerliste) {
        this.spielerliste = spielerliste;
    }

    public Stack<Karte> getStapel() {
        return stapel;
    }

    public void setStapel(Stack<Karte> stapel) {
        this.stapel = stapel;
    }

    public int getMindesteinsatz() {
        return mindesteinsatz;
    }

    public void setMindesteinsatz(int mindesteinsatz) {
        this.mindesteinsatz = mindesteinsatz;
    }

    public int getFlopedcards() {
        return flopedcards;
    }

    public void setFlopedcards(int flopedcards) {
        this.flopedcards = flopedcards;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public Karte[] getKartentisch() {
        return kartentisch;
    }

    public void setKartentisch(Karte[] kartentisch) {
        this.kartentisch = kartentisch;
    }

    public boolean isPreflop() {
        return preflop;
    }

    public void setPreflop(boolean preflop) {
        this.preflop = preflop;
    }

}
