package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {24, 2, 0, 34, 12, 110, 120,121,301};
        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j % 2!=0)
                maxNum = j;
        }
        System.out.println("Maximum number = " + maxNum);
    }

        }

