/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class SzovegStilus extends JFrame {

    private Container cp = getContentPane();
    private Tools t = new Tools();

    public SzovegStilus() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.add(t); 
        pack();
        setVisible(true);
    }
}
