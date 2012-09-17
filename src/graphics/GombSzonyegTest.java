/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class GombSzonyegTest extends JFrame{

    
    public GombSzonyegTest(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        getContentPane().add(new GombSzonyeg());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        GombSzonyegTest gst = new GombSzonyegTest();
    }
}
