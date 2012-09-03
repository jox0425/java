/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class TextFieldTest extends JFrame {
    
    public TextFieldTest(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Név összerakás");
        setLocation(300, 200);
        getContentPane().add(new NevPanel());
        pack();
        setVisible(true);
    }   
}
