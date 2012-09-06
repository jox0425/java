/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Gyarmati János
 */
public class OszintesegProba extends JFrame implements ActionListener {

    JMenuBar mb = new JMenuBar();
    JMenu mProba = new JMenu("Próba");
    JMenuItem miProba = new JMenuItem("Őszinteség", 'Ő');
    JMenuItem miKilep = new JMenuItem("Kilép", 'K');

    public OszintesegProba() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 50, 300, 300);
        setJMenuBar(mb);
        mb.add(mProba);
        mProba.setMnemonic('P');
        mProba.add(miProba);
        mProba.add(miKilep);
        miKilep.addActionListener(this);
        miProba.addActionListener(this);
        setVisible(true);
    }

    private double ev() {
        String evStr = "";
        double ev = 0;
        while (ev <= 0) {
            try {
                evStr = JOptionPane.showInputDialog(this, "Hány éves vagy?",
                        "Őszinteségpróba", JOptionPane.QUESTION_MESSAGE);
                if (evStr == null) {
                    return -1;
                } else {
                    ev = Double.parseDouble(evStr);
                }
            } catch (NumberFormatException ex) {
            }
            if (ev <= 0) {
                JOptionPane.showMessageDialog(this, "Pozitív számot kérek", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        return ev;
    }

    private void proba() {
        double ev = ev();
        if (ev == -1) {
            JOptionPane.showMessageDialog(this, "Talán megfutamodtál?");
            return;
        }
        if (ev < 40) {
            int option = JOptionPane.showConfirmDialog(this, "Biztos?", "", JOptionPane.YES_NO_CANCEL_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Nem hiszem", "", JOptionPane.WARNING_MESSAGE);
            }
            if (option == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Gondoltam", "Lebukás", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Te kis hamis");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Kiálltad a próbát", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean tenyleg(String message) {
        Object[] opciok = {"Igen", "Nem"};
        int valasz = JOptionPane.showOptionDialog(this, message, "", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, opciok, opciok[1]);
        return valasz == 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(miProba)) {
            proba();
        } else if (e.getSource().equals(miKilep)) {
            if (tenyleg("Biztosan ki akar lépni?")) {
                System.exit(0);
            }
        }
    }
}
