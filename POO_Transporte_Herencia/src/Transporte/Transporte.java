package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Transporte {
    //Atributos
    protected String nombre;
    
    //Constructor
    public Transporte(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Metodos
    public void Movilizar(){}
}
