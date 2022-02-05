package com.cybertek.OOP_Practice;

public class calc {

  public static int plus(int a, int b){
    return a+b;
  }
  public static int minus(int a, int b){
    return a-b;
  }

  public static void main(String[] args) {
    System.out.println("calc.minus(1,1) = " + calc.minus(1, 1));
    System.out.println("calc.plus(10,1) = " + calc.plus(10, 1));
  }

}
