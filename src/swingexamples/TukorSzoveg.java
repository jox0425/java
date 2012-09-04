/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jox
 */
public class TukorSzoveg extends JFrame implements KeyListener{
    
    private JTextArea taFelso,taAlso;
    private Container cp = getContentPane();
    public TukorSzoveg(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(2,2));
        
        cp.add(new JScrollPane(taFelso=new JTextArea(5, 15)),"North");
        cp.add(new JScrollPane(taAlso=new JTextArea(5, 15)),"South");
        
        taAlso.setEditable(false);
        taAlso.setLineWrap(true);
        taAlso.setWrapStyleWord(true);
        
        taFelso.setLineWrap(true);
        taFelso.setWrapStyleWord(true);
        taFelso.addKeyListener(this);
        
        pack();
        taFelso.requestFocus();
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            taAlso.append(taFelso.getText());
            taFelso.setText("");
        }
    }
    
}
