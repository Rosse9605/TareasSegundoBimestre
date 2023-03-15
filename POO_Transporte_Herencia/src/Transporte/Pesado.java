package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Pesado extends Vehiculo{
    //Constructor
    public Pesado(String Marca, String nombre) {
        super(Marca, nombre);
    }
    
    //Metodos
    @Override
    public void Movilizar() {
        System.out.println(" "+getNombre()+" se Mueve en el "+movilizacion);
    }
    public void Mostrar(){
        System.out.println(" Su marca es: "+Marca);
    }
}