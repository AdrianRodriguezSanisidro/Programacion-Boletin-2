package boletin2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_3 {

    public static void main(String[] args) {
      float euros; float dolares;//escribo las variables
      euros=Float.parseFloat(JOptionPane.showInputDialog("euros "));//Pongo la opcion de introducir los datos
      dolares=(euros*1.1213f);//Pongo la formula del cambio
              JOptionPane.showMessageDialog(null,"Dolares ="+ dolares);//Pongo la opcion de que aparezca el resultado
    }
    
}
