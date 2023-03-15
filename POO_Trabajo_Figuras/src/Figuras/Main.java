package Figuras;
/**
 *
 * @author David_Acaro
 */
public class Main {
    public static void main(String args[]){
        //crear objetos
        Figura rec = new Rectangulo();
        Figura tri = new Triangulo();
        Figura cir = new Circunferencia();
        
        //Llamr metodos
        System.out.println("=========================\n");
        rec.CalcularArea();
        System.out.println("\n=========================\n");
        tri.CalcularArea();
        System.out.println("\n=========================\n");
        cir.CalcularArea();
        System.out.println("\n=========================");
    }
}
