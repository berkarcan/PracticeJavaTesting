package com.cybertek.OOP_Practice;

public class TV {

  private int channel=1;
  private int volumeLevel=1;
  boolean on = false;
  private String brand = "undefined";

  public TV(){
    System.out.println("Creating TV object using no Args- constructor");
  }

  public TV(String brand){
    this.brand=brand;
    System.out.println("Creating TV object using 1 arg - constructor");
  }

  public void channelUp(){
    channel++;
  }

  public void channelDown(){
    channel--;
  }

  public void volumeUp(){
    volumeLevel++;
  }

  public void volumeDown(){
    volumeLevel--;
  }

  public void isOn(){
    if (on==true){System.out.println("TV is already ON");}
  }
  public void turnOn(){
    on=true;
  }
  public void turnOff(){
    if (on==false){System.out.println("TV is already OFF");}
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    if (channel>0 && channel<=120){
      this.channel = channel;
    }else{
      System.out.println("ERROR: TV is either OFF or invalid Channel");
    }
  }

  public int getVolumeLevel() {
    return volumeLevel;
  }

  public void setVolumeLevel(int volumeLevel) {
    if(volumeLevel>=1 && volumeLevel<=7){
      this.volumeLevel = volumeLevel;
    }else {
      System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

}
