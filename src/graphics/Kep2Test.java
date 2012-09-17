/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class Kep2Test extends JFrame{

    public Kep2Test(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,dim.width,dim.height-50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //getContentPane().add(new Kep2("images/SanFran.jpg"));
        getContentPane().add(new Kep2("images/auto.jpg"));
        //getContentPane().add(new Kep2("images/PosterChild.jpg"));
        setVisible(true);
    }
    public static void main(String[] args) {
        Kep2Test k2 = new Kep2Test();
    }
}
