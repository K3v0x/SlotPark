/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.io.File;
import java.util.Random;
import javafx.scene.control.ToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author Kevin
 */
public class BombController {

    private int[][] spielfeld = new int[5][5];
    private JToggleButton[][] buttons = new JToggleButton[5][5];
    private JLabel[] zeilenfield = new JLabel[5];
    private JLabel[] spaltenfield = new JLabel[5];

    public void newGame() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j].setIcon(null);
                buttons[i][j].setText("?");
                buttons[i][j].setEnabled(true);
                buttons[i][j].setSelected(false);
            }

        }
        fillfield(buttons);
    }

   
    
    public void gameOver() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j].setEnabled(false);
                if (spielfeld[i][j] == 0) {
                    buttons[i][j].setText("");
                    buttons[i][j].setIcon(new ImageIcon(System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "ZugführerDlg.PNG"));
                } else {
                    buttons[i][j].setText(spielfeld[i][j] + "");
                }

            }

        }
    }

    public void fillfield(JToggleButton[][] bt) {
        Random rand = new Random();
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld.length; j++) {
                spielfeld[i][j] = rand.nextInt(3 - 0 + 1) + 0;
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.print("\n");
        }

        int anz = 0;
        for (int i = 0; i < spielfeld.length; i++) {

            for (int j = 0; j < spielfeld.length; j++) {
                if (spielfeld[j][i] == 0) {
                    anz++;
                }
            }
            spaltenfield[i].setText(anz + "");
            anz = 0;

        }

        for (int i = 0; i < spielfeld.length; i++) {

            for (int j = 0; j < spielfeld.length; j++) {
                if (spielfeld[i][j] == 0) {
                    anz++;
                }
            }
            zeilenfield[i].setText(anz + "");
            anz = 0;

        }

    }

    public int flip(String buttonname) {
        System.out.println(buttonname);
        String[] parts = buttonname.split(" ");
        int zeile = Integer.parseInt(parts[0]);
        int spalte = Integer.parseInt(parts[1]);
        return spielfeld[zeile][spalte];
    }

    public int[][] getSpielfeld() {
        return spielfeld;
    }

    public void setSpielfeld(int[][] spielfeld) {
        this.spielfeld = spielfeld;
    }

    public JToggleButton[][] getButtons() {
        return buttons;
    }

    public void setButtons(JToggleButton[][] buttons) {
        this.buttons = buttons;
    }

    public JLabel[] getZeilenfield() {
        return zeilenfield;
    }

    public void setZeilenfield(JLabel[] zeilenfield) {
        this.zeilenfield = zeilenfield;
    }

    public JLabel[] getSpaltenfield() {
        return spaltenfield;
    }

    public void setSpaltenfield(JLabel[] spaltenfield) {
        this.spaltenfield = spaltenfield;
    }

}
