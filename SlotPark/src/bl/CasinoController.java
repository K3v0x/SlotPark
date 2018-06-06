/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Combi;

import static beans.Combi.*;
import beans.Farbe;
import static beans.Farbe.*;
import beans.Karte;
import beans.PokerSpieler;
import beans.Status;
import static beans.Status.*;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Kevin
 */
public class CasinoController {

    public final Random rand = new Random();
    private String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    private SoundPlayer player = SoundPlayer.getInstance();

    private LinkedList<PokerSpieler> spielerliste = new LinkedList<>(); //Spielerliste
    private Stack<Karte> stapel = new Stack<>(); //Kartenstapel
    private int mindesteinsatz = 0; //Minimaler Einsatz
    private int flopedcards = 0; //Anzahl der aufgedeckten Karten
    private int pot = 0; //Anzahl der Chips im Pot
    private int flopstate = -1;
    private int highraise = 0;
    private int raisediff = 0;
    private Karte[] kartentisch = new Karte[5]; //Karten, die auf dem Tisch liegen

    private String name;
    private int geld;
    private PokerSpieler spieler;

    public CasinoController(String name, int geld) {
        this.name = name;
        this.geld = geld;
        spieler = new PokerSpieler(new Karte[2], HOHEKARTE, 0, ENTERED, false, name, "1", geld, null);
    }

    /**
     * Begint ein neues Spiel
     */
    public void load() {
        spielerliste.clear();
        PokerSpieler com1 = new PokerSpieler(new Karte[2], HOHEKARTE, 0, ENTERED, true, "Mike", "1", spieler.getGeld(), null);
        PokerSpieler com2 = new PokerSpieler(new Karte[2], HOHEKARTE, 0, ENTERED, true, "Martin", "1", spieler.getGeld(), null);
        PokerSpieler com3 = new PokerSpieler(new Karte[2], HOHEKARTE, 0, ENTERED, true, "Sarah", "1", spieler.getGeld(), null);
        PokerSpieler com4 = new PokerSpieler(new Karte[2], HOHEKARTE, 0, ENTERED, true, "Tom", "1", spieler.getGeld(), null);

        spielerliste.add(spieler);
        spielerliste.add(com1);
        spielerliste.add(com2);
        spielerliste.add(com3);
        spielerliste.add(com4);
        mindesteinsatz = (int) (spieler.getGeld() / 5);
        newRound();
    }

