/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class MouseTest extends JFrame implements MouseListener, MouseMotionListener {

    private int exitSzam;

    public MouseTest() {
        setTitle("MouseTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 150);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }

    void drawString(String str, int x, int y) {
        Graphics gr = this.getGraphics();
        gr.clearRect(0, 0, getWidth(), getHeight());
        gr.drawString(str, x, y);
        gr.dispose();
    }

    String melyikGomb(MouseEvent e) {
        if (e.getModifiers() == MouseEvent.BUTTON1_MASK) {
            return "Bal";
        }
        if (e.getModifiers() == MouseEvent.BUTTON2_MASK) {
            return "Középső";
        }
        if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {
            return "Jobb";
        }
        return "";
    }

    public static void main(String[] args) {
        MouseTest mt = new MouseTest();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        drawString(melyikGomb(e) + " gombon "+ e.getClickCount() + "-t kattintottál! ", e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawString(melyikGomb(e) + " gombot megnyomtad", e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         drawString(melyikGomb(e) + " gombot felengedted", e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (++exitSzam == 5){
            System.exit(0);
        }
        drawString(exitSzam + "! Ha ötödször is elhagysz, én is elhagylak", 20, 50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        drawString(melyikGomb(e) + " gombbal vonszoltad", e.getX(), e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        drawString("Elmozgattad", e.getX(), e.getY());
    }
}
