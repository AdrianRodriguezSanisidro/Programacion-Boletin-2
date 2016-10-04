package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_7 {

    public static void main(String[] args) {
        float n;float i;float t;double renda;
        n=Float.parseFloat(JOptionPane.showInputDialog("Nominal "));
        i=Float.parseFloat(JOptionPane.showInputDialog("Interese anual "));
        t=Float.parseFloat(JOptionPane.showInputDialog("Numero de anos"));
        renda=n*(i*Math.pow((1+i),t))/(Math.pow((1+i),t)-1);
        JOptionPane.showMessageDialog(null,"A renda que debe pagar e de ="+ renda+"€");
    }
    
}
