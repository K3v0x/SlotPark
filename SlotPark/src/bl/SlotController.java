/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Kevin
 */
public class SlotController {

    
    public SlotController() {
    }

    // Kirsche zählt 10, Tree zählt 15, Luck zählt 20, Diamond zählt 50
    public int[] getGewinn(int[][] array) {
        int[] feld = {0, 0};
      
        // Cherry-Auswertung
        if (array[0][0] == 0 && array[0][1] == 0 && array[0][2] == 0) {
            feld[0] += 10;
            feld[1] = 1;
        }
        if (array[1][0] == 0 && array[1][1] == 0 && array[1][2] == 0) {
            feld[0] += 10;
            feld[1] = 2;
        }
        if (array[2][0] == 0 && array[2][1] == 0 && array[2][2] == 0) {
            feld[0] += 10;
            feld[1] = 3;
        }

        // Tree-Auswertung
        if (array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1) {
            feld[0] += 15;
            feld[1] = 1;
        }
        if (array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1) {
            feld[0] += 15;
            feld[1] = 2;
        }
        if (array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1) {
            feld[0] += 15;
            feld[1] = 3;
        }

        // Luck-Auswertung
        if (array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2) {
            feld[0] += 20;
            feld[1] = 1;
        }
        if (array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2) {
            feld[0] += 20;
            feld[1] = 2;
        }
        if (array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2) {
            feld[0] += 20;
            feld[1] = 3;
        }

        // Diamond-Auswertung
        if (array[0][0] == 3 && array[0][1] == 3 && array[0][2] == 3) {
            feld[0] += 50;
            feld[1] = 1;
        }
        if (array[1][0] == 3 && array[1][1] == 3 && array[1][2] == 3) {
            feld[0] += 50;
            feld[1] = 2;
        }
        if (array[2][0] == 3 && array[2][1] == 3 && array[2][2] == 3) {
            feld[0] += 50;
            feld[1] = 3;
        }
        return feld;
    }
}
