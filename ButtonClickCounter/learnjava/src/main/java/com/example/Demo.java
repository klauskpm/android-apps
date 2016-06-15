package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        int[] elements = {};
        int indexPos = 0;
        int sumTotal = 0;

        do
        {
            if (elements.length <= 0)
                break;

            System.out.println("Processing: " + indexPos + " Value: " + elements[indexPos]);

            if (elements[indexPos] > 99) {
                System.out.println("Continue");
                indexPos++;
                continue;
            }

            if (elements[indexPos] < 0) {
                System.out.println("Break");
                break;
            }


            sumTotal = sumTotal + elements[indexPos];
            indexPos++;
        } while(indexPos < elements.length);

        System.out.println("Sum total was: " + sumTotal);
    }
}
