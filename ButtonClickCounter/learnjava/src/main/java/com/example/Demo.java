package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        int[] elements = {5, 7, 12, 100, -1, 8, 3};
        int indexPos = 0;
        int sumTotal = 0;

        for(; indexPos<elements.length; indexPos++)
        {
            System.out.println("Processing: " + indexPos + " Value: " + elements[indexPos]);

//            if (elements[indexPos] > 99) {
//                System.out.println("Continue");
//                continue;
//            }
//
//            if (elements[indexPos] < 0) {
//                System.out.println("Break");
//                break;
//            }


            sumTotal = sumTotal + elements[indexPos];
        }

        System.out.println("Sum total was: " + sumTotal);
    }
}
