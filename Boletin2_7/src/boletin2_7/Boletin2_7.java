package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_7 {

    public static void main(String[] args) {
        double n;int i;float t;double renda;
        n=Float.parseFloat(JOptionPane.showInputDialog("Nominal "));
        i=(int) Long.parseLong(JOptionPane.showInputDialog("Interese anual "));
        t=Float.parseFloat(JOptionPane.showInputDialog("Numero de anos"));
        i=i/1200;t=t*12;
        renda=n*(i*Math.pow((1+i),t))/(Math.pow((1+i),t)-1);
        JOptionPane.showMessageDialog(null,"A renda que debe pagar e de ="+ renda+"€");
    }
    
}
