/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package samples

import org.scalacheck.Prop.forAll
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaCheckTestsSuite extends FunSuite{
  val propSqrt = forAll { (n: Int) => Math.sqrt(n*n) == n }    
  propSqrt.check
    
  val propConcatLists = 
    forAll { (l1: List[Int], l2: List[Int]) =>l1.size + l2.size == (l1 ::: l2).size }
  propConcatLists.check
}
