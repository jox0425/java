/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gyarmati János
 */
public class NevjegyDialog extends JDialog implements ActionListener{
    private Container cp = getContentPane();
    JButton btOk;
    
    NevjegyDialog(JFrame owner){
        super(owner,"Névjegy",true);
        setLocation(getParent().getX()+60, getParent().getY()+40);
        setResizable(false);
        cp.setBackground(SystemColor.controlHighlight);
        cp.setLayout(new GridLayout(3,1));
        cp.add(new JLabel("Tulajdonos: Okos Tóbiás",JLabel.CENTER));
        cp.add(new JLabel("Minden jog fenntartva",JLabel.CENTER));
        JPanel pnOk = new JPanel();
        pnOk.add(btOk = new JButton("OK"));
        btOk.addActionListener(this);
        cp.add(pnOk);
        pack();
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
    
}
