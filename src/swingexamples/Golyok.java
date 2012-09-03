/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jox
 */
public class Golyok extends JFrame {

    protected ImageIcon blueBall, redBall, yellowBall;
    protected JLabel redB, blueB, yellowB;
    protected Container cp = getContentPane();
    protected JPanel pnChecks;
    protected JPanel pnBalls;

    public Golyok() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());

        redBall = new ImageIcon("images/red-ball.gif");
        blueBall = new ImageIcon("images/blue-ball.gif");
        yellowBall = new ImageIcon("images/yellow-ball.gif");

        pnBalls = new JPanel(new GridLayout(1, 3));
        pnBalls.add(redB = new JLabel(redBall));
        pnBalls.add(blueB = new JLabel(blueBall));
        pnBalls.add(yellowB = new JLabel(yellowBall));
        cp.add(pnBalls, "North");

        pnChecks = new JPanel(new GridLayout(1, 3));

        cp.add(pnChecks, "South");

        pack();
        setVisible(true);
    }
}
