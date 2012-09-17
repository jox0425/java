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
public class PluszJel extends JComponent {

    private Color color;
    private int thickness;

    public PluszJel(Color color, int thickness) {
        this.color = color;
        this.thickness = thickness;
        setSize(100, 100);
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.setColor(color);
        gr.fillRect(getWidth() / 2, 0, thickness, getHeight());
        gr.fillRect(0, getHeight() / 2, getWidth(), thickness);
    }
}
