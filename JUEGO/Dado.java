package JUEGO;

public class Dado {

    //Atributos 
    private int numero;
    private boolean volverAlanzar;
    // constructor 
   public Dado(int numero,boolean volverAlanzar){
       this.numero = numero;
       this.volverAlanzar = volverAlanzar; 
   }
       //proteger la cuenta get y set 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVolverAlanzar() {
        return volverAlanzar;
    }

    public void setVolverAlanzar(boolean volverAlanzar) {
        this.volverAlanzar = volverAlanzar;
    }
   // Metodo 
    public void mostar(){
        System.out.println(numero+"");
    }
}
