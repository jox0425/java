/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class EmberkeTest extends JFrame {

    public EmberkeTest() {
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new EmberkekPanel());
        setVisible(true);
    }
}
class EmberkekPanel extends JPanel{
    public EmberkekPanel(){
        setLayout(new GridLayout(5, 0));
        setBackground(Color.LIGHT_GRAY);
        for (int i=0;i<10;i++){
            add(new Emberke(Color.BLUE));
            add(new Emberke(Color.RED));
            add(new Emberke(Color.BLACK));
        }
    }
}