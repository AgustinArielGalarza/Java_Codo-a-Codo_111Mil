package prueba_empleo1;

public class Prueba_Empleo1 {

    public static void main(String[] args) {
        
       producto prod = new producto();
       prod.ArrayList();

        }
    }
    

class producto implements Comparable{
    private String nombre;
    private Double cantidad;
    private int precio;
    public producto(){
        
    }
    public producto (String nom, Double cant, int pre){
        nombre=nom;
        cantidad=cant;
        precio=pre;
    }
    public String dameNombre (){
        return nombre;
        
    }
    public Double dameCantidad (){
        return cantidad;
    }
    
   public int damePrecio (){
       return precio;
   }
   class cocaCocla{
       
   }
    @Override
    public String toString(){
    return "Nombe :"+dameNombre()+" /// " + "Cantidad: "+dameCantidad()+" /// "+"Precio: "+damePrecio();
}

    @Override
    public int compareTo(Object unObjeto) {
        producto otroProd = (producto)unObjeto;
        if(this.precio<otroProd.precio){
            return -1;
        }else {
            return 1;
        }
        
    }

    public void ArrayList(){
        producto [] Prod =new producto[4];
        Prod[0] =new producto("Coca-Cola zero", 1.5, 20);
        Prod[1] =new producto("Coca-Cola", 1.5, 18);
        Prod[2] =new producto("Shampoo sedal", 500.0, 19);
        Prod[3] =new producto("Frutilla", null, 56);
        
        for(int i = 0; i<4; i++) {
            System.out.println(Prod[i].toString());
        }
     
        System.out.println("\n==============================================\n");
        
           for (int i = 0; i<4; i++) {
           if(Prod[0].compareTo(Prod[i]) < 0){
               System.out.println("producto más caro: "+Prod[i].dameNombre());
           }else if (Prod[1].compareTo(Prod[i]) > 0){
                System.out.println("Producto más barato :"+Prod[i].dameNombre());
           }
           }
        }
    
}
