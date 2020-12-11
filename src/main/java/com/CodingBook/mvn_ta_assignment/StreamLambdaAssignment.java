package com.CodingBook.mvn_ta_assignment;

import java.util.Arrays;

public class StreamLambdaAssignment {
    public static void main(String[] args) {
        int [] numbersArray = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        double [] doubleArray = new double [numbersArray.length];

//        System.out.println(Arrays.toString(numbersArray));
        for (int i = 0; i < numbersArray.length; i++){
            doubleArray[i] = numbersArray[i];
            System.out.print("Integer :" + numbersArray[i]);
            System.out.println("\tdouble : "+ doubleArray[i]);
        }

        System.out.println("Integer Numbers with Stream& Lambda :");
        Arrays.stream(numbersArray).forEach((number) -> System.out.print("\t" + number));

        System.out.println("\nDouble Numbers with Stream& Lambda :");
        Arrays.stream(doubleArray).forEach((doubleNumber) -> System.out.print("\t" + doubleNumber));

//        System.out.println(Arrays.toString(doubleArray));
//
//        for (int element : numbersArray) {
//            System.out.println(element);
//        }
    }
}
