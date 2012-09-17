/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class KarakterVaszon extends JPanel implements KeyListener {

    private static final int STEP = 10;  // az elmozdulás mértéke
    private static final int INCR = 5; // a betűméret növekménye
    private char karakter = '?'; // a vásznon megjelenő karakter
    private int meret = 35; //a betű aktuális mérete
    private int x = 100, y = 100; //a betű aktuális pozíciója

    public KarakterVaszon() {
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        requestFocus();
        g.setFont(new Font("Dialog", Font.PLAIN, meret));
        g.drawString(Character.toString(karakter), x, y);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        karakter = e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= STEP;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += STEP;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= STEP;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += STEP;
        } else if (e.getKeyCode() == KeyEvent.VK_F5) {
            meret += INCR;
        } else if (e.getKeyCode() == KeyEvent.VK_F6 && meret >= INCR) {
           meret -= INCR;
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        repaint();
    }
}
