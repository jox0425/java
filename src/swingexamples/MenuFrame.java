/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Gyarmati János
 */
class MenuFrame extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenuItem miFelvitelFiuk;
    JMenuItem miLista1, miLista2;
    JCheckBoxMenuItem cmiNyomtatora;
    JMenuItem miHasznalat, miNevjegy;

    public MenuFrame(String title) {
        super(title);
        setBounds(400, 200, 250, 120);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Menü
        setJMenuBar(mb = new JMenuBar());
        JMenu mFelvitel = new JMenu("Felvitel");
        mb.add(mFelvitel);
        JMenu mFelvitelHallgatok = new JMenu("Hallgatók");
        mFelvitel.add(mFelvitelHallgatok);
        mFelvitel.add(new JMenu("Tanárok"));
        mFelvitelHallgatok.add(miFelvitelFiuk = new JMenuItem("Fiúk", 'F'));
        mFelvitelHallgatok.add(new JMenuItem("Lányok", 'L'));

        JMenu mLista = new JMenu("Lista");
        mb.add(mLista);
        mLista.add(miLista1 = new JMenuItem("Lista1"));
        mLista.add(miLista2 = new JMenuItem("Lista2"));
        mLista.addSeparator();
        mLista.add(cmiNyomtatora = new JCheckBoxMenuItem("Nyomtatóra"));

        JMenu mSugo;
        mb.add(mSugo = new JMenu("Súgó"));
        mSugo.add(miHasznalat = new JMenuItem("Használat"));
        mSugo.add(miNevjegy = new JMenuItem("Névjegy"));

        miFelvitelFiuk.addActionListener(this);
        miLista1.addActionListener(this);
        miLista2.addActionListener(this);
        cmiNyomtatora.addActionListener(this);

        setVisible(true);

    }

    public void lista1() {
        JFrame frList = new JFrame("Lista1");
        frList.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frList.setLocation(getX() + 10, getY() + 10);
        frList.setSize(200, 100);
        frList.setVisible(true);
    }

    public void lista2() {
        JFrame frList = new JFrame("Lista2");
        frList.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frList.setLocation(getX() + 50, getY() + 10);
        frList.setSize(300, 50);
        frList.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(miLista1)) {
            lista1();
        } else if (e.getSource().equals(miLista2)) {
            lista2();
        } else if (e.getSource().equals(miFelvitelFiuk)) {
            System.out.println("Fiúk felvitele");
        } else if (e.getSource().equals(cmiNyomtatora)) {
            if (cmiNyomtatora.getState()) {
                System.out.println("Nyomtatóra");
            } else {
                System.out.println("Nem nyomtatóra");
            }
        }
    }
}
