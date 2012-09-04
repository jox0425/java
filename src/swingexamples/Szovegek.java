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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Gyarmati János
 */
public class Szovegek extends JFrame implements ActionListener{

    private JTextArea taArea;
    private JTextField tfInputField;
    private JButton btNewLine, btExit;
    private Container cp = getContentPane();
    public Szovegek() {
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocation(300,300);
        setResizable(false);
        cp.setLayout(new BorderLayout());
        JPanel pnEditPanel = new JPanel(new BorderLayout());
        pnEditPanel.add(taArea = myArea(),"North");
        JPanel pnEditFieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnEditFieldPanel.add(new JLabel("Szöveg:"));
        pnEditFieldPanel.add(tfInputField = new JTextField(15));
        pnEditPanel.add(pnEditFieldPanel,"South");
        tfInputField.requestFocus();
        cp.add(pnEditPanel, "North");
        
        JPanel pnButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnButtonsPanel.add(btNewLine = new JButton("Új sor"));
        pnButtonsPanel.add(btExit = new JButton("Kilép"));
        cp.add(pnButtonsPanel,"South");

        tfInputField.addActionListener(this);
        btNewLine.addActionListener(this);
        btExit.addActionListener(this);
        
        pack();
        setVisible(true);
    }
    
    private JTextArea myArea(){  
        JTextArea myArea = new JTextArea(10, 20);
        myArea.setEditable(false);
        myArea.setLineWrap(true);
        myArea.setWrapStyleWord(true);      
        return myArea;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btExit)){
            System.exit(0);
        }
        if (e.getSource().equals(tfInputField)){           
            StringBuilder text = new StringBuilder(tfInputField.getText());
            text.append(" ");
            tfInputField.setText("");
            taArea.append(text.toString());
        }
        if (e.getSource().equals(btNewLine)){
            taArea.append("\n");
        }
    }
}
