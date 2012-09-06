/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class FenyujsagFrame extends JFrame {

    private Container cp = getContentPane();

    public FenyujsagFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp.add(new SimpleFenyujsag("Ez a fényújság nagyon lassú, "
                + "és nem is állítható. Mindenesetre egyszerű.", 100, Color.GREEN),"North");
        
        cp.add(new AdvancedFenyujsag("Ez a fényújság nagyon lassú, "
                + "és nem is állítható. Mindenesetre egyszerű.", 100, Color.BLUE),"Center" );
        
        pack();
        setVisible(true);
    }
}
