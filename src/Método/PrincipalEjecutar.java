
package Método;

public class PrincipalEjecutar {
    public static void main(String[] args) {
     metodos imprimir=new   metodos ();
        System.out.println("Imprimer los datos del ciclo for");
        imprimir.ciclofor();
        System.out.println("Imprimer los datos del ciclo while");
        imprimir.ciclowhile();
        System.out.println("imprimir datos cciclo do while");
        imprimir.ciclodowhile();
        System.out.println("Impirmir condicional  par impar");
        imprimir.condicional();
        System.out.println("Imprimir arreglos cadenad");
        imprimir.arreglos();
        System.out.println("Imprimuir arreglos numeros");
        imprimir.arreglonumero();
        System.out.println("Imprimir matriz");
        imprimir.matriz();
        System.out.println(" Imprimir tabla de multiplicar ");
        imprimir.tablamultiplicar();
        System.out.println("Contador de voclaes ");
        imprimir.contarvolcales();
    }
    
}
