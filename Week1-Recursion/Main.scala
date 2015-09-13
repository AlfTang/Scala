/*----------------------------------------------------------------
 *  Author:        Alf Tang
 *  Written:       Sep 12, 2015
 *  
 *  Week 1 homework in "Functional Programming Principles in Scala"
 *  on Coursera
 *----------------------------------------------------------------*/
package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Pascal’s Triangle, which takes a column c and a row r, 
   * counting from 0 and returns the number at that spot in the triangle
   */
  def pascal(c: Int, r: Int): Int = {
    if (c > r || c < 0) throw new IllegalArgumentException("Column index exceeds boundary")
    if(r == 0 || r == 1) 1
    else if(c == 0 || c == r) 1
    else pascal(c-1,r-1) + pascal(c,r-1)
  }

  /**
   * Parentheses balancing, which verifies the balancing of parentheses in a string
   */
  def balance(chars: List[Char]): Boolean = {
    def balanced(sentence: List[Char], leftParenNum: Int): Boolean = {
      if (sentence.isEmpty) leftParenNum == 0
      else if (sentence.head == '(') balanced(sentence.tail, leftParenNum+1)
      else if (sentence.head == ')') leftParenNum > 0 && balanced(sentence.tail, leftParenNum-1) 
      else balanced(sentence.tail, leftParenNum)   
    }
    balanced(chars, 0)
  }

  /**
   * Count how many different ways you can make change for an amount, 
   * given a list of coin denominations.  The number of ways to change 
   * amount a using n kinds of coins equals: 
   * 1.the number of ways to change amount a using all but the first 
   * kind of coin, plus 
   * 2.the number of ways to change amount a - d using all n kinds of coins 
   * where d is the denomination of the first kind of coin. 
   * 
   * Ref:https://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html
   */
  def countChange(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) 0
      else if (money == 0) 1
      else if (money < 0) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
