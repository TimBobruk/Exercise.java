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






/*  car:  for (int i=0; i < 10;i++){
        for (int j=0; j < 10;j++){
            if (j==8){
//               System.exit(-1);
            }
            System.out.printf("i=%d j=%d\n",i,j);
        }
        System.out.println("Happy");
    }*/
//for(byte i = 0;i < 129;i++){
//    if (i == 5){
//       continue;
//    }
//    System.out.println(i);
//}
//    while (number < 15){
//        System.out.println(number);
//        number++;
//    }
//        do {
//            System.out.println(number);
//            number++;
//        }while(number < 15);
//    }
//
//
//    static void exam(int number) {
//        if (number == 0){
//
//        }
//
//        else  if (number == 1){
//
//        }
//
//        else if (number == 2){
//
//        }
//
//        else if (number == 3){
//
//        }
//        else {
//
//        }
//    }
//    static void exam(int number) {
//        switch (number) {
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("The number is not 0, 1, 2 or 3");
//        }
//    }


