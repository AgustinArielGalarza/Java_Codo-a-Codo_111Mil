/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practican2;
import java.util.Scanner;

public class PracticaN2 {

    
    public static void main(String[] args) {
        /*
        -Mostrar numero del 1 al 100 en while
        
        System.out.println("numeros del 1 al 100");
        int i = 1;
        while (i<100){
            System.out.println(i);
            i++; 
        }*/
        
        /* Scanner sc = new Scanner(System.in);
        System.out.println("numeros del 1 al 100");
         int i = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while (i < 100); */
        
        
        Scanner sc = new Scanner(System.in);
        int flor = sc.nextInt();
        
        for(int i = 0; flor <100; i++)
            System.out.println(i);
        
        
        
    }
    
}
