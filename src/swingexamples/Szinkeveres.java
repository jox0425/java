/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

/**
 *
 * @author Gyarmati János
 */
class Szinkeveres extends JFrame
        implements AdjustmentListener {

    private JLabel lbInfo;
    private JTextArea taBackground;
    private JScrollBar sbRed, sbGreen, sbBlue;
    private Container cp = getContentPane();
    private int red, green, blue;
    private Color cBackgroundColor = new Color(red, green, blue);

    public Szinkeveres() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label;

        red = 255;
        green = 164;
        blue = 235;

        cp.add(lbInfo = new JLabel("Color(" + red + "," + green + "," + blue + ")", JLabel.CENTER), "North");
        cp.add(taBackground = new JTextArea(15, 30), "Center");
        taBackground.setBackground(cBackgroundColor = new Color(red, green, blue));

        JPanel pnControlPanel = new JPanel();
        //Scrollbar red
        pnControlPanel.add(label = new JLabel("Red:"));
        label.setVerticalAlignment(JLabel.CENTER);
        pnControlPanel.add(sbRed = new JScrollBar(JScrollBar.VERTICAL, red, 20, 0, 255 + 20));
        sbRed.addAdjustmentListener(this);
        
        //Scrollbar green
        pnControlPanel.add(label = new JLabel("Green:"));
        label.setVerticalAlignment(JLabel.CENTER);
        pnControlPanel.add(sbGreen = new JScrollBar(JScrollBar.VERTICAL, green, 20, 0, 255 + 20));
        sbGreen.addAdjustmentListener(this);
        //Scrollbar blue
        pnControlPanel.add(label = new JLabel("Blue:"));
        label.setVerticalAlignment(JLabel.CENTER);
        pnControlPanel.add(sbBlue = new JScrollBar(JScrollBar.VERTICAL, blue, 20, 0, 255 + 20));
        sbBlue.addAdjustmentListener(this);

        cp.add(pnControlPanel, "South");

        pack();
        setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        red = sbRed.getValue();
        green = sbGreen.getValue();
        blue = sbBlue.getValue();
        lbInfo.setText("Color(" + red + "," + green + "," + blue + ")");
        cBackgroundColor = new Color(red,green,blue);
        taBackground.setBackground(cBackgroundColor);
    }
}
