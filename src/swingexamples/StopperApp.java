/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class StopperApp extends JFrame{

    public StopperApp(){
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(1, 0));
        cp.add(new Stopper(100));
        cp.add(new Stopper(2000));
        pack();
        setVisible(true);
    }
}
