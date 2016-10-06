package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin2_10 {

    public static void main(String[] args) {
        double euros;int b100,b20,b5,b1;
        euros=Double.parseDouble(JOptionPane.showInputDialog("Cantidad de euros "));
        b100=(int) (euros/100);b20=(int) ((euros%100)/20);b5=(int) ((euros%100%20)/5);b1=(int) (euros%100%20%5);
        JOptionPane.showMessageDialog(null,"Numero de billetes de 100 ="+b100+"\nNumero de billetes de 20 ="+b20+"\nNumero de billetes de 5 ="+b5+"\nNumero de monedas de 1 ="+b1);
    }
    
}
