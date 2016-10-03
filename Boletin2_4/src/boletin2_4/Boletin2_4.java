package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_4 {

    public static void main(String[] args) {
       float n1;float n2;float suma;float resta;float producto;float cociente;
       n1=Float.parseFloat(JOptionPane.showInputDialog("Numero 1 "));
       n2=Float.parseFloat(JOptionPane.showInputDialog("Numero 2 "));
       suma=n1+n2;
       resta=n1-n2;
       producto=n1*n2;
       cociente=n1/n2;
       JOptionPane.showMessageDialog(null,"Suma ="+ suma+ "\nResta ="+ resta+ "\nProducto ="+ producto+ "\nCociente ="+ cociente);
    }
    
}
