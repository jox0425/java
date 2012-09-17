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
public class RajzTest extends JFrame{

    
    public RajzTest(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        //getContentPane().setForeground(Color.red);
        getContentPane().add(new Rajz());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        RajzTest rt = new RajzTest();
    }
}
