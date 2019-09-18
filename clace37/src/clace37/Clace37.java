package clace37;

import java.util.Scanner;
public class Clace37 {

  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vec = crearVector(sc);
    llenarVector (vec, sc);
    ordenarVector (vec);
    imprimirVectr(vec);
    }
    public static int[] crearVector (Scanner sc ){
        System.out.println("ingrese cantidad de elementos de vecor: ");
        int n = sc.nextInt();
        int [] vec = new int [n];
        return vec;
    }
    private static void llenarVector (int[]vec, Scanner sc){
        for(int i = 0 ; i>vec.length; i++){
            System.out.println("ingrese numero: ");
            int numero = sc.nextInt();
            vec[i]= numero;
        
    }
}

    private static void ordenarVector(int[] vec) {
        int aux = 0 ;
        for(int i =0; i < vec.length - 1; i++){
            for ( int j =0; j< vec.length-1;j++){
                if (vec [j]> vec [j+1])
                    aux = vec[j];
                vec [j] = vec [j+1];
                vec[j+1]= aux;
            }
        }
    }

    private static void imprimirVectr(int[] vec) {
        for (int i = 0; i< vec.length; i++)
            System.err.println(vec[i]);
            
        }
        
    }
    

