/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Gyarmati János
 */
public class SimpleFenyujsag extends JPanel implements ActionListener {

    protected Timer timer;
    private String text;
    protected int delay;
    private Color textColor;
    protected JTextArea tfFenyujsag;

    public SimpleFenyujsag(String text, int delay, Color textColor) {
        this.text = text+" ";
        this.delay = delay;
        this.textColor = textColor;
        
        Font font = new Font(Font.DIALOG, Font.PLAIN, 16);
        tfFenyujsag = new JTextArea(text, 3, 10);
        tfFenyujsag.setFont(font);
        tfFenyujsag.setForeground(textColor);
        
        timer = new Timer(delay, this);
        timer.start();
        
        add(tfFenyujsag,"North");
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            String el = text.substring(0,1);
            text = text.substring(1,text.length())+el;
            tfFenyujsag.setText(text);
        }
    }
}
