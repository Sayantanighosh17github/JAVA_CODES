package Hackerrank.Day6;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
    static int pos=0;
    static int neg=0;
    static int zero=0;
    static int array;

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int array = arr.length;
        for(int i=0;i<array;i++){
            if(arr[i]>0){
                pos=pos+1;//counting how many positive nos are there
            }
            else if(arr[i]<0){
                neg=neg+1;//counting how many negative numbers are there
            }
            else if(arr[i]==0){
                zero=zero+1;//counting how many zero's are there
            }
        }
        float pos1 =(float)(pos)/(float)(array);
        float neg1=(float)(neg)/(float)(array);
        float zero1=(float)(zero)/(float)(array);
        System.out.printf("%.5f",pos1);//printing the fraction of positive numbers out of total numbers
        System.out.println();
        System.out.printf("%.5f",neg1);//printing the fraction of negative numbers out of total numbers
         System.out.println();
        System.out.printf("%.5f",zero1);//printing the fraction of zero's out of total numbers


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
