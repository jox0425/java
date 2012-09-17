/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Gyarmati János
 */
public class GombSzonyeg extends JComponent {

    private int r, g, b;
    private int sugar;
    public GombSzonyeg() {
        setSize(255, 255);
        this.r = 255;
        this.g = 255;
        this.b = 255;
        this.sugar = 255;
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.translate(getWidth()/2, getHeight()/2);
        for (int i = 0;i<sugar;i+=2 ){
            gr.setColor(new Color(r, g, b));
            gr.drawOval(-(i/2),-(i/2), i, i);
            r--;
            g--;
            b--;
        }
    }
}
