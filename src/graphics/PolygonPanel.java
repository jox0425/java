/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class PolygonPanel extends JPanel {

    private int n; // a szabályos sokszög szögeinek száma
    private int radius; // a sokszög köré írható kör sugara
    private Polygon poly; // a sokszög

    public PolygonPanel(int n, int radius) {
        this.n = n;
        this.radius = radius;
        int alfa = 360 / n; //egy cikk szöge fokban

        poly = new Polygon();
        for (int i = 0; i < n; i++) {
            int x = (int) (radius * Math.cos(Math.toRadians(i * alfa)));
            int y = (int) (radius * Math.sin(Math.toRadians(i * alfa)));
            poly.addPoint(x, y);
        }
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.translate(getWidth() / 2, getHeight() / 2);
        setBackground(new Color(255, 255, 210));
        gr.setColor(Color.LIGHT_GRAY);
        gr.fillPolygon(poly);
        gr.setColor(Color.BLACK);
        gr.drawPolygon(poly);
        gr.fillOval(-5, -5, 10, 10);
    }
}
