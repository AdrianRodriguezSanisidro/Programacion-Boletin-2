package boletin2_2;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_2 {

    public static void main(String[] args) {
       float lado ;float area;//Pongo las variables
       lado= Float.parseFloat(JOptionPane.showInputDialog("lado "));
       area=lado*lado;//Pongo la formula del area del cuadrado
       JOptionPane.showMessageDialog(null,"A area ="+ area);
    
    }
    
}
