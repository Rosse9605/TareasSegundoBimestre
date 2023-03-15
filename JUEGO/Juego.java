
package JUEGO;

import java.util.Scanner;


public class Juego {
      Scanner entrada = new Scanner (System.in);
    // atributos 
    private Dado [] dados = new Dado[5];
    private Jugador [] jugadores;// = new Jugador[?];
    int num;
    String nom;
    
       
    //metodos 
      void menu(){
          inicializaciones();
          registarJugadores();
          jugar();
          mostar();
     }
     void inicializaciones(){
         //inicializacion de los dados 
         for(int i=0;i<dados.length;i++){
          dados [i]= new Dado(1,true); 
          
         }
        // inicializacion de los jugadores
  
         System.out.println("Cuantos jugadores quiere?");
         num = entrada.nextInt(); 
         // inicializar el arreglo  jugadores 
         jugadores = new Jugador[num];
    }
     void registarJugadores(){
          for(int i=0;i<jugadores.length;i++){
             System.out.println("Ingrese el nombre jugador:");
             nom = entrada.next();
             jugadores [i]= new Jugador(nom,0);  
             // System.out.println(jugadores[i]);
         }
        
      
     }
     void jugar(){
         primerlanzamiento();
         segundolanzamiento();
         puntaje(); 
        
     }
    void mostar(){
        System.out.println("");
    }
    void primerlanzamiento(){
           int[] intento= new int[5];
           intento[0]=(int)(Math.random()*6+1);
           intento[1]=(int)(Math.random()*6+1);
           intento[2]=(int)(Math.random()*6+1);
           intento[3]=(int)(Math.random()*6+1);
           intento[4]=(int)(Math.random()*6+1);
           for(int i=0;i<intento.length;i++){
               System.out.print(intento[i]+ "  ");
           }
           System.out.println("\n");
    }
    void segundolanzamiento(){
        
        for(int j=0;j<nom.length();j++){
            
            int[] intento= new int[5];
           intento[0]=(int)(Math.random()*6+1);
           intento[1]=(int)(Math.random()*6+1);
           intento[2]=(int)(Math.random()*6+1);
           intento[3]=(int)(Math.random()*6+1);
           intento[4]=(int)(Math.random()*6+1);
           for(int i=0;i<intento.length;i++){
              System.out.print(intento[i]+"  ");
           }
           System.out.println("\n");
        }
        
           
    }
   /* void tercerlanzamiento(){
        int[] intento= new int[5];
           intento[0]=(int)(Math.random()*6+1);
           intento[1]=(int)(Math.random()*6+1);
           intento[2]=(int)(Math.random()*6+1);
           intento[3]=(int)(Math.random()*6+1);
           intento[4]=(int)(Math.random()*6+1);
    }
    void cuartolanzamiento(){
        int[] intento= new int[5];
           intento[0]=(int)(Math.random()*6+1);
           intento[1]=(int)(Math.random()*6+1);
           intento[2]=(int)(Math.random()*6+1);
           intento[3]=(int)(Math.random()*6+1);
           intento[4]=(int)(Math.random()*6+1);
    }
    void quintolanzamiento(){
        int[] intento= new int[5];
           intento[0]=(int)(Math.random()*6+1);
           intento[1]=(int)(Math.random()*6+1);
           intento[2]=(int)(Math.random()*6+1);
           intento[3]=(int)(Math.random()*6+1);
           intento[4]=(int)(Math.random()*6+1);
    }*/
    void puntaje(){
        
               /* int[] dados = lanzamiento();
                System.out.printf("Dado1:  %d\tDado2:  %d\tDado3: %d\tDado4: %d\tDados5: ", dados[0], dados[1], dados[2], dados[3], dados[4]);
               
                if (dados[0] == dados[1] && dados[1] == dados[2] && dados[2] == dados[3] && dados[3]==dados[4]) {
                    System.out.println("\nHa ganado el Jugador " + jugadores[j]);
                    hayGanador = true; 
                } else { 
                    intento[j][i] = dados[0] + dados[1] + dados[2] + dados[3] + dados[4];
                }*/
                

        
    }
}
