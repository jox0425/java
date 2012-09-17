/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Pontozo extends JPanel {

    private Vector pontok = new Vector();

    public Pontozo() {
        setBackground(Color.PINK);
        setOpaque(true);
        addMouseListener(new EgerFigyelo());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p;
        for (int i = 0; i < pontok.size(); i++) {
            p = (Point) (pontok.get(i));
            g.fillOval(p.x, p.y, 5, 5);
        }
    }

    class EgerFigyelo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            pontok.add(new Point(e.getX(), e.getY()));
            Graphics gr = getGraphics();
            gr.fillOval(e.getX(), e.getY(), 5, 5);
            gr.dispose();
        }
    }
}
