package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Vehiculo extends Terrestre{
    //Atributos
    protected String Marca;
    //Constructor
    public Vehiculo(String Marca, String nombre) {
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
    public void Movilizar() {
    }
}