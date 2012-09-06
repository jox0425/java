/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Gyarmati János
 */
public class Olvasmanyok extends JFrame
        implements ActionListener, ListSelectionListener {

    private JLabel lbCimke;
    private DefaultListModel olvasottModel, olvasandoModel;
    private JList lsOlvasando, lsOlvasott;
    private JTextField tfInputOlvasando;
    private JButton btAthelyez;
    private Container cp = getContentPane();

    public Olvasmanyok() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //adding gui elements
        JPanel pnLists = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
        pnLists.add(lbCimke = new JLabel("Olvasandó:"));
        pnLists.add(lsOlvasando = new JList(olvasandoModel = new DefaultListModel()), "East");
        pnLists.add(btAthelyez = new JButton("->"), "Center");
        pnLists.add(lbCimke = new JLabel("Olvasott:"));
        pnLists.add(lsOlvasott = new JList(olvasottModel = new DefaultListModel()), "West");
        cp.add(pnLists, "North");

        JPanel pnControl = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
        pnControl.add(lbCimke = new JLabel("Hozzáadás:"));
        pnControl.add(tfInputOlvasando = new JTextField(20));
        cp.add(pnControl);

        //adding listeners
        btAthelyez.addActionListener(this);
        lsOlvasando.addListSelectionListener(this);
        lsOlvasott.addListSelectionListener(this);
        tfInputOlvasando.addActionListener(this);
        
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(tfInputOlvasando)) {
            try {
                olvasandoModel.add(0, tfInputOlvasando.getText());
                tfInputOlvasando.setText(null);
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }else if(e.getSource().equals(btAthelyez)){
            try{
                olvasottModel.add(lsOlvasando.getSelectedIndex(), lsOlvasando.getSelectedValue());
                olvasandoModel.remove(lsOlvasando.getSelectedIndex());
            }
            catch(Exception ex){
                System.out.println("Hiba "+ex.getMessage());
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {       
    }
}
