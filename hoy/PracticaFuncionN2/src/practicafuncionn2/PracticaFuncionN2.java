/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafuncionn2;

import java.util.Scanner;

public class PracticaFuncionN2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
        int numero = sc.nextInt();
        int factorial = procedimientoFactorial (numero);
        System.out.println("su numero "+numero+"  es factorial"+factorial);
    }
    public static int procedimientoFactorial (int numero){
        int factorial = numero;
        for (int cont =(numero - 1 );cont > 0; cont--){
            factorial = factorial*cont;
        }
        return factorial;
 }
        // mal hecho
}
