/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gyarmati János
 */
public class Stopper extends JPanel implements ActionListener {

    private Timer timer;
    private int ido = 0;
    private JLabel kijelzo;
    private JButton btStart, btStop;

    public Stopper(int delay) {
        setBorder(BorderFactory.createLoweredBevelBorder());
        setLayout(new GridLayout(0, 1));
        add(kijelzo = new JLabel("0", JLabel.CENTER));
        add(btStart = new JButton("Start"));
        add(btStop = new JButton("Stop"));
        btStart.addActionListener(this);
        btStop.addActionListener(this);
        timer = new Timer(delay, this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            ido++;
            kijelzo.setText(Integer.toString(ido));
        } else if (e.getSource().equals(btStart)) {
            timer.restart();
        } else if (e.getSource().equals(btStop)) {
            timer.stop();
        }
    }
}
