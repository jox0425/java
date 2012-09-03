/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/**
 *
 * @author Jox
 */
public class Golyok1 extends Golyok {

    private JCheckBox cbRed = new JCheckBox();
    private JCheckBox cbBlue = new JCheckBox();
    private JCheckBox cbYellow = new JCheckBox();
    private ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            redB.setVisible(cbRed.isSelected() ? true : false);
            blueB.setVisible(cbBlue.isSelected() ? true : false);
            yellowB.setVisible(cbYellow.isSelected() ? true : false);
        }
    };
    
    public Golyok1(){
        pnChecks.add(cbRed = new JCheckBox("Piros golyó", redBall, true));        
        pnChecks.add(cbBlue = new JCheckBox("Kék golyó", blueBall, true));
        pnChecks.add(cbYellow = new JCheckBox("Sárga golyó", yellowBall, true));
        
        cbRed.addActionListener(al);
        cbBlue.addActionListener(al);
        cbYellow.addActionListener(al);
    }
}
