/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class KarakterVaszonTest extends JFrame{

    public KarakterVaszonTest(){
        setBounds(100,100,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Karaktermozgatás. Betű, Fel, Le, Balra, Jobbra, F5, F6");
        Container cp = getContentPane();
        cp.add(new KarakterVaszon());
        setVisible(true);
    }
    public static void main(String[] args) {
        KarakterVaszonTest kvt = new KarakterVaszonTest();
    }
}
