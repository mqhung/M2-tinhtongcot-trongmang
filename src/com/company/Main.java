package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][]array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        System.out.println("Enter col: " + col);
        sumCol(array,col);
        System.out.println("Sum col "+col + " is: " + sumCol(array,col));


    }
    public static int sumCol(int [][]arr, int col){
        int sum =0;
        for (int i=0;i< arr.length;i++){
            sum += arr[i][col];
        }
        return sum;
    }
}
