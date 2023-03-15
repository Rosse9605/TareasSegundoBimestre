package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Main {
    public static void main(String []args){
        //Objetos
        Avion av = new Avion("Plane","Avion");
        Helicoptero hl = new Helicoptero("HightFly","Helicoptero");
        
        Pesado ps = new Pesado("Camion","Vehiculos Pesados");
        Liviano lv = new Liviano("Moto","Vehiculos Livianos");
        
        Barco br = new Barco("FERRETTI Yachts","Barco");
        
        System.out.println("===============================================");
        
        hl.Movilizar();
        hl.Mostrar();
        
        System.out.println("-----------------------------------------------");
        
        ps.Movilizar();
        ps.Mostrar();
        
        System.out.println();
        
        lv.Movilizar();
        lv.Mostrar();
        
        System.out.println("-----------------------------------------------");
        
        br.Movilizar();
        br.Mostrar();
        
        System.out.println("===============================================");
    }
}
