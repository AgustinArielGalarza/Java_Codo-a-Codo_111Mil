/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int longitud;      
         
        System.out.println("Ingrese el tamaño de array\n");
        longitud=entrada.nextInt();
        int miArray[]=new int[longitud];
        
        for(int i=0;i<miArray.length;i++){
           // int elemento;
            System.out.println("Ingrese numero en la posicion  "+i);
            miArray[i]=entrada.nextInt();
            
        }
        System.out.printf("Los elementos del arrays son:\n");
        
        for(int i=0;i<miArray.length;i++){            
            System.out.printf("\t%d",miArray[i]);  
        }
           
        System.out.printf("\n\n");
    }
}
     
        
       
      
        
        
    
    

