/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author usuario
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdenTest {

    @Test
    public void testA() {
        System.out.println("first");
    }

    @Test
    public void testB() {
        System.out.println("second");
    }

    @Test
    public void testC() {
        System.out.println("third");
    }
}
