/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author micha
 */
public class Icon {

    private String name;
    private String pfad;

    public Icon(String name, String pfad) {
        this.name = name;
        this.pfad = pfad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPfad() {
        return pfad;
    }

    public void setPfad(String pfad) {
        this.pfad = pfad;
    }

    @Override
    public String toString() {
        return "";
    }

    public ImageIcon getIcon() {
        Image img;
        try {
            img = ImageIO.read(new File(this.getPfad()));
            img = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            return icon;
        } catch (IOException ex) {
            Logger.getLogger(Icon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
