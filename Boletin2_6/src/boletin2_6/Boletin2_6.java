package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_6 {

    public static void main(String[] args) {
        float tarifa;float prezo;float desconto;
        tarifa=Float.parseFloat(JOptionPane.showInputDialog("Tarifa "));
        prezo=Float.parseFloat(JOptionPane.showInputDialog("Prezo "));
        desconto=100*(prezo-tarifa)/prezo;
        JOptionPane.showMessageDialog(null,"O desconto e de ="+ desconto+"%");
        
    }
    
}
