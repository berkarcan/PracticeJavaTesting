package com.cybertek.OOP_Practice;

public class ParkingMeter {

  int timeLeft=0;
  int maxTime;

  public ParkingMeter(int maxTime) {
    this.maxTime = maxTime;
  }

  public Boolean add(int t){
    if(t==25 && timeLeft+30<=maxTime){
      timeLeft+=30;
      return true;
    }else{return false;}

  }
    public void tick(){
    if (timeLeft>0){
      timeLeft--;
      }
    }

    public Boolean isExpired(){
    if(timeLeft==0){
      return true;
    }else{
      return false;
    }
    }

  public static void main(String[] args) {

    ParkingMeter parkingMeter=new ParkingMeter(65);
    parkingMeter.add(25);
    parkingMeter.add(25);
    parkingMeter.add(25);
    System.out.println(parkingMeter.timeLeft);
    while (parkingMeter.timeLeft>0) {
      parkingMeter.tick();
    }
    System.out.println(parkingMeter.timeLeft);
  }

}
