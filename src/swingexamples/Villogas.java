/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Gyarmati János
 */
public class Villogas extends JFrame implements ActionListener {

    private Timer timer;
    private JLabel lbFelirat;
    private int i = 0;

    public Villogas() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.add(lbFelirat = new JLabel("Felirat", JLabel.CENTER), "Center");
        timer = new Timer(500, this);
        timer.start();

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            lbFelirat.setVisible(!lbFelirat.isVisible());
        }
    }
}
