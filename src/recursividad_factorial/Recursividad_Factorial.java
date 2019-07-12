/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_factorial;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Recursividad_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s;

        System.out.println("Ingrese el numero a calcular");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        s = factorial(n);
        System.out.println("Total: " + s);
    }

    public static int factorial(int i) {
        int j;
        //Excepcion caso base 1
        if (i == 0) {
            return 1;
        //Caso recursivo
        } else {
            j = i * factorial(i - 1);
            return j;
        }
    }

}
