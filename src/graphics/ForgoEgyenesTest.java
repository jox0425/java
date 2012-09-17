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
public class ForgoEgyenesTest extends JFrame{

    public ForgoEgyenesTest(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        getContentPane().add(new ForgoEgyenes());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ForgoEgyenesTest fet = new ForgoEgyenesTest();
    }
}
