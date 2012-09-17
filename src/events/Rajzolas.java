/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class Rajzolas extends JPanel
        implements MouseListener, MouseMotionListener {

    //Minden eleme egyszínű, összefüggő vonal:
    private Vector vonalak = new Vector();
    private Polygon aktVonal;
    
    //A színeket külön vektorban tároljuk:
    Vector vonalSzinek = new Vector();
    Color aktSzin;

    public Rajzolas() {
        setSize(400,400);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    //a kép törlése:
    public void clear(){
        vonalak.clear();
        vonalSzinek.clear();
        repaint();
    }
    
    //aktuális rajzolószín beállítása
    public void setColor(Color c){
        aktSzin = c;
    }
    
    //a teljes kép (összes sokszög) kirajzolása

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Polygon vonal;
        Color szin;
        for (int i = 0; i<vonalak.size();i++){
            szin = (Color)(vonalSzinek.get(i));
            vonal = (Polygon)(vonalak.get(i));
            g.setColor(szin);
            g.drawPolyline(vonal.xpoints, vonal.ypoints, vonal.npoints);
        }
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Vonalkezdés. egy pont hozzáadása a sokszöghöz
        //először adatmódosítás
        int x = e.getX(), y=e.getY();
        vonalSzinek.add(aktSzin);
        vonalak.add(aktVonal = new Polygon());
        aktVonal.addPoint(x, y);
        //pont kirajzolása
        Graphics gr = getGraphics();
        gr.setColor(aktSzin);
        gr.drawLine(x, y, x, y);
        gr.dispose();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //a vonal folytatása ha már el van kezdve a vonal
        if (aktVonal != null && aktVonal.npoints>0){
            //adatmódosítás
            aktVonal.addPoint(e.getX(), e.getY());
            //utolsó vonalszakasz kirajzolása
            Graphics gr = getGraphics();
            gr.setColor(aktSzin);
            gr.drawLine(aktVonal.xpoints[aktVonal.npoints-2], aktVonal.ypoints[aktVonal.npoints-2],
                    aktVonal.xpoints[aktVonal.npoints-1], aktVonal.ypoints[aktVonal.npoints-1]);
            gr.dispose();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
