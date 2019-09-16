package examen1;

import java.time.Instant;
import java.util.*;

public class Examen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        notebook not1 = new notebook("Ablee", "Pro", "HD1", 13);
        notebook not2 = new notebook("Mamung", "Z", "HD1", 13);
        DetalleOrden Do1 = new DetalleOrden(not1, 2000, 2);
        DetalleOrden Do2 = new DetalleOrden(not2, 1000, 1);
        Orden Or = new Orden(1,null);
        Or.addOrden(Do2);
        Or.addOrden(Do1);
        System.out.println("Buenas tardes a La gran Manzana. Acontinuacion le daremos el Total de la compra: ");
        Or.totalOrden(sc);
            
        }
}
    

class notebook {
    private String marca;
    private String modelo;
    private String procesador;
    private int tamamaño;
    
    public notebook (String mar, String mod, String pro , int tam){
        this.marca=mar;
        this.modelo=mod;
        this.procesador=pro;
        this.tamamaño=tam;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getTamamaño() {
        return tamamaño;
    }
    
}
class DetalleOrden {
    private notebook item;
    private int precioUnitario;
    private int cantidad;
    
    public DetalleOrden (notebook item, int Pu, int cant ){
        this.item= item;
        this.precioUnitario= Pu;
        this.cantidad= cant;
    }

    public notebook getItem() {
        return item;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
class Orden {
    private List <DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;
    
   
    public Orden (int id, Date creacion){
        this.id = id;
        this.creacion=creacion;
        items = new ArrayList <>();
    }
    public void addOrden (DetalleOrden d){
        items.add(d);
    }
    public int getNroItems (){
        return items.size();
    }
    public void setEnvio (Date e){
        this.envio=e;
    }
    public void totalOrden (Scanner sc){
        int TotalOrden = 0;
        int TotalOrden2 = 0;
        int Total = 0;
        int numero = 0;
        do{
            System.out.println("ingrese 1 para seguir o 0 para salir");
            numero = sc.nextInt();
        for (DetalleOrden To : items) {
        if (To.getItem().getMarca().equalsIgnoreCase("Abble") && To.getItem().getModelo().equalsIgnoreCase("Pro")){
            TotalOrden = To.getPrecioUnitario()*To.getCantidad();
            
        } else if (To.getItem().getMarca().equalsIgnoreCase("Mamung") && To.getItem().getModelo().equalsIgnoreCase("Z")){
            TotalOrden2 = To.getPrecioUnitario()*To.getCantidad();
            
        }
        }
        }while (numero == 0);
        Total = TotalOrden*TotalOrden2;
       
    }
}
class Clientes {
    private String nombre;
    private int dni;
    private List <Orden> ordenes;

    public Clientes (String nom, int dni){
        this.nombre= nom;
        this.dni= dni;
        ordenes = new ArrayList<Orden>();
        
    }
    public void addItems (Orden o){
        ordenes.add(o);
    }
    
}