/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jox
 */
public class Mondat extends JFrame implements ActionListener{
    private Container cp = getContentPane();
    private String[] keresztnevek = new String[]{"András","Ábel","Géza","Jenő","István","Viktor","Zoltán"};
    private String[] igek = new String[]{"Kapálni","Játszani","Utazni","Lefeküdni","Sétálni","Repülni","Futni"};
    private JComboBox cbNevek,cbIgek;
    private JLabel lbMondat;
    public Mondat(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mondat varázsló");
        setLocation(200, 200);
        setSize(300, 300);
        cp.setLayout(new FlowLayout());
        cp.add(cbNevek = new JComboBox(keresztnevek));
        cp.add(cbIgek = new JComboBox(igek));
        cp.add(lbMondat = new JLabel(" ",JLabel.CENTER));
        
        cbNevek.addActionListener(this);
        cbIgek.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder mondat = new StringBuilder();
        mondat.append(cbNevek.getSelectedItem());
        mondat.append("! Menj el szépen ");
        mondat.append(cbIgek.getSelectedItem());
        mondat.append("!");
        lbMondat.setText(mondat.toString());
    }
}
