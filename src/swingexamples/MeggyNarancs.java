/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class MeggyNarancs extends JFrame implements ActionListener{

    private JTextField tfGyumolcs;
    private JButton btMeggy,btNarancs;
    
    public MeggyNarancs(){
        setTitle("Gyümölcsök");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(tfGyumolcs = new JTextField(10));
        tfGyumolcs.setEditable(false);
        
        cp.add(btMeggy = new JButton("Meggy"));
        btMeggy.setBackground(Color.red);
        
        cp.add(btNarancs = new JButton("Narancs"));
        btNarancs.setBackground(Color.orange);
        btNarancs.setSelected(true);
        
        btMeggy.addActionListener(this);
        btNarancs.addActionListener(this);
        
        pack();
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton gyumolcs = (JButton)e.getSource();
        String gyum = gyumolcs.getText();
        tfGyumolcs.setText(gyum);
    }
    
}
