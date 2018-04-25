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
import beans.Spieler;
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
    SoundPlayer player = SoundPlayer.getInstance();

    LinkedList<PokerSpieler> spielerliste = new LinkedList<>(); //Spielerliste
    Stack<Karte> stapel = new Stack<>(); //Kartenstapel
    private int mindesteinsatz = 0; //Minimaler Einsatz
    int flopedcards = 0; //Anzahl der aufgedeckten Karten
    int pot = 0; //Anzahl der Chips im Pot
    Karte[] kartentisch = new Karte[5]; //Karten, die auf dem Tisch liegen
    boolean preflop = true; //Preflop-Phase
    boolean flop = false; //Flop-Phase
    boolean raisemode = false;
    private String name;
    private int geld;
    PokerSpieler spieler;

    public CasinoController(String name, int geld) {
        this.name = name;
        this.geld = geld;
        spieler = new PokerSpieler(new Karte[2], HOHEKARTE, "...", false, false, false, name, "1", geld, null);
    }

   
    public void load() {
        PokerSpieler com1 = new PokerSpieler(new Karte[2], HOHEKARTE, "...", false, false, true, "Mike", "1", geld, null);
        PokerSpieler com2 = new PokerSpieler(new Karte[2], HOHEKARTE, "...", false, false, true, "Martin", "1", geld, null);
        PokerSpieler com3 = new PokerSpieler(new Karte[2], HOHEKARTE, "...", false, false, true, "Sarah", "1", geld, null);
        PokerSpieler com4 = new PokerSpieler(new Karte[2], HOHEKARTE, "...", false, false, true, "Tom", "1", geld, null);

        spielerliste.clear();
        spielerliste.add(spieler);
        spielerliste.add(com1);
        spielerliste.add(com2);
        spielerliste.add(com3);
        spielerliste.add(com4);
        mindesteinsatz = (int) (spieler.getGeld() / 5);
        newRound();
    }

    public void newRound() { //Neue Runde starten
        pot = 0;
        stapel.clear();
        flopedcards = 0;
        preflop = true;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (!pokerSpieler.isBankrott()) {
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

                if (pokerSpieler.getGeld() >= mindesteinsatz) {
                    pokerSpieler.setGeld(pokerSpieler.getGeld() - mindesteinsatz);
                    pot = pot + mindesteinsatz;
                } else {
                    pokerSpieler.setFolded(true);
                    System.out.println(pokerSpieler.getName() + " ist bankrott");
                    pokerSpieler.setBankrott(true);

                }
                checkCombi(pokerSpieler);
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
    public void checkCombi(PokerSpieler pokerSpieler) {

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
                pokerSpieler.setCombo(combi);
            } else if (anzahl.get(i + 1) == 2) {
                for (int j = 0; j < anzahl.size(); j++) {
                    if (anzahl.get(j + 1) == 2 && j != i) {
                        combi = ZWEIPAARE;
                        pokerSpieler.setCombo(combi);
                    }
                }
            } else if (anzahl.get(i + 1) == 2) {
                combi = PAAR;
                pokerSpieler.setCombo(combi);
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

    public void letcomplay(PokerSpieler pokerSpieler) {

        if (!pokerSpieler.isFolded() && pokerSpieler.isComputer() && !pokerSpieler.isBankrott()) {
            if (raisemode && pokerSpieler.getCombo() == HOHEKARTE) {
                pokerSpieler.setFolded(true);
                pokerSpieler.setStatus("Folded");
            } else if (!raisemode) {
                int chance = 10 - pokerSpieler.getCombo().getWert();
                if (rand.nextInt(chance - 0 + 1) + 0 == 0) {

                    int einsatz = (int) (rand.nextInt((int) (pokerSpieler.getGeld() / 2 - pokerSpieler.getGeld() / 4 + 1)));
                    pokerSpieler.setStatus("Raised " + einsatz);
                    pokerSpieler.setGeld(pokerSpieler.getGeld() - einsatz);
                    pot = pot + einsatz;
                } else {
                    pokerSpieler.setStatus("Checked");
                }
            }

        }

    }

    public PokerSpieler checkwin() {
        PokerSpieler winner = spielerliste.getFirst();
        Combi winnercombo = HOHEKARTE;

        int anz = 0;
        for (PokerSpieler pokerSpieler : spielerliste) {
            if (pokerSpieler.isBankrott()) {
                anz++;
            }
        }
        if (anz == 4) {
            spielerliste.getFirst().setStatus("WINNER");
        } else {
            for (PokerSpieler pokerSpieler : spielerliste) {
                if (pokerSpieler.getCombo().getWert() > winnercombo.getWert() && !pokerSpieler.isFolded()) {
                    winnercombo = pokerSpieler.getCombo();
                    winner = pokerSpieler;
                }
            }
            for (PokerSpieler pokerSpieler : spielerliste) {
                if (winner == pokerSpieler) {
                    pokerSpieler.setGeld(pokerSpieler.getGeld() + pot);
                }
            }
        }

        return winner;

    }

    public void check() {
        player.play("effect", "Check.mp3", false);
        raisemode = false;
        if (preflop) {
            //Preflop: 3 Karten werden auf dem Tisch aufgedeckt
            flopedcards = 3;
            preflop = false;
            player.play("effect", "Flip.mp3", false);
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
                player.play("effect", "Flip.mp3", false);
            }

        }
        for (PokerSpieler pokerSpieler : spielerliste) {
            letcomplay(pokerSpieler);
            checkCombi(pokerSpieler);
        }
    }

    public void raise(int einsatz) {
        //Einsatz erhöhen
        raisemode = true;
        pot = pot + einsatz;
        spielerliste.getFirst().setGeld(spielerliste.getFirst().getGeld() - einsatz);
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

}
