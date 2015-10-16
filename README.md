# Scala
This is forked from my project in Github: https://github.com/AlfTang/Scala
homework in "Functional Programming Principles in Scala" on Coursera

Week 0: Example Assignment
  The goal is to familiarize with the infrastructure and the tools required during the class.
  
  Exercise 1: sum(xs: List[Int]): Int -- computes the sum of all elements in the list `xs`.
  
  Exercise 2: max(xs: List[Int]): Int -- returns the largest element in a list of integers. If the
  list `xs` is empty it throws a `java.util.NoSuchElementException`.
  
Week 1: Recursion -- using recursion to implement the following 3 methods

  Exercise 1: Pascal’s Triangle
    Implementing the pascal function, which takes a column c and a row r, counting from 0 and    
    returns the number at that spot in the triangle. For example, pascal(0,2)=1, pascal(1,2)=2 and 
    pascal(1,3)=3.
    
  Exercise 2: Parentheses Balancing
    Write a recursive function which verifies the balancing of parentheses in a string, which we 
    represent as a List[Char] not a String.
    
  Exercise 3: Counting Change
    Write a recursive function that counts how many different ways you can make change for an 
    amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 
    if you have coins with denomiation 1 and 2: 1+1+1+1, 1+1+2, 2+2.
