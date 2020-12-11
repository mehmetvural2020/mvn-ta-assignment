package com.CodingBook.mvn_ta_assignment;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   //create an int array and initialize.
//        double[] doubleArray = new double[10];                //create double array and size 10.
        double[] doubleArray = new double[numbersArray.length]; //create double array and size is equal to numbersArray.
//        double[] doubleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numbersArray));
        System.out.println(Arrays.toString(doubleArray));

        for(int i = 0; i < numbersArray.length; i++) {
            System.out.print("Integer : " + numbersArray[i]);
            doubleArray[i] = numbersArray[i];
            System.out.println("\t\tDouble : " + doubleArray[i]);
        }

        for (int intNumber : numbersArray){
            System.out.print("\t" + intNumber);
        }

        System.out.println();

        for (double doubleNumber : doubleArray){      // for dongusunde her bir defa cagirildiginda double numberin degeri => 1.0    2.0  3.0    4.0 5.0
                                                //doubleNumber = doubleArray[i];
            System.out.print("\t" + doubleNumber);
        }

        System.out.println("\n\n\tInteger Numbers with Stream API and Lambda Expression : ");
        Arrays.stream(numbersArray).forEach((intNumber) -> System.out.print("\t" + intNumber));

        System.out.println("\n\n\tDouble Numbers with Stream API and Lambda Expression : ");
        Arrays.stream(doubleArray).forEach((doubleNumber) -> System.out.print("\t" + doubleNumber));


//        double total=0;
//        Arrays.stream(numbersArray).forEach((doubleNumber) -> Arrays.stream(numbersArray).sum());


    }
}
