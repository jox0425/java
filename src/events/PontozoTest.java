/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class PontozoTest extends JFrame{
    
    public PontozoTest(){
        setTitle("Pontozás");
        setBounds(0, 0, 640, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new Pontozo());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PontozoTest pt = new PontozoTest();
    }
}
