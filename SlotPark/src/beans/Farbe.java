/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.Color;

/**
 *
 * @author Kevin
 */
public enum Farbe {
    KREUZ("C", Color.BLACK),
    KARO("D", Color.RED),
    PIK("S", Color.BLACK),
    HERZ("H", Color.RED);

    private Farbe(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    

    String name;
    Color color;
}
