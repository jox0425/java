/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Timer;

/**
 *
 * @author Gyarmati János
 */
public class ForgoEgyenes extends JComponent implements ActionListener {

    private Timer timer;
    private int x1, x2, y1, y2;
    private int szog = 0;
    private int r = 100;

    public ForgoEgyenes() {
        setSize(300, 300);
        timer = new Timer(50, this);
        timer.start();
        x1 = getWidth() / 2;
        y1 = 0;
        x2 = getWidth() / 2;
        y2 = getHeight();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(getWidth() / 2, getHeight() / 2);
        int x = (int) (r * Math.cos(Math.toRadians(szog)));
        int y = (int) (r * Math.sin(Math.toRadians(szog)));
        g.drawLine(-x, -y, x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        szog += 5;
        repaint();
    }
}
