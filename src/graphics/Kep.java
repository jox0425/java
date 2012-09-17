/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Kep extends JPanel {

    private Image img;
    
    public Kep() {
        MediaTracker tr = new MediaTracker(this);
        img = Toolkit.getDefaultToolkit().getImage("images/BelvTempEste.jpg");
        tr.addImage(img, 0);
        try {
            tr.waitForID(0);
        } catch (InterruptedException e) {
        } finally {
            tr.removeImage(img, 0);
        }
    }
    
    @Override
    protected void paintComponent(Graphics gr){
        super.paintComponent(gr);
        gr.drawImage(img, 10, 10, this);
    }
}
