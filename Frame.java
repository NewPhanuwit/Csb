/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author ssp
 */
public class Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame jf = new PlayGames();
            jf.setSize(1400,800);
            jf.setTitle("Animation Example");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
    }
    
}
