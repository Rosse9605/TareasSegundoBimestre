package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Aereo extends Transporte{
    //Atributos
    protected String movilizacion = "Aire";
    protected String Marca;
    
    //Constructor
    public Aereo(String Marca, String nombre) {
        super(nombre);
        this.Marca = Marca;
    }

    //Getters y Setters
    public String getMovilizacion() {
        return movilizacion;
    }
    public void setMovilizacion(String movilizacion) {
        this.movilizacion = movilizacion;
    }
    
    //Metodos
    @Override
    public void Movilizar(){
    }
}