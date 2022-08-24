package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intarray = {24, 2, 0, 34, 12, 110, 120,121,301};
        int maxnum = intarray[0];

        for (int j : intarray) {
            if (j % 2!=0)
                maxnum = j;
        }
        System.out.println("Maximum number = " + maxnum);
    }

        }

