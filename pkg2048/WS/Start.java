/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048.WS;

import javax.swing.JFrame;

/**
 *
 * @author cesar
 */
public class Start {
    public static void main(String[] args){
        Game game = new Game();
        
        JFrame window = new JFrame("2048");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        game.start();
    }
}
