package com.company;

        public class Exercise3 {
            public static void main(String[] args) {
                int[] arr = { 1, 22, 3, 5, 6, 7, 8, 9, 10 };
                int[] arr2 = { 11, 22, 33, 55, 66, 77, 88, 9, 10 };
                for (int i =0; i < arr.length;i++){
                    for (int j =0; j < arr2.length;j++){
                            if (arr[i] == arr2[j]){
                                System.out.println(arr2[j]);
                            }
                    }
                }
            }
        }

