/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Jox
 */
public class ItalKeveres extends JFrame
        implements ListSelectionListener {

    private JTextField tfMix;
    private JList lsItalok;
    private DefaultListModel model = new DefaultListModel();

    public ItalKeveres() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        model.addElement("Bor");
        model.addElement("Sör");
        model.addElement("Pálinka");
        model.addElement("Cola");
        model.addElement("Narancslé");
        model.addElement("Víz");
        lsItalok = new JList(model);

        getContentPane().add(lsItalok, "North");
        getContentPane().add(tfMix = new JTextField(30), "South");

        lsItalok.addListSelectionListener(this);
        tfMix.setEditable(false);

        pack();
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        List ital = lsItalok.getSelectedValuesList();
        StringBuilder sb = new StringBuilder();
        for (Object i : ital) {
            sb.append(i).append(", ");
        }
        tfMix.setText(sb.toString());
    }
}
