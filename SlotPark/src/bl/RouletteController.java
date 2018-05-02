/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.Random;

/**
 *
 * @author micha
 */
public class RouletteController {
    private Random rand = new Random();
    
    
    public int play()
    {
        return rand.nextInt(37);
    }
}
