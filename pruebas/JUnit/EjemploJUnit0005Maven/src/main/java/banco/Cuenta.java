/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author jose maria
 */
class Cuenta {

    double saldo;

    void ingresar(double d) {
        saldo += d;
    }

    double balance() {
        return saldo;
    }
}
