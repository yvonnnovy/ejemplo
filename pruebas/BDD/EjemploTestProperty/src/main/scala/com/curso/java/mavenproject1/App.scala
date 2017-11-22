package com.curso.java.mavenproject1

import org.scalacheck.Prop.forAll

/**
 * @author ${user.name}
 */
object App {     
  def main(args : Array[String]) {
    val propConcatLists = 
      forAll { (l1: List[Int], l2: List[Int]) => l1.size + l2.size == (l1 ::: l2).size }
    propConcatLists.check
    
    val propSqrt = forAll { (n: Int) => Math.sqrt(n*n) == n }    
    propSqrt.check
  }
}
