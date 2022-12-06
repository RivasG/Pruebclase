
package Método;

import javax.swing.JOptionPane;

public class vocales {
    
    void contarvolcales() {
    String palabra;
    int contador = 0;
    palabra=JOptionPane.showInputDialog("Digigite la frase");
        for(int i=0;i<palabra.length();i++) {
 if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')){ 
    contador++;
    }
 }
    JOptionPane.showMessageDialog(null,"La frase " +palabra 
            + "\n tiene " + contador + " vocales");
    }
    public static void main(String[] args) {
        vocales imprimir=new vocales();
        imprimir.contarvolcales();
    }
}
