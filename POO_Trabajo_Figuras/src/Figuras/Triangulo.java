package Figuras;
import java.util.Scanner;
/**
 *
 * @author David_Acaro
 */
public class Triangulo extends Figura{
   Scanner scn =new Scanner(System.in);
    protected double altura;
    protected double ancho;
    //Getters y Setters
    public double getAltura(){
        return altura;
    }
    public double getAncho(){
        return ancho;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    //Metodos
    @Override
    public void CalcularArea(){
        System.out.println("Ingrese la altura del triangulo: ");
        altura = scn.nextInt();
        System.out.println("Ingrese el ancho del triangulo: ");
        ancho = scn.nextInt();
        System.out.println("El area del Triangulo es de: "+(ancho*altura)/2);
    }
}
