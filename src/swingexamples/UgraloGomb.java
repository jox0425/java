/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gyarmati János
 */
public class UgraloGomb extends JFrame implements ActionListener{
    private JButton btKapjel;
    private Container cp = getContentPane();
    private Timer timer;
    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    private int szamlalo = 0;
    public UgraloGomb(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(d.width,d.height);
        JPanel pnField = new JPanel();
        pnField.setSize(d);
        pnField.add(btKapjel = new JButton("Kapj el!"));
        cp.add(pnField);       
        btKapjel.addActionListener(this);
        
        timer = new Timer(800, this);
        timer.start();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)){
            szamlalo++;
            double randomWidth = Math.random()*d.width;
            double randomHeight = Math.random()*d.height;
            btKapjel.setLocation((int)randomWidth, (int)randomHeight);
        }else if(e.getSource().equals(btKapjel)){
            timer.stop();
            btKapjel.setText("Jaj! "+ szamlalo);
            setTitle("Elkaptalak!");
        }
    }
}
