package com.cybertek.OOP_Practice;

public class LameCalculator {
/*
The LameCalculator class has instance methods that can do simple math operations on two numbers.
The methods are: plus, minus, multiply and divide.

All the methods get two ints then the method does the required math operation and returns the result
as an int.

for example:
LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
 */
 public int plus(int a, int b){
   return a+b;
 }
  public int minus(int a, int b){
    return a-b;
  }
  public int multiply(int a, int b){
    return a*b;
  }

  public double divide(int a, int b){
    return a/b;
  }

  public static void main(String[] args) {
    LameCalculator lc = new LameCalculator();
    System.out.println(lc.plus(1, 1));
    System.out.println(lc.minus(1, 1));
    System.out.println(lc.multiply(2,1));
    System.out.println(lc.divide(10,2));
  }

}
