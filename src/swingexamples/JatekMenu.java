/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

/**
 *
 * @author Gyarmati János
 */
public class JatekMenu extends JFrame {

    private JMenuBar mbMenuBar;
    private JMenu mSugo = new JMenu("Súgó");
    private JMenu mJatek = new JMenu("Játék");
    private Container cp = getContentPane();

    public JatekMenu() {
        JRadioButton rbKezd, rbHalad, rbProfi;
        ButtonGroup bgLevel = new ButtonGroup();
        bgLevel.add(rbKezd = new JRadioButton("Kezdő"));
        bgLevel.add(rbHalad = new JRadioButton("Haladó"));
        bgLevel.add(rbProfi = new JRadioButton("Profi"));
        setJMenuBar(mbMenuBar = new JMenuBar());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        mJatek.add(new JMenuItem("Új játék"));
        mJatek.addSeparator();
        mJatek.add(rbKezd);
        mJatek.add(rbHalad);
        mJatek.add(rbProfi);
        mJatek.add(new JMenuItem("Kilépés"));
        
        mSugo.add(new JMenuItem("Tartalom"));
        mSugo.add(new JMenuItem("Témakörök..."));
        mSugo.add(new JMenuItem("A nap tippje"));
        mSugo.addSeparator();
        mSugo.add(new JMenuItem("Névjegy"));
        
        mbMenuBar.add(mJatek);
        mbMenuBar.add(mSugo);
              
        setBounds(100, 100, 200, 300);
        setVisible(true);
    }
}
