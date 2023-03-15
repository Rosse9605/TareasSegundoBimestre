package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Helicoptero extends Aereo{
    //Constructor
    public Helicoptero(String Marca, String nombre) {
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