    /**
     * Startet eine neue Runde
     */
    public void newRound() {
        stapel.clear();
        flopedcards = 0;
        pot = 0;
        flopstate = 1;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.getGeld() == 0) {
                pokerSpieler.setStatus(OUT);
            } else {
                if (pokerSpieler.getGeld() < mindesteinsatz) {
                    pot = (int) (pot + pokerSpieler.getGeld());
                    pokerSpieler.setGeld(0);
                } else {
                    pokerSpieler.setGeld(pokerSpieler.getGeld() - mindesteinsatz);
                    pot = pot + mindesteinsatz;
                }
                if (pokerSpieler.getStatus() != OUT || pokerSpieler.getGeld() > 0) {
                    pokerSpieler.setStatus(ENTERED);
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
                    pokerSpieler.setCombo(HOHEKARTE);
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
                    }

                    checkAllCombos();
                } else {
                    System.out.println(pokerSpieler.getName() + " ist bankrott");
                    pokerSpieler.setStatus(OUT);

                }
            }
        }

    }

    /**
     * Erstellt die Karten des Kartenstapels
     *
     * @param farbe Die Farbe der Karten, die erstellt werden sollen
     */
    public void createCards(Farbe farbe) {
        for (int i = 0; i < 10; i++) {
            stapel.add(new Karte(i + 1, farbe));
        }
        Collections.shuffle(stapel);
    }

    /**
     * Prüft auf die Combo des Pokerspielers
     *
     * @param pokerSpieler Das Objekt vom Pokerspieler
     */
    public void checkAllCombos() {

        for (PokerSpieler pokerSpieler : spielerliste) {
            HashMap<Integer, Integer> anzahl = new HashMap<>();
            Karte[] deck = pokerSpieler.getKarten();
            Karte[] alle = new Karte[7];
            Combi combi = HOHEKARTE;
            for (int i = 0; i < deck.length; i++) {
                alle[i] = deck[i];

            }
            for (int i = 0; i < flopedcards; i++) {
                alle[i + 2] = kartentisch[i];
            }
            for (int i = 0; i < 10; i++) {
                anzahl.put(i + 1, 0);
            }
            for (int i = 0; i < anzahl.size(); i++) {
                for (int j = 0; j < alle.length; j++) {
                    if (alle[j] != null) {
                        if (i == alle[j].getWert()) {
                            anzahl.put(i + 1, anzahl.get(i + 1) + 1);
                        }

                    }
                }

            }

            for (int i = 0; i < anzahl.size(); i++) {
                if (anzahl.get(i + 1) == 4) {
                    combi = VIERLING;
                    pokerSpieler.setCombo(combi);
                } else if (anzahl.get(i + 1) == 3) {
                    for (int j = 0; j < anzahl.size(); j++) {
                        if (anzahl.get(j + 1) == 2 && j != i) {
                            combi = FULLHOUSE;
                            pokerSpieler.setCombo(combi);
                        }
                    }
                } else if (anzahl.get(i + 1) == 3) {
                    combi = DRILLING;
                    pokerSpieler.setCombo(combi);
                } else if (anzahl.get(i + 1) == 2) {
                    for (int j = 0; j < anzahl.size(); j++) {
                        if (anzahl.get(j + 1) == 2 && j != i) {
                            combi = ZWEIPAARE;
                            pokerSpieler.setCombo(combi);
                            break;
                        } else {
                            combi = PAAR;
                            pokerSpieler.setCombo(combi);
                            break;
                        }
                    }

                }

            }
            for (int i = 0; i < anzahl.size() - 1; i++) {
                for (int j = 0; j < 3; j++) {
                    if (anzahl.get(j + 1) > 0
                            && anzahl.get(j + 2) > 0
                            && anzahl.get(j + 3) > 0
                            && anzahl.get(j + 4) > 0
                            && anzahl.get(j + 5) > 0) {
                        combi = STRASSE;
                        pokerSpieler.setCombo(combi);
                    }
                }
            }
        }

    }

    /**
     * Lässt den Computer spielen
     *
     * @param pokerSpieler Das Objekt vom Pokerspieler
     */
    public void letAllComsPlay() {
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.getStatus() != FOLDED && pokerSpieler.isComputer() && pokerSpieler.getStatus() != OUT) {
                if (raiseState() && pokerSpieler.getCombo() == HOHEKARTE) {
                    pokerSpieler.setStatus(CHECKED);
                    if (highraise != 0) {
                        if (pokerSpieler.getGeld() < highraise) {
                            pot = (int) (pot + pokerSpieler.getGeld());
                            pokerSpieler.setGeld(0);
                        } else {
                            pokerSpieler.setGeld(pokerSpieler.getGeld() - highraise);
                            pot = pot + highraise;
                        }
                    }
                } else if (!raiseState()) {
                    int chance = 10 - pokerSpieler.getCombo().getWert();
                    if (rand.nextInt(chance - 0 + 1) + 0 == 0) {
                        int einsatz = (int) (rand.nextInt((int) (pokerSpieler.getGeld() / 2 - pokerSpieler.getGeld() / 4 + 1)));
                        pokerSpieler.setStatus(RAISED);
                        if (highraise != 0) { //Spieler bietet mehr als der andere
                            highraise = highraise + einsatz;
                            if (pokerSpieler.getGeld() < (einsatz + highraise)) {
                                pot = (int) (pot + pokerSpieler.getGeld());
                                pokerSpieler.setGeld(0);

                            } else {
                                pokerSpieler.setGeld(pokerSpieler.getGeld() - (einsatz + highraise));
                                pot = pot + einsatz + highraise;
                            }

                        } else {
                            highraise = einsatz;
                            pokerSpieler.setGeld(pokerSpieler.getGeld() - einsatz);
                            pot = pot + einsatz;
                        }

                    } else {
                        pokerSpieler.setStatus(CHECKED);
                    }
                } else if (raiseState()) {
                    pokerSpieler.setStatus(CHECKED);
                }
            }

        }
    }

    /**
     * Wählt den Gewinner aus
     *
     * @return Der gewinner der Runde
     */
    public PokerSpieler checkwin() {
        PokerSpieler winner = spielerliste.getFirst();
        Combi winnercombo = HOHEKARTE;

        for (PokerSpieler pokerSpieler : spielerliste) {
            if(pokerSpieler.getGeld() == 0)
            {
                pokerSpieler.setStatus(Status.OUT);
            }
            if (pokerSpieler.getCombo().getWert() > winnercombo.getWert() && pokerSpieler.getStatus() != FOLDED && pokerSpieler.getStatus() != OUT) {
                winnercombo = pokerSpieler.getCombo();
                winner = pokerSpieler;
            }
        }
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (winner == pokerSpieler) {
                System.out.println(pot);
                pokerSpieler.setGeld(pokerSpieler.getGeld() + pot);
            }
        }

        return winner;
    }

    public boolean raiseState() {
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.getStatus() == RAISED) {
                return true;
            }
        }
        return false;
    }

    public Status allStatus() {
        HashMap<Status, Integer> map = new HashMap<>();
        Status[] statusfeld = Status.values();

        for (int i = 0; i < statusfeld.length; i++) {
            map.put(statusfeld[i], 0);
        }

        for (PokerSpieler pokerSpieler : spielerliste) {
            switch (pokerSpieler.getStatus()) {
                case OUT:
                    map.put(OUT, map.get(OUT) + 1);
                    break;

                case FOLDED:
                    map.put(FOLDED, map.get(FOLDED) + 1);
                    break;

                case RAISED:
                    map.put(RAISED, map.get(RAISED) + 1);
                    break;
            }

        }

//        for (int i = 0; i < statusfeld.length; i++) {
//            if (map.get(statusfeld[i]) == 4) {
//                return statusfeld[i];
//            }
//        }

        int anz = 0;
        for (int i = 1; i < spielerliste.size(); i++) {
            if(spielerliste.get(i).getStatus() == Status.OUT)
            {
                anz++;
            }
            System.out.println(spielerliste.get(i).getName()+": "+spielerliste.get(i).getGeld());
        }
        System.out.println("Anzahl: "+anz);
        if(anz == 4)
        {
            return Status.OUT;
        }

        return null;
    }

    /**
     * Check-Zug
     */
    public void check() {
        player.play("effect", "Check.mp3", false);

        if (!raiseState()) {
            highraise = 0;
            if (flopstate == 1) {
                //Preflop: 3 Karten werden auf dem Tisch aufgedeckt
                flopedcards = 3;
                flopstate = 2;
                player.play("effect", "Flip.mp3", false);
            } else if (flopstate == 2) {
                //Flop: 1 weitere Karte wird auf dem Tisch aufgedeckt
                if (flopedcards < 5) {
                    switch (flopedcards) {
                        case 3:
                            flopedcards = 4;
                            break;
                        case 4:
                            flopedcards = 5;
                            break;
                    }
                    player.play("effect", "Flip.mp3", false);
                }

            }
        }
        letAllComsPlay();
        checkAllCombos();

    }

    /**
     * Erhöht den Pot
     *
     * @param einsatz Einsatz des Pokerspielers
     */
    public void raise(int einsatz) {
        //Einsatz erhöhen
        if (highraise != 0) { //Spieler bietet mehr als der andere
            highraise = highraise + einsatz;
            spielerliste.getFirst().setGeld(spielerliste.getFirst().getGeld() - (einsatz + highraise));
            pot = pot + einsatz + highraise;
        } else {
            highraise = einsatz;
            spielerliste.getFirst().setGeld(spielerliste.getFirst().getGeld() - einsatz);
            pot = pot + einsatz;
        }

        spielerliste.getFirst().setStatus(RAISED);
        check();
        for (int i = spielerliste.size() - 1; i > 0; i--) {
            if (spielerliste.get(i).getStatus() == CHECKED) {
                spielerliste.getFirst().setStatus(CHECKED);
            } else if (spielerliste.get(i).getStatus() == RAISED) {
                break;
            }
        }

        if (!raiseState()) {
            check();
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    public int getFlopstate() {
        return flopstate;
    }

    public void setFlopstate(int flopstate) {
        this.flopstate = flopstate;
    }

    public int getUmlaufgeld() {
        int umlaufgeld = 0;
        for (PokerSpieler pokerSpieler : spielerliste) {
            umlaufgeld = (int) (umlaufgeld + pokerSpieler.getGeld());
        }
        umlaufgeld = umlaufgeld + pot;
        return umlaufgeld;
    }

}
