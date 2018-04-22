/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Symbol;
import static beans.Symbol.CHERRY;
import static beans.Symbol.DIAMOND;
import static beans.Symbol.LUCK;
import static beans.Symbol.TREE;
import java.util.Random;

/**
 *
 * @author Kevin
 */
public class SlotController {

    Symbol[] slots = {DIAMOND, LUCK, TREE, CHERRY};
    Symbol[][] slotdisplay = new Symbol[3][3];
    Random rand = new Random();

    public void spin() {

        for (int i = 0; i < slotdisplay.length; i++) {
            for (int j = 0; j < slotdisplay.length; j++) {

                slotdisplay[i][j] = slots[rand.nextInt(3) + 0];
                System.out.print(slotdisplay[i][j].getWert() + " ");
            }
            System.out.println("\n");
        }

    }

    public Symbol[][] getSlotdisplay() {
        return slotdisplay;
    }

    public void setSlotdisplay(Symbol[][] slotdisplay) {
        this.slotdisplay = slotdisplay;
    }
    
    
}
