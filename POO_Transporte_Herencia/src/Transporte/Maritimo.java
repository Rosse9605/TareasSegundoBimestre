package Transporte;
/**
 *
 * @author David_Acaro
 */
public class Maritimo extends Transporte{
    //Atributos
    protected String movilizacion = "Agua";
    protected String Marca;
    
    //Constructor
    public Maritimo(String Marca, String nombre) {
        super(nombre);
        this.Marca = Marca;
    }

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