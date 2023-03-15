package Figuras;
import java.util.Scanner;
/**
 *
 * @author David_Acaro
 */
public class Circunferencia extends Figura{
    Scanner scn =new Scanner(System.in);
    private double radio;
    //Getters y Setters
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    //Metodos
    @Override
    public void CalcularArea(){
        System.out.println("Ingrese el radio del circulo: ");
        radio = scn.nextInt();
        System.out.println("La Circunferencia es de: "+Math.PI*Math.pow(radio, 2));
    }
}
