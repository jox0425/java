/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jox
 */
class PressHistory extends JFrame {

    private Container cpPane = getContentPane();
    private JLabel history;
    private JPanel pnButtons = new JPanel();
    private JPanel pnHistory = new JPanel();
    private int buttonCount;
    private JButton[] buttons = new JButton[1];
    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String gombSzam = e.getActionCommand();
            history.setText(history.getText() + gombSzam);
        }
    };

    public PressHistory(int buttonCount) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.buttonCount = buttonCount;
        buttons = new JButton[buttonCount + 1];
        generateButtons();
        
        pnHistory.add(history = new JLabel(" "));
        
        cpPane.setLayout(new BorderLayout());
        cpPane.add(pnButtons, "North");
        cpPane.add(pnHistory, "South");

        pack();
        setVisible(true);
    }

    private void generateButtons() {
        for (int i = 1; i <= buttonCount; i++) {
            buttons[i] = new JButton(Integer.toString(i));
            buttons[i].setContentAreaFilled(false);
            buttons[i].setFocusPainted(false);
            buttons[i].setFocusable(false);
            pnButtons.add(buttons[i]);        
            buttons[i].addActionListener(actionListener);
        }
    }
}
