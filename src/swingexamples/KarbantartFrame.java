/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Jox
 */
public class KarbantartFrame extends JFrame implements ActionListener, ListSelectionListener {
    
    DefaultListModel<Object> mdSzovegek;
    JList<Object> lstSzovegek;
    JButton btUj, btTorol, btKilep;
    JLabel lbInfo;
    
    public KarbantartFrame() {
        super("Szövegek karbantartása");
        setLocation(200, 200);
        lbInfo = new JLabel();
        
        mdSzovegek = new DefaultListModel();
        mdSzovegek.addElement("Hosszúhetény");
        mdSzovegek.addElement("Rövidkaraj");
        lstSzovegek = new JList<>(mdSzovegek);
        lstSzovegek.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstSzovegek.setSelectedIndex(0);
        lstSzovegek.addListSelectionListener(this);
        JScrollPane spSzovegek = new JScrollPane(lstSzovegek);
        
        btUj = new JButton("Új", new ImageIcon("images/insert.gif"));
        btUj.addActionListener(this);
        
        btTorol = new JButton("Törlés", new ImageIcon("images/delete.gif"));
        btTorol.addActionListener(this);
        
        btKilep = new JButton("Kilép", new ImageIcon("images/exit.gif"));
        btKilep.addActionListener(this);
        
        JPanel pnVezer = new JPanel();
        pnVezer.add(btUj);
        pnVezer.add(btTorol);
        pnVezer.add(btKilep);
        Container contentPane = getContentPane();
        contentPane.add(lbInfo, "North");
        contentPane.add(spSzovegek, "Center");
        contentPane.add(pnVezer, "South");
        pack();
        setVisible(true);
        valasztasFigyelo();        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btUj)) {
            uj();
        } else if (e.getSource().equals(btTorol)) {
            torles();
        } else if (e.getSource().equals(btKilep)) {
            System.exit(0);
        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        valasztasFigyelo();
    }
    
    private void valasztasFigyelo() {
        int index = lstSzovegek.getSelectedIndex();
        lbInfo.setText(" ");
        if (index == -1) {
            //nincs kiválasztott elem, törlés gomb tiltása
            btTorol.setEnabled(false);
        } else {
            //van kiválasztott elem, törlés gomb engedélyezése
            btTorol.setEnabled(true);
            if (index == 0) {
                lbInfo.setText("Első");
            } else if (index == mdSzovegek.getSize() - 1) {
                lbInfo.setText("Utolsó");
            }
        }
    }
    
    private void torles() {
        //kiválasztott szöveg törlése:
        int index = lstSzovegek.getSelectedIndex();
        mdSzovegek.remove(index);
        //a kiválasztás újraértékelése
        if (mdSzovegek.getSize() != 0) {
            if (index == mdSzovegek.getSize()) {
                index--;
            }
            lstSzovegek.setSelectedIndex(index);
        }
        valasztasFigyelo();
    }
    
    private void uj() {
        String szoveg = JOptionPane.showInputDialog(this, "Szöveg:");
        if (szoveg == null) {
            return;
        }
        if (szoveg.equals("")) {
            Toolkit.getDefaultToolkit().beep();
        } else {
            mdSzovegek.addElement(szoveg);
            lstSzovegek.setSelectedValue(szoveg, true);
            valasztasFigyelo();
        }
    }
}
