package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Terrestre extends Transporte{
    //Atributos
    protected String movilizacion = "Tierra";
    
    //Constructor
    public Terrestre(String nombre) {
        super(nombre);
    }
    
    //Getters y Setters
    public String getMovilizar() {
        return movilizacion;
    }
    
    public void setMovilizar(String movilizar) {
        this.movilizacion = movilizar;
    }
    
    //Metodos
    @Override
    public void Movilizar(){
    }
}