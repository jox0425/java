/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Gyarmati János
 */
public class AdvancedFenyujsag extends SimpleFenyujsag implements AdjustmentListener {

    protected JScrollBar sbDelay;
    protected JLabel lbDelayInfo;

    public AdvancedFenyujsag(String text, int delay, Color textColor) {
        super(text, delay, textColor);
        
        JPanel pnDelay = new JPanel();
        pnDelay.add(sbDelay = new JScrollBar(JScrollBar.HORIZONTAL, 100, 50, 1, 1000));
        pnDelay.add(lbDelayInfo = new JLabel("50",JLabel.CENTER));
        add(pnDelay,"South");
        sbDelay.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource().equals(sbDelay)) {
            int adjValue = sbDelay.getValue();
            lbDelayInfo.setText(Integer.toString(adjValue));
            delay = adjValue;
            timer.setDelay(delay);
        }

    }
}
