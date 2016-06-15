package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        int[] elements = {5, 7, 12, 100, -1, 8, 3};
        int sumTotal = 0;

//        for(; indexPos<elements.length; indexPos++)
        for(int elementContents : elements)
        {
            System.out.println("Processing: " + elementContents);

            if (elementContents > 99) {
                System.out.println("Continue");
                continue;
            }

            if (elementContents < 0) {
                System.out.println("Break");
                break;
            }


            sumTotal = sumTotal + elementContents;
        }

        System.out.println("Sum total was: " + sumTotal);
    }
}
