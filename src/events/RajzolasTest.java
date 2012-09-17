/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class RajzolasTest extends JFrame implements ActionListener {

    JButton btTorol, btRajzoloSzin;
    Rajzolas rajzlap;
    Color[] colors = new Color[]{Color.BLACK, Color.WHITE, Color.RED,
        Color.PINK, Color.ORANGE, Color.MAGENTA, Color.BLUE};
    int rajzoloSzin = 0;

    public RajzolasTest() {
        setTitle("Rajzolás");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //törlés és színállítás gombok:
        JPanel pn = new JPanel();
        pn.add(btTorol = new JButton("Töröl"));
        pn.add(new JLabel("Rajzolószín", JLabel.RIGHT));
        pn.add(btRajzoloSzin = new JButton(""));
        btRajzoloSzin.setBackground(colors[rajzoloSzin]);

        getContentPane().add(pn, "North");

        //rajzolóterület:
        getContentPane().add(rajzlap = new Rajzolas(), "Center");
        rajzlap.setBackground(Color.LIGHT_GRAY);
        rajzlap.setColor(colors[rajzoloSzin]);

        btRajzoloSzin.addActionListener(this);
        btTorol.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btTorol)) {
            rajzlap.clear();
        } else if (e.getSource().equals(btRajzoloSzin)) {
            if (rajzoloSzin < colors.length - 1) {
                rajzoloSzin++;
            } else {
                rajzoloSzin = 0;
            }
            btRajzoloSzin.setBackground(colors[rajzoloSzin]);
            rajzlap.setColor(colors[rajzoloSzin]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        RajzolasTest rt = new RajzolasTest();
    }
}
