//------------------------------------------------//
//              Mahmoud Zakaria                  //
//          Github: ZakariaMahmoud              //
//     Email : zakaria.forwork@gmail.com       //
//                JAVA: Day_01                //
//-------------------------------------------//

package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static int getRandom(int max, int min) {
        return (int) (Math.random() * (max - min)) + min;

    }
    public static void main(String[] args) {

      int max, min, rand,counter;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the MAX number : ");
        max = Integer.parseInt(in.nextLine());
        System.out.print("Please enter the min number : ");
        min = Integer.parseInt(in.nextLine());
        rand = getRandom(max, min);
        System.out.println("random = " + rand);
        counter = Integer.toString(rand).length();
        int total=0,value;
        for (int i = 1; i <= counter; i++) {
            value = (int) (rand / Math.pow(10, counter - i));
            total += value;
            rand -= (int) (value * Math.pow(10, counter - i));
        }

        System.out.println("total  = " + total);

    }
}
