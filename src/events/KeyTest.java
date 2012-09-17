/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class KeyTest extends JFrame implements KeyListener {

    public KeyTest() {
        setBounds(100, 100, 500, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        KeyTest kt = new KeyTest();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        setTitle(getTitle() + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F4
                && e.getModifiers() == InputEvent.ALT_MASK) {
            System.exit(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            String title = getTitle();
            title = title.substring(0, title.length() - 2);
            setTitle(title);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
