package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin2_9 {

    public static void main(String[] args) {
       float b100,b20,b5,b1,euros;
       b100=Float.parseFloat(JOptionPane.showInputDialog("Billetes de 100€ "));
       b20=Float.parseFloat(JOptionPane.showInputDialog("Billetes de 20€ "));
       b5=Float.parseFloat(JOptionPane.showInputDialog("Billetes de 5€ "));
       b1=Float.parseFloat(JOptionPane.showInputDialog("Monedas de 1€" ));
       euros=b1+b100*100+b20*20+b5*5;
       JOptionPane.showMessageDialog(null,"La cantidad es = "+euros+"€");
    }
    
}
