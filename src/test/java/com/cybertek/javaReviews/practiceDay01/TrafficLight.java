package com.cybertek.javaReviews.practiceDay01;

public class TrafficLight extends Light{
  // my blueprint for all traffic lights
// We are applying encapsulation: we have private field and Getter/Setter methods
  private String color;

  public TrafficLight(String localTime){
    this.localTime=localTime;
  }

  public TrafficLight(){

  }

  public void showColor(){
    System.out.println("color = " + color);
    System.out.println("localTime = " + localTime);
  }

  // local time of each light should shared by all traffic lights

  public static String localTime;

  public static void showTime(){
    System.out.println("The time of our traffic lights in the city : "+localTime);
    //  System.out.println("color = " + color); it is different for each object, and our compiler can NOT decide which object's color to put there

    // System.out.println("location = " + location);
  }

  public void changeColor (String newColor){
    if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")){
      System.out.println("changing the color to "+newColor);
      color = newColor;
    } else {
      System.err.println("ERROR : invalid color : " + newColor);
    }
  }


  public void giveLight(){

    System.out.println("Showing different light colors to arrange the traffic" + location +" at this location");

  }



}
