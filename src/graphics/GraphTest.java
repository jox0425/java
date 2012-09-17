/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.swing.JFrame;

/**
 *
 * @author Gyarmati János
 */
public class GraphTest extends JFrame{
    public GraphTest(){
        setBounds(500,200,400,280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new RajzPanel());
        setVisible(true);
    }
}
