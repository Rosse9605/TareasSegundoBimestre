
package JUEGO;


 
public class Jugador {
    //Atrivutos 
    private String nombre;
    private int puntos; 
// constructor 
    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
// para la clase este privada 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    // un meotdo para llamar al main 
    public void mostar(){
        System.out.println(nombre+ ""+puntos);
    }
    
    
}
