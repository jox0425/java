/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class ImageTest extends JFrame{

    public ImageTest(){
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        getContentPane().add(new Kep());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ImageTest it = new ImageTest();
    }
}
