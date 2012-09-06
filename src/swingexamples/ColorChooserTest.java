/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class ColorChooserTest extends JFrame implements ActionListener {
    
    private JButton btSzin = new JButton("Színválasztás");
    private Color color;
    
    public ColorChooserTest(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(btSzin);
        btSzin.addActionListener(this);
        color = btSzin.getBackground();
        pack();
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        color = JColorChooser.showDialog(this, "A gomb színe...", color);
        if (color != null){
            btSzin.setBackground(color);
        }
    }
    
}
