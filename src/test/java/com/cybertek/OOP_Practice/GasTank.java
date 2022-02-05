package com.cybertek.OOP_Practice;

public class GasTank {

  double amount=0;
  double capacity;

  public GasTank(double capacity) {
    this.capacity = capacity;
  }

  public void addGas(Double p){
    amount+=p;
    if (amount>capacity){amount=capacity;}
  }

  public void useGas(double v){
    amount-=v;
    if (amount<0){amount=0;}
  }

  public Boolean isEmpty(){
    if(amount<0.1){return true;
    }else{
      return false;}
  }
  public Boolean isFull(){
      if(amount>capacity-0.1){return true;
      }else{
        return false;}
  }

  public Double getGasLevel(){
    return amount;
    }

    public Double fillUp(){
      Double difference=capacity-amount;
      amount=capacity;
      return difference;
    }

  public static void main(String[] args) {
    GasTank gasTank=new GasTank(10);
    System.out.println("gasTank.isEmpty() = " + gasTank.isEmpty());
    gasTank.addGas(1.5);
    gasTank.addGas(10.5);
    System.out.println("gasTank.isEmpty() = " + gasTank.isEmpty());
    System.out.println("gasTank.getGasLevel() = " + gasTank.getGasLevel());
    gasTank.useGas(9);
    System.out.println("gasTank.getGasLevel() = " + gasTank.getGasLevel());
    System.out.println("the difference is = " + gasTank.fillUp());
    gasTank.fillUp();
    System.out.println("gasTank.isFull() = " + gasTank.isFull());
  }


}
