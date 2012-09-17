/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class RajzPanel extends JPanel {
    
    @Override
    protected void paintComponent(Graphics x){
        super.paintComponent(x);
        repaint();
        setBackground(new Color(130,180,160));
        x.drawOval(40, 80, 320, 100);
        x.drawRect(40, 80, 320, 100);
        x.setColor(Color.WHITE);
        x.setFont(new Font("Arial", Font.BOLD, 40));
        x.drawString("Szeretlek Macó!!", 60, 140);
        x.drawLine(60, 140, 340, 140);
        x.setColor(Color.ORANGE);
        x.fillRect(0, 200, 500, 10);
    }
    
}
