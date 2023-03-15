package Cajero;
/**
 *
 * @author David_Acaro
 */
import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        int var = 0;
        int aux;
        Scanner scn =new Scanner(System.in);
        
        Cuenta infc = new Consultar_saldo();
        Cuenta infd = new Deposito();
        Cuenta infr = new Retiro();
        //Contrasena
        System.out.println("Ingrese su Contrasena");
        aux = scn.nextInt();
        if(aux==infc.getPassword()){
            //Seleccion de metodos
            while(var!=4){
                infc.setSaldo(infd.getSaldo());
                infc.setSaldo(infr.getSaldo());
                System.out.print("""
                    Ingrese una opcion
                      1.Consultar Saldo
                      2.Depositar
                      3.Retirar
                      4.Salir 
                    ========================
                    """);
                var = scn.nextInt();
                switch(var){
                case 1 -> infc.mostrar();
                case 2 -> {
                    infd.calcular();
                    infd.mostrar();
                    infr.setSaldo(infd.getSaldo());
                    infc.setSaldo(infd.getSaldo());
                    }
                case 3 -> {
                    infr.calcular();
                    infr.mostrar();
                    infd.setSaldo(infr.getSaldo());
                    infc.setSaldo(infr.getSaldo());
                    }
                case 4 -> var=4;
                default -> System.out.println("\nError\n");
                }
                if(var==4){
                    System.out.println("Salio del Sistema");
                }
            }
        }else{
            System.out.println("Contrasena Incorrecta");
        }
    }
}
