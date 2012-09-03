/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Jox
 */
public class Golyok2 extends Golyok {

    private JRadioButton cbRed = new JRadioButton();
    private JRadioButton cbBlue = new JRadioButton();
    private JRadioButton cbYellow = new JRadioButton();
    private ButtonGroup bg = new ButtonGroup();
    private ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            redB.setVisible(cbRed.isSelected());
            blueB.setVisible(cbBlue.isSelected());
            yellowB.setVisible(cbYellow.isSelected());
        }
    };

    public Golyok2() {


        pnChecks.add(cbRed = new JRadioButton("Piros golyó"));
        cbRed.addActionListener(al);
        bg.add(cbRed);

        pnChecks.add(cbBlue = new JRadioButton("Kék golyó"));
        cbBlue.addActionListener(al);
        bg.add(cbBlue);

        pnChecks.add(cbYellow = new JRadioButton("Sárga golyó"));
        cbYellow.addActionListener(al);
        bg.add(cbYellow);
    }
}
