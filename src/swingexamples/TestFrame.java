/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Gyarmati János
 */
public class TestFrame extends JFrame
        implements ActionListener {
    Container cp = getContentPane();
    JButton btNevjegy,btKilep;
    
    public TestFrame(){
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setBounds(300,200,300,200);
        cp.add(new JTextArea("Ha lenyomod a névjegy gombot, \n"
                + "akkor le kell nyomnod az OK-t is \nNincs mese..."));
        
        JPanel pn = new JPanel();
        pn.add(btNevjegy = new JButton("Névjegy"));
        pn.add(btKilep = new JButton("Kilép"));
        cp.add(pn,"South");
        
        btNevjegy.addActionListener(this);
        btKilep.addActionListener(this);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btNevjegy)){
            NevjegyDialog n = new NevjegyDialog(this);
        } else if (e.getSource().equals(btKilep)){
            System.exit(0);
        }
    }
}
