package Cajero;
/**
 *
 * @author David_Acaro
 */
import java.util.Scanner;
public class Retiro extends Cuenta{
    Scanner scn =new Scanner(System.in);
    //Atributos
    int aux;
    double s_aux;
    int in=0;
    //Metodos
    @Override
    public void calcular(){
        while(in==0){
            System.out.println("Cuanto desea retirar?");
            s_aux = scn.nextInt();
            if(getSaldo()==0){
                System.out.println("Su cuenta no posee dinero");
                in =1;
            } else{
                if(s_aux>getSaldo()){
                System.out.println("Saldo insuficiente, solo puede retirar "+getSaldo());
            }else{
                setSaldo(getSaldo()-s_aux);
                System.out.println("Usted retiro "+s_aux);
                in=1;}
            }
        }
        in=0;
    }
    @Override
    public void mostrar() {
        System.out.println("Su saldo xd actual es de "+getSaldo());
    }
}