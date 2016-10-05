package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin2_8 {

    public static void main(String[] args) {
     float gradosC,gradosF,gradosK;
     gradosC=Float.parseFloat(JOptionPane.showInputDialog("Grados centigrados"));
     gradosF=gradosC+32;
     gradosK=gradosC+273.15f;
     JOptionPane.showMessageDialog(null,"Grados Fahrenheit ="+ gradosF+"\nGrados Kelvin ="+ gradosK);
     
    }
    
}
