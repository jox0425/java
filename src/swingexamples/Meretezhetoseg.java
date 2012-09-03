/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jox
 */
public class Meretezhetoseg extends JFrame {

    public Container cp = getContentPane();
    private JCheckBox cbResizable;
    private ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (cbResizable.isSelected()) {
                setResizable(true);
            }else {
                setResizable(false);
            }
        }
    };

    public Meretezhetoseg() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setTitle("Méretezhetőség");
        
        cp.add(cbResizable = new JCheckBox("Méretezhető ablak?",true));
        cbResizable.addActionListener(al);
               
        pack();
        setVisible(true);
    }
}
