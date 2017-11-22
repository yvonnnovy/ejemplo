/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package samples

import com.curso.java.mavenproject1.Cuenta
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaTestJavaSuite extends FunSpec{
  describe("Una cuenta") {

    it("al ingresar una cantidad en una cuenta, el saldo debe ser igual a esa cantidad") {
      val cuenta = new Cuenta
      cuenta ingresar(100)
      assert(cuenta.saldo === 100)      
    }

    it("debe ocurrir un error si se intenta sacar mas dinero del disponible") {
      val cuenta = new Cuenta
      intercept[IllegalStateException] {
        cuenta reintegrar(100)
      }
    }
  }
}
