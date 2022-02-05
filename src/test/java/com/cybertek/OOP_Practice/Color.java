package com.cybertek.OOP_Practice;
import java.util.*;

/**
 * represents basic Color class example
 */
public class Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */
    
    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public Color(int r, int g, int b){
       //TODO
        this.rgb=new int[]{r,g,b};
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public Color() {
        //TODO
        this(255,255,255);
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     *
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     *
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     * 
     * Color color4 = new Color(192, 192, 192); 
       System.out.println(color4 ) ; // prints "light gray"
     */
    public String toString() {
        
       //TODO
        String[] Names={"white", "light gray", "gray", "dark gray", "black", "red", "pink", "orange", "yellow", "green", "magenta", "cyan", "blue"};
        int[][] colors={WHITE, LIGHT_GRAY, GRAY, DARK_GRAY, BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA, CYAN, BLUE};
        int i=0;
        for (int[] color : colors) {
            if(Arrays.equals(color, this.rgb)){
                return Names[i];
            }
            i++;
        }
        return "n/a"; //change this to return colors
    }


    public static void main(String[] args) {
        Color color = new Color();
        System.out.println(color.toString() );

        color = new Color(255, 0, 0);
        System.out.println(color.toString() ) ;

        color = new Color(255, 100, 0);
        System.out.println(color.toString() ) ;

        Color color4  = new Color(192, 192, 192);
        System.out.println(color4 ) ;

        System.out.println(color4 ) ;
    }

}