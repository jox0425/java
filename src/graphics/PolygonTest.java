/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gyarmati János
 */
public class PolygonTest extends JFrame {

    public PolygonTest(int n, int radius) {
        setBounds(500, 200, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new PolygonPanel(n, radius));
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int n = Integer.parseInt(args[0]);
            int radius = Integer.parseInt(args[1]);
            PolygonTest pt = new PolygonTest(n, radius);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A program használata: \nPolygonTest n radius."
                    + "\n\nPéldául : PolygonTest 5 100",
                    "Nincs programparaméter!",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
