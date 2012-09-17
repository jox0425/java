/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Emberke extends JPanel{
    private Color color;
    
    public Emberke(Color color){
        this.color = color;
    }
    
    @Override
    protected void paintComponent(Graphics gr){
        //a (0,0) pont az emberke szive helye:
        super.paintComponent(gr);
        gr.translate(getWidth()/2, getHeight()/2);
        gr.setColor(color);
        gr.drawOval(-5, -15, 10, 10); //fej
        gr.drawLine(0, -5, 0, 7); //törzs, függőleges egyenes
        gr.drawLine(-7, 0, 7, 0); //két keze
        gr.drawLine(0, 7, -5, 20); //bal lába
        gr.drawLine(0, 7, 5, 20); //jobb lába
    }
}