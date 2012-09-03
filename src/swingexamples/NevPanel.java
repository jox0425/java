/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class NevPanel extends JPanel implements ActionListener {

    JTextField tfVezetekNev, tfKeresztNev, tfTeljesNev;
    JLabel lbMonogram;

    public NevPanel() {
        setLayout(new GridLayout(3, 1));

        JPanel pn = new JPanel();
        pn.add(new JLabel("Vezetéknév:"));
        pn.add(tfVezetekNev = new JTextField(10));
        pn.add(new JLabel("Keresztnev"));
        pn.add(tfKeresztNev = new JTextField(10));
        add(pn);

        pn = new JPanel();
        pn.add(new JLabel("Teljes név:"));
        pn.add(tfTeljesNev = new JTextField(20));
        tfTeljesNev.setEditable(false);
        add(pn);

        pn = new JPanel();
        pn.add(new JLabel("Monogram"));
        pn.add(lbMonogram = new JLabel(""));
        add(pn);

        tfVezetekNev.addActionListener(this);
        tfKeresztNev.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String vez = tfVezetekNev.getText();
        String ker = tfKeresztNev.getText();
        tfTeljesNev.setText(vez + " " + ker);
        try {
            lbMonogram.setText(vez.charAt(0) + ". " + ker.charAt(0) + ".");
        } catch (StringIndexOutOfBoundsException ex) {
            lbMonogram.setText("");
        }
    }
}
