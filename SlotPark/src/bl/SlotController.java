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
import javax.swing.JLabel;

/**
 *
 * @author Kevin
 */
public class SlotController {

    Symbol[] slots = {CHERRY, TREE, LUCK, DIAMOND};
    Symbol[][] slotdisplay = new Symbol[3][3];
    Random rand = new Random();
    
    
    public int getGewinn(int[][] array) {
        int gewinn=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]==2)
                {
                    gewinn+=1;
                }
            }
        }
        return gewinn;
    }
}