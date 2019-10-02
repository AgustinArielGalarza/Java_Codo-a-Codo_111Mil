package practicandofucionesn1;

import java.util.Scanner;

public class PracticandoFucionesN1 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la figura triangulo, circulo o cuadrado :");
        String figura = sc.nextLine();
        
        switch (figura) {
            case "triangulo":
                ProcedimientoT(sc);
                break;
            case "circulo":
                 ProcedimientoC(sc);
                 break;
            case "cuadrado":
                ProcedimientoCu(sc);
                break;
            default:
                System.out.println("Escriba la figura");
               
        }
    
        
        
        
    }
     public static void ProcedimientoT(Scanner sc){
         System.out.println("ingrese base");
         int base = sc.nextInt();
         System.out.println("ingrese altura");
         int altura = sc.nextInt();
         if(base == 0 || altura == 0){
             System.out.println("intentelo nuevamente");
         }
         else{
         
         int area = CalcularAreaT (base, altura);
         System.out.println("su area es :"+area);
         }
         
    }
     public static void ProcedimientoC (Scanner sc){
         System.out.println("ingrese radio :");
         double radio = sc.nextDouble();
         double Pi = 3.14;
         
         if(radio == 0){
             System.out.println("intentelo nuevamente");
         }
         else{
             double area = CalcularAreaC (radio, Pi);
             System.out.println("el area es "+area);
         }
   }
     public static void ProcedimientoCu (Scanner sc){
         System.out.println("ingrese un lado :");
         int lado1 = sc.nextInt();
         System.out.println("ingrese otro lado :");
         int lado2 = sc.nextInt();
         int area = CalcularAreaCu (lado1, lado2);
         System.out.println("su area es :"+area);
}
     
     
     
     
     
     
     
     public static int CalcularAreaT (int base, int altura){
          int area = (base* altura)/2;
          return area;
     }
     public static double CalcularAreaC (double radio, double Pi){
         double area = (radio*radio)/Pi;
         return area;
     }
     public static int CalcularAreaCu (int lado1, int lado2){
         int area = lado1*lado2;
                 return area;
         
     }

}
