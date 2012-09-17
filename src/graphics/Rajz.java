/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Rajz extends JPanel{
    
    public Rajz(){
    
    }
    
    @Override
    protected void paintComponent(Graphics gr){
        super.paintComponent(gr);
        setBackground(new Color(0,235,255));
        //téglalapok a sarkokban
        gr.setColor(Color.orange);
        gr.fill3DRect(0, 0, 80, 50,true);
        gr.fill3DRect(getWidth()-80, 0, 80, 50,true);
        gr.fill3DRect(0, getHeight()-50, 80, 50,true);
        gr.fill3DRect(getWidth()-80, getHeight()-50, 80, 50,true);
        
        //középpont
        gr.translate(getWidth()/2, getHeight()/2);
        gr.setColor(Color.BLUE);
        
        //középső ellipszis és téglalap
        gr.drawRect(-100, -50, 200, 100);
        gr.fillOval(-100, -50, 200, 100);
    }
}
