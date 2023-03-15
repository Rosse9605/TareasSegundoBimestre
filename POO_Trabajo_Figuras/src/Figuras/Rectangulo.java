package Figuras;
import java.util.Scanner;
/**
 *
 * @author David_Acaro
 */
public class Rectangulo extends Figura{
    Scanner scn =new Scanner(System.in);
    //Atributos
    protected double largo;
    private double ancho;
    //Getters y Setters
    public double getLargo(){
        return largo;
    }
    public double getAncho(){
        return ancho;
    }
        
    public void setLargo(double largo){
        this.largo = largo;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    //Metodos
    @Override
    public void CalcularArea(){
        System.out.println("Ingrese el largo del rectangulo: ");
        largo = scn.nextInt();
       System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = scn.nextInt();
        System.out.println("El area del Rectangulo es de: "+largo*ancho);
    }
}
