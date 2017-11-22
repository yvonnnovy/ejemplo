/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Administrador
 */
public class Cuenta {

    private Double balance;

    public Cuenta() {
        balance = 0.0d;
    }

    public Cuenta(Double balance) {
        checkCantidad(balance);
        this.balance = balance;
    }

    private void checkCantidad(Double cantidad) throws IllegalArgumentException {
        if (cantidad < 0.0d) {
            throw new IllegalArgumentException("La cantidad no puede ser menor que cero");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        checkCantidad(balance);
        this.balance = balance;
    }

    public void ingresar(Double importe){
        checkCantidad(importe);
        balance += importe;
    }
}
