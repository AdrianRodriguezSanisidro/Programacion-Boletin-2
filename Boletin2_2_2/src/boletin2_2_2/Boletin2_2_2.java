
package boletin2_2_2 ;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_2_2 {

    public static void main(String[] args) {
       float lado ;float area;//Pongo las variables
       lado= Float.parseFloat(JOptionPane.showInputDialog("lado "));
       area=(float) Math.pow(lado,2);//Uso de la libreria Math para laformula
       JOptionPane.showMessageDialog(null,"A area ="+ area);
    
    } 
}
