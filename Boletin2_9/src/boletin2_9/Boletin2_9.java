package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin2_9 {

    public static void main(String[] args) {
       long b100,b20,b5,b1;double euros;
       b100=Long.parseLong(JOptionPane.showInputDialog("Billetes de 100€ "));
       b20=Long.parseLong(JOptionPane.showInputDialog("Billetes de 20€ "));
       b5=Long.parseLong(JOptionPane.showInputDialog("Billetes de 5€ "));
       b1=Long.parseLong(JOptionPane.showInputDialog("Monedas de 1€" ));
       euros=b1+b100*100+b20*20+b5*5;
       JOptionPane.showMessageDialog(null,"La cantidad es = "+euros+"€");
    }
    
}
