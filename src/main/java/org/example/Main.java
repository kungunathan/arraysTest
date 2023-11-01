package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Create an array
        int[] myArray={10,15,7,2,8,1,6};
        //to string method
        System.out.println("Before sorting: " + Arrays.toString(myArray));
        //Sort in ascending order
        Arrays.sort(myArray);
        System.out.println("After sorting" + Arrays.toString(myArray));

        //Search-Binary search method
         System.out.println("The index position of 7 is: "+Arrays.binarySearch(myArray, 7));

         //Fill method
        int[] x = new int[5];
        Arrays.fill(x,4);
        System.out.println("Values of x: "+Arrays.toString(x));

        //Comparison(equals)
        int[] m={2,3,4,5,6};
        int[] k={2,3,4,5,6};
        boolean isEqual = Arrays.equals(m,k);
        System.out.println("Are arrays k nad m equal? " + isEqual);
    }
}