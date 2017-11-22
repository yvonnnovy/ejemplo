/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose maria
 */
public class CuentaTest {

    private Cuenta cuenta;

    public CuentaTest() {
    }

    @Before
    public void setUp() {
        cuenta = new Cuenta();
    }

    @Test
    public void ingresoEnCuentaVacia() {
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 100.0d);
    }

    @Test
    public void ingresoEnCuentaConImporteExistente() {
        cuenta.ingresar(100.0d);
        cuenta.ingresar(100.0d);
        assertTrue(cuenta.balance() == 200.0d);
    }
}
