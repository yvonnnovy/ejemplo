/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 *
 * @author Administrador
 */
public class CuentaTest {

    public CuentaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("En BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("En AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("En Before");
    }

    @After
    public void tearDown() {
        System.out.println("En After");
    }

    @Test
    public void testIngresoEnCuentaVacia() {
        System.out.println("testIngresoEnCuentaVacia");
        Cuenta instance = new Cuenta();
        instance.setBalance(100.0d);
        Double expResult = 100.0d;
        Double result = instance.getBalance();
        assertEquals(expResult, result);
    }

    @Test
    public void testIngresoEnCuentaNoVaciaOk() {
        System.out.println("testIngresoEnCuentaNoVaciaOk");
        Cuenta instance = new Cuenta(100.0d);
        instance.ingresar(100.0d);
        Double expResult = 200.0d;
        Double result = instance.getBalance();
        assertEquals(expResult, result);
    }

    @Test(expected = AssertionError.class)
    public void testIngresoEnCuentaNoVacia() {
        System.out.println("testIngresoEnCuentaNoVacia");
        Cuenta instance = new Cuenta(100.0d);
        instance.setBalance(100.0d);
        Double expResult = 200.0d;
        Double result = instance.getBalance();
        assertEquals(expResult, result);
    }
    @Rule
    public Timeout global = Timeout.seconds(5);

    @Test
    public void timeoutBien() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Fin del método timeoutBien()");
    }

    @Ignore("Test temporalmente deshabilitado")
    @Test
    public void timeoutMal() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Fin del método timeoutMal()");
    }
}
