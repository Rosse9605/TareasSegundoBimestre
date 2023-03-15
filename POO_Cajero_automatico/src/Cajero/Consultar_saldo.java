package Cajero;
/**
 *
 * @author David_Acaro
 */
import java.util.Scanner;
public class Consultar_saldo extends Cuenta{
    Scanner scn =new Scanner(System.in);
    //Metodos
    @Override
    public void mostrar(){
        System.out.println("Su Saldo Actual es de: "+getSaldo()+"\n========================");
    }
}
