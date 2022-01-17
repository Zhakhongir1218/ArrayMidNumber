package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.println("Enter how many number will Array Contains: ");
    int countOfNumber = in.nextInt();
    int sumOfArray = 0;
    int Array[] = new int [countOfNumber];
    for (int i = 0; i<=Array.length-1; i++){
        Array[i] = in.nextInt();
        sumOfArray = Array[i]+sumOfArray;

    }
        System.out.println("Middle number is : " + sumOfArray/countOfNumber);
        System.out.println("The sum of Array is : " + sumOfArray);
        System.out.println(Arrays.toString(Array));


    }
}
