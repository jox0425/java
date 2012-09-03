/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Jox
 */
public class SzinekFrame extends JFrame implements ActionListener{

    private Color[] colors = new Color[]{Color.WHITE, Color.BLACK, Color.BLUE,
        Color.CYAN, Color.GRAY, Color.GREEN, Color.RED};
    private String[] szinek = new String[]{"Fehér", "Fekete", "Kék",
        "Türkiz", "Szürke", "Zöld", "Piros"};
    private JComboBox cbSzinek;
    private Container cp = getContentPane();
    public SzinekFrame(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 100, 200, 200);
        cp.setLayout(new FlowLayout());
        cp.add(cbSzinek = new JComboBox(szinek));
        cbSzinek.addActionListener(this);
        setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cp.setBackground(colors[cbSzinek.getSelectedIndex()]);
    }
}
