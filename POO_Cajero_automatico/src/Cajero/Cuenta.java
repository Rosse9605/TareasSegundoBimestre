package Cajero;
/**
 *
 * @author David_Acaro
 */
public abstract class Cuenta {
    
    protected double saldo=50;
    protected int password = 1234;

    public int getPassword() {
        return password;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void calcular(){
    }
    public abstract void mostrar();
    
}
