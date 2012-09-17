/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Kep2 extends JPanel {
    
    private Image img;                  //eredeti kép
    private Image fittedImg = null;     //kicsinyített/nagyított kép
    private double ratio;               //arány: szélesség/magasság
    private String fileName;            //a képállomány neve
    private MediaTracker tr;
    
    public Kep2(String fileName) {
        //a kép betöltése file-ból a médiakövető segítségével:
        this.fileName = fileName;
        img = Toolkit.getDefaultToolkit().createImage(fileName);
        tr = new MediaTracker(this);
        tr.addImage(img, 0);
        try {
            tr.waitForID(0);
        } catch (InterruptedException e) {
        } finally {
            tr.removeImage(img, 0);
        }
        //ratio kiszámítása. csak akkor jó, ha betöltődött a kép
        ratio = 1.0 * img.getWidth(this) / img.getHeight(this);
        System.out.println("Ratio= " + ratio);
        
        addComponentListener(new ComponentAdapter() {
            //átméretezték a panelt:
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Ratio= " + ratio);
                //a kép átméretezése a médiakövető segítségével.
                //igazítás a komponens szélességéhez vagy magasságához
                if (getHeight() * ratio > getWidth()) {
                    fittedImg = img.getScaledInstance(getWidth(), -1, Image.SCALE_DEFAULT);
                } else {
                    fittedImg = img.getScaledInstance(-1, getHeight(), Image.SCALE_DEFAULT);
                }
                tr = new MediaTracker(e.getComponent());
                tr.addImage(fittedImg, 0);
                try {
                    tr.waitForID(0);
                } catch (InterruptedException ex) {
                } finally {
                    tr.removeImage(img, 0);
                }
            }
        });     
    }
    
    @Override
    protected void paintComponent(Graphics gr){
        super.paintComponent(gr);
        //a kép kirajzolása
        gr.drawImage(fittedImg, 0, 0, this);
        
        //a képfájl nevének megjelenítése egy szürke téglalapban:
        gr.setColor(Color.LIGHT_GRAY);
        gr.fillRoundRect(0, getHeight()-30, 300, 30, 5, 5);
        gr.setColor(Color.BLACK);
        gr.drawRoundRect(0, getHeight()-30, 300, 30, 5, 5);
        gr.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        gr.drawString(fileName, 10, getHeight()-10);
    }
}
