/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class Muveletek extends JFrame implements ActionListener {

    private JTextField balSzam, jobbSzam, eredmeny;
    private JComboBox cbMuvelet;
    private Container cp = getContentPane();
    private String[] muveletek = new String[]{"+", "-", "/", "*"};

    public Muveletek() {
        setTitle("Műveletek");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width / 2, screenSize.height / 2);
        setLocation((screenSize.width - getSize().width) / 2, (screenSize.height - getSize().height) / 2);
        cp.add(balSzam = new JTextField(5));
        cp.add(cbMuvelet = new JComboBox(muveletek));
        cp.add(jobbSzam = new JTextField(5));
        cp.add(new JLabel(" = "));
        cp.add(eredmeny = new JTextField(10));
        eredmeny.setEditable(false);
        
        balSzam.addActionListener(this);
        jobbSzam.addActionListener(this);
        cbMuvelet.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int bal = Integer.parseInt(balSzam.getText());
            int jobb = Integer.parseInt(jobbSzam.getText());
            int muv = cbMuvelet.getSelectedIndex();
            int ered = 0;
            switch (muv) {
                case 0:
                    ered = bal + jobb;
                    break;
                case 1:
                    ered = bal - jobb;
                    break;
                case 2:
                    if (jobb == 0) {
                        throw new ArithmeticException("Nullával nem osztunk!");
                    }
                    ered = bal / jobb;
                    break;
                case 3:
                    ered = bal * jobb;
                    break;
            }
            eredmeny.setText(Integer.toString(ered));
        } catch (NumberFormatException | ArithmeticException ex) {
            eredmeny.setText("Hiba!" + ex.getMessage());
        }
    }
}
