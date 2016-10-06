package boletin2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author AdrianRodriguezSanisidro
 */
public class Boletin2_1 {

    public static void main(String[] args) {
    //Escribo las variables
        float base;
    float altura;
    float area;
    //Añado la opcion de escribir los datos de la base y la altura
    base= Float.parseFloat(JOptionPane.showInputDialog("Base "));
    altura= Float.parseFloat(JOptionPane.showInputDialog("Altura "));
    area=base*altura/2; //Pongo la formula de el area del triangulo
   //Pongo la opcion de que aparezca una ventana con el resultado
    JOptionPane.showMessageDialog(null,"A area do triangulo é ="+ area);
    }
    
}
