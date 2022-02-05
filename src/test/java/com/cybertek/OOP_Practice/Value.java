package com.cybertek.OOP_Practice;

public class Value {
  int a;
  int flag;  //1 if constructor is called, 2 if set val is called

  public Value(int a) {
    this.flag=1;
    this.a=a;
  }
  public Value(){
  }

  public void setVal(int val){
    this.flag=2;
    this.a=val;
  }

  public Boolean wasModified(){
    if(flag==1 || flag==2){
      return true;
    }else{
      return false;
    }
  }

  public int getVal(){
    if(flag==2){
      return a;
    }else if (flag==1){
      return a;
    }else{
      return 0;
    }

  }

  public static void main(String[] args) {
    Value value=new Value();
    System.out.println(value.a);
    System.out.println("getval = " + value.getVal());
  }





}
