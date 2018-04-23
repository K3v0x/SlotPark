/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Icon;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;

/**
 *
 * @author micha
 */
public class ComboboxRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        Icon icons = (Icon) value;
//        this.setText(icons.getName());
        try {
            Image img = ImageIO.read(new File(icons.getPfad()));
            img = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.setIcon(icon);
            this.setHorizontalAlignment(CENTER);
        } catch (IOException ex) {
            Logger.getLogger(ComboboxRenderer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
}
