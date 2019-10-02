/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacasadosiclos;
import java.util.Scanner;
/**
 *
 * @author Agustin
 */
public class PracticaCasaDoSiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese edad");
        int promedio = 0;
        int edad = sc.nextInt();

        do {
            System.out.println("el promedio es" + promedio);
            promedio = edad + promedio;
        } while (promedio < 25);
    }
    
}
