/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class PluszJelTest extends JFrame{

    public PluszJelTest(){
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new PluszJel(Color.yellow, 10));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PluszJelTest pjt = new PluszJelTest();
    }
}
