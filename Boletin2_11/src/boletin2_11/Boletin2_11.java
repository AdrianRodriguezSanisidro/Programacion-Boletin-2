package boletin2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin2_11 {

  public static void main(String[] args) {
       float soldoF,impV,km,nDesp,soldoT;//Clasifico el suedlo fijo,el importe de ventas,los km desprazados y el numero de desplazamientos
       soldoF=Float.parseFloat(JOptionPane.showInputDialog("Soldo fixo"));
       impV=Float.parseFloat(JOptionPane.showInputDialog("Importe de ventas "));
       km=Float.parseFloat(JOptionPane.showInputDialog("Km desprazados "));
       nDesp=Float.parseFloat(JOptionPane.showInputDialog("Numero de desprazamentos"));
       soldoT=((soldoF+(impV*5/100)+(2*km)+(30*nDesp))-36)*18/100;
       JOptionPane.showMessageDialog(null,"Sueldo final ="+ soldoT);
         }
    
}
