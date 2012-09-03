/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jox
 */
public class Nyelvek extends JFrame{
    
    protected Container cp = getContentPane();
    protected JLabel lbText;
    
    public Nyelvek(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 300);
        setLayout(new BorderLayout());
        JPanel pnText = new JPanel();
        pnText.add(lbText = new JLabel(" ",JLabel.CENTER));
        cp.add(pnText,"North");
        
        

    }
}
