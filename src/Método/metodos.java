package Método;

import java.util.ArrayList;
import java.util.Scanner;

public class metodos {

    Scanner entrada = new Scanner(System.in);
    int i, limite, numero, j;
    String palabra;
    int contador = 0;
    //uso del ciclo for
    //crear metodo

    public void ciclofor() {
        for (i = 0; i <= 10; i++) { //todo ciclo tiene un inicio;un final,un incremento
            System.out.println("Los numeros del ciclo son :" + i);
        } //cierra for
    }//cierra el metodo

    public void ciclowhile() {
        i = 0; //inicio
        while (i <= 10) { //limite
            i++; //incremento
            System.out.println("Los numeros del ciclo while son :" + i);
        } //el cierra el ciclo
    } //cierra le metodo

    public void ciclodowhile() {
        i = 0; //iniico
        do {
            i++;//incremento
            System.out.println("Los numeros del ciclo do while " + i);

        } while (i != 10); //limite
    } //cierra el metodo

    public void condicional() {
        System.out.println("Digite el limite");
        limite = entrada.nextInt();
        for (i = 0; i <= limite; i++) {
            numero = (int) Math.floor(Math.random() * 100);
            if (numero % 2 == 0) {
                System.out.println(i + ") El numero es par " + numero);
            } else {
                System.out.println(i + ") El numero es impar " + numero);
            }
        }
    } //cierar metodo

    public void arreglos() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Carro");
        array.add("Computadora");
        array.add("Telefono");
        array.add("Televisor");
        array.add("Licuadora");
        for (String item : array) {
            System.out.println(item);
        } //cierra el ciclo
    } //cierra el metodo

    public void arreglonumero() {
        int[] array = new int[10];
        for (i = 0; i < 10; i++) {
            array[i] = (int) Math.floor(Math.random() * 200);
            System.out.println(i + 1 + ") " + array[i]);
        }
    } //cierra metodo

    public void matriz() {
        int[][] matriz = new int[4][4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 9);
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
    } //cierra el metodo
    public void tablamultiplicar() {
        System.out.println("Digite el limite");
        limite = entrada.nextInt();
        System.out.println("Ingrese la tabla a multiplicar");
        numero = entrada.nextInt();
        for (i = 1; i <= limite; i+=2) {
      
            System.out.println(numero+"*"+i+"="+numero*i);
        
            }

    } //cierra el ciclo
    void contarvolcales() {
        System.out.println("Digite la palabra que desea ");
        palabra=entrada.next();
        for(int i=0;i<palabra.length();i++) {
 if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')){ 
    contador++;
    }
 }
    System.out.println("La palabra " +palabra + " tiene " + contador + " vocales");
    
    
    }
} //cierra la clase
