package com.cybertek.OOP_Practice;

import java.util.concurrent.Callable;

public class CameraPhone extends Phone{

  static int imageSize;
  static int memorySize;

  public CameraPhone(int imageSize, int memorySize) {
    this.imageSize = imageSize;
    this.memorySize = memorySize;
  }

  public static  int numPictures(int imageSize, int memorySize){
    return memorySize*1000/imageSize;
  }

  public static void main(String[] args) {

    System.out.println("CameraPhone.numPictures() = " + CameraPhone.numPictures(2,4));

  }

}
