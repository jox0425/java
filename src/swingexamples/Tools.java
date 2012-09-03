/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class Tools extends JPanel implements ActionListener {

    private JLabel lbSzoveg = new JLabel("Mintaszöveg");
    private JTextField tfSzoveg;
    private JComboBox cbBetuTipus, cbBetuMeret, cbBetuStilus,
            cbSzovegSzin, cbSzovegIgazitas;
    final Color[] colorArray = new Color[]{Color.BLACK, Color.WHITE, Color.RED,
        Color.MAGENTA, Color.ORANGE};
    final String[] namedColorArray = new String[]{"Fekete", "Fehér", "Piros",
        "Magenta", "Narancs"};
    final Integer[] alignArray = new Integer[]{JLabel.LEFT, JLabel.CENTER, JLabel.RIGHT};
    final String[] namedAlignArray = new String[]{"Balra", "Középre", "Jobbra"};
    final Integer[] styleArray = new Integer[]{Font.BOLD, Font.ITALIC};
    final String[] namedStyleArray = new String[]{"Félkövér", "Dőlt"};
    final String[] typeArray = new String[]{Font.SERIF, Font.MONOSPACED, Font.SANS_SERIF};
    final static Integer[] sizeArray = new Integer[21];

    public Tools() {
        initSizeArray();
        setLayout(new BorderLayout());
        
        JPanel p = new JPanel();
        p.add(tfSzoveg = new JTextField("Mintaszöveg"));
        p.add(cbBetuTipus = new JComboBox(typeArray));
        p.add(cbBetuMeret = new JComboBox(sizeArray));
        p.add(cbBetuStilus = new JComboBox(namedStyleArray));
        p.add(cbSzovegSzin = new JComboBox(namedColorArray));
        p.add(cbSzovegIgazitas = new JComboBox(namedAlignArray));
        add(p);
        
        tfSzoveg.addActionListener(this);
        cbBetuTipus.addActionListener(this);
        cbBetuMeret.addActionListener(this);
        cbBetuStilus.addActionListener(this);
        cbSzovegSzin.addActionListener(this);
        cbSzovegIgazitas.addActionListener(this);
        
        add(lbSzoveg,"South");    
        setVisible(true);
    }

    static void initSizeArray() {
        for (Integer i = 10, j = 0; i <= 50; i += 2, j++) {
            sizeArray[j] = i;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font f = new Font(typeArray[cbBetuTipus.getSelectedIndex()],styleArray[cbBetuStilus.getSelectedIndex()], sizeArray[cbBetuMeret.getSelectedIndex()]);
        String s = tfSzoveg.getText();
        lbSzoveg.setText(s);
        lbSzoveg.setFont(f);
        lbSzoveg.setHorizontalAlignment(alignArray[cbSzovegIgazitas.getSelectedIndex()]);
        lbSzoveg.setForeground(colorArray[cbSzovegSzin.getSelectedIndex()]);          
    }
}
